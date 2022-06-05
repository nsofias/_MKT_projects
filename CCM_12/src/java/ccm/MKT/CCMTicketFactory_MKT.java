/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.MKT;

import ccm.CCMAlarm;
import ccm.CCMTicket;
import ccm.CCMTicketFactory;
import diligent_MKT.AlarmOpenningProfile;
import diligent_MKT.Alarm_FYROM;
import static diligent_MKT.Alarm_FYROM.COPPER_PATH_DEPTH_ATC;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_ATC;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_CABLE;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_DP;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_DSLAM;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SERVING_AREA;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SLOT;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_BOX;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_OLT;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SHELF;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SLOT;
import static diligent_MKT.Alarm_FYROM.TYPE_COPPER;
import static diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE;
import static diligent_MKT.Alarm_FYROM.TYPE_GPON;
import static diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE;
import diligent_MKT.Ticket_FYROM;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import nsofiasLib.others.Helpme;

/**
 *
 * @author nsofias
 */
public class CCMTicketFactory_MKT implements CCMTicketFactory {

    List<String> ATCsCoords = new ArrayList();

    public CCMTicketFactory_MKT() {
        try {
            ATCsCoords = Helpme.getFileRowsAsList(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/NC_Locations1.csv", StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("CCM12:coords reading error: " + e.toString());
            e.printStackTrace();
        }
    }

    //****************** to OVERWRITE **************************************
    @Override
    public CCMTicket createTicket(CCMAlarm myAlarm) {
        String type = myAlarm.getAlarmType();
        String elementName = myAlarm.getAlarmObject();
        //String parentName = myAlarm.getAlarmParent();
        Ticket_MKT myTicket = new Ticket_MKT(myAlarm.getAlarmParent());

        Alarm_FYROM myAlarm_FYROM = new Alarm_FYROM(elementName, myAlarm.getAlarmStart());
        myAlarm_FYROM.setAlarmOpenningProfile(new AlarmOpenningProfile("1; ;0"));
        String[] pathParts = elementName.split(";");
        myAlarm_FYROM.setDESCRIPTION(pathParts[pathParts.length - 1]);
        Ticket_FYROM myTicket_FYROM = new Ticket_FYROM("");
        //SERVING_AREA;ATC;DSLAM;OLT;SHELF;SLOT;CABLE;DP;BOX;
        //------------ setType ----
        //myAlarm_FYROM.setAlarmSubType(type);
        //------------- COPPER -----------------
        switch (type) {
            case "SERVING_AREA":
                myAlarm_FYROM.setSERVING_AREA(elementName);
                myTicket_FYROM.setType(TYPE_COPPER);
                myAlarm_FYROM.setAlarmType(TYPE_COPPER);
                //
                myTicket_FYROM.setSubType(SUBTYPE_COPPER_SERVING_AREA);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_COPPER_SERVING_AREA);
                break;
            case "ATC":
                myAlarm_FYROM.setSERVING_AREA(elementName.split(";")[0]);
                myAlarm_FYROM.setATC(elementName);
                myTicket_FYROM.setType(TYPE_COPPER);
                myAlarm_FYROM.setAlarmType(TYPE_COPPER);
                //
                myTicket_FYROM.setSubType(SUBTYPE_COPPER_ATC);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_COPPER_ATC);
                break;
            case "DSLAM":
                myAlarm_FYROM.setSERVING_AREA(elementName.split(";")[0]);
                myAlarm_FYROM.setATC(elementName.split(";")[1]);
                myAlarm_FYROM.setDSLAM(elementName);
                myTicket_FYROM.setType(TYPE_COPPER);
                myAlarm_FYROM.setAlarmType(TYPE_COPPER);
                //
                myTicket_FYROM.setSubType(SUBTYPE_COPPER_DSLAM);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_COPPER_DSLAM);
                break;
            case "SLOT":
                myAlarm_FYROM.setSERVING_AREA(elementName.split(";")[0]);
                myAlarm_FYROM.setATC(elementName.split(";")[1]);
                myAlarm_FYROM.setDSLAM(elementName.split(";")[2]);
                myAlarm_FYROM.setSLOT(elementName);
                myTicket_FYROM.setType(TYPE_COPPER);
                myAlarm_FYROM.setAlarmType(TYPE_COPPER);
                //
                myTicket_FYROM.setSubType(SUBTYPE_COPPER_SLOT);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_COPPER_SLOT);
                //------------- COPPER CABLE -----------------
                break;
            case "CABLE":
                myAlarm_FYROM.setATC(elementName.split(";")[0]);
                myAlarm_FYROM.setCABLE(elementName.split(";")[1]);
                myTicket_FYROM.setType(TYPE_COPPER_CABLE);
                myAlarm_FYROM.setAlarmType(TYPE_COPPER_CABLE);
                //
                myTicket_FYROM.setSubType(SUBTYPE_COPPER_CABLE_CABLE);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_COPPER_CABLE_CABLE);
                break;
            case "DP":
                myAlarm_FYROM.setATC(elementName.split(";")[0]);
                myAlarm_FYROM.setCABLE(elementName.split(";")[1]);
                myAlarm_FYROM.setDP(elementName.split(";")[2]);
                myTicket_FYROM.setType(TYPE_COPPER_CABLE);
                myAlarm_FYROM.setAlarmType(TYPE_COPPER_CABLE);
                //
                myTicket_FYROM.setSubType(SUBTYPE_COPPER_CABLE_DP);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_COPPER_CABLE_DP);
                //------------- GPON -----------------                
                break;
            case "OLT":
                myAlarm_FYROM.setATC(myAlarm.getAlarmParent());//just for weather!!!
                myAlarm_FYROM.setOLT(elementName);
                myTicket_FYROM.setType(TYPE_GPON);
                myAlarm_FYROM.setAlarmType(TYPE_GPON);
                //
                myTicket_FYROM.setSubType(SUBTYPE_GPON_OLT);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_GPON_OLT);
                break;
            case "GPON_SHELF":
                myAlarm_FYROM.setOLT(elementName.split(";")[0]);
                myAlarm_FYROM.setSHELF(elementName.split(";")[1]);
                myTicket_FYROM.setType(TYPE_GPON);
                myAlarm_FYROM.setAlarmType(TYPE_GPON);
                //
                myTicket_FYROM.setSubType(SUBTYPE_GPON_SHELF);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_GPON_SHELF);
                break;
            case "GPON_SLOT":
                myAlarm_FYROM.setOLT(elementName.split(";")[0]);
                myAlarm_FYROM.setSHELF(elementName.split(";")[1]);
                myAlarm_FYROM.setSLOT(elementName.split(";")[2]);
                myTicket_FYROM.setType(TYPE_GPON);
                myAlarm_FYROM.setAlarmType(TYPE_GPON);
                //
                myTicket_FYROM.setSubType(SUBTYPE_GPON_SLOT);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_GPON_SLOT);
                //------------- GPON CABLE -----------------
                break;
            case "GPON_CABLE":
                myAlarm_FYROM.setATC(elementName.split(";")[0]);
                myAlarm_FYROM.setCABLE(elementName.split(";")[1]);
                myTicket_FYROM.setType(TYPE_GPON_CABLE);
                myAlarm_FYROM.setAlarmType(TYPE_GPON_CABLE);
                //
                myTicket_FYROM.setSubType(SUBTYPE_GPON_CABLE);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_GPON_CABLE);
                break;
            case "GPON_BOX":
                myAlarm_FYROM.setATC(elementName.split(";")[0]);
                myAlarm_FYROM.setCABLE(elementName.split(";")[1]);
                myAlarm_FYROM.setBOX(elementName.split(";")[2]);
                myTicket_FYROM.setType(TYPE_GPON_CABLE);
                myAlarm_FYROM.setAlarmType(TYPE_GPON_CABLE);
                //
                myTicket_FYROM.setSubType(SUBTYPE_GPON_BOX);
                myAlarm_FYROM.setAlarmSubType(SUBTYPE_GPON_BOX);
                break;
            default:
                break;
        }
        //-----------------------
        long linesRegistered = myAlarm_FYROM.findLinesRegistered();
        myAlarm.setAffectedCustomers(linesRegistered);
        myAlarm_FYROM.setLinesRegistered(linesRegistered);
        myTicket_FYROM.setArea("");
        List<Alarm_FYROM> alarmsInTicket = new ArrayList();
        alarmsInTicket.add(myAlarm_FYROM);
        myTicket_FYROM.appendNetworkElements(alarmsInTicket);
        myTicket_FYROM.setIncidentStartDate(myAlarm_FYROM.getAlarmStart());
        myTicket_FYROM.setState(Ticket_FYROM.STATE_PENDING_TO_OPEN);
        myTicket_FYROM.setSYNOPSIS(myTicket_FYROM.getDescUnformated());
        //---------- weather ----------------------
        if (myAlarm_FYROM.getATC() != null) {
            String myATC = myAlarm_FYROM.getATC();
            try {
                if (myATC.contains(";")) {
                    myATC = myATC.split(";")[1];
                }
                Double[] coords = findLatLonOfATC(ATCsCoords, myATC);
                String weather = Helpme.getWeatherInfo_LON_LAT(coords[1], coords[0]);
                myAlarm.setWeatherInfo(weather);
            } catch (Exception e) {
                System.out.println("CCM12:weather error: " + e.toString());
                e.printStackTrace();
            }
        }
        //-----------PENDING_STATE_DURATION_MIN-----------           
        myTicket_FYROM.setWaitTime(0);
        myTicket.setMyTicket_IBM(myTicket_FYROM);
        return myTicket;
    }

    static Double[] findLatLonOfATC(List<String> allATCsCoords, String myATC) {
        Optional<Double[]> res = allATCsCoords.stream().filter(v -> v.contains(myATC + ";"))
                .findAny().map(v -> v.split(";"))
                .map(v -> new Double[]{Double.valueOf(v[2].replace(",", ".")), Double.valueOf(v[3].replace(",", "."))});
        return res.orElse(null);
    }

    public static void main(String[] args) {
        try {
            List<String> myATCsCoords = Helpme.getFileRowsAsList(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/NC_Locations1.csv", StandardCharsets.UTF_8);
            Double[] coords = CCMTicketFactory_MKT.findLatLonOfATC(myATCsCoords, "OS_Bitola_Dolno Orizari");
            System.out.println(Arrays.asList(coords));
            String weather = Helpme.getWeatherInfo_LON_LAT(coords[1], coords[0]);
            System.out.println(weather);
        } catch (Exception e) {
            System.out.println("CCM12:coords reading error: " + e.toString());
            e.printStackTrace();
        }

    }
}
