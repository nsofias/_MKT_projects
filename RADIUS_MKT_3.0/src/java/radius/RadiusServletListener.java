/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

//import com.sun.webkit.Timer;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import nsofiasLib.fileIO.CSV_LineParser;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.fileIO.FileParser2Daemon;

/**
 * Web application lifecycle listener.
 *
 * @author nsofias
 */
@WebListener()
public class RadiusServletListener implements ServletContextListener
    {
    HealthCheckerDaemon myHealthCheckerDaemon;
    FileParser2Daemon myRADIUSFileParserDaemon;
    Config myConfig = new Config();

    @Override
    public void contextInitialized(ServletContextEvent sce)
        {
        try
            {
            ServletContext myContext = sce.getServletContext();
            myConfig.load();
            CSV_LineParser myCSVLineParser = new CSV_LineParser();
            FileParser2 myFileParser = new FileParser2(myCSVLineParser);
            myCSVLineParser.setSplitterStr("\t");
            RadiusLog_LineParserListener myRadiusLog_LineParserListener = new RadiusLog_LineParserListener(4, 2, 17, "interim-update,start", "stop");
            //****************************************************************************
            ConcurrentHashMap<String, Set<String>> stopEvents = new ConcurrentHashMap<>();
            myRadiusLog_LineParserListener.setStopEvents(stopEvents);
            //****************************************************************************
            try
                {
                myRadiusLog_LineParserListener.loadFromDisk(myConfig.getMainDirectory() + "/conf/sesions");
                }
            catch (Exception e)
                {
                System.out.println(myConfig.getMainDirectory() + "/conf/sesions file not found");
                }
            myCSVLineParser.addListeners(myRadiusLog_LineParserListener);
            String DSLFileLineParserDir = myConfig.getDSLFileLineParser_dir();
            String DSLFileLineParserExt = myConfig.getDSLFileLineParser_ext();
            myFileParser.setRemoveFiles(true);//myDSLFileParser.setRenameFiles(true);
            myFileParser.setRememberFilenames(false);
            myFileParser.setEND_LINE("<File End>");
            myRADIUSFileParserDaemon = new FileParser2Daemon(myFileParser, DSLFileLineParserDir, DSLFileLineParserExt, 5000);//every 10s
            myRADIUSFileParserDaemon.setRunning(true);
            myRADIUSFileParserDaemon.setVerbal(false);
            Thread myFileParser2DaemonThread = new Thread(myRADIUSFileParserDaemon);
            myFileParser2DaemonThread.start();
            myContext.setAttribute("container", myRadiusLog_LineParserListener);
            myContext.setAttribute("fileParserDaemon", myRADIUSFileParserDaemon);
            //------------------------- HealthCheckerDaemon Schedule to run every 900 secs =15 mins ------------------------
            myHealthCheckerDaemon = new HealthCheckerDaemon(myConfig,myRadiusLog_LineParserListener, 20000);
            myHealthCheckerDaemon.setRunning(true);
            Thread myHealthCheckerDaemonThread = new Thread(myHealthCheckerDaemon);
            myHealthCheckerDaemonThread.start();
            //------------------
            }
        catch (Exception e)
            {
            System.out.println("RadiusServletListener" + e);
            }
        }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
        {
        ServletContext myContext = sce.getServletContext();
        RadiusLog_LineParserListener myRadiusLog_LineParserListener = (RadiusLog_LineParserListener) myContext.getAttribute("container");
        myRADIUSFileParserDaemon.setRunning(false);
        myHealthCheckerDaemon.setRunning(false);
        int counter = 0;
        try
            {
            while (!myRADIUSFileParserDaemon.isStopped() && myHealthCheckerDaemon.isStopped() && counter < 20)
                {
                Thread.sleep(2000);
                System.out.println("DSLMON: " + counter + " " + myRADIUSFileParserDaemon.isStopped());
                counter++;
                }
            }
        catch (Exception e)
            {
            System.out.println("DSLMON:" + e.toString());
            }
        finally
            {
            myRadiusLog_LineParserListener.flushToDisk(myConfig.getMainDirectory() + "/conf/sesions");
            System.out.println("DSLMON:--->flushing To Disk");
            }
        }

    public static void main(String[] args)
        {
        try
            {
            CSV_LineParser myCSVLineParser = new CSV_LineParser();
            FileParser2 myFileParser = new FileParser2(myCSVLineParser);
            myCSVLineParser.setSplitterStr(";");
            myCSVLineParser.keepResultsMapped(0);
            RadiusLog_LineParserListener myContainerUpdate_LineParserListener = new RadiusLog_LineParserListener(4, 2, 17, "interim-update,start", "stop");
            myCSVLineParser.addListeners(myContainerUpdate_LineParserListener);
            myFileParser.parse_file("C:/myTests/acct-20181114-01.logSK-FCAR-2_20181114120502081");
            /*
            Map<String, String[]> mappedObjs = myCSVLineParser.getMappedObjs();
            for (Iterator<String> it = mappedObjs.keySet().iterator(); it.hasNext();)
                {
                String myLabel = it.next();
                System.out.println(myLabel + " " + Arrays.toString(mappedObjs.get(myLabel)));
                }
            System.out.println(Arrays.toString(mappedObjs.get("520052")));*/
            }
        catch (Exception e)
            {
            e.printStackTrace();
            }
        }
    }
