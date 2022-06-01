/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA;

import static diligent_mkt_ws.Diligent_connector.syncCUSTOMERLINEID;
import java.util.ArrayList;
import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author nsofias
 */
public class LinesValidator implements Runnable {

    String ticketId;
    String serviceID;
    String endDate;
    ArrayList<String> lineIDs;

    public LinesValidator(String ticketId, String serviceID, String endDate, ArrayList<String> lineIDs) {
        this.ticketId = ticketId;
        this.endDate = endDate;
        this.lineIDs = lineIDs;
        this.serviceID = serviceID;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1800000);//15m delay
            if (ticketId != null && endDate != null && lineIDs != null && !lineIDs.isEmpty()) {
                String res = syncCUSTOMERLINEID(ticketId, endDate, lineIDs);
                System.out.println("DiligentMKT/releaseAffected (syncCUSTOMERLINEID) for :" + ticketId + "-" + serviceID + " at " + new TimeStamp1().getNowFormated()+" result="+res);
            }
        } catch (Exception e) {
            System.out.println("DiligentMKT/releaseAffected syncCUSTOMERLINEID thread error for " + ticketId + "-" + serviceID + " at " + new TimeStamp1().getNowFormated() + ": " + e.toString());
            e.printStackTrace(System.out);
        }
        //System.out.println("Correlator: acknowledged:" + operation_context);
    }
}
