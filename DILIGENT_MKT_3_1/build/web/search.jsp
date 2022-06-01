<%-- 
    Document   : correlation_info
    Created on : Jan 7, 2019, 2:37:46 PM
    Author     : nsofias
--%><%@page import="java.net.URLEncoder,nsofiasLib.utils.URLContextReader_object,java.io.FileInputStream,java.io.InputStreamReader,java.util.Properties,nsofiasLib.ote.alarms.*,java.util.Iterator,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02,03,04";%>
<%@ include file = "sequrityPart.jsp"%>
<%
//----------- sequrity----------------
    try
        {
        if (!userTypes.contains(userType))
            {
            %>
            <font face="Verdana" size="3" color="#000080">Sorry, you are not authorized to view this page!!!</font>
            <%return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------
%>

<%String search = request.getParameter("search");
    if (search == null)
        {
        search = "";
        }
    else
        {
        search = search.trim();
        }%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Correlation info</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>
        <h1>Customer Status Page</h1>
        <form name="F1" action="search.jsp">
            <h2>Please insert a line id (p.ex. F20392290)<h2>
                    <input type="text" name="search" value="<%=search%>" size="40" />
                    <input type="submit" value="Submit" name="Submit" />
                    </form>  
                    <%
                        if (search != null && !search.isEmpty())
                            {
                            String RETRIEVE_URL = getUrl() + "?search=" + URLEncoder.encode(search);
                            URLContextReader_object myUrlReader = new URLContextReader_object();
                            ArrayList<String> lines = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);
                            for (String line : lines)
                                {
                                out.println("<p>" + line);
                                }
                            }
                    %>

                    <%!
                        String getUrl()
                            {
                            Properties properties = new Properties();
                            String APPLICATIONS_PATH = System.getenv("APPLICATIONS_PATH");//C:/my files/data/access7
                            try (FileInputStream myStream = new FileInputStream(APPLICATIONS_PATH + "/DSLMON_SKOPIA/conf/parameters.properties"))
                                {
                                properties.load(new InputStreamReader(myStream, "UTF8"));
                                return properties.getProperty("RETRIEVE_URL");
                                }
                            catch (Exception e)
                                {
                                return "";
                                }
                            }
                    %>
                    </body>
                    </html>

