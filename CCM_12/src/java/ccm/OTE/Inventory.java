/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

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
public class Inventory {

    static String spark_proxy_ip = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "spark_proxy", "UTF8");

    public static Map<String, Map<String, String>> requestNumberInfo(ArrayList<String> a_numbers) {
        Map<String, Map<String, String>> res = new HashMap();
        try {
            URLContextReader_object myUrlReader = new URLContextReader_object();
            String a_numbers_ = "";
            for (String a_number : a_numbers) {
                a_numbers_ += a_number + ",";
            }
            //88888888888888888888888
            a_numbers_ = URLEncoder.encode(a_numbers_.substring(0, a_numbers_.length() - 1), "UTF-8");
            //888888888888888888888888
            String url = "http://" + spark_proxy_ip + ":8080/SPARK_PROXY/SparkProxyrOSIX_servlet?queryTimeout=360000&type=site_description&a_number=" + a_numbers_;
            ArrayList<String> strs = myUrlReader.getUrlContext(url, 360000, 360000);
            if (strs.get(0).contains("Exception")) {
                System.out.println("CCM:Inventory:Exception   url:" + url + " returned:" + strs.get(0));
            }
            Gson gson = new Gson();
            java.lang.reflect.Type array_type = new TypeToken<java.util.Map<String, PstnNumberInfo>>() {
            }.getType();
            Map<String, PstnNumberInfo> myPstnNumberInfos = (Map<String, PstnNumberInfo>) gson.fromJson(strs.get(0), array_type);
            for (String a_number : myPstnNumberInfos.keySet()) {
                PstnNumberInfo myPstnNumberInfo = myPstnNumberInfos.get(a_number);
                Map<String, String> cliResources = new HashMap();
                // for OTE parameters AREA;BRAS;DSLAM;SLOT;CABLE
                cliResources.put("AREA", myPstnNumberInfo.getArea());
                cliResources.put("BRAS", myPstnNumberInfo.getBrasname());
                cliResources.put("DSLAM", myPstnNumberInfo.getDslamcode());
                cliResources.put("SLOT", myPstnNumberInfo.getDslamcode()+":"+myPstnNumberInfo.getDslamslot());
                cliResources.put("CABLE", myPstnNumberInfo.getCable());
                res.put(myPstnNumberInfo.getA_number(), cliResources);
            }
        } catch (Exception e) {
        }
        return res;
    }

    public static void main(String args[]) {
        try {
            ArrayList Anumbers = new ArrayList();
            Anumbers.add("2107623595");            
            Map<String, Map<String, String>> myPstnNumberInfoList = Inventory.requestNumberInfo(Anumbers);
            System.out.println("CCM:Inventory:myPSTN_cachedArrayList size :" + myPstnNumberInfoList.size());
            for (String a_number : myPstnNumberInfoList.keySet()) {
                Map<String, String> myPstnNumberInfo = myPstnNumberInfoList.get(a_number);
                System.out.println("CCM:Inventory:xxxx " + myPstnNumberInfo);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
