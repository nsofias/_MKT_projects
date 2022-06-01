<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="java.util.ArrayList,nsofiasLib.utils.mapper.*,nsofiasLib.databases.DatabaseParser,nsofiasLib.time.TimeStamp1,java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <head>
        <title>Unusual patterns</title>
        <link rel="stylesheet" href="global_1.css">
    </head>


    <body>     
<h1>Unusual (time) patterns during last month</h1>
<%
        Counters_1D sourceCounters = null;
        LineGroupper myLineGroupper;
        DatabaseParser myDatabaseParser;
        String classForName = "com.mysql.jdbc.Driver";
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        String connectionString = "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron";
        String user = "sa";
        String password = "trinitron";
        TimeStamp1 startTimeStamp =new TimeStamp1();
        startTimeStamp.addDays(-30);
        String startTime = startTimeStamp.getNowUnformated();
        String sql = "SELECT * FROM dslmon_skopia.alarms where objTime > '"+startTime+"' order by objTime Desc ";
        try
            {

            //---------------
            myLineGroupper = new LineGroupper(new int[]
                {
                0
                }, ",");//group sourxes
            //            ------------------------------------------------------------
            myDatabaseParser = new DatabaseParser(myLineGroupper, classForName, connectionString, user, password);
            myDatabaseParser.parse_databaseRecords(sql);
            //
            sourceCounters = myLineGroupper.getAggregationResults();
            sourceCounters.sortByValue();
            //sourceCounters.sortByKey();
            //sourceCounters.display();
            }
        catch (Exception e)
            {
            e.printStackTrace();
            }
        //=============================================================================  
        if (sourceCounters == null)
            {
            return;
            }
        //----------------------------------------------------------------
        Iterator sourceIterator = sourceCounters.getKeysIterator();
        while (sourceIterator.hasNext())
            {
            try
                {
                String nextsource = (String) sourceIterator.next();
                if (sourceCounters.getCount(nextsource) > 5)
                    {
                    //System.out.println("Parsing resource = " + nextsource);
                    myLineGroupper = new LineGroupper(new int[]
                        {
                        1
                        }, ",");
                    myLineGroupper.setLineMustContain(nextsource);
                    //
                    myDatabaseParser = new DatabaseParser(myLineGroupper, classForName, connectionString, user, password);
                    sql = "SELECT * FROM dslmon_skopia.alarms  where objName = '"+nextsource+"' AND objTime > '"+startTime+"' order by objTime Desc limit 60000";
                    myDatabaseParser.parse_databaseRecords(sql);
                    Counters_1D timestampsCounters = myLineGroupper.getAggregationResults();
                    timestampsCounters.sortByKey();
                    //timestampsCounters.display();
                    //------------------------                
                    ArrayList myTimeStampsDiff = new ArrayList();
                    Iterator myIteratorT = timestampsCounters.getKeysIterator();
                    String thisT = (String) myIteratorT.next();
                    while (myIteratorT.hasNext())
                        {
                        String nextT = (String) myIteratorT.next();
                        double diff = new TimeStamp1(nextT).minutesDiff(new TimeStamp1(thisT));
                        myTimeStampsDiff.add(diff);
                        thisT = nextT;
                        }
                    double mean = myLineGroupper.getMean(myTimeStampsDiff);
                    double deviation = myLineGroupper.getDeviation(myTimeStampsDiff);
                   if (mean / deviation > 2 && mean > 60)
                        {
                        out.println("<p><b>"+nextsource +" </b>is repeating almost every "+ (int)mean/60+" hours  for (at least) " + sourceCounters.getCount(nextsource) + " times");
                        }
                    }
                }
            catch (Exception e)
                {
                e.printStackTrace();
                }
            }

        

%>




    </body>
</html>