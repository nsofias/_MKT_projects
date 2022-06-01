/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author nsofias
 */
public class DSLMONInfo_object
    {

    public DSLMONInfo_object()
        {
        }
    

    public ArrayList getDslmonAlarms(String url) throws Exception
        {
        ArrayList alarms = new ArrayList();
        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream())))
            {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                {
//              System.out.println(inputLine);
                if (!inputLine.isEmpty())
                    {

                    String[] myObj = inputLine.split("\t");
                    DslmonAlarm myAlarm = new DslmonAlarm(myObj[0], myObj[1]);
                    myAlarm.setAlertType(Integer.valueOf(myObj[2]));
                    myAlarm.setAlertStart(myObj[3]);
                    myAlarm.setAlertStop(myObj[4]);
                    myAlarm.setAlertOrigin(myObj[5]);
                    if (myObj[6].equals("true"))
                        {
                        myAlarm.setStilAlive(true);
                        }
                    else
                        {
                        myAlarm.setStilAlive(false);
                        }
                    if (myObj.length > 7)
                        {
                        myAlarm.setCriticality(Integer.valueOf(myObj[7]));
                        }
                    if (myObj.length > 8)
                        {
                        myAlarm.setAlertDesc(myObj[8]);
                        }
                    if (myObj.length > 9)
                        {
                        myAlarm.setDisConnections(Integer.parseInt(myObj[9]));
                        }
                    if (myObj.length > 10)
                        {
                        myAlarm.setTicket_sr(myObj[10]);
                        }
                    //
                    alarms.add(myAlarm);
//                    System.out.println("LOADED ALARM..." + myAlarm.toString());
                    }
                }
            }
        return alarms;
        }    

    public static void main(String[] args) throws Exception
        {
        DSLMONInfo_object myCCMInfo_object = new DSLMONInfo_object();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
//        int tickets = myCCMInfo_object.getDslmonAlarms("http://172.16.167.7:8080/DSLMON/alarmsWS_servlet");                        
        ArrayList <DslmonAlarm>dslMonAlarms = myCCMInfo_object.getDslmonAlarms("http://diligent:8080/DSLMON/alarmsWS_servlet");
//
//      
//
//
        String objName="hera-asr9ka(0/0/4) Dsl:14180(1)";
        String str = "";
        try
            {
            String myDslam = "", myPort = "";
            int pos1 = objName.indexOf(" Dsl");
            int pos2 = objName.lastIndexOf("(");
            if (pos1 >= 0 && pos2 >= 0)
                {
                myDslam = objName.substring(pos1 + 5, pos2);                
                }
            int pos3 = objName.lastIndexOf(")");
            if (pos1 >= 0 && pos3 >= 0)
                {
                myPort = objName.substring(pos2+1, pos3);
                }
            String myResource = "";
            if (!myDslam.isEmpty())
                {
                myResource = myResource + myDslam;
                if (!myPort.isEmpty())
                    {
                    myResource = myResource + ";" + myPort;
                    }
                System.out.println("CCM:myDslam:"+myDslam);
                System.out.println("CCM:myResource:"+myResource);
                for (DslmonAlarm dslmonAlarm : dslMonAlarms)
                    {
                    if ((dslmonAlarm.getAlertType() == DslmonAlarm.dslamCallsUp && dslmonAlarm.getObjName().contains(myDslam))
                            || (dslmonAlarm.getAlertType() == DslmonAlarm.cardCallsUp && dslmonAlarm.getObjName().contains(myResource)))
                        {
                        str="Φαινεται να 'κοπηκαν' "+dslmonAlarm.getDisConnections()+" χρηστεςν στις "+new TimeStamp1(dslmonAlarm.getAlertStart()).getNowFormated()+". ";
                        if (dslmonAlarm.isStilAlive())
                            str=str+"Οι χρηστες φαινεται να ειναι ακομη εκτος! ";
                        else
                            str=str+"Οι χρηστες φαινεται να εχουν επανελθει. ";
                        if (!dslmonAlarm.getTicket_sr().startsWith("#")&&!dslmonAlarm.getTicket_sr().startsWith("$"))
                            str=str+"Siebel SR:"+dslmonAlarm.getTicket_sr();
                        break;
                        }
                    }
                }

            }
        catch (Exception e)
            {
            e.printStackTrace();
            }
        System.out.println("CCM:found:"+str);
        }

    }
