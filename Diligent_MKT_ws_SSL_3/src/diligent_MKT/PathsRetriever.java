/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_MKT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nsofiasLib.others.Parameters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.URLContextReader_object;
import nsofiasLib.utils.mapper.paths.Paths_1D_decimal;

/**
 *
 * @author stb
 */
public class PathsRetriever {
    String RETRIEVE_URL;
    String LAST_SESSION_URL;
    String lastRadiusSession_previous = "";
    String pattern = "";
    boolean isGPON = false;
    int[] checkForNulls;
    int depth;

    public PathsRetriever(String pattern, boolean GPON, int[] checkForNulls, int depth) {
        this.pattern = pattern;
        this.isGPON = GPON;
        this.checkForNulls = checkForNulls;
        this.depth = depth;
        Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "UTF8");
        RETRIEVE_URL = myParameters.getStringValue("RETRIEVE_URL", "");
        LAST_SESSION_URL = myParameters.getStringValue("LAST_SESSION_URL", "");
    }

    public Paths_1D_decimal retrieveAggr() {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        Paths_1D_decimal newAggregation = new Paths_1D_decimal(depth, Alarm_FYROM.PATH_DELIMETER);//SERVICING_AREA;ATC;DSLAM;SLOT
        //
        try {
            String lastRadiusSession = (String) myUrlReader.getUrlContext(LAST_SESSION_URL, 120000, 120000).get(0);
            TimeStamp1 now = new TimeStamp1();
            if (lastRadiusSession.equals(-1) || lastRadiusSession_previous.equals(lastRadiusSession)) {
                System.out.println("+++++++++PathsRetriever is pending...++++++++++++");
                return null;
            }
            lastRadiusSession_previous = lastRadiusSession;
            //-------------------------------
            System.out.println("DSLMON_SKOPIA:retrieveAggr:PathsRetriever hitting URL " + RETRIEVE_URL + "?state=live");
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL + "?state=live", 120000, 120000);//10 min
            System.out.println("DSLMON_SKOPIA:Communicating ... returned " + aggr.size() + " at " + new TimeStamp1().getNowFormated());
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        //---------
                        for (int id : checkForNulls) {
                            if (reg_[id] == null || reg_[id].isEmpty()) {
                                throw new Exception("id=" + id);
                            }
                        }
                        //-----
                        String myPath = getPathFrompattern(pattern, reg_);
                        newAggregation.update(myPath, 1.0);
                    }
                } catch (Exception e) {
                    //e.printStackTrace();
                    //System.out.println("----->"+reg);
                }
            });
            newAggregation.setHeader(lastRadiusSession);
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        return newAggregation;
    }

    public ArrayList<String> retrieveAggrErrors() {
        ArrayList<String> errors = new ArrayList();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        Map<Integer, String> errorDescs = new HashMap();
        errorDescs.put(7, "slot part 1");
        errorDescs.put(8, "slot part 2");
        errorDescs.put(9, "slot part 3");
        errorDescs.put(11, "ATC");
        errorDescs.put(12, "CABLE");
        errorDescs.put(13, "DP");
        errorDescs.put(15, "DSLAM");
        errorDescs.put(18, "SERVING_AREA");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        //
        try {
            System.out.println("DSLMON_SKOPIA:retrieveAggrErrors: PathsRetriever hitting URL " + RETRIEVE_URL);
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);//10 min
            System.out.println("DSLMON_SKOPIA:Communicating ... returned " + aggr.size() + " at " + new TimeStamp1().getNowFormated());
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        for (int id : checkForNulls) {
                            if (reg_[id] == null || reg_[id].isEmpty()) {
                                throw new Exception(errorDescs.get(id) + " is null or empty for Nas-port-id: " + reg_[1]);
                            }
                        }
                    }
                } catch (Exception e) {
                    errors.add("retrieveAggrErrors: " + e.toString());
                }
            });
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:retrieveAggrErrors_1::"+e.toString());
        }
        return errors;
    }

    public ArrayList retrieveLines(String path) {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        //
        ArrayList lines = new ArrayList();
        try {
            System.out.println("DSLMON_SKOPIA:retrieveLines: LinesRetriever hitting URL " + RETRIEVE_URL + "path: " + path);
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);//10 min
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        String myPath = getPathFrompattern(pattern, reg_);
                        //--------------------------------------------
                        if (myPath.equals(path) || myPath.startsWith(path + Alarm_FYROM.PATH_DELIMETER)) {
                            lines.add(reg_[4] + "  " + reg_[2] + "   " + myPath.replaceAll(";", " : ") + "   " + reg_[14] + "     " + reg_[0] + "   " + new TimeStamp1(reg_[17] + ".000").getNowFormated());
                        }
                    }
                } catch (Exception e) {
                    //System.out.println("reg=" + reg);
                    //myLog.getLogger().warn("DSLMON_SKOPIA: retrieveAggr error:" + e.toString());
                }
            });
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        return lines;
    }

    public ArrayList retrieveLineIDs(String path) {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        //
        ArrayList lines = new ArrayList();
        try {
            System.out.println("DSLMON_SKOPIA:retrieveLineIDs: LinesRetriever hitting URL " + RETRIEVE_URL);
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);//10 min
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        String myPath = getPathFrompattern(pattern, reg_);
                        //--------------------------------------------
                        if (myPath.equals(path) || myPath.startsWith(path + Alarm_FYROM.PATH_DELIMETER)) {
                            lines.add(reg_[4]);
                        }
                    }
                } catch (Exception e) {
                    //System.out.println("reg=" + reg);
                    //myLog.getLogger().warn("DSLMON_SKOPIA: retrieveAggr error:" + e.toString());
                }
            });
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        return lines;
    }

    public ArrayList retrieveStoppedLines() {
        ArrayList lines = new ArrayList();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        try {
            System.out.println("DSLMON_SKOPIA:retrieveStoppedLines hitting URL " + RETRIEVE_URL);
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);//10 min
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        String myPath = getPathFrompattern(pattern, reg_);
                        //--------------------------------------------
                        if (reg_[2].equals("stop")) {
                            lines.add(reg_[4] + "  " + reg_[2] + "   " + myPath.replaceAll(";", " : ") + "   " + reg_[14] + "     " + reg_[0] + "   " + new TimeStamp1(reg_[17] + ".000").getNowFormated());
                        }
                    }
                } catch (Exception e) {
                }
            });
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        return lines;
    }

    public ArrayList retrieve4GBackupLines() {
        ArrayList lines = new ArrayList();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        try {
            System.out.println("DSLMON_SKOPIA:retrieve4GBackupLines hitting URL " + RETRIEVE_URL);
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);//10 min
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        String myPath = getPathFrompattern(pattern, reg_);
                        //--------------------------------------------
                        if (reg_.length > 22 && reg_[22].trim().equals("Y")) {
                            lines.add(reg_[4] + "  " + reg_[2] + "   " + myPath.replaceAll(";", " : ") + "   " + reg_[14] + "     " + reg_[0] + "   " + new TimeStamp1(reg_[17] + ".000").getNowFormated() + "   " + reg_[20] + "   " + reg_[22]);
                        }
                    }
                } catch (Exception e) {
                }
            });
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        return lines;
    }

    public HashMap<String, String> retrieveStopped4GBackupLines() {
        HashMap<String, String> lines = new HashMap();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        try {
            System.out.println("DSLMON_SKOPIA:retrieveStopped4GBackupLines hitting URL " + RETRIEVE_URL);
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);//10 min
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        String myPath = getPathFrompattern(pattern, reg_);
                        //--------------------------------------------
                        if (reg_[2].equals("stop") && reg_.length > 22 && reg_[22].trim().equals("Y")) {
                            String info = reg_[4] + "  " + reg_[2] + "   " + myPath.replaceAll(";", " : ") + "   " + reg_[14] + "     " + reg_[0] + "   " + new TimeStamp1(reg_[17] + ".000").getNowFormated() + "   " + reg_[20] + "   " + reg_[22] + "   " + reg_[23];
                            lines.put(reg_[4], info);
                        }
                    }
                } catch (Exception e) {
                }
            });
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        return lines;
    }

    public ArrayList retrieveSubPaths(String path) {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        //
        ArrayList lines = new ArrayList();
        try {
            System.out.println("DSLMON_SKOPIA:retrieveSubPaths: LinesRetriever hitting URL " + RETRIEVE_URL);
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);//10 min
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        String myPath = getPathFrompattern(pattern, reg_);
                        //--------------------------------------------
                        if (myPath.startsWith(path + Alarm_FYROM.PATH_DELIMETER) && !lines.contains(myPath)) {
                            lines.add(myPath);
                        }
                    }
                } catch (Exception e) {
                }
            });
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        return lines;
    }

    public String retrievePath(String lineId) {
        String path = "";
        //-------------
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        //
        try {
            System.out.println("DSLMON_SKOPIA:retrievePath: LinesRetriever hitting URL " + RETRIEVE_URL);
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);//10 min
            for (String reg : aggr) {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        String myPath = getPathFrompattern(pattern, reg_);
                        //--------------------------------------------
                        if (reg_[4].equals(lineId)) {
                            path = myPath;
                        }
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        //-------------        
        return path;
    }

    public ArrayList retrieveElements(int depth) {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        URLContextReader_object myUrlReader = new URLContextReader_object();
        ArrayList lines = new ArrayList();
        //
        try {
            String lastRadiusSession = (String) myUrlReader.getUrlContext(LAST_SESSION_URL, 120000, 120000).get(0);
            if (lastRadiusSession.equals(-1) || lastRadiusSession_previous.equals(lastRadiusSession))// || now.minutesDiff(new TimeStamp1(lastRadiusSession)) <= 2)
            {
                System.out.println("+++++++++PathsRetriever is pending...++++++++++++");
                return null;
            }
            lastRadiusSession_previous = lastRadiusSession;
            //-------------------------------
            System.out.println("DSLMON_SKOPIA:retrievePath: PathsRetriever hitting URL " + RETRIEVE_URL + "?state=live");
            ArrayList<String> aggr = myUrlReader.getUrlContext(RETRIEVE_URL + "?state=live", 120000, 120000);//10 min
            System.out.println("DSLMON_SKOPIA:Communicating ...  returned " + aggr.size() + " at " + new TimeStamp1().getNowFormated());
            aggr.forEach((reg)
                    -> {
                try {
                    String[] reg_ = reg.split("\t");
                    String cardTechnology = reg_[5];
                    if (cardTechnology.equals("GPON") == isGPON) {
                        String myPath = getPathFrompattern(pattern, reg_);
                        String element = myPath.split(Alarm_FYROM.PATH_DELIMETER)[depth - 1];
                        if (!lines.contains(element)) {
                            lines.add(element);
                        }
                    }
                } catch (Exception e) {
                }
            });
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:PathsRetriever error::"+e.toString());
        }
        Collections.sort(lines);
        return lines;
    }

    private String getPathFrompattern(String myPattern, String[] reg_) {
        return myPattern
                .replaceAll("\\$D", Alarm_FYROM.PATH_DELIMETER)
                .replaceAll("\\$7", reg_[7])//slot_part
                .replaceAll("\\$8", reg_[8])//slot_part
                .replaceAll("\\$9", reg_[9])//slot_part
                .replaceAll("\\$11", reg_[11])//ATC
                .replaceAll("\\$12", reg_[12])//cable
                .replaceAll("\\$13", reg_[13])//dp
                .replaceAll("\\$15", reg_[15])//DSLAM
                .replaceAll("\\$18", reg_[18]);//SERVING_AREA
    }

    //******************************************    
    public static void main(String[] args) {
        //COPPER
        {
        /*
            PathsRetriever myPathsRetriever1 = PathRetrieverFactory.create(Alarm_FYROM.TYPE_COPPER);
            PathsRetriever myPathsRetriever2 = PathRetrieverFactory.create(Alarm_FYROM.TYPE_COPPER_CABLE);
            PathsRetriever myPathsRetriever3 = PathRetrieverFactory.create(Alarm_FYROM.TYPE_GPON);
            PathsRetriever myPathsRetriever4 = PathRetrieverFactory.create(Alarm_FYROM.TYPE_GPON_CABLE);
        
            Paths_1D_decimal myAggr = myPathsRetriever1.retrieveAggr();
            System.out.println("DSLMON_SKOPIA:myAggr" + myAggr.mapperElementsList.size());
            myAggr.mapperElementsList.forEach((k, v) -> {
                System.out.println("DSLMON_SKOPIA::BBoard new:" + k);
            });*/
        }

        //Paths_1D_decimal myAggr = myPathsRetriever.retrieveAggr();
        //myAggr.sortByKey();
        //myAggr.display();
/*
        System.out.println("--------");
        ArrayList<String> lines = myPathsRetriever.retrieveAggrErrors();
        lines.forEach((s) ->
            {
            System.out.println(s);
            });
         */
 /*
        ArrayList<String> mylist = myPathsRetriever.retrieveElements(1);
        System.out.println("Elements");
        mylist.forEach((s) ->
            {
            System.out.println(s);
            });
        //System.out.println("path = " + myPathsRetriever.retrievePath("L0072807"));
         */
                PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(Alarm_FYROM.TYPE_COPPER);
                System.out.println("path = " + myPatrhsRetriever.retrievePath("F0002200"));
                if (myPatrhsRetriever != null) {
                    ArrayList<String> myLines = myPatrhsRetriever.retrieveLines("Centar");
                    Collections.sort(myLines);
                    for (String line : myLines) {
                        System.out.println("<tr><td>" + line + "</td></tr>");
                }
            }
    }
}
