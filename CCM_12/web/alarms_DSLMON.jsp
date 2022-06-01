<%@page import="ccm.OTE.DSLMONInfo_object"%>
<%@page import="ccm.OTE.DslmonAlarm"%>
<%@page import="nsofiasLib.others.Parameters,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    DSLMONInfo_object myDSLMONInfo_object = new DSLMONInfo_object();
    System.setProperty("http.proxyHost", "");
    System.setProperty("http.proxyPort", "");
    ArrayList<DslmonAlarm> alarmArrayList = new ArrayList();
    try{
        String diligent_ip = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "diligent", "UTF8");
    alarmArrayList = myDSLMONInfo_object.getDslmonAlarms("http://"+diligent_ip+":8080/DSLMON/alarmsWS_servlet");
    }catch(Exception e){out.println("Dili@gent is (at the moment) not available!!!");return;}    
    Collections.sort(alarmArrayList);  
    %>
<html>
   

    <head>
        <title>Alarms</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    
    
    <body>     
<%             
        String type = request.getParameter("type");
        if (type==null || type.isEmpty())
            type="ALL";
        //---------
        int criticality=50;
        try{
            criticality = Integer.parseInt(request.getParameter("criticality"));    
            }
        catch(Exception e){}                        
        //-----------------
        String status = request.getParameter("status");
        if (status==null || status.isEmpty())
            status="ALL";                  
%> 

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="diliEvents.png" />
<p>
            <table  border='1'>
            <tr bgcolor="LightBlue">
            <th>Resource Type</th>
            <th>Bras : Dslam : DslamCard</th>           
            <th>Dili@event info</th>
            </tr>
            
<%

             for ( DslmonAlarm myAlarm:alarmArrayList)
                {
                if (myAlarm.getTicket_sr().startsWith("#") || myAlarm.getTicket_sr().startsWith("$"))
                    {
                    continue;
                    }                     
                if (status.contains("alive") && !myAlarm.isStilAlive())
                    {
                    continue;
                    }                
                if (
/*                   (type.equals("BRAS") && myAlarm.getAlertType()!=DslmonAlarm.brasCallsUp)||
                   (type.equals("DSLAM") && myAlarm.getAlertType()!=DslmonAlarm.dslamCallsUp)||*/
                   (type.equals("CARD") && myAlarm.getAlertType()!=DslmonAlarm.cardCallsUp)
                   )
                    {
                    continue;
                    } 
                if ( myAlarm.getDisConnections()<criticality)
                    {
                    continue;
                    }
                String AlertOrigin = myAlarm.getAlertOrigin();
                AlertOrigin = AlertOrigin.replaceAll(";", " : ");                
                TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlertStart());
                TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlertStop());
                TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlertStart());
                T0.addSeconds(-7400);
                String AlertStart = T1.getNowFormated();
                String AlertStop = T2.getNowFormated();                
                int AlertType = myAlarm.getAlertType();
                String AlertTypeS="";
                if (AlertType==DslmonAlarm.brasCallsUp)
                    {
                    AlertTypeS="BRAS";
                    }
                else if (AlertType==DslmonAlarm.dslamCallsUp)
                    {
                    AlertTypeS="DSLAM";
                    }
                else if (AlertType==DslmonAlarm.cardCallsUp)
                    {
                    AlertTypeS="CARD";      
                    }

                String bgcolor="#E5E4E2";
                String desc = "";
                if (myAlarm.getTicket_sr().startsWith("MTT"))
                    {
                    desc = "ΜΤΤ SR (ΜΕΤΑΓΩΓΗ): <font color='green'>"+myAlarm.getTicket_sr()+"</font>  ( "+myAlarm.getDisConnections()+" disconnections on "+AlertStart.substring(0, 16)+")";
                    }
                else
                    {
                    desc = "ΝΤΤ SR: <font color='green'>"+myAlarm.getTicket_sr()+"</font>  ( "+myAlarm.getDisConnections()+" disconnections on "+AlertStart.substring(0, 16)+")";
                    }
                String color="green";
                if (myAlarm.getDisConnections()>250)
                    color="red";
                if (myAlarm.isStilAlive())
                    {%>                            
                    <tr>  
                        <td nowrap><b><%=AlertTypeS%></b></td>                    
                        <td nowrap><b><font color='<%=color%>'><%=AlertOrigin%></font></b></td>                      
                        <td nowrap><b><%=desc%></b></td>                                                
                        <td><b>alive</b></td>
                    </tr> 
<%                  }
                else
                    { %>
                    <tr bgcolor="<%=bgcolor%>">
                        <td nowrap><%=AlertTypeS%></td>
                        <td nowrap><%=AlertOrigin%></td>                     
                        <td nowrap><%=desc%></td> 
                        <td>old</td>
                    </tr> 
<%                  }                    
                }
%>
        
        </table>
    </body>
</html>

