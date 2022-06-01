package ccm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import nsofiasLib.fileIO.FFileFilter;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.fileIO.FileSelector;
import nsofiasLib.fileIO.ParseFileEmptyException;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.JsonParser;

/**
 *
 * @author nsofias
 */
public class CallsLoaderDaemon_file extends CallsLoaderDaemon {

    private String parserDir = "/ccm/data/";
    private String parserExt = "txt";
    private String file_type = "JSON";
    private boolean removeFiles = true;
    private String csvcols = "1;2;3;5";

    public CallsLoaderDaemon_file(CCMonitorStatsObjsContainer myStatsObjContainer, NetworkResourcesFinder networkResourcesFinder,CallInfo_factory callInfo_factory, int sleep, int step) {
        super(myStatsObjContainer, networkResourcesFinder,callInfo_factory, sleep, step);
    }

    @Override
    public ArrayList<CallInfo> requestLastCallsInfo() throws Exception {
        ArrayList<CallInfo> myCalls = new ArrayList<>();
        String files_dir = System.getenv("APPLICATIONS_PATH") + getParserDir();
        System.out.println("CCM12:AlarmsLoaderDaemon:starting requestLastCallsInfo:parserDir=" + files_dir + " ext=" + getParserExt());
        FFileFilter myFFileFilter = new FFileFilter();
        myFFileFilter.setAcceptDir(false);
        myFFileFilter.setExtention(getParserExt());
        FileSelector myFileSelector = new FileSelector(files_dir, myFFileFilter);
        File[] myFiles = myFileSelector.loadFiles();
        for (File myFile : myFiles) {
            System.out.println("CCM12:AlarmsLoaderDaemon new File found for proccessing:" + myFile.getAbsolutePath());
            // --------------------------------   
            if ((new TimeStamp1()).getTimeInMillis() - myFile.lastModified() < 10000) {
                System.out.println("CCM12:AlarmsLoaderDaemon:Waiting for 3 secs for file '" + myFile.getAbsolutePath() + "'");
                throw new ParseFileEmptyException();
            }
            //--------------------------------------
            List<String> res = FileParser2.getLinesAsList(myFile.getAbsolutePath(), "UTF-8");
            System.out.println("CCM12:CallsLoaderDaemon:requestLastCallsInfo file: lines in file:" + res.size());
            int count = 0;
            for (String myLine : res) {
                try {
                    //String lineId, String startTime, String networkType, String reason
                    if (getFile_type().equals("JSON")) {
                        String startTime = JsonParser.getJsonValueOf(myLine, "startTime", JsonParser.TYPE_String);
                        String lineId = JsonParser.getJsonValueOf(myLine, "lineId", JsonParser.TYPE_String);
                        String lineIdInFault = JsonParser.getJsonValueOf(myLine, "lineIdInFault", JsonParser.TYPE_String);
                        String reason = JsonParser.getJsonValueOf(myLine, "reason", JsonParser.TYPE_String);
                        CallInfo myCallInfo = createCallInfo(startTime, lineId, lineIdInFault, reason);
                        //lineId, String startTime, String networkType, String reason
                        if (myCallInfo != null) {
                            myCalls.add(myCallInfo);
                            count++;
                        }
                        
                        //System.out.println("CCM12:CallsLoaderDaemon:requestLastCallsInfo added:" + myCallInfo.getLineId());
                    }
                    if (getFile_type().equals("CSV")) {
                        String[] fields = myLine.split("\\|");
                        String[] csvcols_ = getCsvcols().split(";");
                        //startTime;lineId;lineIdInFault;reason   
                        String startTime = fields[Integer.parseInt(csvcols_[0])];
                        String lineId = fields[Integer.parseInt(csvcols_[1])];
                        String lineIdInFault = fields[Integer.parseInt(csvcols_[2])];
                        String reason;
                        try {
                            reason = fields[Integer.parseInt(csvcols_[3])];
                        } catch (Exception e) {
                            reason = "N/A";
                        }
                        CallInfo myCallInfo = createCallInfo(startTime, lineId, lineIdInFault, reason);
                        //lineId, String startTime, String networkType, String reason
                        if (myCallInfo != null) {
                            myCalls.add(myCallInfo);
                            count++;
                        }
                        
                        //System.out.println("CCM12:CallsLoaderDaemon:requestLastCallsInfo added:" + myCallInfo.getLineId());
                    }
                } catch (Exception e) {
                    System.out.println("CCM12:CallsLoaderDaemon:requestLastCallsInfo error:" + e.toString() + " " + myLine);
                }
                if (isRemoveFiles()) {
                    myFile.delete();
                }
            }
            System.out.println("CCM12:CallsLoaderDaemon:requestLastCallsInfo file: calls added:" + myCalls.size());
            return myCalls;
        }
        return myCalls;
    }

    /**
     * @param parserDir the parserDir to set
     */
    public void setParserDir(String parserDir) {
        this.parserDir = parserDir;
    }

    /**
     * @param parserExt the parserExt to set
     */
    public void setParserExt(String parserExt) {
        this.parserExt = parserExt;
    }

    /**
     * @param removeFiles the removeFiles to set
     */
    public void setRemoveFiles(boolean removeFiles) {
        this.removeFiles = removeFiles;
    }

    /**
     * @return the parserDir
     */
    public String getParserDir() {
        return parserDir;
    }

    /**
     * @return the parserExt
     */
    public String getParserExt() {
        return parserExt;
    }

    /**
     * @return the file_type
     */
    public String getFile_type() {
        return file_type;
    }

    /**
     * @param file_type the file_type to set
     */
    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    /**
     * @return the removeFiles
     */
    public boolean isRemoveFiles() {
        return removeFiles;
    }

    /**
     * @return the csvcols
     */
    public String getCsvcols() {
        return csvcols;
    }

    /**
     * @param csvcols the csvcols to set
     */
    public void setCsvcols(String csvcols) {
        this.csvcols = csvcols;
    }

}
