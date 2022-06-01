/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_MKT;
/**
 *
 * @author gsofi
 * 
                .replaceAll("\\$D", Alarm_FYROM.PATH_DELIMETER)
                .replaceAll("\\$7", reg_[7])//slot_part
                .replaceAll("\\$8", reg_[8])//slot_part
                .replaceAll("\\$9", reg_[9])//slot_part
                .replaceAll("\\$11", reg_[11])//ATC
                .replaceAll("\\$12", reg_[12])//cable
                .replaceAll("\\$13", reg_[13])//dp
                .replaceAll("\\$15", reg_[15])//DSLAM
                .replaceAll("\\$18", reg_[18]);//SERVING_AREA 
 */
public class PathRetrieverFactory {
    public static String pattern_COPPER = "$18;$11;$15;$15:$7-$8-$9";
    public static String pattern_COPPER_CABLE = "$11;$11#$12;$11#$12#$13";
    public static String pattern_GPON = "$15;$15:$7-$8;$15:$7-$8-$9";
    public static String pattern_GPON_CABLE = "$11;$12;$13";
    //
    public static int DEPTH_COPPER = 4;
    public static int DEPTH_COPPER_CABLE = 3;
    public static int DEPTH_GPON = 3;
    public static int DEPTH_GPON_CABLE = 3;    

    public static PathsRetriever create(String type) {
        PathsRetriever myPatrhsRetriever = null;
        if (type.equals(Alarm_FYROM.TYPE_COPPER)) {
            myPatrhsRetriever = new PathsRetriever(pattern_COPPER, false, new int[]{}, DEPTH_COPPER);
        } else if (type.equals(Alarm_FYROM.TYPE_COPPER_CABLE)) {
            myPatrhsRetriever = new PathsRetriever(pattern_COPPER_CABLE, false, new int[]{}, DEPTH_COPPER_CABLE);
        } else if (type.equals(Alarm_FYROM.TYPE_GPON)) {
            myPatrhsRetriever = new PathsRetriever(pattern_GPON, true, new int[]{}, DEPTH_GPON);
        } else if (type.equals(Alarm_FYROM.TYPE_GPON_CABLE)) {
            myPatrhsRetriever = new PathsRetriever(pattern_GPON_CABLE, true, new int[]{12, 13}, DEPTH_GPON_CABLE);
        }
        return myPatrhsRetriever;
    }
}
