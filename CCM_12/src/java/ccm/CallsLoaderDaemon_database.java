/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author nsofias
 */
public class CallsLoaderDaemon_database extends CallsLoaderDaemon {

    OracleDataSource ods;
    String jdbcDriver;
    String connectionURL;
    private String sql;
    private String sqlExecAfter;
    private String tablefields;

    public CallsLoaderDaemon_database(CCMonitorStatsObjsContainer myStatsObjContainer, NetworkResourcesFinder networkResourcesFinder, CallInfo_factory callInfo_factory, OracleDataSource ods, String jdbcDriver, int sleep, int step) {
        super(myStatsObjContainer, networkResourcesFinder, callInfo_factory, sleep, step);
        this.ods = ods;
        this.jdbcDriver = jdbcDriver;
    }

    public CallsLoaderDaemon_database(CCMonitorStatsObjsContainer myStatsObjContainer, NetworkResourcesFinder networkResourcesFinder, CallInfo_factory callInfo_factory, String connectionURL, String jdbcDriver, int sleep, int step) {
        super(myStatsObjContainer, networkResourcesFinder, callInfo_factory, sleep, step);
        this.connectionURL = connectionURL;
        this.jdbcDriver = jdbcDriver;
    }

    @Override
    public ArrayList<CallInfo> requestLastCallsInfo() throws Exception {
        System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+"  jdbcDriver=" + jdbcDriver);
        System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+"  connectionURL=" + connectionURL);
        System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+"  String sql=" + sql);
        System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+"  String sqlExecAfter=" + sqlExecAfter);
        System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+"  String tablefields=" + tablefields);
        if (ods != null) {
            System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+"  ServiceName=" + ods.getServiceName());
            System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+"  URL=" + ods.getURL());
            System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+"  User=" + ods.getUser());
        }
        ArrayList<CallInfo> myCalls = new ArrayList<>();
        if (sql != null) {
            Class.forName(jdbcDriver);
            System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":CallsLoaderDaemon_databaseActionsDataConnector/retrieveActions...");
            //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
            Connection conn;
            if (jdbcDriver.contains("OracleDriver")) {
                conn = ods.getConnection();
            } else {
                conn = DriverManager.getConnection(connectionURL);
            }
            //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
            String[] tablefields_ = tablefields.split(";");
            //startTime lineId lineIdInFault reason
            try (Statement stmt = conn.createStatement()) {
                stmt.setQueryTimeout(120000);
                System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":DataConnector/retrieveCalls sql = " + sql);
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String startTime = rs.getString(tablefields_[0]);
                    String lineId = rs.getString(tablefields_[1]);
                    String lineIdInFault = rs.getString(tablefields_[2]);
                    String reason = rs.getString(tablefields_[3]);
                    System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":DataConnector/requestLastCallsInfo lineId = " + lineIdInFault);
                    if (lineIdInFault != null) {
                        CallInfo myCallInfo = createCallInfo(startTime, lineId, lineIdInFault, reason);
                        if (myCallInfo != null) {
                            myCalls.add(myCallInfo);
                        }
                    }
                }
                System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":DataConnector/requestLastCallsInfo count = " + myCalls.size());
            } catch (Exception e) {
                System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":DataConnector/requestLastCallsInfo error " + e.toString());
                e.printStackTrace(System.out);
                conn.close();
            }
            //-------------- cleanup after -------------------
            if (sqlExecAfter != null) {
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate(sqlExecAfter);
                    System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":DataConnector/requestLastCallsInfo sqlExecAfter = " + sqlExecAfter);
                }
                catch (Exception e){
                    System.out.println("CCM12:CallsLoaderDaemon+"+this.getDaemonName()+":DataConnector/requestLastCallsInfo sqlExecAfter Exception= " + sqlExecAfter+ " "+e.toString());
                }
            }
            conn.close();
        }
        return myCalls;
    }

    public void setTablefields(String tablefields) {
        this.tablefields = tablefields;
    }

    /*
    
    public void doAfterRetrieve(Statement stmt) throws Exception
        {
        stmt.executeQuery("UPDATE MTKPROD.ITG_DILIGENT_ORDER_LINES set done='1' where done='0'");
        //---- databaseCleaning -----
        TimeStamp1 now = new TimeStamp1();
        TimeStamp1 databaseCleaningTimeStamp = new TimeStamp1(databaseCleaningTime);
        if (now.hoursDiff(databaseCleaningTimeStamp) > 12)
            {
            databaseCleaningTime = now.getNowUnformated();
            stmt.executeQuery("DELETE FROM MTKPROD.ITG_DILIGENT_ORDER_LINES where done='1'");
            System.out.println("SVTIssue_connector:houseKeeping ok!");
            }
        }      
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setSqlExecAfter(String sqlExecAfter) {
        this.sqlExecAfter = sqlExecAfter;
    }

    public static void main(String args[]) {

    }

}
