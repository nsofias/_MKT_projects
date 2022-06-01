/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

import ccm.CallInfo;
import ccm.CallInfo_factory;

/**
 *
 * @author nsofias
 */
public class CallInfo_factory_OTE implements CallInfo_factory{
    
    /**
     *
     * @param startTime
     * @param lineId
     * @param lineIdInFault
     * @param reason
     * @return
     */
    @Override
public CallInfo createCallInfo(String startTime, String lineId, String lineIdInFault, String reason) {
        //2021-09-10T15:05:33
        String startTimeFormated = startTime.replaceAll("-", "").replaceAll(":", "") + ".000";
        /*
        if (lineIdInFault != null && lineIdInFault.startsWith("6")) {
            reason = "MOBILE";
        }*/
        //if ((lineIdInFault == null || lineIdInFault.isEmpty() || lineIdInFault.startsWith("6")) && lineId != null && lineId.startsWith("2")) {
            lineIdInFault = lineId;
        //}

        if (lineIdInFault != null 
                && !lineIdInFault.isEmpty() 
                //&& lineIdInFault.startsWith("2")
                ) {
            return new CallInfo(lineIdInFault, startTimeFormated, "DEFAULT", reason);
        }
        return null;
    }    
}
