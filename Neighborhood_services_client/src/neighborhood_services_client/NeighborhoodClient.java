/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neighborhood_services_client;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ws.NeighbourDataMetrics;
import ws.TechnicalExceptionMessage;

/**
 *
 * @author gsofi
 */
public class NeighborhoodClient {

    private static void getNeighbourDataByLine(String line) throws TechnicalExceptionMessage {        
        javax.xml.ws.Holder<ws.EIMessageContext2> eiMessageContext = new javax.xml.ws.Holder<ws.EIMessageContext2>();
        ws.EIMessageContext2 myContext = new ws.EIMessageContext2();
        myContext.setCorrelationId("xxxx");
        myContext.setSender("diligent");
        eiMessageContext.value = myContext;
        //
        ws.GetNeighbourDataByLineRequest data = new ws.GetNeighbourDataByLineRequest();
        data.setLineID(line);
        //
        javax.xml.ws.Holder<ws.GetNeighbourDataByLineResponse> data0 = new javax.xml.ws.Holder<ws.GetNeighbourDataByLineResponse>();
        ws.GetNeighbourDataByLineResponse myResponse = new ws.GetNeighbourDataByLineResponse(); 
        data0.value = myResponse;
        //        
        ws.NeighbourDataPortTypeService service = new ws.NeighbourDataPortTypeService();
        ws.NeighbourDataPortType port = service.getNeighbourDataPortType();
        port.getNeighbourDataByLine(eiMessageContext, data, data0);
        List<NeighbourDataMetrics> metrics = data0.value.getNeighbourDataMetrics();
        metrics.forEach(v->System.out.println(v.getName()+" "+v.getValue()));
        //System.out.println(data0.value.getNeighbourDataMetrics());
    }

    public static void main(String[] args) {
        try {
            getNeighbourDataByLine("L0287454");
        } catch (TechnicalExceptionMessage ex) {
            Logger.getLogger(NeighborhoodClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
