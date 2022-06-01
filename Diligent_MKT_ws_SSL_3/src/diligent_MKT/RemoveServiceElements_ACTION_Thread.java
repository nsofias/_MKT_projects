/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_MKT;

import java.util.ArrayList;
import nsofiasLib.ote.alarms.Alarm_Parameters;
import nsofiasLib.others.Parameters;
import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author nsofias
 */
public class RemoveServiceElements_ACTION_Thread implements Runnable {

    private final Ticket_FYROM myTicket;
    ArrayList eventsLogArrayList;
    Alarm_Parameters myParameters;
    Alarm_FYROM myAlarm;

    public RemoveServiceElements_ACTION_Thread(Ticket_FYROM myTicket, Alarm_FYROM myAlarm, ArrayList eventsLogArrayList, Alarm_Parameters myParameters) {
        this.eventsLogArrayList = eventsLogArrayList;
        this.myTicket = myTicket;
        this.myParameters = myParameters;
        this.myAlarm = myAlarm;
    }

    @Override
    public void run() {
        System.out.println("RemoveServiceElements_ACTION_Thread started for  " + myAlarm.getTicketSR() + "-" + myAlarm.getAffServiceID());
        myTicket.setBUSY(true);
        try {
            //------------------------- removeServiceElements -------------------------
            if (!myAlarm.getAffServiceID().equals(myAlarm.getObjName()))//do not updateServiceElements if found already open by Ericcsson (we put the objName as AffServiceID)
            {
                myTicket.updateServiceElements(myAlarm);
                System.out.println("RemoveServiceElements_ACTION_Thread/updateServiceElements for   " + myTicket.getDesc() + " at " + new TimeStamp1().getNowFormated());
            }
            long releaseCustomersAffectedDelay = 1800000;
            try {
                releaseCustomersAffectedDelay = Long.parseLong(Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "releaseCustomersAffectedDelay", "utf-8"));
            } catch (NumberFormatException e) {
                System.out.println("RemoveServiceElements_ACTION_Thread error reading releaseCustomersAffected value");
            }
            Thread.sleep(releaseCustomersAffectedDelay);
            myTicket.releaseCustomersAffected(myAlarm);
            System.out.println("RemoveServiceElements_ACTION_Thread/propagateAffectedCustomers_inService for " + myAlarm.getTicketSR() + "-" + myAlarm.getAffServiceID() + " at " + new TimeStamp1().getNowFormated());
        } catch (Exception e) {
            myTicket.setBUSY(false);
            e.printStackTrace(System.out);
            eventsLogArrayList.add(0, new TimeStamp1().getNowFormated() + ":(" + myTicket.getSR() + "-" + myTicket.getSYNOPSIS() + ")/RemoveServiceElements_ACTION_Thread " + e.toString());
            System.out.println("RemoveServiceElements_ACTION_Thread error:(" + myAlarm.getTicketSR() + "-" + myAlarm.getAffServiceID() + "):  " + e.toString());
            myTicket.sendMailAlert("","ERRORR RemoveServiceElements_ACTION_Thread for ticket with  Synopsis:" + myTicket.getSYNOPSIS(), myParameters);
        }
        myTicket.setBUSY(false);
        System.out.println("DSLMON_SKOPIA: RemoveServiceElements_ACTION_Thread ended " + myAlarm.getTicketSR() + "-" + myAlarm.getAffServiceID());
    }

}
