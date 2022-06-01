/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import nsofiasLib.utils.MailAlert;

/**
 *
 * @author nsofias
 */
public class Config
    {
    private String mainDirectory = System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/";
    private String adminPassword = "4711";
    //--------comunication------------
    private String http_proxyHost = "";
    private String http_proxyPort = "";
    //----------- threshold & VIPs NOTIFICATIONS ------------------
    private boolean ERRORS_sendMailAlert = true;
    private String ERRORS_mail_recipients = "nsofias@ote.gr";
    private String ERRORS_mail_cc_recipients = "nsofias@ote.gr";
    private String ERRORS_mailServer = "10.255.0.1";
    private String ERRORS_mailSender = "DslMon@ote.gr";
    private String ERRORS_mailUser = "DslMon@ote.gr";
    private String ERRORS_mailPass = "DslMon@ote.gr";
    //--------- Siebel Notifications -------------
    private boolean TICKETS_sendMailAlert = true;
    private String TICKETS_mail_recipients = "nsofias@ote.gr";
    private String TICKETS_mail_cc_recipients = "nsofias@ote.gr";
    private String TICKETS_mailServer = "10.255.0.1";
    private String TICKETS_mailSender = "DslMon@ote.gr";
    private String TICKETS_mailUser = "10.255.0.1";
    private String TICKETS_mailPass = "DslMon@ote.gr";    
    private int DEBUG = 0;

    public void load() throws Exception
        {
        Properties properties = new Properties();
        //System.out.println("DSLMON:"+System.getenv("APPLICATIONS_PATH"));
        String APPLICATIONS_PATH = System.getenv("APPLICATIONS_PATH");//C:/my files/data/access7
        try (FileInputStream myStream = new FileInputStream(APPLICATIONS_PATH + "/DSLMON_SKOPIA/conf/parameters.properties"))
            {
            properties.load(new InputStreamReader(myStream, "UTF8"));
            adminPassword = properties.getProperty("adminPassword").trim();
            //--------comunication------------
            http_proxyHost = properties.getProperty("http.proxyHost").trim();
            http_proxyPort = properties.getProperty("http.proxyPort").trim();
            //----------- threshold & VIPs NOTIFICATIONS ------------------
            ERRORS_sendMailAlert = Boolean.parseBoolean(properties.getProperty("ERRORS.sendMailAlert"));
            ERRORS_mail_recipients = properties.getProperty("ERRORS.mail_recipients").trim();
            ERRORS_mail_cc_recipients = properties.getProperty("ERRORS.mail_cc_recipients").trim();
            ERRORS_mailServer = properties.getProperty("ERRORS.mailServer").trim();
            ERRORS_mailSender = properties.getProperty("ERRORS.mailSender").trim();
            ERRORS_mailUser = properties.getProperty("ERRORS.mailUser").trim();
            ERRORS_mailPass = properties.getProperty("ERRORS.mailPass").trim();
            
            //
            TICKETS_sendMailAlert = Boolean.parseBoolean(properties.getProperty("TICKETS.sendMailAlert"));
            TICKETS_mail_recipients = properties.getProperty("TICKETS.mail_recipients").trim();
            TICKETS_mail_cc_recipients = properties.getProperty("TICKETS.mail_cc_recipients").trim();
            TICKETS_mailServer = properties.getProperty("TICKETS.mailServer").trim();
            TICKETS_mailSender = properties.getProperty("TICKETS.mailSender").trim();
            TICKETS_mailUser = properties.getProperty("TICKETS.mailUser").trim();
            TICKETS_mailPass = properties.getProperty("TICKETS.mailPass").trim();
            }

        catch (Exception e)
            {
            e.printStackTrace(System.out);
            new MailAlert().sendmailAlert("DSLMON error:", e);
            }
        System.out.println("DSLMON: Properties loaded ok!!!!");

        }

    /**
     * @return the mainDirectory
     */
    public String
            getMainDirectory()
        {
        return mainDirectory;

        }

    /**
     * @param mainDirectory the mainDirectory to set
     */
    public void setMainDirectory(String mainDirectory
    )
        {
        this.mainDirectory
                = mainDirectory;

        }

    /**
     * @return the adminPassword
     */
    public String
            getAdminPassword()
        {
        return adminPassword;

        }

    /**
     * @param adminPassword the adminPassword to set
     */
    public void setAdminPassword(String adminPassword
    )
        {
        this.adminPassword
                = adminPassword;

        }

    /**
     * @return the http_proxyHost
     */
    public String
            getHttp_proxyHost()
        {
        return http_proxyHost;

        }

    /**
     * @param http_proxyHost the http_proxyHost to set
     */
    public void setHttp_proxyHost(String http_proxyHost
    )
        {
        this.http_proxyHost
                = http_proxyHost;

        }

    /**
     * @return the http_proxyPort
     */
    public String
            getHttp_proxyPort()
        {
        return http_proxyPort;

        }

    /**
     * @param http_proxyPort the http_proxyPort to set
     */
    public void setHttp_proxyPort(String http_proxyPort
    )
        {
        this.http_proxyPort
                = http_proxyPort;

        }

    /**
     * @return the TICKETS_mailUser
     */
    public String getTICKETS_mailUser()
        {
        return TICKETS_mailUser;
        }

    /**
     * @param TICKETS_mailUser the TICKETS_mailUser to set
     */
    public void setTICKETS_mailUser(String TICKETS_mailUser)
        {
        this.TICKETS_mailUser = TICKETS_mailUser;
        }

    /**
     * @return the TICKETS_mailPass
     */
    public String getTICKETS_mailPass()
        {
        return TICKETS_mailPass;
        }

    /**
     * @param TICKETS_mailPass the TICKETS_mailPass to set
     */
    public void setTICKETS_mailPass(String TICKETS_mailPass)
        {
        this.TICKETS_mailPass = TICKETS_mailPass;
        }

    /**
     * @return the ERRORS_mailUser
     */
    public String getERRORS_mailUser()
        {
        return ERRORS_mailUser;
        }

    /**
     * @param ERRORS_mailUser the ERRORS_mailUser to set
     */
    public void setERRORS_mailUser(String ERRORS_mailUser)
        {
        this.ERRORS_mailUser = ERRORS_mailUser;
        }

    /**
     * @return the ERRORS_mailPass
     */
    public String getERRORS_mailPass()
        {
        return ERRORS_mailPass;
        }

    /**
     * @param ERRORS_mailPass the ERRORS_mailPass to set
     */
    public void setERRORS_mailPass(String ERRORS_mailPass)
        {
        this.ERRORS_mailPass = ERRORS_mailPass;
        }

    /**
     * @return the ERRORS_sendMailAlert
     */
    public boolean isERRORS_sendMailAlert()
        {
        return ERRORS_sendMailAlert;
        }

    /**
     * @param ERRORS_sendMailAlert the ERRORS_sendMailAlert to set
     */
    public void setERRORS_sendMailAlert(boolean ERRORS_sendMailAlert)
        {
        this.ERRORS_sendMailAlert = ERRORS_sendMailAlert;
        }

    /**
     * @return the ERRORS_mail_recipients
     */
    public String getERRORS_mail_recipients()
        {
        return ERRORS_mail_recipients;
        }

    /**
     * @param ERRORS_mail_recipients the ERRORS_mail_recipients to set
     */
    public void setERRORS_mail_recipients(String ERRORS_mail_recipients)
        {
        this.ERRORS_mail_recipients = ERRORS_mail_recipients;
        }

    /**
     * @return the ERRORS_mail_cc_recipients
     */
    public String getERRORS_mail_cc_recipients()
        {
        return ERRORS_mail_cc_recipients;
        }

    /**
     * @param ERRORS_mail_cc_recipients the ERRORS_mail_cc_recipients to set
     */
    public void setERRORS_mail_cc_recipients(String ERRORS_mail_cc_recipients)
        {
        this.ERRORS_mail_cc_recipients = ERRORS_mail_cc_recipients;
        }

    /**
     * @return the ERRORS_mailServer
     */
    public String getERRORS_mailServer()
        {
        return ERRORS_mailServer;
        }

    /**
     * @param ERRORS_mailServer the ERRORS_mailServer to set
     */
    public void setERRORS_mailServer(String ERRORS_mailServer)
        {
        this.ERRORS_mailServer = ERRORS_mailServer;
        }

    /**
     * @return the ERRORS_mailSender
     */
    public String getERRORS_mailSender()
        {
        return ERRORS_mailSender;
        }

    /**
     * @param ERRORS_mailSender the ERRORS_mailSender to set
     */
    public void setERRORS_mailSender(String ERRORS_mailSender)
        {
        this.ERRORS_mailSender = ERRORS_mailSender;
        }

    /**
     * @return the TICKETS_sendMailAlert
     */
    public boolean isTICKETS_sendMailAlert()
        {
        return TICKETS_sendMailAlert;
        }

    /**
     * @param TICKETS_sendMailAlert the TICKETS_sendMailAlert to set
     */
    public void setTICKETS_sendMailAlert(boolean TICKETS_sendMailAlert)
        {
        this.TICKETS_sendMailAlert = TICKETS_sendMailAlert;
        }

    /**
     * @return the TICKETS_mail_recipients
     */
    public String getTICKETS_mail_recipients()
        {
        return TICKETS_mail_recipients;
        }

    /**
     * @param TICKETS_mail_recipients the TICKETS_mail_recipients to set
     */
    public void setTICKETS_mail_recipients(String TICKETS_mail_recipients)
        {
        this.TICKETS_mail_recipients = TICKETS_mail_recipients;
        }

    /**
     * @return the TICKETS_mail_cc_recipients
     */
    public String getTICKETS_mail_cc_recipients()
        {
        return TICKETS_mail_cc_recipients;
        }

    /**
     * @param TICKETS_mail_cc_recipients the TICKETS_mail_cc_recipients to set
     */
    public void setTICKETS_mail_cc_recipients(String TICKETS_mail_cc_recipients)
        {
        this.TICKETS_mail_cc_recipients = TICKETS_mail_cc_recipients;
        }

    /**
     * @return the TICKETS_mailServer
     */
    public String getTICKETS_mailServer()
        {
        return TICKETS_mailServer;
        }

    /**
     * @param TICKETS_mailServer the TICKETS_mailServer to set
     */
    public void setTICKETS_mailServer(String TICKETS_mailServer)
        {
        this.TICKETS_mailServer = TICKETS_mailServer;
        }

    /**
     * @return the TICKETS_mailSender
     */
    public String getTICKETS_mailSender()
        {
        return TICKETS_mailSender;
        }

    /**
     * @param TICKETS_mailSender the TICKETS_mailSender to set
     */
    public void setTICKETS_mailSender(String TICKETS_mailSender)
        {
        this.TICKETS_mailSender = TICKETS_mailSender;
        }

    /**
     * @return the DEBUG
     */
    public int getDEBUG()
        {
        return DEBUG;
        }

    /**
     * @param DEBUG the DEBUG to set
     */
    public void setDEBUG(int DEBUG)
        {
        this.DEBUG = DEBUG;
        }

    
    public static void main(String args[])
        {
        try
            {
            Config myConfig = new Config();
            myConfig.load();
            }
        catch (Exception e)
            {
            new MailAlert().sendmailAlert("Correlator error:", e);
            e.printStackTrace();
            }
        }    
    }
