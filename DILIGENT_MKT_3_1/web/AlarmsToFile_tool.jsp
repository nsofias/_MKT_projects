<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="java.sql.ResultSet,nsofiasLib.databases.DatabaseLogger,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="application/csv"%>
<%    
    response.setHeader("Content-type","text/csv");
    response.setHeader("Content-disposition","inline; filename="+ "myAlarms.csv");
    String from_timestamp = request.getParameter("from");
    String to_timestamp = request.getParameter("to");
    ResultSet res;
    if (from_timestamp == null || to_timestamp == null)
        {
        out.println("dates????"); return;
        }
    try
        {
        from_timestamp = from_timestamp + "T000000.000";
        to_timestamp = to_timestamp + "T235959.000";
        //--------------------------
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        //-------
        String sqlStr = "select * from dslmon_skopia.alarms where objTime >= '" + from_timestamp + "' && objTime <= '" + to_timestamp + "'";
        res = myDatabaseLogger.getResults(sqlStr);
        out.println("objName;objTime;alertType;alertStart;alertStop;alertOrigin;stilAlive;criticality;alertDesc;disConnections;ticket_sr");
        while (res.next())
            {
            //objName+";"+objTime+";"+alertType+";"+alertStart+";"+alertStop+";"+alertOrigin+";"+stilAlive+";"+criticality+";"+alertDesc+";"+disConnections+";"+ticket_sr;                
            String objName = res.getString("objName").replace(";", ":");
            String objTime = res.getString("objTime");
            String alertType = res.getString("alertType");
            String alertStart = res.getString("alertStart");
            String alertStop = res.getString("alertStop");
            String alertOrigin = res.getString("alertOrigin").replace(";", ":");;
            String stilAlive = res.getString("stilAlive");
            String criticality = res.getString("criticality");
            String alertDesc = res.getString("alertDesc");
            String disConnections = res.getString("disConnections");
            String ticket_sr = res.getString("ticket_sr");
            out.println(objName + ";" + objTime + ";" + alertType + ";" + alertStart + ";" + alertStop + ";" + alertOrigin + ";" + stilAlive + ";" + criticality + ";" + alertDesc + ";" + disConnections + ";" + ticket_sr);
            }
        res.close();
        }
    catch (Exception e)
        {
        out.println(e.toString());
        }
%>        
