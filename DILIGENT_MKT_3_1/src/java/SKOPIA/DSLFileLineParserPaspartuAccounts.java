package SKOPIA;

import java.io.BufferedWriter;
import java.util.ArrayList;
import nsofiasLib.fileIO.LineParser;
import nsofiasLib.fileIO.ParseFileEmptyException;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;

public class DSLFileLineParserPaspartuAccounts implements LineParser {

    BufferedWriter outlog;
    long linesFound = 0, linesIncluded = 0;
    final ArrayList connections = new <String>ArrayList();
    //Counters domains = new Counters();
    TimeStamp1 startTime, endTime;
    String filename = "";

    public DSLFileLineParserPaspartuAccounts() {
    }

    @Override
    public void startParser(String filename) throws Exception {
        this.filename = filename;
        //connections.clear();
        linesFound = 0;
        linesIncluded = 0;
        startTime = new TimeStamp1();
    }

    @Override
    public void stopParser() throws Exception {
        System.out.println("DSLMON: DSLMON: File loaded at " + new TimeStamp1().getNowFormated() + " LinesFound = " + linesFound + "  linesIncluded=" + linesIncluded);
        if (linesFound == 0 || linesIncluded == 0) {
            System.out.println("DSLMON: WARNING after parsing " + filename + "!!! linesFound=" + linesFound + "  linesIncluded=" + linesIncluded);
            throw new ParseFileEmptyException();
        }

        Counters connectionsCounters = new Counters();
        connectionsCounters.updateCounters(connections);
        System.out.println("DSLMON:connectionsCounters updated");
        //connectionsCounters.sort(Counters.sortByCount);
        //System.out.println("DSLMON:connectionsCounters sorted");
        endTime = new TimeStamp1();
        //------ find long disconnections -----------------------------  
        System.out.println("DSLMON: counters size==" + connectionsCounters.size());
        System.out.println("DSLMON:linesFound=" + linesFound);
        System.out.println("DSLMON:linesIncluded=" + linesIncluded);
        System.out.println("DSLMON:time in secs=" + endTime.secondsDiff(startTime));
    }

    @Override
    public void parseLine(String myLine) throws Exception //8/13/2013 11:15:50 πμ	2621044647	TC-1-2-@
    {
        try {
            linesFound++;

            String fields[] = myLine.split(",");
            String user = fields[0].trim();

            connections.add(fields[2] + ";" + fields[1].split(":")[0]);
            linesIncluded++;
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        try {
        } catch (Exception e) {
            System.out.println("DSLMON:" + e.toString());
        }
    }
}
