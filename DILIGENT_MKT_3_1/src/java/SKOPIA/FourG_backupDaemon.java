/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA;

import diligent_MKT.Alarm_FYROM;
import diligent_MKT.PathRetrieverFactory;
import diligent_MKT.PathsRetriever;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nsofiasLib.ote.alarms.Alarm_Parameters;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.utils.MailSender_new;

/**
 *
 * @author nsofias
 */
public class FourG_backupDaemon extends SimpleDaemon {

    Container myContainer;
    private ConcurrentHashMap<String, String> stopped4G = new ConcurrentHashMap<>();
    Config myConfig;
    Alarm_Parameters myParameters;
    private boolean firstCycle;

    public FourG_backupDaemon(Container myContainer, Config myConfig, int sleep) {
        super(sleep);
        this.myConfig = myConfig;
        this.myContainer = myContainer;
        //----------generic Alarm_Parameters--------
        myParameters = new Alarm_Parameters();
        myParameters.setERRORS_mailSender(myConfig.getERRORS_mailSender());
        myParameters.setERRORS_mailServer(myConfig.getERRORS_mailServer());
        myParameters.setERRORS_mail_cc_recipients("kpanagiotop@ote.gr");
        myParameters.setERRORS_mail_recipients(myConfig.getERRORS_mail_recipients());
        myParameters.setERRORS_mailUser(myConfig.getERRORS_mailUser());
        myParameters.setERRORS_mailPass(myConfig.getERRORS_mailPass());
        firstCycle = true;
    }

    @Override
    public void processData() {
        try {
            System.out.println("DSLMON: 4GABackup started");
            PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(Alarm_FYROM.TYPE_COPPER);
            HashMap<String, String> myStopped4GBackupLines = myPatrhsRetriever.retrieveStopped4GBackupLines();
            myStopped4GBackupLines = filterOutMassive(myContainer.getAlarmArrayList_stillAlive(), myStopped4GBackupLines, myPatrhsRetriever);
            //-------add------------------
            for (String lineID : myStopped4GBackupLines.keySet()) {
                if (getStopped4G().get(lineID) == null) {
                    if (firstCycle == false) {
                        try {
                            String subject = "Customer (" + lineID + ") with 4GBackup line disconnected";
                            String body = "<h2>Customer (" + lineID + ") with 4GBackup line disconnected</h2>";
                            MailSender_new myMailSender = new MailSender_new();
                            myMailSender.setServer(myParameters.getERRORS_mailServer());
                            myMailSender.setSender(myParameters.getERRORS_mailSender());
                            myMailSender.setUser(myParameters.getERRORS_mailUser());
                            myMailSender.setPass(myParameters.getERRORS_mailPass());
                            myMailSender.setRecipient(myParameters.getERRORS_mail_recipients());
                            myMailSender.setCc(myParameters.getERRORS_mail_cc_recipients());
                            myMailSender.setSubject(subject);
                            myMailSender.setBodyMessage(body);
                            //myMailSender.sendMail();
                        } catch (Exception e) {
                            e.printStackTrace(System.out);
                            System.out.println("DSLMON: createMailAlert failed!" + e.toString());
                        }
                    }
                    System.out.println("DSLMON: 4GAdded " + lineID);
                    getStopped4G().put(lineID, myStopped4GBackupLines.get(lineID));
                }
            }

            //-- remove ----
            for (String line4GID : getStopped4G().keySet()) {
                if (myStopped4GBackupLines.get(line4GID) == null) {
                    System.out.println("DSLMON: 4Gremoved " + line4GID);
                    getStopped4G().remove(line4GID);
                    if (firstCycle == false) {
                        try {
                            String subject = "Customer (" + line4GID + ") with 4GBackup line re-connected";
                            String body = "<h2>Customer (" + line4GID + ") with 4GBackup line re-connected</h2>";
                            body += "<p>" + line4GID;
                            MailSender_new myMailSender = new MailSender_new();
                            myMailSender.setServer(myParameters.getERRORS_mailServer());
                            myMailSender.setSender(myParameters.getERRORS_mailSender());
                            myMailSender.setUser(myParameters.getERRORS_mailUser());
                            myMailSender.setPass(myParameters.getERRORS_mailPass());
                            myMailSender.setRecipient(myParameters.getERRORS_mail_recipients());
                            myMailSender.setCc(myParameters.getERRORS_mail_cc_recipients());
                            myMailSender.setSubject(subject);
                            myMailSender.setBodyMessage(body);
                            //myMailSender.sendMail();
                        } catch (Exception e) {
                            e.printStackTrace(System.out);
                            System.out.println("DSLMON: createMailAlert failed!" + e.toString());
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("DSLMON:FourG_backupDaemon error:" + e.toString());
        }
        firstCycle = false;
    }

    private static HashMap<String, String> filterOutMassive(List<Alarm_FYROM> myLiveAlarms, HashMap<String, String> linesToBeFiltered, PathsRetriever myPatrhsRetriever) {
        ArrayList<String> linesMasive = new ArrayList();
        if (myPatrhsRetriever != null) {
            for (Alarm_FYROM myAlarm : myLiveAlarms) {
                linesMasive.addAll(myPatrhsRetriever.retrieveLines(myAlarm.getNetworkElementName()));
            }
        }
        //----------------
        for (String line : linesToBeFiltered.keySet()) {
            if (linesMasive.contains(line)) {
                linesToBeFiltered.remove(line);
            }
        }
        return linesToBeFiltered;
    }

    /**
     * @return the stopped4G
     */
    public Map<String, String> getStopped4G() {
        return stopped4G;
    }

    /**
     * @param active4G the stopped4G to set
     */
    public void setStopped4G(ConcurrentHashMap<String, String> active4G) {
        this.stopped4G = active4G;
    }

    public static void main(String[] args) {

    }
}
