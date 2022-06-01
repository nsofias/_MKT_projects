/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author nsofias
 */
public class CallsLoaderDaemon extends SimpleDaemon {
    NetworkResourcesFinder networkResourcesFinder;
    CallInfo_factory callInfo_factory;
    Map<String, String> reasonsMappingTable = new HashMap();
    private final CCMonitorStatsObjsContainer myStatsObjContainer;

    public CallsLoaderDaemon(CCMonitorStatsObjsContainer myStatsObjContainer, NetworkResourcesFinder networkResourcesFinder, CallInfo_factory callInfo_factory, int sleep, int step) {
        super(sleep, step);
        this.myStatsObjContainer = myStatsObjContainer;
        this.networkResourcesFinder = networkResourcesFinder;
        this.callInfo_factory = callInfo_factory;
    }

    public CallInfo createCallInfo(String startTime, String lineId, String lineIdInFault, String reason) {
        return callInfo_factory.createCallInfo(startTime, lineId, lineIdInFault, reason);
    }

    @Override
    public void processData() {
        System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+": started");

        try {
            //-------- get new calls --------
            ArrayList<CallInfo> myCallInfoList = requestLastCallsInfo();
            //----------------------
            if (!myCallInfoList.isEmpty()) {                
                System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":requestLastCallsInfo size :" + myCallInfoList.size() + " @" + new TimeStamp1().getNowFormated());
                //------------- findCLIsResources -------------------
                networkResourcesFinder.findCLIsResources(myCallInfoList);                
                //------------- setResources & include call in container -----------
                int count = 0;
                for (CallInfo myCallInfo : myCallInfoList) {                      
                    if (!myCallInfo.getResources().isEmpty()) {
                        try {
                            count++;
                            String calmyCallInfoIndex = myCallInfo.getStartTime() + "_" + myCallInfo.getLineId();
                            System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":calmyCallInfoIndex="+calmyCallInfoIndex);                            
                            myStatsObjContainer.put(calmyCallInfoIndex, myCallInfo);
                            System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":new instance added to Container: calmyCallInfoIndex:"+calmyCallInfoIndex+" " + myCallInfo.toString());
                        } catch (Exception e) {
                            e.printStackTrace(System.out);
                            System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":parseLine error:" + e.toString());
                        }
                    }
                }
                myStatsObjContainer.setMyLastCallInputTimeStamp(new TimeStamp1());
                System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+": NEW CALLS ADDED: " + count + " out of "+myCallInfoList.size() +" Container size = " + myStatsObjContainer.size());
                //============================
                myStatsObjContainer.updateClock();
                myStatsObjContainer.prepareCurrentObj();
                System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":endProccess finished");
            }
        } catch (Exception e) {
            System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":No Data error: " + e.toString());
            e.printStackTrace(System.out);
        }
        System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+" finished" + " " + new TimeStamp1().getNowFormated());
    }



    /**
     * @return the myStatsObjContainer
     */
    public CCMonitorStatsObjsContainer getMyStatsObjContainer() {
        return myStatsObjContainer;
    }

    public ArrayList<CallInfo> requestLastCallsInfo() throws Exception {
        ArrayList<CallInfo> myCalls = new ArrayList<>();
        return myCalls;
    }

}
