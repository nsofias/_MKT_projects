<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="java.sql.ResultSet,nsofiasLib.databases.DatabaseLogger,java.util.Collections,nsofiasLib.utils.Counters1,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
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
<%
    String from_timestamp = request.getParameter("from");
    String to_timestamp = request.getParameter("to");
    ResultSet res;

    TimeStamp1 from = new TimeStamp1();
    from.addHours(-24);
    from_timestamp = from.getNowUnformated();
 
    TimeStamp1 to = new TimeStamp1();
    to_timestamp = to.getNowUnformated();

    String from_timestamp_ = from.getNowFormated().substring(0, 16);
    String to_timestamp_ = to.getNowFormated().substring(0, 16);
    //------------------------------------------
    Counters1 myCounters = new Counters1();
    try {
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        //-------
        String sqlStr = "select actionType,actionResult from Actor.actions where actionReportedDate >= '" + from_timestamp + "' && actionReportedDate <= '" + to_timestamp + "'";
        res = myDatabaseLogger.getResults(sqlStr);
        while (res.next()) {
            //objName+";"+objTime+";"+alertType+";"+alertStart+";"+alertStop+";"+alertOrigin+";"+stilAlive+";"+criticality+";"+alertDesc+";"+disConnections+";"+ticket_sr;                
            String actionResult = res.getString("actionResult");
            String actionType = res.getString("actionType");
            if (actionType.equals("SVTIssue_action")) {
                myCounters.updateCounters("ORDS");
                if (actionResult != null && !actionResult.equals("null")) {
                    myCounters.updateCounters("PROCESSED");
                }
            }
            if (actionResult.startsWith("SVT_TRANSPORT_NOK")) {
                myCounters.updateCounters("SVT_TRANSPORT_NOK");
            }
            if (actionResult.startsWith("SVT_OK")) {
                myCounters.updateCounters("SVT_OK");
            }
            if (actionResult.startsWith("SVT_NOK")) {
                myCounters.updateCounters("SVT_NOK");
            }
            if (actionResult.startsWith("EML_OK")) {
                myCounters.updateCounters("EML_OK");
            }
            if (actionResult.startsWith("EML_ERROR")) {
                myCounters.updateCounters("EML_ERROR");
            }
            if (actionResult.startsWith("CRM_OK")) {
                myCounters.updateCounters("CRM_OK");
            }
            if (actionResult.startsWith("CRM_ERROR")) {
                myCounters.updateCounters("CRM_ERROR");
            }
            if (actionResult.startsWith("CRM_INCIDENT_FOUND")) {
                myCounters.updateCounters("CRM_INCIDENT_FOUND");
            }
        }
        res.close();
    } catch (Exception e) {
        out.println(e.toString());
    }
    myCounters.displayCounters();
    long ORDS = (long) myCounters.getValue("ORDS", "DEFAULT_PARAMETER");
    long PROCESSED = (long) myCounters.getValue("PROCESSED", "DEFAULT_PARAMETER");
    long SVT_TRANSPORT_NOK = (long) myCounters.getValue("SVT_TRANSPORT_NOK", "DEFAULT_PARAMETER");
    long SVT_OK = (long) myCounters.getValue("SVT_OK", "DEFAULT_PARAMETER");
    long SVT_NOK = (long) myCounters.getValue("SVT_NOK", "DEFAULT_PARAMETER");
    long EML_OK = (long) myCounters.getValue("EML_OK", "DEFAULT_PARAMETER");
    long EML_ERROR = (long) myCounters.getValue("EML_ERROR", "DEFAULT_PARAMETER");
    long CRM_OK = (long) myCounters.getValue("CRM_OK", "DEFAULT_PARAMETER");
    long CRM_ERROR = (long) myCounters.getValue("CRM_ERROR", "DEFAULT_PARAMETER");
    long CRM_INCIDENT_FOUND = (long) myCounters.getValue("CRM_INCIDENT_FOUND", "DEFAULT_PARAMETER");
%>        


<html xmlns:v="urn:schemas-microsoft-com:vml"
      xmlns:o="urn:schemas-microsoft-com:office:office"
      xmlns:p="urn:schemas-microsoft-com:office:powerpoint"
      xmlns:oa="urn:schemas-microsoft-com:office:activation"
      xmlns="http://www.w3.org/TR/REC-html40">
    <head>
        <meta http-equiv=Content-Type content="text/html; charset=windows-1253">
            <meta name=ProgId content=PowerPoint.Slide>
                <meta name=Generator content="Microsoft PowerPoint 12">
                    <link id=Main-File rel=Main-File href="../Presentation1.htm">
                        <link rel=Preview href=preview.wmf>
                            <!--[if !mso]>
                            <style>
                            v\:* {behavior:url(#default#VML);}
                            o\:* {behavior:url(#default#VML);}
                            p\:* {behavior:url(#default#VML);}
                            .shape {behavior:url(#default#VML);}
                            v\:textbox {display:none;}
                            </style>
                            <![endif]-->
                            <title>Slide 1</title>
                            <meta name=Description content="11/28/2020">
                                <link rel=Stylesheet href="master03_stylesheet.css">
                                    <![if !ppt]>
                                    <style media=print>
                                        <!--.sld
                                        {left:0px !important;
                                         width:6.0in !important;
                                         height:4.5in !important;
                                         font-size:62% !important;}
                                        -->
                                    </style>
                                            <script><!--
function LoadSld()
                                                {
                                                var sld = GetObj("SlideObj")
                                                        if (!g_supportsPPTHTML) {
                                                sld.style.visibility = "visible"
                                                        return
                                                }
                                                if (MakeNotesVis())
                                                        return
                                                        runAnimations = _InitAnimations();
                                                if (IsWin("PPTSld"))
                                                        parent.SldUpdated(GetSldId())
                                                        g_origSz = parseInt(SlideObj.style.fontSize)
                                                        g_origH = sld.style.posHeight
                                                        g_origW = sld.style.posWidth
                                                        g_scaleHyperlinks = (document.all.tags("AREA").length > 0)
                                                        if (g_scaleHyperlinks)
                                                        InitHLinkArray()
                                                        if (g_scaleInFrame || (IsWin("PPTSld") && parent.IsFullScrMode()))
                                                        document.body.scroll = "no"
                                                        _RSW()
                                                        if (IsWin("PPTSld") && parent.IsFullScrMode())
                                                        FullScrInit();
                                                MakeSldVis();
                                                if (runAnimations)
                                                {
                                                if (document.all("NSPlay"))
                                                        document.all("NSPlay").autoStart = false;
                                                if (sld.filters && sld.filters.revealtrans)
                                                        setTimeout("document.body.start()", sld.filters.revealtrans.duration * 1000);
                                                else
                                                        document.body.start();
                                                }
                                                }
                                                function MakeSldVis()
                                                {
                                                var fTrans = g_showAnimation && SldHasTrans()
                                                        if (fTrans)
                                                {
                                                if (g_bgSound) {
                                                idx = g_bgSound.indexOf(",");
                                                pptSound.src = g_bgSound.substr(0, idx);
                                                pptSound.loop = - (parseInt(g_bgSound.substr(idx + 1)));
                                                }
                                                SlideObj.filters.revealtrans.Apply()
                                                }
                                                SlideObj.style.visibility = "visible"
                                                        if (fTrans)
                                                        SlideObj.filters.revealtrans.Play()
                                                }
                                                function MakeNotesVis()
                                                {
                                                if (!IsNts())
                                                        return false
                                                        SlideObj.style.display = "none"
                                                        nObj = document.all.item("NotesObj")
                                                        parent.SetHasNts(0)
                                                        if (nObj) {
                                                nObj.style.display = ""
                                                        parent.SetHasNts(1)
                                                }
                                                return 1
                                                }
                                                function ChkAutoAdv()
                                                {
                                                if (SldHasTrans())
                                                        SlideObj.onfilterchange = AutoAdv
                                                        else
                                                        AutoAdv()
                                                }
                                                function AutoAdv()
                                                {
                                                if (!IsWin("PPTSld") || !gUseSldTimings)
                                                        return
                                                        var sld = GetCurSld()
                                                        if ((sld.mAdvDelay > 0) && !parent.IsFramesMode())
                                                        setTimeout("                                        parent.GoToNextSld()", sld.mAdvDelay)
                                                }
                                                function GetObj(id)
                                                {
                                                if (g_supportsPPTHTML)
                                                        return document.all(id);
                                                else
                                                        return document.getElementById(id);
                                                }
                                                function SldHasTrans() {
                                                return SlideObj.style.filter != "";
                                                }
                                                fun                                        ction GetSldId() {
                                                return sId = location.href.substring(location.href.lastIndexOf('/') + 1)
                                                }
                                                function HideMenu() {
                                                if (frames["PPTSld"] && PPTSld.document.all.item("ctxtmenu") && PPTSld.ctxtmenu.style.display != "none") {
                                                PPTSld.ctxtmenu.style.display = 'none';
                                                retur                                        n true
                                                }
                                                return false
                                                }
                                                function IsWin(name) {
                                                return window.name == name
                                                }
                                                function IsNts() {
                                                return IsWin("PPTNts")
                                                }
                                                function IsSldOrNts() {
                                                return(IsWin("PPTSld") || IsWin("PPTNts"))
                                                }
                                                function SupportsPPTAnimation() {
                                                return(navigator.platform == "Win32" && navigator.appVersion.indexOf("Windows") > 0)
                                                }
                                                function SupportsPPTHTML()
                                                {
                                                var appVer = navigator.appVersion, msie = appVer.indexOf("MSIE "), ver = 0
                                                        if (msie >= 0)
                                                        ver = parseFloat(appVer.su                                        bstring(msie + 5, appVer.indexOf(";", msie)))
                                                        else
                                                        ver = parseInt(appVer)
                                                        return(ver >= 4 && msie >= 0)
                                                }
                                                function _RSW()
                                                {
                                                if (!g_supportsPPTHTML || IsNts() ||
                                                        (!g_scaleInFrame && (!IsWin("PPTSld") || !parent.IsFullScrMode())))
                                                        return
                                                        var padding = 0;
                                                if (IsWin("PPTSld") && parent.IsFramesMode())
                                                        padding = 6
                                                        cltWidth = document.body.clientWidth - padding
                                                        cltHeight = document.body.clientHeight - padding
                                                        factor = (1.0 * cltWidth) / g_origW
                                                        if (cltHeight < g_origH * factor)
                                                        factor = (1.0 * cltHeight) / g_origH
                                                        newSize = g_origSz * factor
                                                        if (newSize < 1)
                                                        newSize = 1
                                                        s = SlideObj.style
                                                        s.fontSize = newSize + "px"
                                                        s.posWidth = g_origW * factor
                                                        s.posHeight = g_origH * factor
                                                        s.posLeft = (cltWidt                                        h - s.posWidth + padding) / 2
                                                        s.posTop = (cltHeight - s.posHeight + padding) / 2
                                                        if (g_scaleHyperlinks)
                                                        ScaleHyperlinks(factor)
                                                }
                                                function _InitAnimations()
                                                {
                                                animRuntimeInstalled = '' + document.body.localTime != 'undefined';
                                                isFullScreen = (window.name == "PPTSld") && !parent.IsFramesMode();
                                                g_animUseRuntime = g_showAnimation && animRuntimeInstalled && !(isFullScreen && parent.IsSldVisited());
                                                if (g_animUseRuntime) {
                                                collSeq = document.all.tags("seq");
                                                if (collSeq != null) {
                                                for (ii = 0; ii < collSeq.length; ii++) {
                                                if (collSeq[ii].getAttribute("p:nodeType") == "mainSeq") {
                                                g_animMainSequence = collSeq[ii];
                                                break;
                                                }
                                                }
                                                }
                                                if (g_animItemsToHide && document.body.playAnimations != false) {
                                                for (jj = 0; jj < g_animItemsToHide.length; jj++) {
                                                if (hideObj = GetObj(g_animItemsToHide[jj]))
                                                        hideObj.runtimeStyle.visibility = "hidden";
                                                }
                                                }
                                                if (g_animInteractiveItems) {
                                                for (jj = 0; jj < g_animInteractiveItems.length; jj++) {
                                                if (triggerObj = GetObj(g_animInteractiveItems[jj]))
                                                        triggerObj.runtimeStyle.cursor = "hand";
                                                }
                                                }
                                                if (gUseSldTimings && '' + g_animSlideTime != 'undefined') {
                                                adjustedTime = document.body.calculateAutoAdvanceTimes(g_animSlideTime, g_animEffectTimings);
                                                if (IsWin("PPTSld") && adjustedTime != g_animSlideTime) {
                                                var sld = GetCurSld();
                                                sld.mAdvDelay = adjustedTime * 1000;
                                                }
                                                }
                                                }
                                                return g_animUseRuntime;
                                                }

                                                var g_supportsPPTHTML = SupportsPPTHTML(), g_scaleInFrame = 1, gId = "", g_bgSound = "",
                                                        g_scaleHyperlinks = false, g_allowAdvOnClick = 0, g_showInBrowser = 0, gLoopCont = 0, gUseSldTimings = 1;
                                                var g_showAnimation = g_supportsPPTHTML && SupportsPPTAnimation() && g_showInBrowser;
                                                var g_animManager = null;
                                                var g_animUseRuntime = false;
                                                varg_animItemsToHide, g_animInteractiveItems, g_animSlideTime;
                                                varg_animMainSequence = null;
//--></script><!--[if vml]><script>g_vml = 1;
</script><![endif]--><![endif]><o:shapelayout v:ext="edit">
 <o:idmap v:ext="edit" data="2"/>
</o:shapelayout>
</head>

<body lang=EL style='margin:0px;background-color:white' onresize="_RSW()"
onload="LoadSld()">

<div id=SlideObj class=sldstyle='position:absolute;top:0px;left:0px;
width:929px;height:696px;font-size:16px;background-color:#7030A0;clip:rect(0%, 101%, 101%, 0%);
visibility:hidden'><p:slide coordsize="720,54 0"
 color                                                s="#ffffff,#000000,#eeece1,#1f497d,#4f81bd,#c0504d,#0000ff,#800080"
 masterh ref="master                                                03.xml">
 <v:background id="_x0000_s2049" o:bwmode="white" fillcolor="#7030a0">
  <v:fill color2="#c0504d [5]"/>
 </v:background><v:roundrect id="_x0000_s2050" style='position:absolute;left:31.125pt;
                                                top:48.875pt;width:652pt;height:110.25pt;visibility:visible;mso-wrap-style:square;
                                                v-text-anchor:top' arcsize="10923f" o:gfxdata="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
AAA=
" fillcolor="#bcbcbc">
  <v:fill color2="#ededed" rotate="t" angle="180" colors="                                                0 #bcbcbc;22938f #d0d0d0;1 #ededed"
   focus="100%" type="gr adient"/>
                                                 <v:shadow on="t" color="black" opacity="24903f" origin=",.5" offset="0,.55556mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:roundrect><v:roundrect id="_x0000_s2051" style='position:absolute;left:38.25pt;
                                                top:186.625pt;width:191.375pt;height:101.125pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' arcsize="10923f" o:gfxdata="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
jQYAAAAA
" fillcolor="#bcbcbc">
  <v:fill color2="#ededed" rotate="t" angle="18 0" colors                                                ="0 #bcbcbc;22938f #d0d0d0;1 #ededed"
   focus="100%" type ="gradient"                                                />
  <v:shadow on="t" color="black" opacity="24903f" origin=",.5" offset="0,.55556mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:roundrect><v:roundrect id="_x0000_s2052" style='position:absolute;left:258pt;
                                                top:186.625pt;width:205.5pt;height:101.125pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' arcsize="10923f" o:gfxdata="UEsDBBQABgAIAAAAIQBa4xFm/gAAAOIBAAATAAAAW0NvbnRlbnRfVHlwZXNdLnhtbJSRTU/EIBCG
7yb+BzJX01I9GGNK92D1qEbXHzCBaUu2BcJg3f330v24GNfEI8y8z/sE6tV2GsVMka13Cq7LCgQ5
7Y11vYKP9VNxB4ITOoOjd6RgRwyr5vKiXu8CschpxwqGlMK9lKwHmpBLH8jlSefjhCkfYy8D6g32
JG+q6lZq7xK5VKSFAU3dUoefYxKP23x9MIk0MoiHw+LSpQBDGK3GlE3l7MyPluLYUObkfocHG/gq
a4D8tWGZnC845l7y00RrSLxiTM84ZQ1pIkvjv1ykufwbslhOXPius5rKNnKbY280n6zO0XnAQBn9
X/z7kjvB5f6Hmm8AAAD//wMAUEsDBBQABgAIAAAAIQAx3V9h0gAAAI8BAAALAAAAX3JlbHMvLnJl
bHOkkMFqwzAMhu+DvYPRvXHaQxmjTm+FXksHuwpbSUxjy1gmbd++pjBYRm876hf6PvHv9rcwqZmy
eI4G1k0LiqJl5+Ng4Ot8WH2AkoLR4cSRDNxJYN+9v+1ONGGpRzL6JKpSohgYS0mfWosdKaA0nCjW
Tc85YKljHnRCe8GB9KZttzr/ZkC3YKqjM5CPbgPqfE/V/IcdvM0s3JfGctDc996+omrH13iiuVIw
D1QMuCzPMNPc1OdAv/au/+mVERN9V/5C/Eyr9cesFzV2DwAAAP//AwBQSwMEFAAGAAgAAAAhALT3
3xtKAwAAPAsAABAAAABkcnMvc2hhcGV4bWwueG1s3FbfT9swEH6ftP/B8uvEmrQMumjpNJDYHtBU
tfCM3MQpWR07sp2u5a/fd3ZaUIW2CXhgy0O5xOf78d19d3z6vGkUW0vraqNznr5POJO6MGWtlzm/
vro4GnPmvNClUEbLnG+l458nb998ajPXMlzWLmtzfut9mw0GrriVjXDvTSs1zipjG+HxapeD1kon
tRcejho1GCbJyaARteYTmNLreTu1JBXf11PL6jLnHznTooHLmel0KUs2kwUCWSrJxnzQ69K1IGtc
gzB4aMsFmyLbVLbpQxV/E2ppxU/kfxClyExVsU3OR8PTD+MPJ5xtcz4cnSbH4yHFIzK58ayAwvAk
TYYfgWQBjXQ4HqXjEWkMYiik2lrnv0rz7LAYGcq5JYgIH6ApMrG+dD762/mhz0o/F4QIcIQV9fdb
JaPhmQQyoReeDDBqDujSkEBoI3muLFsLlfNylfbwKQ1P5LKqlXoxp8PfO+19kVtZVQD5xRz/Idu9
t5Cx0S/nuKm1sX/IOvoLlOor3WZ+c2bKLYWzwF8Q9blFt16dG5QYZBG6uDU25z6SSTk/pwZ7rovA
zN2kenJ3UsqYJqwR9jJEC2EWBLWO4deYURpUpEzUErO08JazUlZXYjG/wzhLj48THCLjoCTFpT6z
K2p5VgHrL+GS6LzhTGFK6v4YV24x9TCPpp0u4CA2jdLztqCoXFtMCx+Jkib07Llyr3EWWUO63kXd
nRq+3Z9+qfzO5iN6/emiAzOvNgHYRTe/24sXSGP/8h3rIqh4sYjjSGRAYxbHdECTXNnwA2RXXVM3
5kcdQUXGOZf66HqO9QP00jFhtwhoRZUu5xouaDvZeoU1oc08SJytpKVdhhWDESywnXrFtgjG0fqN
UPWd/BZeF8JJVdNug7o2U2tMFeSyth4DHF9d48+VFDCaBNIoTVFrc4EpRDORZmvAzai6pI/hxS4X
+xGWJKfJ+R7yh2qR5DuEukvdI9iRnV4O/cD8tpWVKBDou0YfqZ4nUhwcSBEJVLiDg8L1nWFp1YrM
Txiem/gwygLFx28sCWlA8VXXRVrMC/Dn/63PzUFZpC6nwgqw6NHCqKOvs1dAGOqdf5wj90AHTrRh
D+7WH/7LdO3kFwAAAP//AwBQSwMEFAAGAAgAAAAhAK2Twr7TAAAA+QAAAA8AAABkcnMvZG93bnJl
di54bWxEj01Lw0AURfeC/2F4gjs7aUCpsa+lKKJLkxbq8pl5TULnI8yMyfTfO7jQ5eVezuWst8lo
MbEPg7MIy0UBgm3r1GA7hMP+9W4FIkSyirSzjHDhANvN9dWaKuVmW/PUxE5kiA0VIfQxjpWUoe3Z
UFi4kW3uTs4bijn6TipPc4YbLcuieJCGBpsfehr5uef23HwbhDJ9qP299rEJx6k76zL5l88a8fYm
7Z5ARE7xfzy3xyRXf+Uv6l0hPII4vV2+/KBqCpE9QnbLptkS5OYHAAD//wMAUEsBAi0AFAAGAAgA
AAAhAFrjEWb+AAAA4gEAABMAAAAAAAAAAAAAAAAAAAAAAFtDb250ZW50X1R5cGVzXS54bWxQSwEC
LQAUAAYACAAAACEAMd1fYdIAAACPAQAACwAAAAAAAAAAAAAAAAAvAQAAX3JlbHMvLnJlbHNQSwEC
LQAUAAYACAAAACEAtPffG0oDAAA8CwAAEAAAAAAAAAAAAAAAAAAqAgAAZHJzL3NoYXBleG1sLnht
bFBLAQItABQABgAIAAAAIQCtk8K+0wAAAPkAAAAPAAAAAAAAAAAAAAAAAKIFAABkcnMvZG93bnJl
di54bWxQSwUGAAAAAAQABAD1AAAAogYAAAAA
" fillcolor="#bcbcbc">
  <v:fill color2="#ededed" rotate="t" angle="180" c olors="0                                                 #bcbcbc;22938f #d0d0d0;1 #ededed"
   focus="100%" type="gra dient"/>
                                                  <v:shadow on="t" color="black" opacity="24903f" origin=",.5" offset="0,.55556mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:roundrect><v:roundrect id="_x0000_s2053" style='position:absolute;left:491.875pt;
                                                top:186.625pt;width:191.25pt;height:101.125pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' arcsize="10923f" o:gfxdata="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
eG1sUEsFBgAAAAAEAAQA9QAAAKAGAAAAAA==
" fillcolor="#bcbcbc">
  <v:fill color2="#ededed" rotate="t" angle=" 180" colo                                                rs="0 #bcbcbc;22938f #d0d0d0;1 #ededed"
   focus="100%" t ype="gradie                                                nt"/>
  <v:shadow on="t" color="black" opacity="24903f" origin=",.5" offset="0,.55556mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:roundrect><v:oval id="_x0000_s2054" style='position:absolute;left:66.625pt;
                                                top:333.625pt;width:127.5pt;height:44.125pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' o:gfxdata="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
" fillcolor="#bcbcbc">
  <v:fill color2="#ededed" rotate="t" ang le="180"                                                 colors="0 #bcbcbc;22938f #d0d0d0;1 #ededed"
   focus="100 %" type="gr                                                adient"/>
  <v:shadow on="t" color="black" opacity="24903f" origin=",.5" offset="0,.55556mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:oval><v:oval id="_x0000_s2055" style='position:absolute;left:534.375pt;
                                                top:333.625pt;width:127.5pt;height:44.125pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' o:gfxdata="UEsDBBQABgAIAAAAIQBa4xFm/gAAAOIBAAATAAAAW0NvbnRlbnRfVHlwZXNdLnhtbJSRTU/EIBCG
7yb+BzJX01I9GGNK92D1qEbXHzCBaUu2BcJg3f330v24GNfEI8y8z/sE6tV2GsVMka13Cq7LCgQ5
7Y11vYKP9VNxB4ITOoOjd6RgRwyr5vKiXu8CschpxwqGlMK9lKwHmpBLH8jlSefjhCkfYy8D6g32
JG+q6lZq7xK5VKSFAU3dUoefYxKP23x9MIk0MoiHw+LSpQBDGK3GlE3l7MyPluLYUObkfocHG/gq
a4D8tWGZnC845l7y00RrSLxiTM84ZQ1pIkvjv1ykufwbslhOXPius5rKNnKbY280n6zO0XnAQBn9
X/z7kjvB5f6Hmm8AAAD//wMAUEsDBBQABgAIAAAAIQAx3V9h0gAAAI8BAAALAAAAX3JlbHMvLnJl
bHOkkMFqwzAMhu+DvYPRvXHaQxmjTm+FXksHuwpbSUxjy1gmbd++pjBYRm876hf6PvHv9rcwqZmy
eI4G1k0LiqJl5+Ng4Ot8WH2AkoLR4cSRDNxJYN+9v+1ONGGpRzL6JKpSohgYS0mfWosdKaA0nCjW
Tc85YKljHnRCe8GB9KZttzr/ZkC3YKqjM5CPbgPqfE/V/IcdvM0s3JfGctDc996+omrH13iiuVIw
D1QMuCzPMNPc1OdAv/au/+mVERN9V/5C/Eyr9cesFzV2DwAAAP//AwBQSwMEFAAGAAgAAAAhABOo
tRomAwAAjgkAABAAAABkcnMvc2hhcGV4bWwueG1s1FZbb9owFH6ftP9g+XViuZRRGjVULVK7B9Qh
aH/AieNAhmNHtmHQX79jO0BVVetU+rDxACf2l3P5zo3Lq20jyIZrUyuZ0+RrTAmXTJW1XOT08eG2
N6TEWJAlCCV5Tnfc0KvR50+XbWZagi9Lk7U5XVrbZlFk2JI3YL6qlku8q5RuwOKjXkSt5oZLCxYN
NSJK43gQNVBLOkJVcjNvp9pJ7H4z1aQu0ZczSiQ0aPPHBgRJUhp1AIf1skQsCtFzBcYrgmxb6abz
D/7Gv1LDLwz6hWuQqaoi25wOzoeDtD+gZJfTfno2uDiLnT+Q8a0lDAHJII2TIdLHEPFtEKepdzgK
njhkq4294+pkr4hTlFMuRN0ajvxBBpuJsY6JoxV3LOSpDAR2A6eYcbsTPCiecaTFZ//d7GKWHW8+
AF84fCw0wVzntFwljl0MR0i05ExWtRAfZjT9s9HOljPLq4oz+2GG34j2YM1HrOTHGW5qqfQbUQd7
vp+6TLeZ3d6ocufcKfAXW/PUpGsrxgpTjJ0Cki2VzqkNnSSMnbsCO9WEb8v9bHp3dbqQcZSQBvTE
e4vCzAtiE9yvZYkDLUQiFjg9mdWUlLx6gGL+lNOLpN+PMUyM2IM4TOSNXrmSJxVyfe1fgrVVlAic
i7K7xleWIBc4jKZrydBAKBoh5y1zXpmWTZkNjZLE7nPolSPiJnSNw1oTsHsYnh1vryu71/kKrrst
1tiZD1tPbLGePx3EWwzj8HCPC8JDLBRhHEGGbMzCjPZsOlPafyGzq3VTN+pnHUjFiHGmyd7jHBcO
spcMHXeFZytA1jmVaMLtI12vcC9INfcSJSuu3fbCpYLzF3AfdcCWeeVY+g2I+ol/948FGC5qt80Q
LtVUK1V5uay1xemNp6axY8EBlca+aYR0Xkt1i1NoP5g8b0rUpTv0D3pRHEZYHJ/H4wPlz2GhyfcM
rSeyY3Dt9HSyrwdidy2vgKGjXxrZE12fcHhxwSE0EDMvLpjpKkO75QqZHRFC3FTFnOO3P+OynIIG
zNKrCRG9u9k/kBDn/X+egyPRYU/7Obsfr/gXxrSj3wAAAP//AwBQSwMEFAAGAAgAAAAhABjSrEjX
AAAA+gAAAA8AAABkcnMvZG93bnJldi54bWxEj09PAjEQR+8mfodmTLxJl8WgrhSCBJBETWDV+7gd
dhu2f2wr7H57Gw94nLzJ++VNZp1u2ZF8UNYIGA4yYGQqK5WpBXy8r27ugYWIRmJrDQnoKcBsenkx
wULak9nRsYw1SxITChTQxOgKzkPVkMYwsI5MYnvrNcZ0+ppLj6ck1y3Ps2zMNSqTFhp0tGioOpQ/
WkD5/brM++X61g3Vyj19PmzX+WIrxPVVN38EFqmL/8+jlzdSd2f4p9rI1DICtn/uv7ySOwyRvIAU
l1ITAj79BQAA//8DAFBLAQItABQABgAIAAAAIQBa4xFm/gAAAOIBAAATAAAAAAAAAAAAAAAAAAAA
AABbQ29udGVudF9UeXBlc10ueG1sUEsBAi0AFAAGAAgAAAAhADHdX2HSAAAAjwEAAAsAAAAAAAAA
AAAAAAAALwEAAF9yZWxzLy5yZWxzUEsBAi0AFAAGAAgAAAAhABOotRomAwAAjgkAABAAAAAAAAAA
AAAAAAAAKgIAAGRycy9zaGFwZXhtbC54bWxQSwECLQAUAAYACAAAACEAGNKsSNcAAAD6AAAADwAA
AAAAAAAAAAAAAAB+BQAAZHJzL2Rvd25yZXYueG1sUEsFBgAAAAAEAAQA9QAAAIIGAAAAAA==
" fillcolor="#bcbcbc">
  <v:fill color2="#ededed" rotate="t" angle= "180" col                                                ors="0 #bcbcbc;22938f #d0d0d0;1 #ededed"
   focus="100% " type="gra                                                dient"/>
  <v:shadow on="t" color="black" opacity="24903f" origin=",.5" offset="0,.55556mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:oval><v:roundrect id="_x0000_s2056" style='position:absolute;left:222.5pt;
                                                top:407.125pt;width:141.75pt;height:101pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' arcsize="10923f" o:gfxdata="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
AI4GAAAAAA==
" fillcolor="#bcbcbc">
  <v:fill color2="#ededed" rotate="t" angle="180" c olors="0                                                 #bcbcbc;22938f #d0d0d0;1 #ededed"
   focus="100%" type= "gradient"/                                                >
  <v:shadow on="t" color="black" opacity="24903f" origin=",.5" offset="0,.55556mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:roundrect><v:roundrect id="_x0000_s2057" style='position:absolute;left:371.375pt;
                                                top:407.125pt;width:141.75pt;height:101pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' arcsize="10923f" o:gfxdata="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
AAA=
" fillcolor="#bcbcbc">
  <v:fill color2="#ededed" rotate="t" angle="180" colors="0 #bcbcbc;22938f #d0d0d0;1 #ededed"
   focus="100%" type="gradient"/>
  <v:shadow on="t" color="black" opacity="24903f" origin=",.5" offset="0,.55556mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:roundrect><v:shapetype id="_x0000_t67" coordsize="21600,21600" o:spt="67"
  adj="16200,5400" path="m0@0l@1@0@1,0@2,0@2@0,21600@0,10800,21600xe">
  <v:stroke joinstyle="miter"/>
  <v:formulas>
   <v:f eqn="val #0"/>
   <v:f eqn="val #1"/>
   <v:f eqn="sum height 0 #1"/>
   <v:f eqn="sum 10800 0 #1"/>
   <v:f eqn="sum width 0 #0"/>
   <v:f eqn="prod @4 @3 10800"/>
   <v:f eqn="sum width 0 @5"/>
  </v:formulas>
  <v:path o:connecttype=" custom" o                                                :connectlocs="10800,0;0,@0;10800,21600;21600,@0"
   o:connectangles="27 0,180,90,0"                                                textboxrect="@1,0,@2,@6"/>
  <v:handles>
   <v:h position="#1,#0" xrange="0,10800" yrange="0,21600"/>
  </v:handles>
 </v:shapetype><v:shape id="_x0000_s2058" type="#_x0000_t67" style='position:absolute;
                                                left:109.125pt;top:159.125pt;width:49.625pt;height:27.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:middle' o:gfxdata="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
" adj="10800" fillcolor="#cb6c1d" strokecolor="#f69240">
  <v:fill color2="#ff8f26" rotate="t" angle="180" colors="0 #cb6c1d;52429f #ff8f2a;1 #ff8f26"
   focus="100% " type="g                                                radient">
   <o:fill v:ext="view" type="gradientUnscaled"/>
  </v:fill> 
  <v:shado                                                w on="t" color="black" opacity="22937f" origin=",.5" offset="0,.63889mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:shape><v:shape id="_x0000_s2059" type="#_x0000_t67" style='position:absolute;
                                                left:335.875pt;top:159.125pt;width:49.625pt;height:27.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:middle' o:gfxdata="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
AAAAAA==
" adj="10800" fillcolor="#cb6c1d" strokecolor="#f69240">
  <v:fill color2="#ff8f26" rotate="t" angle="180" colors="0 #cb6c1d;52429f #ff8f2a;1 #ff8f26"
   focus="100% " type="g                                                radient">
   <o:fill v:ext="view" type="gradientUnscaled"/>
  </v:fi ll>
  <v:sh                                                adow on="t" color="black" opacity="22937f" origin=",.5" offset="0,.63889mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:shape><v:shape id="_x0000_s2060" type="#_x0000_t67" style='position:absolute;
                                                left:562.75pt;top:159.125pt;width:49.5pt;height:27.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:middle' o:gfxdata="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
AA==
" adj="10800" fillcolor="#cb6c1d" strokecolor="#f69240">
  <v:fill color2="#ff8f26" rotate="t" angle="180" colors="0 #cb6c1d;52429f #ff8f2a;1 #ff8f26"
   focus="100% " type="g                                                radient">
   <o:fill v:ext="view" type="gradientUnscaled"/>
  </v:fill >
  <v:shad                                                ow on="t" color="black" opacity="22937f" origin=",.5" offset="0,.63889mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:shape><v:shape id="_x0000_s2061" type="#_x0000_t67" style='position:absolute;
                                                left:569.75pt;top:296.875pt;width:49.625pt;height:27.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:middle' o:gfxdata="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
AAAA
" adj="10800" fillcolor="#cb6c1d" strokecolor="#f69240">
  <v:fill color2="#ff8f26" rotate="t" angle="180" colors="0 #cb6c1d;52429f #ff8f2a;1 #ff8f26"
   focus="100% " type="g                                                radient">
   <o:fill v:ext="view" type="gradientUnscaled"/>
  </v:fill> 
  <v:shado                                                w on="t" color="black" opacity="22937f" origin=",.5" offset="0,.63889mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:shape><v:shape id="_x0000_s2062" type="#_x0000_t67" style='position:absolute;
                                                left:109.125pt;top:296.875pt;width:49.625pt;height:27.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:middle' o:gfxdata="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
AA==
" adj="10800" fillcolor="#cb6c1d" strokecolor="#f69240">
  <v:fill color2="#ff8f26" rotate="t" angle="180" colors="0 #cb6c1d;52429f #ff8f2a;1 #ff8f26"
   focus="100%" type="gradient">
   <o:fill v:ext="view" type="gradientUnscaled"/>
  </v:fill>
  <v:shadow on="t" color="black" opacity="22937f" origin=",.5" offset="0,.63889mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>                                                
 </v:shape><v:shapetype id="_x0000_t202" coordsize="21600,216 00" o:spt="                                                202"
  path="m,l,21600r21600,l21600,xe">
  <v:stroke joinstyle="miter"/>
  <v:path gradientshapeok="t" o:connecttype="rect"/>
 </v:shapetype><v:shape id="_x0000_s2063" type="#_x0000_t202" style='position:absolute;
                                                left:406.75pt;top:453pt;width:78pt;height:31.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' o:gfxdata="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 PAAAAAAAA                                                AAAAAAAAAKQFAABkcnMv
ZG93bnJldi54bWxQSwUGAAAAAAQABAD1AAAAqAYAAA AA
" fillco                                                lor="white [0]" strokecolor="#f79646" strokeweight="2pt">
  <v:textbox style='mso-rotate-with-shape:t;mso-fit-shape-to-text:t'/>
 </v:shape><v:shape id="_x0000_s2064" type="#_x0000_t202" style='position:absolute;
                                                left:258pt;top:453pt;width:77.875pt;height:31.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' o:gfxdata="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 AAAAAAAA                                                AAAAAAAAAoAUAAGRycy9kb3du
cmV2LnhtbFBLBQYAAAAABAAEAPUAAACkBgAAAAA=
" fillcolor=                                                "white [0]" strokecolor="#f79646" strokeweight="2pt">
  <v:textbox style='mso-rotate-with-shape:t;mso-fit-shape-to-text:t'/>
 </v:shape><v:shape id="_x0000_s2065" type="#_x0000_t202" style='position:absolute;
                                                left:541.375pt;top:232.625pt;width:78pt;height:31.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' o:gfxdata="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
AHaPo/bXAAAA+gAAAA8 AAAAAAAA                                                AAAAAAAAAjgUAAGRycy9kb3ducmV2LnhtbFBLBQYAAAAABAAE
APUAAACSBgAAAAA=
" fillcolor=                                                "white [0]" strokecolor="#f79646" strokeweight="2pt">
  <v:textbox style='mso-rotate-with-shape:t;mso-fit-shape-to-text:t'/>
 </v:shape><v:shape id="_x0000_s2066" type="#_x0000_t202" style='position:absolute;
                                                left:314.625pt;top:232.625pt;width:78pt;height:31.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' o:gfxdata="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
AEXzYZTXAAAA+gAAAA8 AAAAAAAAA                                                AAAAAAAAjgUAAGRycy9kb3ducmV2LnhtbFBLBQYAAAAABAAE
APUAAACSBgAAAAA=
 " fillcolor                                                ="white [0]" strokecolor="#f79646" strokeweight="2pt">
  <v:textbox style='mso-rotate-with-shape:t;mso-fit-shape-to-text:t'/>
 </v:shape><v:shape id="_x0000_s2067" type="#_x0000_t202" style='position:absolute;
                                                left:314.625pt;top:104pt;width:90.75pt;height:31.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' o:gfxdata="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
AAAhACMNjyrYAAAA+gAAAA8 AAAAAAAAA                                                AAAAAAAAkAUAAGRycy9kb3ducmV2LnhtbFBLBQYAAAAA
BAAEAPUAAACVBgAAAAA=
 " fillcolor                                                ="white [0]" strokecolor="#f79646" strokeweight="2pt">
  <v:textbox style='mso-rotate-with-shape:t;mso-fit-shape-to-text:t'/>
 </v:shape><v:shape id="_x0000_s2068" type="#_x0000_t202" style='position:absolute;
                                                left:94.875pt;top:232.625pt;width:78pt;height:31.5pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:top' o:gfxdata="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
oJxv2AAAAPoAAA APAAAAAAA                                                AAAAAAAAAAIsFAABkcnMvZG93bnJldi54bWxQSwUGAAAAAAQABAD1
AAAAkAYAAAAA
"  fillcolor="                                                white [0]" strokecolor="#f79646" strokeweight="2pt">
  <v:textbox style='mso-rotate-with-shape:t;mso-fit-shape-to-text:t'/>
 </v:shape><v:shape id="_x0000_s2069" type="#_x0000_t67" style='position:absolute;
                                                left:275pt;top:292.625pt;width:49.625pt;height:107.75pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:middle' o:gfxdata="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
VAYAAAAA
" adj="16626" fillcolor="#cb6c1d" strokecolor="#f69240">
  <v:fill color2="#ff8f26" rotate="t" angle="180" colors="0 #cb6c1d;52429f #ff8f2a;1 #ff8f26"
   focus="100% " type="                                                gradient">
   <o:fill v:ext="view" type="gradientUnscaled"/>
  </v:fill>
  <v:shadow                                                 on="t" color="black" opacity="22937f" origin=",.5" offset="0,.63889mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:shape><v:shape id="_x0000_s2070" type="#_x0000_t67" style='position:absolute;
                                                left:405.375pt;top:292.625pt;width:49.625pt;height:107.75pt;visibility:visible;
                                                mso-wrap-style:square;v-text-anchor:middle' o:gfxdata="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
AFUGAAAAAA==
" adj="16626" fillcolor="#cb6c1d" strokecolor="#f69240">
  <v:fill color2="#ff8f26" rotate="t" angle="180" colors="0 #cb6c1d;52429f #ff8f2a;1 #ff8f26"
   focus="100%" type="gradient">
   <o:fill v:ext="view" type="gradientUnscaled"/>
  </v:fill>
  <v:shadow on="t" color="black" opacity="22937f" origin=",.5" offset="0,.63889mm"/>
  <v:textbox style='mso-rotate-with-shape:t'/>
 </v:shape><![if !vml]><img border=0
 v:shapes="_x0000_s2050,_x0000_s2051,_x0000_s2052,_x0000_s2053,_x 0000_s20                                                54,_x0000_s2055,_x0000_s2056,_x0000_s2057,_x0000_s2058,_x0000_s2059,_x0000_s2060,_x0000_s2061,_x0000_s2062,_x0000_s2063,_x0000_s2064,_x0000_s2065,_x0000_s2066,_x0000_s2067,_x0000_s2068,_x0000_s2069,_x0000_s2070"
 src="slide0001_image001.png" style='position:absolute;top:9.05%;left:4.3%;
                                                width:90.85%;height:85.77%'><![endif]>
 <div v:shape="_x0000_s2050">
 <div clas                                                s=O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center;position:absolute;top:10.63%;left:6.02%;
                                                width:87.08%;height:4.16%'><span lang=EN-US style='color:#0070C0'><b>ORDERS</b></span><span
 style='color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
 </div>
 <div v:shape="_x0000_s2051">
 <div class                                                =O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></di v>
 <div cla                                                ss=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center;position:absolute;top:36.06%;left:6.99%;
                                                width:23.25%;height:4.16%'><span lang=EN-US style='color:#0070C0'><b>SVT-service
 Ok</b></span><span style='color:#0070C0;mso-special-format:lastCR;display:
                                                none'><b>&#13;</b></span></div>
 </div>
 <div v:shape="_x0000_s2052">
 <d iv class=                                                O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div> 
 <div class                                                =O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center;position:absolute;top:36.06%;left:37.56%;
                                                width:25.29%;height:4.16%'><span lang=EN-US style='color:#0070C0'><b>SVT-service
 NOk</b></span><span style='color:#0070C0;mso-special-format:lastCR;display:
                                                none'><b>&#13;</b></span></div>
 </div>
 <div v:shape="_x0000_s2053">
 <d iv class=                                                O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
  <div class=O                                                4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center;position:absolute;top:36.06%;left:69.86%;
                                                width:23.46%;height:4.16%'><span lang=EN-US style='color:#0070C0'><b>SVT-transport
 NOk</b></span><span style='color:#0070C0;mso-special-format:lastCR;display:
                                                none'><b>&#13;</b></span></div>
 </div>
 <div v:shape="_x0000_s2054">
 <div clas                                                s=O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center;position:absolute;top:63.5%;left:12.59%;
                                                width:11.08%;height:4.16%'><span lang=EN-US style='color:#0070C0'><b>END</b></span><span
 style='color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
 </div>
 <div v:shape="_x0000_s2055">
 <div clas                                                s=O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center;position:absolute;top:63.5%;left:77.61%;
                                                width:11.08%;height:4.16%'><span lang=EN-US style='color:#0070C0'><b>END</b></span><span
 style='color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
 </div>
 <div v:shape="_x0000_s2056">
 <d iv class                                                =O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center;position:absolute;top:77.01%;left:32.61%;
                                                width:16.36%;height:4.16%'><span lang=EN-US style='color:#0070C0'><b>CRM issue</b></span><span
 style='color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
 </div>
 <div v:shape="_x0000_s2057">
 <d iv class                                                =O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center;position:absolute;top:77.01%;left:53.28%;
                                                width:16.36%;height:4.16%'><span lang=EN-US style='color:#0070C0'><b>email</b></span><span
 style='color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
 </div>
 <div v:shape="_x0000_s2 058">
 <d                                                iv class=O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 sty le='mso-marg                                                in-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center'><span style='position:absolute;
                                                top:29.45%;left:17.43%;width:2.47%;height:4.16%'><span style='color:#0070C0;
                                                mso-special-format:lastCR;display:none'><b>&#13;</b></span></span></div>
 </div>
 <div v:shape="_x0000_s2 059">
 <d                                                iv class=O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 sty le='mso-marg                                                in-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center'><span style='position:absolute;
                                                top:29.45%;left:48.86%;width:2.47%;height:4.16%'><span style='color:#0070C0;
                                                mso-special-format:lastCR;display:none'><b>&#13;</b></span></span></div>
 </div>
 <div v:shape="_x0000_s2 060">
 <d                                                iv class=O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 st yle='mso-mar                                                gin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center'><span style='position:absolute;
                                                top:29.45%;left:80.4%;width:2.47%;height:4.16%'><span style='color:#0070C0;
                                                mso-special-format:lastCR;display:none'><b>&#13;</b></span></span></div>
 </div>
 <div v:shape="_x0000_s2 061">
 <d                                                iv class=O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 sty le='mso-marg                                                in-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center'><span style='position:absolute;
                                                top:55.02%;left:81.37%;width:2.47%;height:4.16%'><span style='color:#0070C0;
                                                mso-special-format:lastCR;display:none'><b>&#13;</b></span></span></div>
 </div>
 <div v:shape="_x0000_s2 062">
 <d                                                iv class=O1 style='mso-margin-left-alt:468'></div>
 <div class=O2 sty le='mso-marg                                                in-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='text-align:center'><span style='position:absolute;
                                                top:55.02%;left:17.43%;width:2.47%;height:4.16%'><span style='color:#0070C0;
                                                mso-special-format:lastCR;display:none'><b>&#13;</b></span></span></div>
 </div>
 <div v:shape="_x0000_s2063 ">
 <div                                                class=O1 style='mso-margin-left-alt:468'></div> 
 <div class=O2 style='mso-margin-left-alt:720'></div>
 <div class=O3 style='mso-margin-left-alt:1008'></div>
 <div class=O4 style='mso-margin-left-alt:1296'></div>
 <div class=O style='position:absolute;top:84.77%;left:57.58%;width:9.68%;
                                                height:4.59%'><span lang=EN-US style='font-size:60%;color:#0070C0'><b><a href='orders_1.jsp?actionResult=EML_OK&actionType=CRM_action&from=<%=to_timestamp_%>&to=<%=from_timestamp_%>' target="_blank"><%=EML_OK%></a>,err:<a href='orders_1.jsp?actionResult=EML_ERROR&actionType=CRM_action&from=<%=to_timestamp_%>&to=<%=from_timestamp_%>' target="_blank"><%=EML_ERROR%></a></b></span><span
                                            style='font-size:60%;color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
                                        </div>
                                        <div v:shape="_x0000_s2064" >
                                            <div class=O1 style='mso-margin-left-alt:468'></div>
                                            <div class=O2 style='mso-margin-left-alt:720'></div>
                                            <div class=O3 style='mso-margin-left-alt:1008'></div>
                                            <div class=O4 style='mso-margin-left-alt:1296'></div>
                                            <div class=O style='position:absolute;top:84.77%;left:37.02%;width:10.01%;
                                                 height:4.59%'><span lang=EN-US style='font-size:60%;color:#0070C0'><b><a href='orders_1.jsp?actionResult=CRM_OK&actionType=CRM_action&from=<%=to_timestamp_%>&to=<%=from_timestamp_%>' target="_blank"><%=CRM_OK%></a>,err:<a href='orders_1.jsp?actionResult=CRM_ERROR&actionType=CRM_action&from=<%=to_timestamp_%>&to=<%=from_timestamp_%>' target="_blank"><%=CRM_ERROR%></a>,INC:<a href='orders_1.jsp?actionResult=CRM_INCIDENT_FOUND&actionType=CRM_action&from=<%=to_timestamp_%>&to=<%=from_timestamp_%>' target="_blank"><%=CRM_INCIDENT_FOUND%></a></b></span><span
                                                    style='font-size:60%;color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
                                        </div>
                                        <div v:shape="_x0000_s2065 ">
                                            <div class=O1 style='mso-margin-left-alt:468'></div>
                                            <div class=O2 style='mso-margin-left-alt:720'></div>
                                            <div class=O3 style='mso-margin-left-alt:1008'></div>
                                            <div class=O4 style='mso-margin-left-alt:1296'></div>
                                            <div class=O style='position:absolute;top:43.82%;left:76.31%;width:9.68%;
                                                 height:4.59%'><span lang=EN-US style='font-size:60%;color:#0070C0'><b><a href='orders_1.jsp?actionResult=SVT_TRANSPORT_NOK&actionType=SVTIssue_action&from=<%=to_timestamp_%>&to=<%=from_timestamp_%>' target="_blank"><%=SVT_TRANSPORT_NOK%></a></b></span><span
                                                    style='font-size:60%;color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
                                        </div>
                                        <div v:shape="_x0000_s2066 ">
                                            <div class=O1 style='mso-margin-left-alt:468'></div>
                                            <div class=O2 style='mso-margin-left-alt:720'></div>
                                            <div class=O3 style='mso-margin-left-alt:1008'></div>
                                            <div class=O4 style='mso-margin-left-alt:1296'></div>
                                            <div class=O style='position:absolute;top:43.82%;left:44.88%;width:9.68%;
                                                 height:4.59%'><span lang=EN-US style='font-size:60%;color:#0070C0'><b><a href='orders_1.jsp?actionResult=SVT_NOK&actionType=SVTIssue_action&from=<%=to_timestamp_%>&to=<%=from_timestamp_%>' target="_blank"><%=SVT_NOK%></a></b></span><span
                                                    style='font-size:60%;color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
                                        </div>
                                        <div v:shape="_x0000_s2067 ">
                                            <div class=O1 style='mso-margin-left-alt:468'></div>
                                            <div class=O2 style='mso-margin-left-alt:720'></div>
                                            <div class=O3 style='mso-margin-left-alt:1008'></div>
                                            <div class=O4 style='mso-margin-left-alt:1296'></div>
                                            <div class=O style='position:absolute;top:20.11%;left:44.88%;width:30.3%;
                                                 height:4.59%'><span lang=EN-US style='font-size:60%;color:#0070C0'><b><%=PROCESSED%>  out of <%=ORDS%></b></span><span
                                                    style='font-size:60%;color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
                                        </div>
                                        <div v:shape="_x0000_s2068 ">
                                            <div class=O1 style='mso-margin-left-alt:468'></div>
                                            <div class=O2 style='mso-margin-left-alt:720'></div>
                                            <div class=O3 style='mso-margin-left-alt:1008'></div>
                                            <div class=O4 style='mso-margin-left-alt:1296'></div>
                                            <div class=O style='position:absolute;top:43.82%;left:14.31%;width:8.61%;
                                                 height:4.59%'><span lang=EN-US style='font-size:60%;color:#0070C0'><b><a href='orders_1.jsp?actionResult=SVT_OK&actionType=SVTIssue_action&from=<%=to_timestamp_%>&to=<%=from_timestamp_%>' target="_blank"><%=SVT_OK%></a></b></span><span
                                                    style='font-size:60%;color:#0070C0;mso-special-format:lastCR;display:none'><b>&#13;</b></span></div>
                                        </div>
                                        <div v:shape="_x0000_s2 069">
                                            <div class=O1 style='mso-margin-left-alt:468'></div>
                                            <div class=O2 sty le='mso-margin-left-alt:720'></div>
                                            <div class=O3 style='mso-margin-left-alt:1008'></div>
                                            <div class=O4 style='mso-margin-left-alt:1296'></div>
                                            <div class=O style='text-align:center'><span style='position:absolute;
                                                                                         top:61.06%;left:40.47%;width:2.47%;height:4.16%'><span style='color:#0070C0;
                                                        mso-special-format:lastCR;display:none'><b>&#13;</b></span></span></div>
                                        </div>
                                        <div v:shape="_x0000_s2 070">
                                            <div class=O1 style='mso-margin-left-alt:468'></div>
                                            <div class=O2 sty le='mso-margin-left-alt:720'></div>
                                            <div class=O3 style='mso-margin-left-alt:1008'></div>
                                            <div class=O4 style='mso-margin-left-alt:1296'></div>
                                            <div class=O style='text-align:center'><span style='position:absolute;
                                                                                         top:61.06%;left:58.55%;width:2.47%;height:4.16%'><span style='color:#0070C0;
                                                        mso-special-format:lastCR;display:none'><b>&#13;</b></span></span></div>
                                        </div>
                                        </p:slide></div>

                                        </body>

                                        </html>
