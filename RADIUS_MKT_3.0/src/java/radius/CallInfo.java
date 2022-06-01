/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nsofias
 */
/*
    SERVING_AREA;ATC;DSLAM;OLT;SHELF;SLOT;CABLE;DP;BOX;
 */
public class CallInfo {

    private final String lineId;
    private String startTime;
    private String networkType;
    private String reason;
    private final Map<String, String> resources = new HashMap<>();

    public CallInfo(String lineId, String startTime, String networkType, String reason) {
        this.lineId = lineId;
        this.startTime = startTime;
        this.networkType = networkType;
        this.reason = reason;
    }

    /**
     * @return the resources
     */
    public Map<String, String> getResources() {
        return resources;
    }


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    /**
     * @return the a_number
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * @return the terminationCode
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the lineType
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * @param lineType the lineType to set
     */
    public void setNetworkType(String lineType) {
        this.networkType = lineType;
    }

    public static void main(String[] args) {
        //String[] a = new String[]{"1","2",null};
        //String[] b = new String[10];
        //System.out.println(b[2]);
    }

}
