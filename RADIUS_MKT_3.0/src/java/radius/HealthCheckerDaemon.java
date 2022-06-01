package radius;

import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;

/**
 *
 * @author nsofias
 */
public class HealthCheckerDaemon extends SimpleDaemon {
    TimeStamp1 healthMonitorTimeStamp;
    String attachement = "yes";
    TimeStamp1 thresholdsCalc_Timestamp;
    Config myConfig;
    RadiusLog_LineParserListener myRadiusLog_LineParserListener;

    public HealthCheckerDaemon(Config myConfig, RadiusLog_LineParserListener myRadiusLog_LineParserListener, int sleep) {
        super(sleep);
        this.myConfig = myConfig;
        this.myRadiusLog_LineParserListener = myRadiusLog_LineParserListener;
        thresholdsCalc_Timestamp = new TimeStamp1();
        healthMonitorTimeStamp = new TimeStamp1();
    }

    @Override
    public void processData() {
        TimeStamp1 now = new TimeStamp1();
        if (now.minutesDiff(healthMonitorTimeStamp) > 15) {
            healthMonitorTimeStamp = new TimeStamp1();
            try {
                myConfig.load();
                System.out.println("RADIUS_SKOPIA:healthMonitor myConfig.loaded success");
            } catch (Exception e) {
                new MailAlert().sendmailAlert("RADIUS_SKOPIA.myConfig.load() error::",e);
                e.printStackTrace(System.out);
            }
            //-----------------
            try {

                myRadiusLog_LineParserListener.cleanStuckedSessions(600);
                System.out.println("RADIUS_SKOPIA:healthMonitor cleanStuckedSessions success");
            } catch (Exception e) {
                System.out.println("RADIUS_SKOPIA:healthMonitor cleanStuckedSessions error:"+e.toString());
                e.printStackTrace(System.out);
            }
//-------------------------
            try {
                myRadiusLog_LineParserListener.cleanOldClosedSessions(20160);//14 days
                System.out.println("RADIUS_SKOPIA:cleanOldClosedSessions success");
            } catch (Exception e) {
                System.out.println("RADIUS_SKOPIA:healthMonitor cleanOldClosedSessions error:"+e.toString());
                e.printStackTrace(System.out);
            }
            //---------- removeOldStopEvents --------------------------------
            try {
                myRadiusLog_LineParserListener.removeOldStopEvents();
                System.out.println("RADIUS_SKOPIA:removeOldStopEvents success");
            } catch (Exception e) {
                System.out.println("RADIUS_SKOPIA:healthMonitor removeOldStopEvents error:"+e.toString());
                e.printStackTrace(System.out);
            }
        }
    }

}
