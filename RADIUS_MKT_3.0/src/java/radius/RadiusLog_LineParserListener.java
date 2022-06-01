/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import nsofiasLib.fileIO.CSV_LineParser;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.fileIO.csv.LineParserListener;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;


/**
 *
 * @author nsofias
 */
public class RadiusLog_LineParserListener implements LineParserListener
    {   
    private final int id_column;
    private final int state_column;
    private final int timeStampColumn;
    private final String startSession_string;
    private final String stopSession_string;
    private final Map<String, RadiusSessionRecord> radiusLiveSessionsContainer = new ConcurrentHashMap();
    private ConcurrentHashMap<String, Set<String>> stopEvents = null;
    private final ArrayList<String> myErrors = new ArrayList();
    //---------
    private long counter_starts = 0;
    private long counter_stops = 0;
    private long counter_NoLineIdErros = 0;
    private long counter_BadTimingErros = 0;
    private long counter_WrongStateErros = 0;
    //-----
    private String timestam_lastSession = "-1";
    private String timestam_lastUpdated = "-1";
    private static final int TIMESTAMP_LENGTH_MIN = 10;
    //
    String fallBackTimeStamp_;

    public RadiusLog_LineParserListener(int id_column, int state_column, int timeStampColumn, String IN_string, String OUT_string)
        {
        this.id_column = id_column;
        this.state_column = state_column;
        this.timeStampColumn = timeStampColumn;
        this.startSession_string = IN_string;
        this.stopSession_string = OUT_string;
        //
        TimeStamp1 fallBackTimeStamp = new TimeStamp1();
        fallBackTimeStamp.addDays(-1);
        fallBackTimeStamp_ = fallBackTimeStamp.getNowUnformated().substring(0, 15);
        }

    @Override
    public void onNewLineEvent(EventObject myEvent)
        {
        setTimestam_lastUpdated(new TimeStamp1().getNowUnformated());
        String[] myValues = (String[]) myEvent.getSource();
        try
            {
            String id = myValues[id_column];
            if (id == null || id.isEmpty())
                {
                counter_NoLineIdErros++;
                return;
                }
            String stateString = myValues[getState_column()];//interim-update,start,stop
            String newEventTimeStamp = myValues[timeStampColumn].trim();
            //------------------------------------------------
            if (newEventTimeStamp.length() < RadiusLog_LineParserListener.TIMESTAMP_LENGTH_MIN)
                {
                newEventTimeStamp = fallBackTimeStamp_; // timestam is not correct because newEventTimeStamp.length cannot be < RadiusLog_LineParserListener.TIMESTAMP_LENGTH_MIN!
                myValues[timeStampColumn] = newEventTimeStamp;
                System.out.println("RadiusLog_LineParserListener:onNewLineEvent timeStamp.length() < RadiusLog_LineParserListener.TIMESTAMP_LENGTH_MIN" + myEvent.toString());
                }
            //-----------------------------------------------------
            if (newEventTimeStamp.compareTo(timestam_lastSession) > 0)
                {
                timestam_lastSession = newEventTimeStamp;
                }
            RadiusSessionRecord myRadiusLogRecord = new RadiusSessionRecord(id, newEventTimeStamp, myValues);
            if (startSession_string.contains(stateString))
                {
                counter_starts++;
                myRadiusLogRecord.setIsLive(true);
                }
            else if (stopSession_string.contains(stateString))
                {
                counter_stops++;
                myRadiusLogRecord.setIsLive(false);
                //--------------------- keep line events---------
                //System.out.println("stopEvents is "+stopEvents);
                if (stopEvents != null)
                    {
                    Set lineStopEvents = stopEvents.get(id);
                    //System.out.println("lineStopEvents is "+lineStopEvents);
                    if (lineStopEvents == null)
                        {
                        Set myList = new ConcurrentSkipListSet();
                        myList.add(newEventTimeStamp);
                        stopEvents.put(id, myList);
                        //System.out.println("new lineID: "+id);
                        }
                    else
                        {
                        if (!lineStopEvents.contains(newEventTimeStamp))
                            {
                            lineStopEvents.add(newEventTimeStamp);
                            }
                        //System.out.println("lineID update: " + id);
                        }
                    }
                }
            RadiusSessionRecord oldRadiusLogRecord = getEventsContainer().get(id);
            if (oldRadiusLogRecord == null)
                {
                radiusLiveSessionsContainer.put(id, myRadiusLogRecord);
                }
            else
                {
                if ((newEventTimeStamp.compareTo(oldRadiusLogRecord.getTimeStamp()) > 0))
                    {
                    radiusLiveSessionsContainer.put(id, myRadiusLogRecord);
                    }
                else if (newEventTimeStamp.compareTo(oldRadiusLogRecord.getTimeStamp()) == 0)
                    {
                    counter_WrongStateErros++;
                    if (!myRadiusLogRecord.isIsLive())
                        {
                        radiusLiveSessionsContainer.put(id, myRadiusLogRecord);
                        }
                    if (myValues[getState_column()].equals(oldRadiusLogRecord.getMyValues()[getState_column()]))
                        {
                        myErrors.add(0, "Double event found  :id=" + id + ", new Timestamp:" + newEventTimeStamp);
                        }
                    else
                        {
                        myErrors.add(0, "Double change of STATE found :id=" + id + ", new Timestamp:" + newEventTimeStamp);
                        }
                    }
                else if (newEventTimeStamp.compareTo(oldRadiusLogRecord.getTimeStamp()) < 0)
                    {
                    counter_BadTimingErros++;
                    //myErrors.add(0, "Invalid Timing event found (new event will be descarded): id=" + id + ", new Timestamp:" + newEventTimeStamp + ", old Timestamp:" + oldRadiusLogRecord.getTimeStamp());
                    }
                }
            }
        catch (Exception e)
            {
            if (!myValues[0].contains("File Start") && !myValues[0].contains("File End"))
                {
                System.out.println("RadiusLog_LineParserListener:onNewLineEvent line excluded:" + myEvent.toString() + " Error:" + e.toString());
                }
            }
        }

    /**
     * @return the eventsContainer
     */
    public Map<String, RadiusSessionRecord> getEventsContainer()
        {
        return radiusLiveSessionsContainer;
        }

    /**
     * @return the eventsContainer
     */
    public List<RadiusSessionRecord> getLiveSessionsAsList()
        {
        List myList = new ArrayList();
        for (String key : radiusLiveSessionsContainer.keySet())
            {
            RadiusSessionRecord myRadiusLogRecord = radiusLiveSessionsContainer.get(key);
            if (myRadiusLogRecord.isIsLive())
                {
                myList.add(radiusLiveSessionsContainer.get(key));
                }
            }
        return myList;
        }

    public List<RadiusSessionRecord> getClosedSessionsAsList()
        {
        List myList = new ArrayList();
        for (String key : radiusLiveSessionsContainer.keySet())
            {
            RadiusSessionRecord myRadiusLogRecord = radiusLiveSessionsContainer.get(key);
            if (!myRadiusLogRecord.isIsLive())
                {
                myList.add(radiusLiveSessionsContainer.get(key));
                }
            }
        return myList;
        }

    public List<RadiusSessionRecord> getSessionsAsList()
        {
        List myList = new ArrayList();
        for (String key : radiusLiveSessionsContainer.keySet())
            {
            myList.add(radiusLiveSessionsContainer.get(key));
            }
        return myList;
        }

    public long getLiveSessionsNumber()
        {
        int count = 0;
        for (String key : radiusLiveSessionsContainer.keySet())
            {
            RadiusSessionRecord myRadiusLogRecord = radiusLiveSessionsContainer.get(key);
            if (myRadiusLogRecord.isIsLive())
                {
                count++;
                }
            }
        return count;
        }

    public long getAllSessionsNumber()
        {
        return radiusLiveSessionsContainer.size();
        }

    public void flushToDisk(String filename)
        {
        System.out.println("RadiusLog_LineParserListener:Alarms flushToDisk...");
        //------------------ TICKETS --------------------
        try (BufferedWriter flashOutlog = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), "UTF-8")))
            {
            for (String key : radiusLiveSessionsContainer.keySet())
                {
                RadiusSessionRecord myRadiusLogRecord = radiusLiveSessionsContainer.get(key);
                flashOutlog.write(myRadiusLogRecord.toString());
                flashOutlog.newLine();
                }
            flashOutlog.flush();
            flashOutlog.close();
            }
        catch (IOException e)
            {
            System.out.println("RadiusLog_LineParserListener: sessions flushToDisk error");
            new MailAlert().sendmailAlert("RadiusLog_LineParserListener error:sessions flushToDisk error", e);
            }
        //----------------- stopEvents ----------------------------------------
        try (Writer writer = new FileWriter(filename + ".stopEvents"))
            {
            Gson gson = new GsonBuilder().create();
            gson.toJson(stopEvents, writer);
            }
        catch (IOException e)
            {
            System.out.println("RadiusLog_LineParserListener: stopEvents flushToDisk error");
            new MailAlert().sendmailAlert("RadiusLog_LineParserListener error:stopEvents flushToDisk error", e);
            }
        }

    public void loadFromDisk(String filename) throws Exception
        {
        timestam_lastSession = "-1";
        System.out.println("RadiusLog_LineParserListener::Loading from disc");
        try (BufferedReader flashedOutlog = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8")))
            {
            radiusLiveSessionsContainer.clear();
            String myLine;
            while ((myLine = flashedOutlog.readLine()) != null)
                {
                String id = myLine.split("\t")[0];
                String timeStamp = myLine.split("\t")[1];
                if (timeStamp.length() < RadiusLog_LineParserListener.TIMESTAMP_LENGTH_MIN)
                    {
                    timeStamp = fallBackTimeStamp_; // timestam is not correct because newEventTimeStamp.length cannot be < RadiusLog_LineParserListener.TIMESTAMP_LENGTH_MIN!                    
                    }
                boolean isLive = Boolean.parseBoolean(myLine.split("\t")[2]);
                String[] myValues = myLine.split("\t")[3].split("&&");
                myValues[timeStampColumn] = timeStamp;
                if (timeStamp.length() >= RadiusLog_LineParserListener.TIMESTAMP_LENGTH_MIN && timeStamp.compareTo(timestam_lastSession) > 0)
                    {
                    timestam_lastSession = timeStamp;
                    }
                RadiusSessionRecord myRadiusSessionRecord = new RadiusSessionRecord(id, timeStamp, myValues);
                myRadiusSessionRecord.setIsLive(isLive);
                radiusLiveSessionsContainer.put(id, myRadiusSessionRecord);
                }
            }
        catch (Exception e)
            {
            System.out.println("RadiusLog_LineParserListener:Loading sessions from disc error " + e.toString());
            new MailAlert().sendmailAlert("RadiusLog_LineParserListener: Loading sessions from disc error ", e);
            }
        //---------- stopEvents -------------
        try
            {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename + ".stopEvents"));
            Gson gson = new Gson();
            Type type = new TypeToken<ConcurrentHashMap<String, Set<String>>>()
                {
                }.getType();
            stopEvents.putAll((ConcurrentHashMap<String, Set<String>>) gson.fromJson(bufferedReader, type));
            }
        catch (Exception e)
            {
            System.out.println("RadiusLog_LineParserListener::Loading stopEvents from disc error " + e.toString());
            new MailAlert().sendmailAlert("RadiusLog_LineParserListener: Loading stopEvents from disc error ", e);
            }
        }

    public void resetCounters()
        {
        counter_starts = 0;
        counter_stops = 0;
        counter_NoLineIdErros = 0;
        counter_BadTimingErros = 0;
        counter_WrongStateErros = 0;
        }

    public ArrayList cleanStuckedSessions(int minutesBack)
        {
        ArrayList<String> stucks = new ArrayList();

        TimeStamp1 oldTimestamp = new TimeStamp1(timestam_lastSession + ".000");
        oldTimestamp.addMinutes(-minutesBack);
        String oldTimestamp_ = oldTimestamp.getNowUnformated();
        for (String key : radiusLiveSessionsContainer.keySet())
            {
            RadiusSessionRecord myRadiusLogRecord = radiusLiveSessionsContainer.get(key);
            String sessionTime = myRadiusLogRecord.getTimeStamp();
                {
                if (sessionTime.compareTo(oldTimestamp_) < 0)
                    {
                    if (myRadiusLogRecord.isIsLive())
                        {
                        myErrors.add(0, "live session " + myRadiusLogRecord.getId() + ": has not been updated for more than " + minutesBack + " minutes, isIsLive = " + myRadiusLogRecord.isIsLive());
                        stucks.add(key);
                        }
                    //myRadiusLogRecord.setIsLive(false);
                    }
                }
            }
        return stucks;
        }

    public ArrayList cleanOldClosedSessions(int minutesBack)
        {
        ArrayList<String> stucks = new ArrayList();
        TimeStamp1 oldTimestamp = new TimeStamp1(timestam_lastSession + ".000");
        oldTimestamp.addMinutes(-minutesBack);
        String oldTimestamp_ = oldTimestamp.getNowUnformated();
        for (String key : radiusLiveSessionsContainer.keySet())
            {
            RadiusSessionRecord myRadiusLogRecord = radiusLiveSessionsContainer.get(key);
            String sessionTime = myRadiusLogRecord.getTimeStamp();
                {
                if (sessionTime.compareTo(oldTimestamp_) < 0)
                    {
                    radiusLiveSessionsContainer.remove(key);
                    }
                }
            }
        return stucks;
        }

    public String getOldestLiveSession()
        {
        if (timestam_lastSession.equals("-1"))
            {
            return "-1";
            }
        else
            {
            TimeStamp1 myOldestSession = new TimeStamp1();
            String myOldestSession_ = myOldestSession.getNowUnformated();
            for (String key : radiusLiveSessionsContainer.keySet())
                {
                try
                    {
                    RadiusSessionRecord myRadiusLogRecord = radiusLiveSessionsContainer.get(key);
                    String sessionTime = myRadiusLogRecord.getTimeStamp();
                        {
                        if (myRadiusLogRecord.isIsLive() && sessionTime.compareTo(myOldestSession_) < 0)
                            {
                            myOldestSession_ = sessionTime;
                            }
                        }
                    }
                catch (Exception e)
                    {
                    }
                }
            return myOldestSession_;
            }
        }

    public void removeOldStopEvents()
        {
        //---------- remove old --------------------------------
        TimeStamp1 after = new TimeStamp1();
        after.addHours(-168);
        String after_ = after.getNowUnformated();
        //String after_ = "20181210T011218";            
        long count = 0;
        for (String lineID : stopEvents.keySet())
            {
            Set lineIDStopEvents = stopEvents.get(lineID);
            //System.out.println(lineID + " " + lineIDStopEvents.size());
            lineIDStopEvents.removeIf(stoptime -> ((String) stoptime).compareTo(after_) < 0);
            count += lineIDStopEvents.size();
            //System.out.println(lineID + " " + lineIDStopEvents);
            }
        System.out.println("RADIUS_SKOPIA:stopEvents size=" + stopEvents.size() + " Stops=" + count);
        }

    /**
     * @return the counter_starts
     */
    public long getCounter_startEvents()
        {
        return counter_starts;
        }

    /**
     * @return the counter_stops
     */
    public long getCounter_stopEvents()
        {
        return counter_stops;
        }

    /**
     * @return the timestam_lastSession
     */
    public String getTimestam_lastSession()
        {
        return timestam_lastSession;
        }

    /**
     * @return the myErrors
     */
    public ArrayList<String> getMyErrors()
        {
        return myErrors;
        }

    /**
     * @return the counter_NoLineIdErros
     */
    public long getCounter_NoLineIdErros()
        {
        return counter_NoLineIdErros;
        }

    /**
     * @return the counter_BadTimingErros
     */
    public long getCounter_BadTimingErros()
        {
        return counter_BadTimingErros;
        }

    /**
     * @return the counter_WrongStateErros
     */
    public long getCounter_WrongStateErros()
        {
        return counter_WrongStateErros;
        }

    /**
     * @return the timestam_lastUpdated
     */
    public String getTimestam_lastUpdated()
        {
        return timestam_lastUpdated;
        }

    /**
     * @param timestam_lastUpdated the timestam_lastUpdated to set
     */
    public void setTimestam_lastUpdated(String timestam_lastUpdated)
        {
        this.timestam_lastUpdated = timestam_lastUpdated;
        }

    /**
     * @return the stopEvents
     */
    public Map<String, Set<String>> getStopEvents()
        {
        return stopEvents;
        }
    /**
     * @return the state_column
     */
    public int getState_column()
        {
        return state_column;
        }

    public void setStopEvents(ConcurrentHashMap<String, Set<String>> stopEvents)
        {
        this.stopEvents = stopEvents;
        }

    public static void main(String[] args)
        {
        try
            {
            CSV_LineParser myCSVLineParser = new CSV_LineParser();
            FileParser2 myFileParser = new FileParser2(myCSVLineParser);
            myCSVLineParser.setSplitterStr("\t");
            RadiusLog_LineParserListener myContainerUpdate_LineParserListener = new RadiusLog_LineParserListener(4, 2, 17, "interim-update,start", "stop");
            ConcurrentHashMap<String, Set<String>> stopEvents = new ConcurrentHashMap<>();
            myContainerUpdate_LineParserListener.setStopEvents(stopEvents);
            myCSVLineParser.addListeners(myContainerUpdate_LineParserListener);
            String DSLFileLineParserDir = "C:\\my Files\\data\\RADIUS_SKOPIA\\data";//myConfig.getDSLFileLineParser_dir();
            String DSLFileLineParserExt = "NO_EXT";//myConfig.getDSLFileLineParser_ext();  
            myFileParser.setRemoveFiles(false);//myDSLFileParser.setRenameFiles(true);
            myFileParser.setRememberFilenames(false);
            myFileParser.parse_files(DSLFileLineParserDir, DSLFileLineParserExt);
            //
            System.out.println("--- Stop Events ---------");
            for (String lineID : stopEvents.keySet())
                {
                Set lineIDStopEvents = stopEvents.get(lineID);
                //System.out.println(lineID + " " + lineIDStopEvents.size());
                System.out.println(lineID + " " + lineIDStopEvents);
                }
            System.out.println("--- Stop Events after cleanning ---------");
            //---------- remove old --------------------------------
            TimeStamp1 after = new TimeStamp1();
            after.addHours(-12);
            String after_ = after.getNowUnformated();
            //String after_ = "20181210T011218";
            for (String lineID : stopEvents.keySet())
                {
                Set lineIDStopEvents = stopEvents.get(lineID);
                //System.out.println(lineID + " " + lineIDStopEvents.size());
                lineIDStopEvents.removeIf(stoptime -> ((String) stoptime).compareTo(after_) < 0);
                System.out.println(lineID + " " + lineIDStopEvents);
                }
            myContainerUpdate_LineParserListener.flushToDisk("C:\\my Files\\data\\RADIUS_SKOPIA\\conf\\sessions");
            /*
            FileParser2Daemon myDSLFileParserDaemon = new FileParser2Daemon(myFileParser, DSLFileLineParserDir, DSLFileLineParserExt, 10000);
            myDSLFileParserDaemon.setRunning(true);
            myDSLFileParserDaemon.setVerbal(false);
            Thread myFileParser2DaemonThread = new Thread(myDSLFileParserDaemon);
            myFileParser2DaemonThread.start();*/
            }
        catch (Exception e)
            {
            e.printStackTrace(System.out);
            }
        }

    }
