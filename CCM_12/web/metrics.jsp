<%@page import="java.util.Map"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%@page import="nsofiasLib.time.TimeStamp1"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.HashMap"%>

<%
    Map<String, Object> m = new HashMap();
    ServletContext context = request.getServletContext();
    Map<String, SimpleDaemon> daemons = (Map<String, SimpleDaemon>) context.getAttribute("daemons");
    for (String daemonName : daemons.keySet()) {
        SimpleDaemon myDaemon = daemons.get(daemonName);
        m.putAll(myDaemon.getMetrics());
    }
    out.println(new Gson().toJson(m));
%>