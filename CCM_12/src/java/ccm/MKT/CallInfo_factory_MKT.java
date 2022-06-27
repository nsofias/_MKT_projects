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
Приговори
Трансфер BCC - SOHO/KCBC
Mobile Инфо – Проверка на Internet/Voice/SMS сообраќај
Mobile Проблем – Внесена пречка
Mobile Проблем – Слаб проток
Прекинат повик
Повик од продажба
VoIP  - Проблем - Внесена пречка
Активација Video во Smart / M1
Дигитални сертификати- подршка за користење
Дигитални сертификати - инфо
Mobile Инфо – Смартфон карактеристики
Net  - Проблем - Wi-Fi - сетирање
IPTV  - Инфо - Статус на барање
IPTV  - Проблем - Внесена пречка
Net  - Проблем - Port reset / Management
Акт/Деакт на VAS TV канали
Mobile Проблем – Мобилен Интернет
Net - Проблем - Сетирање - Net Cube
Mobile Инфо – Статус на пречка
 */
