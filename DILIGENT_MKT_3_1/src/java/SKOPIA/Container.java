package SKOPIA;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.Ticket_FYROM;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import static java.lang.System.out;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.others.Parameters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.mapper.Counters_1D_decimal;
import nsofiasLib.utils.mapper.Counters_2D_decimal;
import nsofiasLib.utils.mapper.paths.Paths_1D_decimal;

public class Container {

    private final String PATH_DELIMETER;
    private final Counters_2D_decimal aggregations;
    //private final Counters_1D vanished;
    private final Map<String, Patern> traffic_paterns = Collections.synchronizedMap(new LinkedHashMap());
    //private final List<Alarm> alarmArrayList = Collections.synchronizedList(new ArrayList());
    private final Map<String, Ticket_FYROM> ticketsArrayList = new ConcurrentHashMap();
    private ArrayList<String> vips = new ArrayList();
    private final ArrayList eventsLogArrayList = new ArrayList();
    private String myClock, myPreviousClock;
    private long shotsIncluded = 0;
    private Config myConfig;
    private boolean checkForAlarms = true;

    public Container(Config myConfig, String myPATH_DELIMETER) {
        this.PATH_DELIMETER = myPATH_DELIMETER;
        this.myConfig = myConfig;
        aggregations = new Counters_2D_decimal(2);
    }

    public int getCCMonitorStatsObjsContainerSize() {
        return aggregations.size();
    }

    public Ticket_FYROM findTicketBySR(String SR) {
        for (String myTicketId : ticketsArrayList.keySet()) {
            Ticket_FYROM myTicket = ticketsArrayList.get(myTicketId);
            if (myTicket.getSR() != null && myTicket.getSR().contains(SR)) {
                return myTicket;
            }
        }
        return null;
    }

    public void save_lastShot_to_database(String aggrType) throws Exception {
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8", "localhost");
        String driver = "com.mysql.jdbc.Driver";
        String connStr = "jdbc:mysql://" + diligent_db + ":3306/dslmon_skopia?user=sa&password=trinitron";
        aggregations.save_lastShot_to_database(driver, connStr, "aggregations", aggrType);
    }

    public boolean removeOldmessages() {
        boolean error = false;
        if (getMyClock() != null) {
            TimeStamp1 rightNow = new TimeStamp1(getMyClock());
            for (int i = eventsLogArrayList.size() - 1; i >= 0; i--) {
                TimeStamp1 commentsTimeStamp = new TimeStamp1(((String) eventsLogArrayList.get(i)).substring(0, 23));
                if (rightNow.hoursDiff(commentsTimeStamp) > 48)//48 hours
                {
                    try {
                        eventsLogArrayList.remove(i);
                    } catch (Exception e) {
                        error = true;
                    }
                }
            }
        } else {
            System.out.println("DSLMON_SKOPIA: Container:removeOldmessages: clock is null");
        }
        return error;
    }

    public boolean removeOldTickets(double days) {
        boolean error = false;
        if (getMyClock() != null) {
            TimeStamp1 rightNow = new TimeStamp1(getMyClock());
            for (String myTicketId : ticketsArrayList.keySet()) {
                Ticket myTicket = ticketsArrayList.get(myTicketId);
                TimeStamp1 endTimeStamp = new TimeStamp1(myTicket.getIncidentStoppedDate());
                if (rightNow.daysDiff(endTimeStamp) >= days || myTicket.getState().equals(Ticket.STATE_CANCELED)) {
                    try {
                        ticketsArrayList.remove(myTicketId);
                    } catch (Exception e) {
                        error = true;
                    }
                }
            }
        } else {
            System.out.println("DSLMON_SKOPIA: Container:removeOldTickets: clock is null");
        }
        return error;
    }

    public Paths_1D_decimal getLastAggregation() {
        return (Paths_1D_decimal) aggregations.getLastShot();
    }

    public Paths_1D_decimal getBeforeLastAggregation() {
        return (Paths_1D_decimal) aggregations.getBeforeLastShot();
    }

    public int include_aggregation(Paths_1D_decimal new_aggregation) throws Exception {
        synchronized (aggregations) {
            aggregations.update(new_aggregation.getHeader(), new_aggregation);
        }
        return aggregations.size();
    }

    public void flushToDisk(String aggrType) {
        try {
            System.out.println("Alarms flushToDisk...");
            List ticketsAsArrayList = getTicketsAsArrayList();
            if (!ticketsAsArrayList.isEmpty()) {
                //------------------ TICKETS --------------------

                try (Writer writer = new FileWriter(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/data/" + aggrType + "_tickets.flash")) {
                    Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
                    gson.toJson(this.getTicketsArrayList(), writer);
                } catch (IOException e) {
                    System.out.println("DSLMON_SKOPIA error:Tickets flushToDisk error");
                    new MailAlert().sendmailAlert("DSLMON_SKOPIA error:Tickets flushToDisk error", e);
                }
            }
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:flushToDisk error:" + e.toString());
        }

    }

    public void loadFromDisk(String aggrType) throws Exception {
        System.out.println("DSLMON_SKOPIA:Loading from disc");
        ticketsArrayList.clear();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/data/" + aggrType + "_tickets.flash"));
            // Map<String, Ticket_FYROM> ticketsArrayList = new ConcurrentHashMap();
            ticketsArrayList.clear();
            //Gson gson = new Gson();
            Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
            Type type = new TypeToken<Map<String, Ticket_FYROM>>() {
            }.getType();
            ticketsArrayList.putAll((Map<String, Ticket_FYROM>) gson.fromJson(bufferedReader, type));
            for (String key : ticketsArrayList.keySet()) {
                out.println(key + " " + ticketsArrayList.get(key).getElementsList().size());
            }
        } catch (IOException e) {
            System.out.println("DSLMON_SKOPIA error:Tickets flushToDisk error");
            new MailAlert().sendmailAlert("DSLMON_SKOPIA error:Tickets flushToDisk error", e);
        }

    }

    public Counters getAlertStats(String ObjName, String AlertStop, String AlertStart) {
        Counters statObjsCounters = new Counters();
        return statObjsCounters;
    }

    public List<Alarm_FYROM> getAlarmArrayList() {
        List<Alarm_FYROM> alarmArrayList = new ArrayList();
        List<Ticket_FYROM> ticketList = this.getTicketsAsArrayList();
        ticketList.forEach((myTicket)
                -> {
            alarmArrayList.addAll(myTicket.getElementsList());
        });
        return alarmArrayList;
    }

    public List<Alarm_FYROM> getAlarmArrayList_stillAlive() {
        List<Alarm_FYROM> alarmArrayList = new ArrayList();
        List<Ticket_FYROM> ticketList = this.getTicketsAsArrayList();
        for (Ticket_FYROM myTicket : ticketList) {
            for (Alarm_FYROM myAlarm : myTicket.getElementsList()) {
                if (myAlarm.isStilAlive()) {
                    alarmArrayList.add(myAlarm);
                }
            }
        }
        return alarmArrayList;
    }

    public String getMyClock() {
        return myClock;
    }

    public ArrayList getEventsLogArrayList() {
        return eventsLogArrayList;
    }

    //--------------------------------------------------------------
    //----------------------- private ------------------------------
    //--------------------------------------------------------------
    //-------------------- IP NETWORK RESOURCES----------------------------------                           
    public Counters_1D_decimal getShotsOfLabel(String resource, String aggrType) {
        try {
            String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8", "localhost");
            String driver = "com.mysql.jdbc.Driver";
            String connStr = "jdbc:mysql://" + diligent_db + ":3306/dslmon_skopia?user=sa&password=trinitron";
            return (Counters_1D_decimal) aggregations.getShotsOfLabel(resource, aggrType, driver,connStr, "aggregations");
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA: getQStatsObjsArrayList error:" + "DSLMON_SKOPIA: " + e.toString());
            return null;
        }
    }

    public void setMyClock(String myClockNew) {
        myPreviousClock = myClock;
        myClock = myClockNew;
    }
//0000000000000000000000000000000000000000000000000000000000000000000000000000000

    public int getSize() {
        return aggregations.size();
    }

    public void prepare(Paths_1D_decimal newAggregation) {
        try {
            this.setMyClock(newAggregation.getHeader());
            this.include_aggregation(newAggregation);
            System.out.println("DSLMON_SKOPIA: connections_2DCounters.size = " + aggregations.size());
            if (aggregations.size() == 2) {
                Paths_1D_decimal myLastShot = (Paths_1D_decimal) aggregations.getLastShot();
                System.out.println("myLastShot ok:" + myLastShot.size());
                Paths_1D_decimal myBeforeLastShot = (Paths_1D_decimal) aggregations.getBeforeLastShot();
                System.out.println("myBeforeLastShot ok:" + myBeforeLastShot.size());
                System.out.println("---------------IMS---------");
                System.out.println("DSLMON_SKOPIA:myClock=" + myClock + "  " + myPreviousClock);
                //            
                System.out.println("DSLMON_SKOPIA: connections_2DCounters.getFirstShot().getHeader() = " + ((Paths_1D_decimal) aggregations.getFirstShot()).getHeader());
                System.out.println("DSLMON_SKOPIA: connections_2DCounters.getBeforeLastShot().getHeader() = " + ((Paths_1D_decimal) aggregations.getBeforeLastShot()).getHeader());
                //System.out.println("DSLMON_SKOPIA: connections_2DCounters.getLastShot().getHeader() = " + ((Paths_1D_decimal) aggregations.getLastShot()).getHeader());
                //--------------------------------------------------------------
                try {
                    System.out.println("DSLMON_SKOPIA:connections_2DCounters.size() = " + aggregations.size());
                } catch (Exception e) {
                }
                if (((Paths_1D_decimal) aggregations.getFirstShot()).getHeader().equals(((Paths_1D_decimal) aggregations.getLastShot()).getHeader())) {
                    System.out.println("Diligent FATAL ERROR:connections_2DCounters.getFirstShot().getHeader().equals(disConnections_2DCounters.getLastShot().getHeader())!");
                    new MailAlert().sendmailAlert("Diligent FATAL ERROR:connections_2DCounters.getFirstShot().getHeader().equals(disConnections_2DCounters.getLastShot().getHeader())!", "Diligent FATAL ERROR");
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            new MailAlert().sendmailAlert("DSLMON_SKOPIA error:", e);
        }
    }

    public double getLastCount(String myLabel) {
        Counters_1D_decimal myLastShot = aggregations.getLastShot();
        Iterator itr = myLastShot.getKeysIterator();
        double count = 0;
        while (itr.hasNext()) {
            String label = (String) itr.next();
            if (label.equals(myLabel) || label.startsWith(myLabel + PATH_DELIMETER)) {
                count += myLastShot.getValue(label);
            }
        }
        return count;
    }

    public double getPreviousCount(String myLabel) {
        Counters_1D_decimal myLastShot = aggregations.getFirstShot();
        Iterator itr = myLastShot.getKeysIterator();
        double count = 0;
        while (itr.hasNext()) {
            String label = (String) itr.next();
            if (label.equals(myLabel) || label.startsWith(myLabel + PATH_DELIMETER)) {
                count += myLastShot.getValue(label);
            }
        }
        return count;
    }

    public void removeAggregationsFirstShot() {
        aggregations.removeFirstElement();
    }

    public Map<String, Ticket_FYROM> getTicketsArrayList() {
        return ticketsArrayList;
    }

    public Map<String, Ticket_FYROM> getPendingTicketsArrayList() {
        Map<String, Ticket_FYROM> tickets = new HashMap();
        for (String myTicketId : ticketsArrayList.keySet()) {
            Ticket_FYROM myTicket = ticketsArrayList.get(myTicketId);
            if (myTicket.isPending()) {
                tickets.put(myTicket.getTicketId(), myTicket);
            }
        }
        return tickets;
    }

    public Map<String, Ticket_FYROM> getOpenTicketsArrayList() {
        Map<String, Ticket_FYROM> tickets = new HashMap();
        for (String myTicketId : ticketsArrayList.keySet()) {
            Ticket_FYROM myTicket = ticketsArrayList.get(myTicketId);
            if (myTicket.isOpen()) {
                tickets.put(myTicket.getTicketId(), myTicket);
            }
        }
        return tickets;
    }

    public List<Ticket_FYROM> getTicketsAsArrayList() {
        List tickets = new ArrayList();
        for (String myTicketId : ticketsArrayList.keySet()) {
            Ticket_FYROM myTicket = ticketsArrayList.get(myTicketId);
            tickets.add(myTicket);
        }
        return tickets;
    }

    public boolean canSIEBEL_CLOSE(Ticket_FYROM myTicket, int OPEN_STATE_DURATION_MIN) {
        return false;
    }

    //******************************************************************
    //************************** K P I s *******************************
    //******************************************************************
    public Counters getRetainability(String from, String to) {
        TimeStamp1 T1from = new TimeStamp1(from);//last
        TimeStamp1 T1to = new TimeStamp1(to);//first
        double sessionHours = T1from.hoursDiff(T1to);
        Counters myScorers = getTopScorers_events(from, to);
        Counters myScorers1 = new Counters();
        for (String label : myScorers.keySet()) {
            double diconnProbability = myScorers.getCount(label) / sessionHours;
            double DSLRetainability = 100.0 * (1 - diconnProbability);
            myScorers1.updateCounters(label, DSLRetainability);
            //System.out.println("retain:"+myScorers.getLabel(i) + "  " + DSLRetainability);
        }
        return myScorers1;
    }

    public Counters getAvailability(String T1, String T2) {
        Counters myScorers = new Counters();
        long totalDur = new TimeStamp1(T1).secondsDiff(new TimeStamp1(T2));
        for (Object myAlarmObj : this.getAlarmArrayList()) {
            Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
            String alertOrigin = myAlarm.getObjName();
            TimeStamp1 start = new TimeStamp1(myAlarm.getAlertStart());
            TimeStamp1 stop = new TimeStamp1(myAlarm.getAlarmStop());
            long alarmDur = stop.secondsDiff(start);
            if (myAlarm.getAlertStart().compareTo(T2) > 0 && myAlarm.getAlertStart().compareTo(T1) < 0) {
                myScorers.updateCounters(alertOrigin, alarmDur);
            }
        }
        Counters myScorers1 = new Counters();
        for (String label : myScorers.keySet()) {
            double diconnProbability = 1.0 * myScorers.getCount(label) / totalDur;
            double DSLAvailability = 100.0 * (1 - diconnProbability);
            myScorers1.updateCounters(label, DSLAvailability);
            //System.out.println("avail:"+myScorers.getLabel(i) + "  " + DSLAvailability);
        }
        return myScorers1;
    }

    public Counters getTopScorers_events(String T1, String T2) {
        Counters myScorrers = new Counters();
        this.getAlarmArrayList().forEach((myAlarmObj)
                -> {
            try {
                Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
                String alertOrigin = myAlarm.getNetworkElementName();
                if (alertOrigin != null && myAlarm.getAlertStart().compareTo(T2) > 0 && myAlarm.getAlertStart().compareTo(T1) < 0) {
                    myScorrers.updateCounters(alertOrigin);
                }
            } catch (Exception e) {
                System.out.println("getTopScorers_events error:" + e.toString());
            }
        });
        myScorrers.calculatePercValues();
        return myScorrers;
    }

    public Counters getTopScorers_impact(String T1, String T2) {
        Counters myScorrers = new Counters();
        for (Object myAlarmObj : this.getAlarmArrayList()) {
            try {
                Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
                String alertOrigin = myAlarm.getObjName();
                TimeStamp1 start = new TimeStamp1(myAlarm.getAlertStart());
                TimeStamp1 stop = new TimeStamp1(myAlarm.getAlarmStop());
                double humanMins = stop.minutesDiff(start);
                double ekmet = (humanMins * myAlarm.getLinesDisconnected()) / 60;
                if (alertOrigin != null && myAlarm.getAlertStart().compareTo(T2) > 0 && myAlarm.getAlertStart().compareTo(T1) < 0) {
                    myScorrers.updateCounters(alertOrigin, ekmet);
                }
            } catch (Exception e) {
                System.out.println("getTopScorers_events error:" + e.toString());
            }
        }
        return myScorrers;
    }

    /**
     * @return the checkForAlarms
     */
    public boolean isCheckForAlarms() {
        return checkForAlarms;
    }

    /**
     * @param checkForAlarms the checkForAlarms to set
     */
    public void setCheckForAlarms(boolean checkForAlarms) {
        this.checkForAlarms = checkForAlarms;
    }

    /**
     * @return the myConfig
     */
    public Config getMyConfig() {
        return myConfig;
    }

    /**
     * @param myConfig the myConfig to set
     */
    public void setMyConfig(Config myConfig) {
        this.myConfig = myConfig;
    }

    /**
     * @return the vips
     */
    public ArrayList<String> getVips() {
        return vips;
    }

    /**
     * @param vips the vips to set
     */
    public void setVips(ArrayList<String> vips) {
        this.vips = vips;
    }

    /**
     * @return the shotsIncluded
     */
    public long getShotsIncluded() {
        return shotsIncluded;
    }

    /**
     * @param shotsIncluded the shotsIncluded to set
     */
    public void setShotsIncluded(long shotsIncluded) {
        this.shotsIncluded = shotsIncluded;
    }

    public Map<String, Patern> getTraffic_paterns() {
        return traffic_paterns;
    }

    public static void main(String[] args) {

        try {

            /*
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/data/TYPE_COPPER_CABLE_tickets.flash"));
            Map<String, Ticket_FYROM> ticketsArrayList = new ConcurrentHashMap();
            ticketsArrayList.clear();
            Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
            Type type = new TypeToken<Map<String, Ticket_FYROM>>() {
            }.getType();
            ticketsArrayList.putAll((Map<String, Ticket_FYROM>) gson.fromJson(bufferedReader, type));
            for (String key : ticketsArrayList.keySet()) {
                System.out.println(key);
            }*/
            Config myConfig = new Config();
            myConfig.load();
            Container myContainer = new Container(myConfig, ";");
            myContainer.loadFromDisk("TYPE_COPPER_CABLE");
            //
            myContainer.flushToDisk("TYPE_COPPER_CABLE_1");
        } catch (Exception e) {
            e.printStackTrace();
            //new MailAlert().sendmailAlert("DSLMON_SKOPIA error:Tickets flushToDisk error", e);
        }
    }
}
