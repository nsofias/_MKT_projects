/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_mkt_ws;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.URLContextReader_object;

/**
 *
 * @author nsofias
 */
public class Alarm_umbrella {

    public static String EQTYPE_DSLAM = "dslam";
    public static String EQTYPE_OLT = "olt";

    public static boolean existsAlarmInNMS(String type, String dslam, String q1) {
        setSystemProperties();
        String URL = null;
        try {
            if (q1 == null) {
                URL = "http://10.232.63.13/alarm_exists?type=" + type + "&dslam=" + URLEncoder.encode(dslam, "UTF-8");//CE-OLT-17            
            } else {
                URL = "http://10.232.63.13/alarm_exists?type=" + type + "&dslam=" + URLEncoder.encode(dslam, "UTF-8") + "&q1=" + q1;//CE-OLT-17    
            }
            URLContextReader_object myUrlReader = new URLContextReader_object();
            String res = (String) myUrlReader.getUrlContext(URL, 120000, 120000).get(0);
            System.out.println("ALARM_UMBRELLA: existsNMSError URL=" + URL + " returned:" + res);
            return res.contains("yes");
        } catch (Exception e) {
            System.out.println("ALARM_UMBRELLA: (FATAL) ->(COPPER) existsNMSError: error: header:= " + dslam + ", " + e.toString());
            new MailAlert().sendmailAlert("ALARM_UMBRELLA error (existsNMSError) :", "URL=" + URL + " error=" + e);
            e.printStackTrace(System.out);
            return false;
        }
    }

    public static boolean isDying_gasp(String dslam) {
        setSystemProperties();
        String URL = null;
        try {
            URL = "http://10.232.63.13/get_dslam_alarms?cleared_time=30minutes&dslam=" + URLEncoder.encode(dslam, "UTF-8") + "&filter=dgasp";//CE-OLT-17
            System.out.println("ALARM_UMBRELLA: isDying_gasp URL=" + URL);
            URLContextReader_object myUrlReader = new URLContextReader_object();
            String lastRadiusSession = (String) myUrlReader.getUrlContext(URL, 120000, 120000).get(0);
            return !lastRadiusSession.equals("[]");
        } catch (Exception e) {
            System.out.println("ALARM_UMBRELLA: isDying_gasp error for " + dslam + ", " + e.toString());
            new MailAlert().sendmailAlert("ALARM_UMBRELLA error (isDying_gasp) :", "URL=" + URL + " error=" + e);
            e.printStackTrace(System.out);
            return false;
        }
    }

    public static int findBoundCTTs(String sr) throws Exception {
        setSystemProperties();
        URL URL = new URL("http://10.232.63.13/diliserv/diligent_rest");
        //System.out.println("ALARM_UMBRELLA: findBoundCTTs URL=" + URL);
        URLContextReader_object myUrlReader = new URLContextReader_object();
        myUrlReader.setUsername("diligent");
        myUrlReader.setPassword("Tril1g3nt");
        String res = (String) myUrlReader.postTextToUrl(URL, "{\"get_related_count\": {\"ticket\": \" " + sr + "  \"}}");
        //System.out.println("ALARM_UMBRELLA: findBoundCTTs res=" + res);
        return Integer.parseInt(res);
    }

    /*
        user: diligent
        pass: Tril1g3nt

        Ποστάρεις π.χ.:
        {"get_related_count": {"ticket": "INC1459778"}}

        με Endpoint: 'http://10.232.63.13/diliserv/diligent_rest'    
     */
    public static int isDying_gasp(List<String> lineIDs) {
        setSystemProperties();
        int count = 0;
        try {
            diligent_mkt_ws.StringArray lineids = new diligent_mkt_ws.StringArray();
            lineids.getString().addAll(lineIDs);
            diligent_mkt_ws.DiligentService service = new diligent_mkt_ws.DiligentService();
            diligent_mkt_ws.Application port = service.getApplication();
            Map<String, Object> reqContext = ((BindingProvider) port).getRequestContext();
            reqContext.put(BindingProvider.USERNAME_PROPERTY, "diligent");
            reqContext.put(BindingProvider.PASSWORD_PROPERTY, "Tril1g3nt");
            count = port.getDyingGaspCount(lineids).result.getValue().intValue();
            System.out.println("ALARM_UMBRELLA: isDying_gasp (list) count:  " + count);
        } catch (Exception e) {
            System.out.println("ALARM_UMBRELLA: isDying_gasp (list) error:  " + e.toString());
            e.printStackTrace(System.out);
        }
        return count;
    }

    public static ArrayList get_dslam_alarms(String dslam, String filter) {
        setSystemProperties();
        String URL = null;
        try {
            URL = "http://10.232.63.13/get_dslam_alarms?cleared_time=30minutes&dslam=" + URLEncoder.encode(dslam, "UTF-8") + "&filter=" + filter;//CE-OLT-17
            System.out.println("ALARM_UMBRELLA: get_dslam_alarms URL=" + URL);
            URLContextReader_object myUrlReader = new URLContextReader_object();
            String payload = (String) myUrlReader.getUrlContext(URL, 120000, 120000).get(0);
            Gson gson = new Gson();
            java.lang.reflect.Type my_class = new TypeToken<ArrayList<NmsAlarm>>() {
            }.getType();
            ArrayList<NmsAlarm> myAlarms = (ArrayList<NmsAlarm>) gson.fromJson(payload, my_class);
            return myAlarms;
        } catch (Exception e) {
            System.out.println("ALARM_UMBRELLA: (FATAL) ->(COPPER) createAlarms: error: header:= " + dslam + ", " + e.toString());
            new MailAlert().sendmailAlert("ALARM_UMBRELLA error (get_dslam_alarms) :", "URL=" + URL + " error=" + e);
            e.printStackTrace(System.out);
            return new ArrayList();
        }
    }
    private static void setSystemProperties() {
        System.setProperty("http.proxyHost", "");
        System.setProperty("https.proxyHost", "");
        System.setProperty("http.proxyPort", "");        
    }
//******
    public static void main(String[] args) {
        try {
            int ctts = findBoundCTTs("INC1459778");
            System.out.println("ALARM_UMBRELLA:findBoundCTTs returned " + ctts);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        if (false)
        try {
            List<String> lineIDs = new ArrayList();
            lineIDs.add("24242");
            lineIDs.add("55525");
            lineIDs.add("f22234234");
            int res = Alarm_umbrella.isDying_gasp(lineIDs);
            System.out.println("\n" + res);
            //----------
            System.out.println("existsNMSError=" + existsAlarmInNMS("olt", "CE-OLT-17", "0-1-1"));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

}
