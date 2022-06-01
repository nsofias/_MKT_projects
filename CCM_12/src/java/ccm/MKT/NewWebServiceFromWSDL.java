/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.MKT;

import ccm.AlarmsDetectionListener;
import ccm.CCMonitorStatsObjsContainer;
import diligent_MKT.Alarm_FYROM;
import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author gsofi
 */
@WebService(serviceName = "CRMDiligentResponsePortTypeService", portName = "CRMDiligentResponsePortType", endpointInterface = "mk.telekom.it.crm.diligent.services.querydiligentincidentresponse.CRMDiligentResponsePortType", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncidentResponse", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/CRMDiligentResponsePortType.wsdl")
@HandlerChain(file = "NewWebServiceFromWSDL_handler.xml")
public class NewWebServiceFromWSDL {

    @Resource
    private WebServiceContext myContext;

    public void markAffectedResponse(javax.xml.ws.Holder<net.tmobile.ei.messaging.datatypes.EIMessageContext2> eiMessageContext, mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.MarkAffectedAsyncResponse data, javax.xml.ws.Holder<mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.MarkAffectedAsyncResponseOutput> data0) throws mk.telekom.it.crm.diligent.services.querydiligentincidentresponse.TechnicalExceptionMessage {
        ServletContext servletContext = (ServletContext) myContext.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
        String myCorrelationId = eiMessageContext.value.getCorrelationId();//this.getTicketId()+myAlarm.getAffServiceID()
        String myStatus = data.getStatus();
        String mySR = myCorrelationId.split("-")[0];
        System.out.println("DiligentMKT/MarkAffectedResponseOutput" + myCorrelationId);
        CCMonitorStatsObjsContainer myContainer = (CCMonitorStatsObjsContainer) servletContext.getAttribute("myContainer");
        AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) servletContext.getAttribute("myAlarmsDetectionListener");
        myContainer.getAlarmArrayList().entrySet().stream().map(entry -> entry.getValue())
                .filter(v -> v.getTicketId() != null)
                .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                .filter(v -> v != null)
                .map(v -> v.getMyTicket_IBM())
                .filter(v -> v != null && v.getSR() != null && !v.getSR().isEmpty())
                .forEach(myTicket -> {
                    try {
                        for (Alarm_FYROM myAlarm : myTicket.getElementsList()) {
                            if ((myTicket.getSR() + "-" + myAlarm.getAffServiceID()).equals(myCorrelationId)) {
                                myAlarm.setMarkCustomersStatus(myStatus);
                                System.out.println("DiligentMKT/MarkAffectedResponseOutput myAlarm " + myCorrelationId + " changet status to" + myStatus);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("DiligentMKT/MarkAffectedResponseOutput error(" + myCorrelationId + "):" + e.toString());
                        e.printStackTrace(System.out);
                    }
                });
    }

    public void releaseAffectedResponse(javax.xml.ws.Holder<net.tmobile.ei.messaging.datatypes.EIMessageContext2> eiMessageContext, mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.ReleaseAffectedAsyncResponse data, javax.xml.ws.Holder<mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.ReleaseAffectedAsyncResponseOutput> data0) throws mk.telekom.it.crm.diligent.services.querydiligentincidentresponse.TechnicalExceptionMessage {
        ServletContext servletContext = (ServletContext) myContext.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
        String myCorrelationId = eiMessageContext.value.getCorrelationId();//this.getTicketId()+myAlarm.getAffServiceID()
        String myStatus = data.getStatus();
        String mySR = myCorrelationId.split("-")[0];
        System.out.println("DiligentMKT/MarkAffectedResponseOutput" + myCorrelationId);
        CCMonitorStatsObjsContainer myContainer = (CCMonitorStatsObjsContainer) servletContext.getAttribute("myContainer");
        AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) servletContext.getAttribute("myAlarmsDetectionListener");
        myContainer.getAlarmArrayList().entrySet().stream().map(entry -> entry.getValue())
                .filter(v -> v.getTicketId() != null)
                .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                .filter(v -> v != null)
                .map(v -> v.getMyTicket_IBM())
                .filter(v -> v != null && v.getSR() != null && !v.getSR().isEmpty())
                .forEach(myTicket -> {
                    try {
                        for (Alarm_FYROM myAlarm : myTicket.getElementsList()) {
                            if ((myTicket.getSR() + "-" + myAlarm.getAffServiceID()).equals(myCorrelationId)) {
                                myAlarm.setReleaseCustomersStatus(myStatus);
                                System.out.println("DiligentMKT/MarkAffectedResponseOutput myAlarm " + myCorrelationId + " changet status to" + myStatus);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("DiligentMKT/MarkAffectedResponseOutput error(" + myCorrelationId + "):" + e.toString());
                        e.printStackTrace(System.out);
                    }
                });
    }

}
