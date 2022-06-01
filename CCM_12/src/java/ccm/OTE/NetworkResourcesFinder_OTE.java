/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

import ccm.CallInfo;
import ccm.NetworkResourcesFinder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nsofiasLib.others.Parameters;
import nsofiasLib.utils.URLContextReader_object;

/**
 *
 * @author nsofias
 */
public class NetworkResourcesFinder_OTE implements NetworkResourcesFinder {

    static String spark_proxy_ip = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "spark_proxy", "UTF8");

    @Override
    public void findCLIsResources(ArrayList<CallInfo> myCallInfoList) {
        ArrayList<String> fault_CLIs = findFaultCLIs(myCallInfoList);
        System.out.println("CCM12:Inventory:findCLIsResources initial size=" + fault_CLIs.size());
        //
        Map<String, PstnNumberInfo> myPstnNumberInfos = getPstnNumberInfos(fault_CLIs);

        for (CallInfo myCallInfo : myCallInfoList) {
            try {
                String lineID = String.valueOf(myCallInfo.getLineId().hashCode());
                PstnNumberInfo myPstnNumberInfo = myPstnNumberInfos.get(lineID);
                Map<String, String> cliResources = myCallInfo.getResources();
                // for OTE parameters AREA;BRAS;DSLAM;SLOT;CABLE
                if (myPstnNumberInfo.getArea() != null) {
                    cliResources.put("AREA", myPstnNumberInfo.getArea());
                }
                if (myPstnNumberInfo.getBrasname() != null) {
                    cliResources.put("BRAS", myPstnNumberInfo.getBrasname());
                }
                if (myPstnNumberInfo.getDslamcode() != null) {
                    cliResources.put("DSLAM", myPstnNumberInfo.getDslamcode());
                }
                if (myPstnNumberInfo.getDslamslot() != null && !myPstnNumberInfo.getDslamslot().isEmpty()) {
                    cliResources.put("SLOT", myPstnNumberInfo.getDslamcode() + ":" + myPstnNumberInfo.getDslamslot());
                }
                if (myPstnNumberInfo.getCable() != null && !myPstnNumberInfo.getCable().contains("null")) {
                    cliResources.put("KENTRO", myPstnNumberInfo.getCable().split(":")[0]);
                    cliResources.put("CABLE", myPstnNumberInfo.getCable());
                }
                myCallInfo.setLineId(lineID);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("CCM12:NetworkResourcesFinder_OTE#1"+e.toString());
            }
        }

        //----------------------------------------------
    }

    public ArrayList<String> findFaultCLIs(ArrayList<CallInfo> myList) {
        ArrayList<String> fault_CLIs = new ArrayList();
        for (CallInfo myNewCall : myList) {
            String fault_cli = myNewCall.getLineId();
            if (!fault_CLIs.contains(fault_cli) &&  fault_cli.startsWith("2")) {
                fault_CLIs.add(fault_cli);
            }
        }
        return fault_CLIs;
    }

    public Map<String, PstnNumberInfo> getPstnNumberInfos(ArrayList<String> fault_CLIs) {
        Map<String, PstnNumberInfo> myPstnNumberInfos = new HashMap();
        try {
            URLContextReader_object myUrlReader = new URLContextReader_object();
            String a_numbers_ = "";
            for (String a_number : fault_CLIs) {
                a_numbers_ += a_number + ",";
            }
            a_numbers_ = URLEncoder.encode(a_numbers_.substring(0, a_numbers_.length() - 1), "UTF-8");
            String url = "http://" + spark_proxy_ip + ":8080/SPARK_PROXY/SparkProxyrOSIX_servlet?queryTimeout=360000&type=site_description&a_number=" + a_numbers_;
            ArrayList<String> strs = myUrlReader.getUrlContext(url, 360000, 360000);
            if (strs.get(0).contains("Exception")) {
                System.out.println("CCM12:Inventory:Exception   url:" + url + " returned:" + strs.get(0));
            }
            Gson gson = new Gson();
            java.lang.reflect.Type array_type = new TypeToken<java.util.Map<String, PstnNumberInfo>>() {
            }.getType();
            myPstnNumberInfos = (Map<String, PstnNumberInfo>) gson.fromJson(strs.get(0), array_type);
        } catch (Exception e) {
            System.out.println("CCM12:NetworkResourcesFinder_OTE#2"+e.toString());
            e.printStackTrace();
        }

        System.out.println("CCM12:fault_CLIs.size= " + fault_CLIs.size() + "  myPstnNumberInfos.size=" + myPstnNumberInfos.size());
        for (String a_number : fault_CLIs) {
            try {
                if (myPstnNumberInfos.get(a_number) == null) {
                    PstnNumberInfo myPstnNumberInfo = PstnInfoFinder.getAnumberInfo(a_number);
                    if (myPstnNumberInfo != null) {
                        myPstnNumberInfos.put(myPstnNumberInfo.getA_number(), myPstnNumberInfo);
                    }
                }
            } catch (Exception e) {
                System.out.println("CCM12:getPstnNumberInfos:Exception "+e.toString()+" for a_number "+a_number);                
                //e.printStackTrace();
            }           
        }
         System.out.println("CCM12:fault_CLIs.size= " + fault_CLIs.size() + "  myPstnNumberInfos.size (after)=" + myPstnNumberInfos.size());
        return myPstnNumberInfos;
    }

    public static void main(String args[]) {
        try {
            ArrayList Anumbers = new ArrayList();
            Anumbers.add("2107019798");

            Map<String, PstnNumberInfo> myPstnNumberInfoList = new NetworkResourcesFinder_OTE().getPstnNumberInfos(Anumbers);
            System.out.println("CCM12:Inventory:myPSTN_cachedArrayList size :" + myPstnNumberInfoList.size());
            for (String a_number : myPstnNumberInfoList.keySet()) {
                PstnNumberInfo myPstnNumberInfo = myPstnNumberInfoList.get(a_number);
                System.out.println("CCM12:Inventory: " + a_number + "\t" + myPstnNumberInfo.getArea() + "\t" + myPstnNumberInfo.getBrasname() + "\t" + myPstnNumberInfo.getDslamcode());
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
