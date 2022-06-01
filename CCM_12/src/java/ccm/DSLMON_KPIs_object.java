/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author nsofias
 */
public class DSLMON_KPIs_object
    {

    private final ArrayList<String> DSLAM_avail = new ArrayList();
    private final ArrayList<String> DSLAM_retain = new ArrayList();

    public DSLMON_KPIs_object()
        {
        }

    public double getDslam_avail(String myDslam)
        {
        for (String dslamKPIs : DSLAM_avail)
            {
            if (dslamKPIs.contains(";" + myDslam + ","))
                {
                return Double.valueOf(dslamKPIs.split(",")[1]);
                }
            }
        return 100.0;
        }

    public double getDslam_retain(String myDslam)
        {
        for (String dslamKPIs : DSLAM_retain)
            {
            if (dslamKPIs.contains(";" + myDslam + ","))
                {
                return Double.valueOf(dslamKPIs.split(",")[1]);
                }
            }
        return 100.0;
        }
   

    public String getQoS(String myDslam)
        {
        String str = "";
        //double avail = this.getDslam_avail(myDslam);
        try
            {
            double retain = this.getDslam_retain(myDslam);

            if (retain < 100 && retain >= 99)
                {
                str = "Μέτρια παροχή υπηρεσιας. (Πιθανοτητα αδιάλειπτης λειτουργίας > 1h= " + format_number(retain) + " %)";
                }
            else if (retain < 99)
                {
                str = "<b>Επαναλαμβανόμενες διακοπές υπηρεσιας!!!</b> (Πιθανοτητα αδιάλειπτης λειτουργίας > 1h= " + format_number(retain) + " %)";
                }
            else
                {
                str = "Σταθερη παροχή υπηρεσιας. (Πιθανοτητα αδιάλειπτης  λειτουργίας > 1h > 99.999 %)";
                }
            }
        catch (Exception e)
            {
            str = "N/A";
            }
        return str;
        }

    public void updateKPIs(String avail_url, String retain_url) throws Exception
        {
        /*
        URL myURL = new URL(avail_url);
        URLConnection yc = myURL.openConnection();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream())))
            {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                {
                if (!inputLine.isEmpty())
                    {
                    DSLAM_avail.add(inputLine);
                    }
                }
            }
         */
        //
        URL myURL = new URL(retain_url);
        URLConnection yc = myURL.openConnection();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream())))
            {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                {
                if (!inputLine.isEmpty())
                    {
                    DSLAM_retain.add(inputLine);
                    System.out.println(inputLine);
                    }
                }
            }
        }

    private String format_number(double myNumder)
        {
        NumberFormat myNumberFormat = NumberFormat.getInstance();
        myNumberFormat.setMinimumFractionDigits(2);
        myNumberFormat.setMaximumFractionDigits(2);
        myNumberFormat.setGroupingUsed(false);
        String myNumder_string = myNumberFormat.format(myNumder);
        double myNumder_D = Double.valueOf(myNumder_string.replaceAll(",", ".")).doubleValue();
        if (myNumder - myNumder_D > 0.001)
            {
            myNumder_D = myNumder_D + 0.01;
            myNumder_string = myNumberFormat.format(myNumder_D);
            //          myNumder_string = myNumder_string.replaceAll(",",".");
            //          System.out.println("<><><><>"+String.valueOf(myNumder)+" "+myNumder_string);
            }
        return (myNumder_string);
        }
    
    public String getDslam_events(String myDslam) throws Exception
        {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URL myURL = new URL("http://172.25.37.250:8080/DSLMON/events_dslams_WS.jsp?DSLAM="+myDslam);
        URLConnection yc = myURL.openConnection();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream())))
            {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                {
                if (!inputLine.isEmpty())
                    {
                    //System.out.println(inputLine);
                    DSLAM_retain.add(inputLine);
                    return inputLine;
                    }
                }
            }
        return "error";
        } 
    
    public static void main(String[] args) throws Exception
        {
        DSLMON_KPIs_object myCCMInfo_object = new DSLMON_KPIs_object();
        }
    }
