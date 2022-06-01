/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cross_ws.alatMeasures;

import com.google.gson.Gson;
import cross_ws.alat.AlatPerformSeltMeasureRequest1;
import cross_ws.alat.AlatPerformSyncMeasureRequest1;
import cross_ws.alat.TechnicalExceptionMessage;
import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author gsofi
 */
public class AlatMeasures {

    public static void getMeasureHistory() throws TechnicalExceptionMessage {
        setSystemProperties();
        cross_ws.alat.EIMessageContext2 my_eiMessageContext = new cross_ws.alat.EIMessageContext2();
        javax.xml.ws.Holder<cross_ws.alat.EIMessageContext2> eiMessageContext = new javax.xml.ws.Holder<cross_ws.alat.EIMessageContext2>();
        eiMessageContext.value = my_eiMessageContext;
        my_eiMessageContext.setSender("mk.telekom.system.architecture.Diligent:ALAT");
        my_eiMessageContext.setTarget("alat");
        my_eiMessageContext.setCorrelationId(new TimeStamp1().getNowUnformated());
        //
        cross_ws.alat.AlatGetMeasureHistoryRequest data = new cross_ws.alat.AlatGetMeasureHistoryRequest();
        cross_ws.alat.AlatGetMeasureHistoryResponse response = new cross_ws.alat.AlatGetMeasureHistoryResponse();
        javax.xml.ws.Holder<cross_ws.alat.AlatGetMeasureHistoryResponse> data0 = new javax.xml.ws.Holder<cross_ws.alat.AlatGetMeasureHistoryResponse>();
        data0.value = response;
        getMeasureHistory_(eiMessageContext, data, data0);
    }

    public static String performSeltMeasure() throws TechnicalExceptionMessage {
        setSystemProperties();
        cross_ws.alat.EIMessageContext2 my_eiMessageContext = new cross_ws.alat.EIMessageContext2();
        javax.xml.ws.Holder<cross_ws.alat.EIMessageContext2> eiMessageContext = new javax.xml.ws.Holder<>();
        eiMessageContext.value = my_eiMessageContext;
        my_eiMessageContext.setSender("mk.telekom.system.architecture.Diligent:ALAT");
        my_eiMessageContext.setTarget("alat");
        my_eiMessageContext.setCorrelationId(new TimeStamp1().getNowUnformated());
        //
        cross_ws.alat.AlatPerformSeltMeasureRequest data = new cross_ws.alat.AlatPerformSeltMeasureRequest();
        AlatPerformSeltMeasureRequest1 request = new cross_ws.alat.AlatPerformSeltMeasureRequest1();
        request.setPhoneNumber("F2005565");
        data.setPerformSeltMeasure(request);
        //
        cross_ws.alat.AlatPerformSeltMeasureResponse response = new cross_ws.alat.AlatPerformSeltMeasureResponse();
        javax.xml.ws.Holder<cross_ws.alat.AlatPerformSeltMeasureResponse> data0 = new javax.xml.ws.Holder<>();
        data0.value = response;
        performSeltMeasure_(eiMessageContext, data, data0);
        return new Gson().toJson(data0.value.getPerformSeltMeasureResponse());
    }

    public static String performSyncMeasure(String myPhoneNumber) throws TechnicalExceptionMessage {
        setSystemProperties();
        cross_ws.alat.EIMessageContext2 my_eiMessageContext = new cross_ws.alat.EIMessageContext2();
        javax.xml.ws.Holder<cross_ws.alat.EIMessageContext2> eiMessageContext = new javax.xml.ws.Holder<>();
        eiMessageContext.value = my_eiMessageContext;
        my_eiMessageContext.setSender("mk.telekom.system.architecture.Diligent:ALAT");
        my_eiMessageContext.setTarget("alat");
        my_eiMessageContext.setCorrelationId(new TimeStamp1().getNowUnformated());
        //
        cross_ws.alat.AlatPerformSyncMeasureRequest data = new cross_ws.alat.AlatPerformSyncMeasureRequest();
        AlatPerformSyncMeasureRequest1 request = new cross_ws.alat.AlatPerformSyncMeasureRequest1();
        request.setPhoneNumber(myPhoneNumber);
        request.setUserName("Diligent");
        data.setPerformSyncMeasure(request);
        //
        cross_ws.alat.AlatPerformSyncMeasureResponse response = new cross_ws.alat.AlatPerformSyncMeasureResponse();
        javax.xml.ws.Holder<cross_ws.alat.AlatPerformSyncMeasureResponse> data0 = new javax.xml.ws.Holder<>();
        data0.value = response;
        performSyncMeasure_(eiMessageContext, data, data0);
        return new Gson().toJson(data0.value.getPerformSyncMeasureResponse());
    }

    private static void getMeasureHistory_(javax.xml.ws.Holder<cross_ws.alat.EIMessageContext2> eiMessageContext, cross_ws.alat.AlatGetMeasureHistoryRequest data, javax.xml.ws.Holder<cross_ws.alat.AlatGetMeasureHistoryResponse> data0) throws TechnicalExceptionMessage {
        cross_ws.alat.AlatService service = new cross_ws.alat.AlatService();
        cross_ws.alat.Alat port = service.getAlat();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        port.getMeasureHistory(eiMessageContext, data, data0);
    }

    private static void performSeltMeasure_(javax.xml.ws.Holder<cross_ws.alat.EIMessageContext2> eiMessageContext, cross_ws.alat.AlatPerformSeltMeasureRequest data, javax.xml.ws.Holder<cross_ws.alat.AlatPerformSeltMeasureResponse> data0) throws TechnicalExceptionMessage {
        cross_ws.alat.AlatService service = new cross_ws.alat.AlatService();
        cross_ws.alat.Alat port = service.getAlat();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        port.performSeltMeasure(eiMessageContext, data, data0);
    }

    private static void performSyncMeasure_(javax.xml.ws.Holder<cross_ws.alat.EIMessageContext2> eiMessageContext, cross_ws.alat.AlatPerformSyncMeasureRequest data, javax.xml.ws.Holder<cross_ws.alat.AlatPerformSyncMeasureResponse> data0) throws TechnicalExceptionMessage {
        cross_ws.alat.AlatService service = new cross_ws.alat.AlatService();
        cross_ws.alat.Alat port = service.getAlat();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        port.performSyncMeasure(eiMessageContext, data, data0);
    }

    private static void resetPort_(javax.xml.ws.Holder<cross_ws.alat.EIMessageContext2> eiMessageContext, cross_ws.alat.AlatResetPortRequest data, javax.xml.ws.Holder<cross_ws.alat.AlatResetPortResponse> data0) throws TechnicalExceptionMessage {
        cross_ws.alat.AlatService service = new cross_ws.alat.AlatService();
        cross_ws.alat.Alat port = service.getAlat();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        port.resetPort(eiMessageContext, data, data0);
    }

    private static void setSystemProperties() {
        String certificates_dir = System.getenv("APPLICATIONS_PATH") + "/certificates/";
        System.setProperty("javax.net.ssl.trustStore", certificates_dir + "diligent-prod-keystore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.keyStore", certificates_dir + "diligent-prod-keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
    }

    public static void main(String[] args) {

        try {
            String res = performSyncMeasure("F2005565");
            System.out.println(res);
            /*--------- performSyncMeasure ------------
            {
                    "oltber": "0.00E0",
                    "oltberplrendts": "Mar 21, 2022 5:17:00 PM",
                    "oltberplrstartts": "Mar 20, 2022 5:17:05 PM",
                    "oltifadm": "up",
                    "oltifoper": "up",
                    "oltlaserbiascurrent": "11 mA",
                    "oltlasertemp": "36 C",
                    "oltlaservoltage": "3.27 V",
                    "oltplr": "0.00E0",
                    "oltrxonupower": "-21.3 dBm",
                    "olttxpower": "3.4 dBm",
                    "onuberplrstartts": "Mar 20, 2022 5:17:05 PM",
                    "onudnber": "0.00E0",
                    "onudnplr": "N/A",
                    "onuifadm": "up",
                    "onuifoper": "up",
                    "onulaserbiascurrent": "9 mA",
                    "onulasertemp": "36 C",
                    "onulaservoltage": "3.3 V",
                    "onurxpower": "-20.8 dBm",
                    "onutxpower": "2.5 dBm",
                    "onuupber": "0.00E0",
                    "onuupbip": "6339",
                    "onuupplr": "7.79E-2"
            }            
             */
        } catch (TechnicalExceptionMessage ex) {
            System.out.println("createIncident error:" + ex.getFaultInfo().getDescription().get(0).getValue());
        }
    }
}
