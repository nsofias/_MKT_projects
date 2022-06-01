<%@page import="diligent_MKT.PathRetrieverFactory"%>
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.PathsRetriever"%>
<%@page import="diligent_MKT.NCDB"%>
<%@page import="java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<% String userTypes = "00";%>
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
<%-- 
    Document   : formatErrors
    Created on : Jan 23, 2019, 2:55:30 PM
    Author     : nsofias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="global_1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diligent input flow Data Format Errors Report</title>
    </head>
    <body>
        <%
            String NCDBCheck = request.getParameter("NCDBCheck");
            out.println("<h1> DiligentMKT input format errors on " + new TimeStamp1().getNowFormated() + "</h1>");
            create_DiliAgent_DataFormatErrors_Report(NCDBCheck, out);
        %>
    </body>
</html>

<%!
    public void create_DiliAgent_DataFormatErrors_Report(String NCDBCheck, JspWriter out)
        {
        if (NCDBCheck != null)
            {
            ArrayList<String> myNCDBlist;
            try
                {
                myNCDBlist = NCDB.getDslamsDistinct();
                }
            catch (Exception e)
                {
                return;
                }
            //----------- copper ----------
            try
                {
                String str = "<p><h1>COPPER (NCDBCheck)</h1>";
                str += "<p><h1>COPPER Dslams (NCDBCheck)</h1>";
                PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_COPPER);
                ArrayList<String> mylist = myPathsRetriever.retrieveElements(3);
                out.println("Got " + mylist.size() + " dslams from RADIUS");
                out.println("Got " + myNCDBlist.size() + " dslams drom NCDB");
                out.flush();
                str += "<table width='100%'  border='1'>";
                for (String s : mylist)
                    {
                    //System.out.println(s);
                    if (!myNCDBlist.contains(s))
                        {
                        str += "<tr nowrap><td>DSLAM " + s + " not found in NCDB</td></tr>";
                        out.flush();
                        }
                    }
                str += "</table>";
                out.println(str);
                out.flush();
                }
            catch (Exception e)
                {
                }
            //----------- gpon ----------
            try
                {
                String str = "<p><h1>GPON (NCDBCheck)</h1>";
                str += "<p><h1>COPPER OLTs (NCDBCheck)</h1>";
                PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_GPON);
                ArrayList<String> mylist = myPathsRetriever.retrieveElements(2);
                out.println("Got " + mylist.size() + " OLTs from RADIUS");
                out.println("Got " + myNCDBlist.size() + " OLTs drom NCDB");
                out.flush();
                str += "<table width='100%'  border='1'>";
                for (String s : mylist)
                    {
                    //System.out.println(s);
                    if (!myNCDBlist.contains(s))
                        {
                        str += "<tr nowrap><td>OLT " + s + " not found in NCDB</td></tr>";
                        out.flush();
                        }
                    }
                str += "</table>";
                out.println(str);
                out.flush();
                }
            catch (Exception e)
                {
                }
            }
        //**************************************************************************
        //**************************************************************************
        //**************************************************************************
        try
            {
            String str = "<p><h1>COPPER</h1>";
            PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_COPPER);
            ArrayList<String> errors = myPathsRetriever.retrieveAggrErrors();
            str += "<table width='100%'  border='1'>";
            for (String s : errors)
                {
                //System.out.println(s);
                str += "<tr nowrap><td>" + s + "</td></tr>";
                }
            str += "</table>";
            out.println(str);
            out.flush();
            }
        catch (Exception e)
            {
            }
        //------------------------------
        try
            {
            String str = "<p><h1>COPPER(passive)</h1>";
            PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_COPPER_CABLE);
            ArrayList<String> errors = myPathsRetriever.retrieveAggrErrors();
            str += "<table width='100%'  border='1'>";
            for (String s : errors)
                {
                //System.out.println(s);
                str += "<tr nowrap><td>" + s + "</td></tr>";
                }
            str += "</table>";
            out.println(str);
            out.flush();
            }
        catch (Exception e)
            {
            }
        //------------------------------
        try
            {
            String str = "<p><h1>GPON</h1>";
            PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_GPON);
            ArrayList<String> errors = myPathsRetriever.retrieveAggrErrors();
            str += "<table width='100%'  border='1'>";
            for (String s : errors)
                {
                //System.out.println(s);
                str += "<tr nowrap><td>" + s + "</td></tr>";
                }
            str += "</table>";
            out.println(str);
            out.flush();
            }
        catch (Exception e)
            {
            }
        //------------------------------
        try
            {
            String str = "<p><h1>GPON (Passive)</h1>";
            PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_GPON_CABLE);
            ArrayList<String> errors = myPathsRetriever.retrieveAggrErrors();
            str += "<table width='100%'  border='1'>";
            for (String s : errors)
                {
                //System.out.println(s);
                str += "<tr nowrap><td>" + s + "</td></tr>";
                }
            str += "</table>";
            out.println(str);
            out.flush();
            }
        catch (Exception e)
            {
            }

        }
%>