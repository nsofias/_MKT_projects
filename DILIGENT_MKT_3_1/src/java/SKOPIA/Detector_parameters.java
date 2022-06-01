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
public class Detector_parameters
    {
    int     PENDING_STATE_DURATION_MIN = -1,
            OPEN_STATE_VOLUMN_MIN = -1,
            REPEATED_FAULTS_PERIOD = 24,
            REPEATED_FAULTS_NUMBER = 2,
            ALARM_CREATE_STATE_VOLUMN_MIN=2,
            ALARM_OPEN_DELTA_MIN = 0;
    boolean OPEN_ENABLED = false;
    double ALARM_OPEN_PERC_REDUCTION = 0.0;

    public void load(String type)
        {
        Properties properties = new Properties();
        String APPLICATIONS_PATH = System.getenv("APPLICATIONS_PATH");//C:/my files/data/access7
        try (FileInputStream myStream = new FileInputStream(APPLICATIONS_PATH + "/DSLMON_SKOPIA/conf/parameters.properties"))
            {
            properties.load(new InputStreamReader(myStream, "UTF8"));
            ALARM_CREATE_STATE_VOLUMN_MIN = Integer.parseInt(properties.getProperty(type + ".ALARM_CREATE_STATE_VOLUMN_MIN").trim());
            PENDING_STATE_DURATION_MIN = Integer.parseInt(properties.getProperty(type + ".TICKET.PENDING_STATE_DURATION_MIN").trim());
            OPEN_STATE_VOLUMN_MIN = Integer.parseInt(properties.getProperty(type + ".TICKET.OPEN_STATE_VOLUMN_MIN").trim());
            ALARM_OPEN_PERC_REDUCTION = Double.parseDouble(properties.getProperty(type + ".TICKET.ALARM_OPEN_PERC_REDUCTION"));
            ALARM_OPEN_DELTA_MIN = Integer.parseInt(properties.getProperty(type + ".TICKET.ALARM_OPEN_DELTA_MIN"));
            REPEATED_FAULTS_PERIOD = Integer.parseInt(properties.getProperty(type + ".TICKET.REPEATED_FAULTS_PERIOD").trim());
            REPEATED_FAULTS_NUMBER = Integer.parseInt(properties.getProperty(type + ".TICKET.REPEATED_FAULTS_NUMBER").trim());
            OPEN_ENABLED = Boolean.parseBoolean(properties.getProperty(type + ".TICKET.OPEN").trim());
            }
        catch (Exception e)
            {
            e.printStackTrace(System.out);
            new MailAlert().sendmailAlert("DSLMON error:", e);
            }
        }

    }
