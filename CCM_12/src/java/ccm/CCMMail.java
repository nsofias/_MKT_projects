/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import nsofiasLib.others.Parameters;
import nsofiasLib.utils.MailSender_new;

/**
 *
 * @author gsofi
 */
public class CCMMail {

    String smtpSender;
    String smtpUser;
    String smtpPass;
    String smtpServer;
    String recipients;
    String mailRecipientsCC;
    String subject;
    String body;
    //

    public CCMMail(String subject, String body) {
        Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
        smtpSender = myParameters.getStringValue("mailSender", "ccmAgent@otenet.gr");
        smtpUser = myParameters.getStringValue("mailUser", null);
        smtpPass = myParameters.getStringValue("mailPass", null);
        smtpServer = myParameters.getStringValue("mailServer", "mail.otenet.gr");
        recipients = myParameters.getStringValue("mailRecipients", "nsofias@ote.gr");
        mailRecipientsCC = myParameters.getStringValue("mailRecipientsCC", "nsofias@ote.gr");
        this.subject = subject;
        this.body = body;
    }

    public void send() {
        System.out.println("CCM12:CCMMail:send (by "+smtpSender+") with subject "+subject+" to "+recipients);
        MailSender_new myMailSender = new MailSender_new();
        myMailSender.setServer(smtpServer);
        myMailSender.setUser(smtpUser);
        myMailSender.setPass(smtpPass);
        myMailSender.setRecipient(recipients);
        myMailSender.setSender(smtpSender);
        myMailSender.setCc(mailRecipientsCC);
        myMailSender.setSubject(subject);
        myMailSender.setBodyMessage(body);
        //
        myMailSender.setDebug(true);
        try {
            myMailSender.sendMail();
        } catch (Exception e) {
            System.out.println("CCM12:CCMMail:send error with subject "+subject);
            e.printStackTrace();
        }
    }
}
