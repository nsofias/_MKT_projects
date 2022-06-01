/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.MKT;

import ccm.CallInfo;
import ccm.NetworkResourcesFinder;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import nsofiasLib.others.Parameters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.URLContextReader_object;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author nsofias
 */
public class NetworkResourcesFinder_MKT implements NetworkResourcesFinder {

    Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
    String findCLIsResourcesURL = myParameters.getStringValue("findCLIsResourcesURL", "http://10.232.63.13:8080/RADIUS_MKT/getCallInfo.jsp");

    @Override
    public void findCLIsResources(ArrayList<CallInfo> myCallInfoList) {
        myCallInfoList.forEach(myCallInfo -> {
            try {
                getPstnNumberInfos(myCallInfo);
            } catch (Exception e) {
                System.out.println("CCM12:findCLIsResources error:" + e.toString());
                e.printStackTrace(System.out);
            }
        });
    }

    private void getPstnNumberInfos(CallInfo myCallInfo) {
        String fault_CLI = myCallInfo.getLineId();
        try {
            try {
                String url = findCLIsResourcesURL + "?lineId=" + fault_CLI;       //http://10.232.63.13:8080/RADIUS_MKT/getCallInfo.jsp?lineId=L0239387
                System.out.println("CCM12:findCLIsResources:myCallInfo:url:" + url);
                URLContextReader_object myUrlReader = new URLContextReader_object();
                String str = (String) myUrlReader.getUrlContext(url).get(0);
                myCallInfo.setResources(new Gson().fromJson(str, CallInfo.class).getResources());
                //System.out.println("CCM12:findCLIsResources(Radius) CABLE:" + myCallInfo.getResources().get("CABLE") + " DP:" + myCallInfo.getResources().get("DP"));
            } catch (Exception e) {
                System.out.println("CCM12:findCLIsResources error:" + e.toString());
            }
            //---------- if not found ask NCDB ------------------
            if (myCallInfo.getResources().isEmpty()) {
                myCallInfo.setResources(findCLIsResourcesFromNCDB(fault_CLI).getResources());
                //System.out.println("CCM12:findCLIsResources(NCDB) CABLE:" + myCallInfo.getResources().get("CABLE") + " DP:" + myCallInfo.getResources().get("DP"));
            }
        } catch (Exception e) {
            System.out.println("CCM12:findCLIsResources error1:" + e.toString());
            e.printStackTrace(System.out);
        }
    }

    public CallInfo findCLIsResourcesFromNCDB(String lineId) throws Exception {
        CallInfo myCallInfo = new CallInfo(lineId, new TimeStamp1().getNowUnformated(), "NA", "UNKN_REASON");
        String SQL_STRING = "SELECT LINE_ID, SERVING_AREA, ATC, DSLAM_NAME, RACK, SHELF, SLOT, CABLE, DP, CARD_TECHNOLOGY "
                + "FROM NC_OSS_PROD_RDB.V_DILIGENT_LINES   where LINE_ID ='" + lineId + "'";
        //-----------------------------------
        //SERVING_AREA;ATC;DSLAM;SLOT;CABLE;DP;
        //--------------------------
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//10.232.58.38:1521/NGOSSRDB");
        ods.setUser("DILIGENT_USER");
        ods.setPassword("Dilipass#1");
        try (Connection conn = ods.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet res = stmt.executeQuery(SQL_STRING);
            if (res.next()) {

                //SERVING_AREA;ATC;DSLAM;SHELF;SLOT;CABLE;DP;BOX;
                String cardTechnology = res.getString("CARD_TECHNOLOGY");
                if (!cardTechnology.equals("GPON")) {
                    cardTechnology = "COPPER";
                }
                String SERVING_AREA = res.getString("SERVING_AREA");
                String ATC = res.getString("ATC");
                if (ATC == null || ATC.isEmpty()) {
                    ATC = SERVING_AREA;
                }
                String DSLAM = res.getString("DSLAM_NAME") != null ? res.getString("DSLAM_NAME") : "";
                String RACK = res.getString("RACK") != null ? res.getString("RACK") : "";
                String SHELF = res.getString("SHELF") != null ? res.getString("SHELF") : "";
                String SLOT = res.getString("SLOT") != null ? res.getString("SLOT") : "";
                String CABLE = res.getString("CABLE") != null ? res.getString("CABLE") : "";
                String DP = res.getString("DP") != null ? res.getString("DP") : "";
                SLOT = DSLAM + ":" + RACK + "-" + SHELF + "-" + SLOT;
                SHELF = DSLAM + ":" + RACK + "-" + SHELF;
                //
                myCallInfo.getResources().put("SERVING_AREA", SERVING_AREA);
                myCallInfo.getResources().put("ATC", SERVING_AREA + ";" + ATC);
                //------------
                if (!cardTechnology.equals("GPON")) {
                    //--------- COPPER  --------------
                    //path = SERVING_AREA + ";" + ATC + ";" + DSLAM + ";" + SLOT;
                    //path = ATC + ";" + CABLE + ";" + DP;
                    myCallInfo.setNetworkType("COPPER");
                    CABLE = ATC + "#" + CABLE;
                    DP = CABLE + "#" + DP;
                    //
                    myCallInfo.getResources().put("DSLAM", SERVING_AREA + ";" + ATC + ";" + DSLAM);
                    myCallInfo.getResources().put("SLOT", SERVING_AREA + ";" + ATC + ";" + DSLAM + ";" + SLOT);
                    myCallInfo.getResources().put("CABLE", ATC + ";" + CABLE);
                    myCallInfo.getResources().put("DP", ATC + ";" + CABLE + ";" + DP);
                } else {
                    //-------- GPON ---------------
                    //path = OLT + ";" + SHELF + ";" + SLOT;
                    //path = ATC + ";" + CABLE + ";" + DP;
                    //
                    myCallInfo.setNetworkType("GPON");
                    myCallInfo.getResources().put("OLT", DSLAM);
                    myCallInfo.getResources().put("GPON_SHELF", DSLAM + ";" + SHELF);
                    myCallInfo.getResources().put("GPON_SLOT", DSLAM + ";" + SHELF + ";" + SLOT);
                    myCallInfo.getResources().put("GPON_CABLE", ATC + ";" + CABLE);
                    myCallInfo.getResources().put("GPON_BOX", ATC + ";" + CABLE + ";" + DP);
                }
                myCallInfo.setNetworkType(cardTechnology);
            }
        }
        return myCallInfo;
    }

    public static void main(String args[]) {
        try {
            CallInfo myCallInfo = new CallInfo("L0288752", "20200101T101010.000", "NETWORK", "REASON");

            new NetworkResourcesFinder_MKT().getPstnNumberInfos(myCallInfo);
            System.out.println("myCallInfo: " + myCallInfo.toString());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
