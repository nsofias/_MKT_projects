/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.MKT;

import ccm.CallInfo;
import ccm.CallInfo_factory;

/**
 *
 * @author nsofias
 */
public class CallInfo_factory_MKT implements CallInfo_factory {

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
        //2021-10-13 11:18:19.0
        try {
            String startTimeFormated = startTime.replaceAll("-", "").replaceAll(":", "").replaceAll(" ", "T");//.replaceAll("\\.0", ".000");
            startTimeFormated = startTimeFormated.split("\\.")[0] + ".000";
            System.out.println("CCM12:createCallInfo lineId=" + lineId + " lineIdInFault=" + lineIdInFault + " reason =" + reason);
            //--------------------
            if (reason.toLowerCase().contains("iptv")) {
                reason = "IPTV";
            } else if (reason.toLowerCase().startsWith("net")|| reason.toLowerCase().contains("internet")) {
                reason = "INTERNET";
            } else if (reason.toLowerCase().contains("voip")) {
                reason = "VOICE";
            } else if (reason.toLowerCase().contains("mobile")) {
                reason = "MOBILE";
            } else {
                return null;
                //reason = reason.split("-")[0].trim();
            }
            //---------------------
            if (lineIdInFault != null && !lineIdInFault.isEmpty() && !lineIdInFault.trim().equals("0")) {
                System.out.println("CCM12:createCallInfo AlarmsLoaderDaemon startTimeFormated:" + startTime + "->" + startTimeFormated);
                return new CallInfo(lineIdInFault, startTimeFormated, "DEFAULT", reason);
            }
        } catch (Exception e) {
            System.out.println("CCM12:createCallInfo error =" + e.toString());
            return null;
        }
        return null;
    }
}

/*
??????????????????
???????????????? BCC - SOHO/KCBC
Mobile ???????? ??? ???????????????? ???? Internet/Voice/SMS ??????????????????
Mobile ?????????????? ??? ?????????????? ????????????
Mobile ?????????????? ??? ???????? ????????????
???????????????? ??????????
?????????? ???? ????????????????
VoIP  - ?????????????? - ?????????????? ????????????
???????????????????? Video ???? Smart / M1
?????????????????? ??????????????????????- ?????????????? ???? ??????????????????
?????????????????? ?????????????????????? - ????????
Mobile ???????? ??? ???????????????? ????????????????????????????
Net  - ?????????????? - Wi-Fi - ????????????????
IPTV  - ???????? - ???????????? ???? ????????????
IPTV  - ?????????????? - ?????????????? ????????????
Net  - ?????????????? - Port reset / Management
??????/?????????? ???? VAS TV ????????????
Mobile ?????????????? ??? ?????????????? ????????????????
Net - ?????????????? - ???????????????? - Net Cube
Mobile ???????? ??? ???????????? ???? ????????????
 */
