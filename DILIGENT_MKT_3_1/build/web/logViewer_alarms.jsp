<%@page import="nsofiasLib.utils.URLContextReader_object,java.util.Iterator,nsofiasLib.utils.CmdProcessBuilder,nsofiasLib.utils.mapper.Mapper,java.io.InputStreamReader,java.io.InputStream,nsofiasLib.utils.MailSender_new,nsofiasLib.time.TimeStamp1,java.util.List,java.util.Properties,java.io.FileInputStream,java.util.Collections,nsofiasLib.time.TimeStamp1,nsofiasLib.utils.Counters,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,nsofiasLib.utils.Counters,nsofiasLib.utils.FTPDaemon,java.text.NumberFormat,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,nsofiasLib.fileIO.FileParser2Daemon,java.util.ArrayList,java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String flush = request.getParameter("flush");
    String errors = request.getParameter("errors");
    String notice = request.getParameter("notice");
    if (notice == null)
        {
        notice = "!@#$%";
        }
%>
<form action="logViewer_alarms.jsp">
    <input type="submit" value="refresh" name="refresh" />
    <input type="submit" value="flush" name="flush" />
    <input type="submit" value="errors" name="errors" />
    <input type="text" name="notice" value="" />
</form>


<%
    if (flush != null)
        {
        try
            {
            try
                {
                List<String> cmd = new ArrayList();
                cmd.add("/bin/bash");
                cmd.add("-c");
                cmd.add("> "+System.getenv("APPLICATIONS_PATH") + "/my.log");
                new CmdProcessBuilder().runCommand(cmd).toString();
                }
            catch (Exception e)
                {
                out.println(e.toString());
                }
            }
        catch (Exception e)
            {
            out.println("error:" + e.toString());
            }

        }
    //-----------------------------------
    if (errors != null)
        {
        try
            {
            String body = "";
            try
                {
                List<String> cmd = new ArrayList();
                //cmd.add("/bin/bash");
                //cmd.add("ping");
                //cmd.add("localhost");
                cmd.add("tail");
                cmd.add("-n10000");
                cmd.add("/opt/tomcat/apache-tomcat-8.5.37/logs/catalina.out");
                body += ("<p><h1>Diligent log file</h1>");
                String text[] = new CmdProcessBuilder().runCommand(cmd).toString().split("\n");
                for (String line : text)
                    {
                    if (line.contains("Exception") || line.contains("error") || line.contains("ERROR") || line.contains("Error"))
                        {
                        line = line.replace("\n", "<p>").replace("Exception", "<b><font color='red'>Exception</font></b>");
                        line = line.replace("\n", "<p>").replace("error", "<b><font color='red'>error</font></b>");
                        line = line.replace("\n", "<p>").replace("ERROR", "<b><font color='red'>error</font></b>");
                        line = line.replace("\n", "<p>").replace("Error", "<b><font color='red'>error</font></b>");
                        line = line.replace("SKOPIA", "MKT");
                        out.println("<p>" + line);
                        }
                    }

                }
            catch (Exception e)
                {
                body += e.toString();
                }
            }
        catch (Exception e)
            {
            out.println("error:" + e.toString());
            }
        }
    else
        {
        try
            {
            String body = "";
            try
                {
                List<String> cmd = new ArrayList();
                //cmd.add("/bin/bash");
                //cmd.add("ping");
                //cmd.add("localhost");
                cmd.add("tail");
                cmd.add("-n10000");
                cmd.add("/opt/tomcat/apache-tomcat-8.5.37/logs/catalina.out");
                body += ("<p><h1>Diligent log file</h1>");
                body += new CmdProcessBuilder().runCommand(cmd).toString()
                        .replace("Exception", "<b><font color='red'>Exception</font></b>")
                        .replace(notice, "<b><font color='red'>"+notice+"</font></b>")
                        .replace("\n", "<p>")
                        .replace("SKOPIA", "MKT");;
                out.println(body);
                }
            catch (Exception e)
                {
                body += e.toString();
                }
            }
        catch (Exception e)
            {
            out.println("error:" + e.toString());
            }
        }
    out.flush();
%>







