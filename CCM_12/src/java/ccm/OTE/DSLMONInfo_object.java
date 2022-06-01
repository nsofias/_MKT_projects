/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 *
 * @author nsofias
 */
public class DSLMONInfo_object {

    public DSLMONInfo_object() {
    }

    public ArrayList<DslmonAlarm> getDslmonAlarms(String url) throws Exception {
        ArrayList<DslmonAlarm> alarms = new ArrayList();
        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        try ( BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
//              System.out.println(inputLine);
                if (!inputLine.isEmpty()) {
                    String[] myObj = inputLine.split("\t");
                    DslmonAlarm myAlarm = new DslmonAlarm(myObj[0], myObj[1]);
                    myAlarm.setAlertType(Integer.valueOf(myObj[2]));
                    myAlarm.setAlertStart(myObj[3]);
                    myAlarm.setAlertStop(myObj[4]);
                    myAlarm.setAlertOrigin(myObj[5]);
                    if (myObj[6].equals("true")) {
                        myAlarm.setStilAlive(true);
                    } else {
                        myAlarm.setStilAlive(false);
                    }
                    if (myObj.length > 7) {
                        myAlarm.setCriticality(Integer.valueOf(myObj[7]));
                    }
                    if (myObj.length > 8) {
                        myAlarm.setAlertDesc(myObj[8]);
                    }
                    if (myObj.length > 9) {
                        myAlarm.setDisConnections(Integer.parseInt(myObj[9]));
                    }
                    if (myObj.length > 10) {
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

    public static void main(String[] args) throws Exception {

    }

}
