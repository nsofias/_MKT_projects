/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRMWS;

import mk.telekom.it.crm.diligent.services.querydiligentincidentresponse.TechnicalExceptionMessage;
import SKOPIA.Diligent_Daemon;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.Ticket_FYROM;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author gsofi
 */
@WebService(serviceName = "CRMDiligentResponsePortTypeService", portName = "CRMDiligentResponsePortType", endpointInterface = "mk.telekom.it.crm.diligent.services.querydiligentincidentresponse.CRMDiligentResponsePortType", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncidentResponse", wsdlLocation = "WEB-INF/wsdl/CRMResponseWebService/CRMDiligentResponsePortType.wsdl")
public class CRMResponseWebService {

    @Resource
    private WebServiceContext context;
    
    public void markAffectedResponse(javax.xml.ws.Holder<net.tmobile.ei.messaging.datatypes.EIMessageContext2> eiMessageContext, mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.MarkAffectedAsyncResponse data, javax.xml.ws.Holder<mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.MarkAffectedAsyncResponseOutput> data0) throws TechnicalExceptionMessage {
        ServletContext servletContext = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
        String myCorrelationId = eiMessageContext.value.getCorrelationId();//this.getTicketId()+myAlarm.getAffServiceID()
        String myStatus = data.getStatus();
        String mySR = myCorrelationId.split("-")[0];
        System.out.println("DiligentMKT/MarkAffectedResponseOutput" + myCorrelationId);
        ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) servletContext.getAttribute("myDiligent_Daemons");
        //
        if (myGroupBy_Daemons != null)
            {
            myGroupBy_Daemons.forEach((myGroupBy_Daemon) ->
                {
                try
                    {
                    Ticket_FYROM myTicket = myGroupBy_Daemon.getMyStatsObjContainer().findTicketBySR(mySR);
                    if (myTicket != null)
                        {
                        for (Alarm_FYROM myAlarm : myTicket.getElementsList())
                            {
                            if ((myTicket.getSR() + "-" + myAlarm.getAffServiceID()).equals(myCorrelationId))
                                {
                                myAlarm.setMarkCustomersStatus(myStatus);
                                System.out.println("DiligentMKT/MarkAffectedResponseOutput myAlarm " + myCorrelationId + " changet status to" + myStatus);
                                }
                            }
                        }
                    }
                catch (Exception e)
                    {
                    System.out.println("DiligentMKT/MarkAffectedResponseOutput error("+myCorrelationId+"):" + e.toString());
                    e.printStackTrace(System.out);
                    }
                });
            }
        else
            {
            System.out.println("DiligentMKT/MarkAffectedResponseOutput error: myGroupBy_Daemons is null");
            }
        }

    public void releaseAffectedResponse(javax.xml.ws.Holder<net.tmobile.ei.messaging.datatypes.EIMessageContext2> eiMessageContext, mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.ReleaseAffectedAsyncResponse data, javax.xml.ws.Holder<mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.ReleaseAffectedAsyncResponseOutput> data0) throws TechnicalExceptionMessage {
        ServletContext servletContext = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
        
        String myCorrelationId = eiMessageContext.value.getCorrelationId();//this.getTicketId()+myAlarm.getAffServiceID()
        String myStatus = data.getStatus();
        String mySR = myCorrelationId.split("-")[0];
        System.out.println("DiligentMKT/ReleaseAffectedResponseOutput for " + myCorrelationId);
        ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) servletContext.getAttribute("myDiligent_Daemons");
        //
        if (myGroupBy_Daemons != null)
            {
            myGroupBy_Daemons.forEach((myGroupBy_Daemon) ->
                {
                try
                    {
                    Ticket_FYROM myTicket = myGroupBy_Daemon.getMyStatsObjContainer().findTicketBySR(mySR);
                    if (myTicket != null)
                        {
                        for (Alarm_FYROM myAlarm : myTicket.getElementsList())
                            {
                            if ((myTicket.getSR() + "-" + myAlarm.getAffServiceID()).equals(myCorrelationId))
                                {
                                myAlarm.setReleaseCustomersStatus(myStatus);
                                System.out.println("DiligentMKT/ReleaseAffectedResponseOutput " + myCorrelationId + " changet status to" + myStatus);
                                }
                            }
                        }
                    }
                catch (Exception e)
                    {
                    System.out.println("DiligentMKT/ReleaseAffectedResponseOutput error("+myCorrelationId+"):" + e.toString());
                    }
                });
            }
        else
            {
            System.out.println("DiligentMKT/ReleaseAffectedResponseOutput error: myGroupBy_Daemons is null");
            }        
        }

    
    
}
