/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

import ccm.CCMAlarm;
import ccm.CCMTicket;
import ccm.CCMTicketFactory;
import nsofiasLib.ote.DSLAMs.DslamDetails;
import nsofiasLib.time.TimeStamp1;
import siebel.NetworkElement;
import siebel.TicketSiebel;

/**
 *
 * @author nsofias
 */
public class CCMTicketFactory_OTE implements CCMTicketFactory {

    @Override
    public CCMTicket createTicket(CCMAlarm myAlarm) {
        System.out.println("CCM12: start createSiebelTicket for element:" + myAlarm.getAlarmObject() + " of type " + myAlarm.getAlarmType());
        String type = myAlarm.getAlarmType();
        String elementName = myAlarm.getAlarmObject();
        String parentName = myAlarm.getAlarmParent();
        Ticket_OTE myTicket = new Ticket_OTE(myAlarm.getAlarmParent());
        TicketSiebel myTicketSiebel = new TicketSiebel();
        System.out.println("CCM12:createSiebelTicket for element:" + elementName + " of type " + type);
        fillInTicketForSiebel(myTicketSiebel, type, elementName, parentName);
        myTicket.setMyTicketSiebel(myTicketSiebel);
        return myTicket;
    }

    public String toHTML(CCMAlarm myAlarm) {
        String alarmObject = myAlarm.getAlarmObject();
        if (myAlarm.getAlarmType().equals("CABLE")) {
            try {
                String alarmObjVals[] = alarmObject.split(":");
                alarmObject = "κεντρο:" + alarmObjVals[0] + "<p>KK:" + alarmObjVals[1] + "<p>KV:" + alarmObjVals[2];
            } catch (Exception e) {
            }
        }
        String myBodyMessage = "";
        myBodyMessage += "<table border='1' width='100%'  bgcolor='#EBF4FA' border='1' cellpadding='5'>";
        myBodyMessage += "<tr><td>Network Element</td><td><b>" + alarmObject + "</b></td></tr>";
        myBodyMessage += "<tr><td>Network Element type</td><td>" + myAlarm.getAlarmType() + "</td></tr>";
        myBodyMessage += "<tr><td>Parent net. element</td><td><b>" + myAlarm.getAlarmParent() + "</td></tr>";
        myBodyMessage += "<tr><td>Alarm source (child elements)</td><td>" + myAlarm.getDesc() + "</b></td></tr>";
        myBodyMessage += "<tr><td>Most affected service</td><td>" + myAlarm.getAlertMostSignificantReason() + "</td></tr>";
        myBodyMessage += "<tr><td>Customer calls)</td><td  aligh='right'>" + myAlarm.getTotalCalls() + "</td></tr>";
        myBodyMessage += "<tr><td>Start time</td><td>" + new TimeStamp1(myAlarm.getAlarmStart()).getNowFormated().substring(0, 16) + "</td></tr>";
        myBodyMessage += "<tr><td>Duration</td><td>" + (new TimeStamp1(myAlarm.getAlarmStop())).minutesDiff(new TimeStamp1(myAlarm.getAlarmStart())) + " minutes</td></tr>";
        if (myAlarm.getAlarmType().equals("DSLAM")) {
            try {
                myBodyMessage += "<tr><td>weather conditions</td><td>" + DslamDetails.weather(myAlarm.getAlarmObject()) + "</td></tr>";
                myBodyMessage += "<tr><td>Extra information</td><td>" + Ticket_OTE.getDslamExtraInfo(myAlarm.getAlarmObject()) + "</td></tr>";
            } catch (Exception e) {
                System.out.println("CCM12:CCMTicketFactory_OTE#1" + e.toString());
                e.printStackTrace();
            }

        } else if (myAlarm.getAlarmType().equals("CABLE")) {
            try {
                myBodyMessage += "<tr><td>weather conditions</td><td>" + DslamDetails.weather(myAlarm.getAlarmParent()) + "</td></tr>";
                String parent = myAlarm.getAlarmParent();
                if (parent != null && !parent.isEmpty()) {
                    myBodyMessage += "<tr><td>Extra information</td><td>" + Ticket_OTE.getDslamExtraInfo(parent) + "</td></tr>";
                }
            } catch (Exception e) {
                System.out.println("CCM12:CCMTicketFactory_OTE#2" + e.toString());
                e.printStackTrace();
            }
        }
        myBodyMessage += "</TABLE>";
        myBodyMessage += "<p><p>Diligent is following the alarm (in the backgroundand) & will open a ticket if necessary.";
        return myBodyMessage;
    }

    private void fillInTicketForSiebel(TicketSiebel myTicketSiebel, String type, String elementName, String parentName) {
        if (myTicketSiebel != null) {
            switch (type) {
                //BRAS
                case "BRAS": {
                    NetworkElement myNetworkElement = new NetworkElement();
                    myNetworkElement.setNasidentifier(elementName);//BRAS_NYMA_6:10149
                    myNetworkElement.setElementName(elementName);
                    myNetworkElement.setSRType("BRAS");
                    myTicketSiebel.getElementsList().add(myNetworkElement);
                    System.out.println("CCM12:createSiebelTicket element=" + elementName + " adding to BRAS NetworkElements");
                    break;
                }
                //DSLAM
                case "DSLAM": {
                    NetworkElement myNetworkElement = new NetworkElement();
                    myNetworkElement.setNasidentifier(parentName);//BRAS_NYMA_6:10149
                    myNetworkElement.setDslamCode(elementName);
                    myNetworkElement.setSRType("DSLAM");
                    myTicketSiebel.getElementsList().add(myNetworkElement);
                    System.out.println("CCM12:createSiebelTicket element=" + elementName + " adding to DSLAM NetworkElements");
                    break;
                }
                //SLOT
                case "SLOT": {
                    NetworkElement myNetworkElement = new NetworkElement();
                    myNetworkElement.setNasidentifier("XXX");//BRAS_NYMA_6:10149
                    myNetworkElement.setDslamCode(parentName);
                    String slot = parentName;
                    if (elementName.split(":").length > 1) {
                        slot = elementName.split(":")[1];
                    }
                    myNetworkElement.setDslamSlot(elementName);
                    myNetworkElement.setSRType("SLOT");
                    myTicketSiebel.getElementsList().add(myNetworkElement);
                    System.out.println("CCM12:createSiebelTicket element=" + elementName + " adding to SLOT NetworkElements");
                    break;
                }
                default:
                    System.out.println("CCM12:createSiebelTicket element=" + elementName + " NOT added to NetworkElements");
                    break;
            }
        }
    }

}
