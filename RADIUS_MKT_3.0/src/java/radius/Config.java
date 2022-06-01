/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

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
    private String mainDirectory = System.getenv("APPLICATIONS_PATH") + "/RADIUS_SKOPIA/";    
    private String adminPassword = "4711";
    //--------comunication------------
    private String http_proxyHost = "";//prox.a.tmn.ote.gr";
    private String http_proxyPort = "";//8080";
    private String DSLFileLineParser_dir = mainDirectory + "data/";
    private String DSLFileLineParser_ext = "gz";
    private boolean DSLFileParserRemoveFiles = true;
    //----------- threshold & VIPs NOTIFICATIONS ------------------
    private boolean sendMailAlert = true;
    private String sendMailAlertThreshold = "CRITICAL";
    private String mail_recipients = "nsofias@ote.gr";
    private String mail_cc_recipients = "nsofias@ote.gr";
    private String mailServer = "10.255.0.1";
    private String mailSender = "DslMon@ote.gr";
    //-----------
    private int DEBUG = 0;

    public void load() throws Exception
        {
        Properties properties = new Properties();
        //log.debug("DSLMON:"+System.getenv("APPLICATIONS_PATH"));
        //String APPLICATIONS_PATH = System.getenv("APPLICATIONS_PATH");//C:/my files/data/access7
        System.out.println("APPLICATIONS_PATH:"+System.getenv("APPLICATIONS_PATH"));
        System.out.println("mainDirectory:"+mainDirectory);
        try (FileInputStream myStream = new FileInputStream(mainDirectory + "conf/parameters.properties"))
            {
            properties.load(new InputStreamReader(myStream, "UTF8"));
            adminPassword = properties.getProperty("adminPassword").trim();
            //--------comunication------------
            http_proxyHost = properties.getProperty("http.proxyHost").trim();
            http_proxyPort = properties.getProperty("http.proxyPort").trim();
            setDSLFileLineParser_dir(properties.getProperty("DSLFileLineParser.dir").trim());
            setDSLFileLineParser_ext(properties.getProperty("DSLFileLineParser.ext").trim());
            setDSLFileParserRemoveFiles(Boolean.parseBoolean(properties.getProperty("DSLFileParserRemoveFiles").trim()));
            //----------- threshold NOTIFICATIONS------------------
            setSendMailAlert(Boolean.parseBoolean(properties.getProperty("sendMailAlert").trim()));
            setSendMailAlertThreshold(properties.getProperty("sendMailAlertThreshold").trim());
            setMail_recipients(properties.getProperty("mail_recipients").trim());
            setMail_cc_recipients(properties.getProperty("mail_cc_recipients").trim());
            setMailServer(properties.getProperty("mailServer").trim());
            setMailSender(properties.getProperty("mailSender").trim());
            setDEBUG(Integer.parseInt(properties.getProperty("DEBUG")));
            System.out.println("Properties loaded ok!!!!");
            }
        catch (Exception e)
            {
            System.out.println("paraeters file:"+mainDirectory + "conf/parameters.properties" +e.toString());
            new MailAlert().sendmailAlert("Conig error:", e);
            }
        }

    /**
     * @return the mainDirectory
     */
    public String getMainDirectory()
        {
        return mainDirectory;
        }

    /**
     * @param mainDirectory the mainDirectory to set
     */
    public void setMainDirectory(String mainDirectory)
        {
        this.mainDirectory = mainDirectory;
        }

    /**
     * @return the adminPassword
     */
    public String getAdminPassword()
        {
        return adminPassword;
        }

    /**
     * @param adminPassword the adminPassword to set
     */
    public void setAdminPassword(String adminPassword)
        {
        this.adminPassword = adminPassword;
        }

    /**
     * @return the http_proxyHost
     */
    public String getHttp_proxyHost()
        {
        return http_proxyHost;
        }

    /**
     * @param http_proxyHost the http_proxyHost to set
     */
    public void setHttp_proxyHost(String http_proxyHost)
        {
        this.http_proxyHost = http_proxyHost;
        }

    /**
     * @return the http_proxyPort
     */
    public String getHttp_proxyPort()
        {
        return http_proxyPort;
        }

    /**
     * @param http_proxyPort the http_proxyPort to set
     */
    public void setHttp_proxyPort(String http_proxyPort)
        {
        this.http_proxyPort = http_proxyPort;
        }

    /**
     * @return the DSLFileLineParser_dir
     */
    public String getDSLFileLineParser_dir()
        {
        return DSLFileLineParser_dir;
        }

    /**
     * @param DSLFileLineParser_dir the DSLFileLineParser_dir to set
     */
    public void setDSLFileLineParser_dir(String DSLFileLineParser_dir)
        {
        this.DSLFileLineParser_dir = DSLFileLineParser_dir;
        }

    /**
     * @return the DSLFileLineParser_ext
     */
    public String getDSLFileLineParser_ext()
        {
        return DSLFileLineParser_ext;
        }

    /**
     * @param DSLFileLineParser_ext the DSLFileLineParser_ext to set
     */
    public void setDSLFileLineParser_ext(String DSLFileLineParser_ext)
        {
        this.DSLFileLineParser_ext = DSLFileLineParser_ext;
        }

    /**
     * @return the DSLFileParserRemoveFiles
     */
    public boolean isDSLFileParserRemoveFiles()
        {
        return DSLFileParserRemoveFiles;
        }

    /**
     * @param DSLFileParserRemoveFiles the DSLFileParserRemoveFiles to set
     */
    public void setDSLFileParserRemoveFiles(boolean DSLFileParserRemoveFiles)
        {
        this.DSLFileParserRemoveFiles = DSLFileParserRemoveFiles;
        }

    /**
     * @return the sendMailAlert
     */
    public boolean isSendMailAlert()
        {
        return sendMailAlert;
        }

    /**
     * @param sendMailAlert the sendMailAlert to set
     */
    public void setSendMailAlert(boolean sendMailAlert)
        {
        this.sendMailAlert = sendMailAlert;
        }

    /**
     * @return the sendMailAlertThreshold
     */
    public String getSendMailAlertThreshold()
        {
        return sendMailAlertThreshold;
        }

    /**
     * @param sendMailAlertThreshold the sendMailAlertThreshold to set
     */
    public void setSendMailAlertThreshold(String sendMailAlertThreshold)
        {
        this.sendMailAlertThreshold = sendMailAlertThreshold;
        }

    /**
     * @return the mail_recipients
     */
    public String getMail_recipients()
        {
        return mail_recipients;
        }

    /**
     * @param mail_recipients the mail_recipients to set
     */
    public void setMail_recipients(String mail_recipients)
        {
        this.mail_recipients = mail_recipients;
        }

    /**
     * @return the mail_cc_recipients
     */
    public String getMail_cc_recipients()
        {
        return mail_cc_recipients;
        }

    /**
     * @param mail_cc_recipients the mail_cc_recipients to set
     */
    public void setMail_cc_recipients(String mail_cc_recipients)
        {
        this.mail_cc_recipients = mail_cc_recipients;
        }

    /**
     * @return the mailServer
     */
    public String getMailServer()
        {
        return mailServer;
        }

    /**
     * @param mailServer the mailServer to set
     */
    public void setMailServer(String mailServer)
        {
        this.mailServer = mailServer;
        }

    /**
     * @return the mailSender
     */
    public String getMailSender()
        {
        return mailSender;
        }

    /**
     * @param mailSender the mailSender to set
     */
    public void setMailSender(String mailSender)
        {
        this.mailSender = mailSender;
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

    }
