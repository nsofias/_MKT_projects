/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_MKT;

import java.util.ArrayList;
import nsofiasLib.ote.alarms.Alarm_Parameters;
import nsofiasLib.time.TimeStamp1;
 
/**
 *
 * @author nsofias
 */
public class AddServiceElements_ACTION_Thread implements Runnable
    {

    private final Ticket_FYROM myTicket;
    ArrayList eventsLogArrayList;
    Alarm_Parameters myParameters;
    ArrayList<Alarm_FYROM> elementsList;
    String owner="";

    public AddServiceElements_ACTION_Thread(String owner,Ticket_FYROM myTicket,ArrayList<Alarm_FYROM> elementsList, ArrayList eventsLogArrayList, Alarm_Parameters myParameters)
        {
        this.eventsLogArrayList = eventsLogArrayList;
        this.myTicket = myTicket;
        this.myParameters = myParameters;
        this.elementsList = elementsList;
        this.owner=owner;
        }

    @Override
    public void run()
        {
        System.out.println("AddServiceElements_ACTION_Thread started for  " + myTicket.getCollerationString());
        myTicket.setBUSY(true);
        try
            {          
            //------------------------- addServiceElements -------------------------
            myTicket.addServiceElements(owner,elementsList);
            System.out.println("addServiceElements for  " + myTicket.getDesc() + " at " + new TimeStamp1().getNowFormated());
            //------------------- releaseCustomersAffected ---------
            myTicket.markCustomersAffected(owner,elementsList);
            System.out.println("propagateAffectedCustomers  for " + myTicket.getDesc() + " at " + new TimeStamp1().getNowFormated());
            myTicket.sendMailAlert(owner,"propagated extra Affected Customers for ticket with  Synopsis:" + myTicket.getSYNOPSIS(), myParameters);
            }
        catch (Exception e)
            {
            myTicket.setBUSY(false);
            e.printStackTrace(System.out);
            System.out.println("Error_" + myTicket.getCollerationString() + "@" + new TimeStamp1().getNowUnformated());
            eventsLogArrayList.add(0, new TimeStamp1().getNowFormated() + ":(" + myTicket.getSR() + "-" + myTicket.getSYNOPSIS() + ")/AddServiceElements_ACTION_Thread " + e.toString());
            System.out.println("AddServiceElements_ACTION_Thread error:"+e.toString());
            myTicket.sendMailAlert(owner,"ERROR AddServiceElements_ACTION_Thread for ticket with  Synopsis:" + myTicket.getSYNOPSIS(), myParameters);
            }
        myTicket.setBUSY(false);
        System.out.println("DSLMON_SKOPIA: AddServiceElements_ACTION_Thread ended " + myTicket.getSR());
        }

    }
