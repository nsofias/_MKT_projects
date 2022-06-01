/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_mkt_ws.handlers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author nsofias
 */
public class CustomerIssueMessageHandler implements SOAPHandler<SOAPMessageContext>
    {
    int MODE = 1;
    FileOutputStream outlogIN = null;
    FileOutputStream outlogOUT = null;

    @Override
    public boolean handleMessage(SOAPMessageContext messageContext)
        {
        SOAPMessage msg = messageContext.getMessage();
        // Indicator telling us which direction this message is going in
        final Boolean outInd = (Boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        // Handler must only add security headers to outbound messages
        if (outInd)
            {
            try
                {
                outlogOUT = new FileOutputStream(new File(System.getenv("APPLICATIONS_PATH") + "/xml/" + new TimeStamp1().getNowUnformated() + "affectedServices_OUT.xml"), true);
                if (MODE == 1)
                    {
                    msg.writeTo(outlogOUT);
                    outlogOUT.close();
                    msg.writeTo(System.out);
                    }
                }
            catch (final IOException | SOAPException e)
                {
                return false;
                }
            }
        //-------------------------
        else
            {
            try
                {
                outlogIN = new FileOutputStream(new File(System.getenv("APPLICATIONS_PATH") + "/xml/" + new TimeStamp1().getNowUnformated() + "affectedServices_IN.xml"), true);
                if (MODE == 1)
                    {
                    msg.writeTo(outlogIN);
                    outlogIN.close();
                    msg.writeTo(System.out);
                    }
                }
            catch (final IOException | SOAPException e)
                {
                return false;
                }
            }
        return true;
        }

    @Override
    public Set<QName> getHeaders()
        {
        return Collections.EMPTY_SET;
        }

    @Override
    public boolean handleFault(SOAPMessageContext messageContext)
        {
        return true;
        }

    @Override
    public void close(MessageContext context)
        {
        }

    }
