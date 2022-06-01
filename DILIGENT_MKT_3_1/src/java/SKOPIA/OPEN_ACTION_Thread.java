/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA;

import diligent_MKT.Ticket_FYROM;
import java.util.ArrayList;
import nsofiasLib.ote.alarms.Alarm_Parameters;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;

/**
 *
 * @author nsofias
 */
public class OPEN_ACTION_Thread implements Runnable
    {

    private final Ticket_FYROM myTicket;
    ArrayList eventsLogArrayList;
    Alarm_Parameters myParameters;

    public OPEN_ACTION_Thread(Ticket_FYROM myTicket, ArrayList eventsLogArrayList, Alarm_Parameters myParameters)
        {
        this.eventsLogArrayList = eventsLogArrayList;
        this.myTicket = myTicket;
        this.myParameters = myParameters;
        }

    @Override
    public void run()
        {
        System.out.println("OPEN_ACTION_Thread started for  " + myTicket.getCollerationString());
        myTicket.setBUSY(true);
        //boolean foundAlreadyOpen = false;
        try
            {
            //-------------------------- openTicket --------------------------------
            myTicket.openTicket("Diligent");
            if (myTicket.getSR()==null)
                {
                throw new Exception();
                }
            myTicket.setState(Ticket_FYROM.STATE_OPEN_INCIDENT);
            System.out.println("New state " + Ticket_FYROM.STATE_OPEN_INCIDENT + " for " + myTicket.getDesc() + " at " + new TimeStamp1().getNowFormated());
            myTicket.sendMailAlert("Diligent","OPPENED ticket with  Synopsis:" + myTicket.getSYNOPSIS(), myParameters);
            //------------------------- addServiceElements -------------------------
            myTicket.addServiceElements("Diligent");
            myTicket.setState(Ticket_FYROM.STATE_OPEN_AFFECTEDSERVICE);
            System.out.println("New state " + Ticket_FYROM.STATE_OPEN_AFFECTEDSERVICE + " for " + myTicket.getDesc() + " at " + new TimeStamp1().getNowFormated());
            //myTicket.sendMailAlert("AFFECTEDSERVICE added to  ticket with  Synopsis:" + myTicket.getSYNOPSIS(), myParameters);
            //------------------- markDeffected ---------
            myTicket.markCustomersAffected("Diligent");
            myTicket.setState(Ticket_FYROM.STATE_OPEN_PROPAGATED);
            System.out.println("New state " + Ticket_FYROM.STATE_OPEN_PROPAGATED + " for " + myTicket.getDesc() + " at " + new TimeStamp1().getNowFormated());
            myTicket.sendMailAlert("Diligent","propagateAffectedCustomers for ticket with  Synopsis:" + myTicket.getSYNOPSIS(), myParameters);
            }
        catch (Exception e)
            {
            myTicket.setBUSY(false);
            e.printStackTrace(System.out);
            System.out.println("Error_" + myTicket.getCollerationString() + "@" + new TimeStamp1().getNowUnformated());
            myTicket.setState(Ticket.STATE_OPEN_FAILED);
            eventsLogArrayList.add(0, new TimeStamp1().getNowFormated() + ":(" + myTicket.getSR() + "-" + myTicket.getSYNOPSIS() + ")/OPEN_ACTION_Thread " + e.toString());
            System.out.println("OPEN_ACTION_Thread error:" + e.toString());
            new MailAlert().sendmailAlert("ERROR (" + e.toString() + " oppening ticket with  Synopsis:" + myTicket.getSYNOPSIS(), e);
            }
        myTicket.setBUSY(false);
        System.out.println("DSLMON_SKOPIA: On_OPEN_ACTION_Thread ended " + myTicket.getSR());
        }

    }
