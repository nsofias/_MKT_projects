/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_MKT;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import nsofiasLib.utils.Counters;
import oracle.jdbc.pool.OracleDataSource;
import java.util.ArrayList;

/**
 *
 * @author nsofias
 */
/*
 SELECT LINE_ID, SERVING_AREA, HOST, DSLAM_NAME, RSU, RACK, SHELF, SLOT, PORT, CARD_TECHNOLOGY, CARD_TYPE, SHELF_CODE, SHELF_NAME, SLOT_NAME, PORT_STATUS, RADIUS_ACCOUNT, ATC, CABLE, DP
 FROM NC_OSS_PROD_RDB.V_DILIGENT_LINES;
 F2002921	Cair	HOST_Skopje_Cair	CA-OLT-01	Cair	0	14	0	1	GPON	MA5600T	SFP 0	SLOT For Board Type GPBD With Serial Number #020PFN6TD4600306	OLT Port 0/14/0	In Service	zlatkoutkovski	Cair	Cair#3#11	Cair#ODCO-11-03																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
 F2001903	Lisice	HOST_Skopje_Lisice_2	LI-OLT-02	ATC - N.Lisice	0	6	6	15	GPON	MA5600T	SFP 6	SLOT For Board Type GPBD With Serial Number #020PFN6TD4600222	OLT Port 0/6/6	In Service	filipgavrilovski	Lisice	Lisice#12#17	Lisice#ODCO-17-02																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
 F2003694	Cair	HOST_Skopje_Cair	CA-OLT-01	Cair	0	6	2	7	GPON	MA5600T	Slot6	Board Type:H801GPBC|Serial Number:020BXRD09B000653	OLT Port 0/6/2	In Service	denis_kuc1	Cair	Cair#3#11	Cair#ODCO-11-05																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
 F2002330	Lisice	HOST_Skopje_Lisice_2	LI-OLT-01	ATC - N.Lisice	0	11	4	24	GPON	MA5600T	SFP 4	SLOT For Board Type GPBD With Serial Number #022MLN10EB000275	OLT Port 0/11/4	In Service	f2002330	Lisice	Lisice#12#34	Lisice#ODCB-34-1618-07																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
 F2008349	Kumanovo	HOST_Kumanovo_Kumanovo	KU-OLT-01	EWSD - Kumanovo	0	6	0	5	GPON	MA5600T	Slot6	Board Type:H801GPBC|Serial Number:020BXRD09C000426	OLT Port 0/6/0	In Service	darjan.stojanovski	Kumanovo	Kumanovo#6#6	Kumanovo#ODCB-06-07																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													


 SELECT LINE_ID, CUSTOMER_ID, STATUS, REGION, PLACE, "PACKAGE", HAS_ADSL, HAS_VOIP, HAS_IPTV, DOWNLOAD_KBPS, UPLOAD_KBPS, ONLY_FOR_OPTIC, IS_WHOLESALE, PACK_CODE, TECHNOLOGY
 FROM NC_OSS_PROD_RDB.V_DILIGENT_LINE_DETAIL;

 F2022870	LI-OLT-05	0	In Service	Lisice	Lisice#12#7	Lisice#ODCF-07-10-12	Active	0	0	1
 F2009291	LI-OLT-05	0	In Service	Cento	Lisice#12#34	Lisice#ODCB-34-1618-07	Active	0	0	1
 F2009268	LI-OLT-05	0	In Service	Cento	Lisice#12#34	Lisice#ODCB-34-1618-07	Active	0	0	1
 F2010426	LI-OLT-05	0	In Service	Centar		Lisice#ODCO-30-01	Active	1	1	1
 F0066490	LI-OLT-05	4	In Service	Lisice	Lisice#12#12	Lisice#ODCF-12-06-17	Active	1	1	0
 F0131544	LI-OLT-05	6	In Service	Lisice	Lisice#12#26	Lisice#ODCP-26-03-06	Active	1	1	0
 F2008938	LI-OLT-05	7	In Service	Lisice	Lisice#12#29	Lisice#ODCO-29-03	Active	1	1	0
 F0119860	LI-OLT-05	5	In Service	Lisice	Lisice#12#22	Lisice#ODCO-22-08	Active	1	1	0
 F2028786	LI-OLT-05	5	In Service	Lisice	Lisice#12#13	Lisice#ODCF-21-03-19	Active	1	1	1
 */
public class NCDB {
    
    private String servicesAsString = "";
    private Counters services = new Counters();
    private ArrayList<String> lines = new ArrayList();
    private int lines_num = 0;
    private ArrayList<String> activeLines = new ArrayList();
    private int activeLines_num = 0;
    private String ATC = "";
    private String SERVING_AREA = "";
    //
    public static String PORT_STATUS_ACTIVE = "ACTIVE";
    public static String PORT_STATUS_NOT_ACTIVE = "NOT_ACTIVE";
    
    public void loadDBInfo(String whereStr) throws Exception {
        String SQL_STRING = "SELECT V_DILIGENT_LINE_DETAIL.LINE_ID, DSLAM_NAME, SLOT,  PORT_STATUS, ATC, SERVING_AREA,  CABLE, DP, STATUS, HAS_ADSL, HAS_VOIP, HAS_IPTV, INTERFACE "
                + "FROM NC_OSS_PROD_RDB.V_DILIGENT_LINES left join NC_OSS_PROD_RDB.V_DILIGENT_LINE_DETAIL "
                + "on V_DILIGENT_LINES.LINE_ID = V_DILIGENT_LINE_DETAIL.LINE_ID ";
        String sqlStr = SQL_STRING;
        if (whereStr != null) {
            sqlStr += " WHERE " + whereStr;
        }
        //System.out.println("sqlStr = " + sqlStr);
        getServices().clear();
        getLines().clear();
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//10.232.58.38:1521/NGOSSRDB");
        ods.setUser("DILIGENT_USER");
        ods.setPassword("Dilipass#1");
        try (Connection conn = ods.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet res = stmt.executeQuery(sqlStr);
            while (res.next()) {
                try {
                    if (ATC.isEmpty()) {
                        ATC = res.getString("ATC");
                    }
                    if (SERVING_AREA.isEmpty()) {
                        SERVING_AREA = res.getString("SERVING_AREA");
                    }
                    String PORT_STATUS = res.getString("PORT_STATUS");// 'In Service'
                    String STATUS = res.getString("STATUS");// 'Active'
                    String LINE_ID = res.getString("LINE_ID");
                    if (!lines.contains(LINE_ID)) {
                        lines.add(LINE_ID);
                    }
                    //--------------------------------------------------------------
                    if (PORT_STATUS.equals("In Service") && STATUS.equals("Active")) {
                        String HAS_ADSL = res.getString("HAS_ADSL");// '0' '1'
                        String HAS_VOIP = res.getString("HAS_VOIP");// '0' '1'
                        String HAS_IPTV = res.getString("HAS_IPTV");// '0' '1'
                        String INTERFACE = res.getString("INTERFACE");
                        //System.out.println(LINE_ID + ";" + PORT_STATUS);
                        if (HAS_ADSL.equals("1")) {
                            getServices().updateCounters("ADSL");
                        }
                        if (HAS_VOIP.equals("1")) {
                            getServices().updateCounters("VOIP");
                        }
                        if (HAS_IPTV.equals("1")) {
                            getServices().updateCounters("IPTV");
                        }
                        if (INTERFACE.contains("POTS")) {
                            getServices().updateCounters("POTS");
                        }
                        activeLines.add(LINE_ID);
                    }
                    
                } catch (Exception e) {
                }
                
            }
            //----------------------------------------------------------
            String serv = "";
            for (String label : getServices().keySet()) {
                serv += label + " : " + getServices().getCount(label);
                serv += ",";
            }
            if (serv.endsWith(",")) {
                serv = serv.substring(0, serv.length() - 1);
            }
            setServicesAsString(serv);
            setLines_num(lines.size());
            setActiveLines_num(activeLines.size());
        }
    }
    
    public static ArrayList getDslamsDistinct() throws Exception {
        ArrayList lines = new ArrayList();
        String SQL_STRING = "SELECT DISTINCT DSLAM_NAME FROM NC_OSS_PROD_RDB.V_DILIGENT_LINES";
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//10.232.58.38:1521/NGOSSRDB");
        ods.setUser("DILIGENT_USER");
        ods.setPassword("Dilipass#1");
        try (Connection conn = ods.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet res = stmt.executeQuery(SQL_STRING);
            while (res.next()) {
                lines.add(res.getString("DSLAM_NAME"));
            }
        }
        return lines;
    }
    
    public static ArrayList getATCsDistinct() throws Exception {
        ArrayList lines = new ArrayList();
        String SQL_STRING = "SELECT DISTINCT ATC FROM NC_OSS_PROD_RDB.V_DILIGENT_LINES";
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//10.232.58.38:1521/NGOSSRDB");
        ods.setUser("DILIGENT_USER");
        ods.setPassword("Dilipass#1");
        try (Connection conn = ods.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet res = stmt.executeQuery(SQL_STRING);
            while (res.next()) {
                lines.add(res.getString("ATC"));
            }
        }
        return lines;
    }
    
    public static ArrayList getSERVICING_AREAsDistinct() throws Exception {
        ArrayList lines = new ArrayList();
        String SQL_STRING = "SELECT DISTINCT SERVING_AREA FROM NC_OSS_PROD_RDB.V_DILIGENT_LINES";
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//10.232.58.38:1521/NGOSSRDB");
        ods.setUser("DILIGENT_USER");
        ods.setPassword("Dilipass#1");
        try (Connection conn = ods.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet res = stmt.executeQuery(SQL_STRING);
            while (res.next()) {
                lines.add(res.getString("SERVING_AREA"));
            }
        }
        return lines;
    }

    /**
     * @param args
     */
    /**
     * @return the servicesAsString
     */
    public String getServicesAsString() {
        return servicesAsString;
    }

    /**
     * @param servicesAsString the servicesAsString to set
     */
    public void setServicesAsString(String servicesAsString) {
        this.servicesAsString = servicesAsString;
    }

    /**
     * @return the services
     */
    public Counters getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(Counters services) {
        this.services = services;
    }

    /**
     * @return the lines
     */
    public ArrayList<String> getLines() {
        return lines;
    }

    /**
     * @param lines the lines to set
     */
    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * @return the lines_num
     */
    public int getLines_num() {
        return lines_num;
    }

    /**
     * @param lines_num the lines_num to set
     */
    public void setLines_num(int lines_num) {
        this.lines_num = lines_num;
    }

    /**
     * @return the activeLines
     */
    public ArrayList<String> getActiveLines() {
        return activeLines;
    }

    /**
     * @param activeLines the activeLines to set
     */
    public void setActiveLines(ArrayList<String> activeLines) {
        this.activeLines = activeLines;
    }

    /**
     * @return the activeLines_num
     */
    public int getActiveLines_num() {
        return activeLines_num;
    }

    /**
     * @param activeLines_num the activeLines_num to set
     */
    public void setActiveLines_num(int activeLines_num) {
        this.activeLines_num = activeLines_num;
    }

    /**
     * @return the ATC
     */
    public String getATC() {
        return ATC;
    }

    /**
     * @param ATC the ATC to set
     */
    public void setATC(String ATC) {
        this.ATC = ATC;
    }
    
    public String getSERVING_AREA() {
        return SERVING_AREA;
    }
    
    public void setSERVING_AREA(String SERVING_AREA) {
        this.SERVING_AREA = SERVING_AREA;
    }

    //0000000000000000000000000000000000000000000000000
    public static void main(String[] args) {
        String whereStr = "UPPER(SERVING_AREA) = 'STIP'";
        NCDB myNCDB = new NCDB();
        try {
            myNCDB.loadDBInfo(whereStr);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        //--------------------
        for (String line : myNCDB.getLines()) {
            System.out.println(line);
        }
    }
}
