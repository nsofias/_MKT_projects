/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

import java.util.ArrayList;

/**
 *
 * @author nsofias
 */
public class Signature_OTE extends ccm.Signature {
    private final ArrayList<String> notesList = new ArrayList();

//
    public static final String SIGNATURE_1 = "SIGNATURE_1";//Unknown Problem";
    public static final String SIGNATURE_2 = "SIGNATURE_2";//"Αfter Maintenance";
    public static final String SIGNATURE_3 = "SIGNATURE_3";//"Problem  Not Solved (after NTT SR)";
    public static final String SIGNATURE_4 = "SIGNATURE_4";//"IPTV issue";
    public static final String SIGNATURE_5 = "SIGNATURE_5";//"Customer Late reaction after massive fault";
    public static final String SIGNATURE_6 = "SIGNATURE_6";//"Probable Cable Fault";
    public static final String SIGNATURE_7 = "SIGNATURE_7";//" Repeated Problem";
    public static final String SIGNATURE_8 = "SIGNATURE_8";//"Transport –Transmision Problem";
    public static final String SIGNATURE_9 = "SIGNATURE_9";//"Problem Solved – No Action Required";
    public static final String SIGNATURE_10 = "SIGNATURE_10";//"Slot Problem";
    public static final String SIGNATURE_11 = "SIGNATURE_11";//"Bras Problem";    
    //
    public static final String PHASE_0 = "PHASE_0";
    public static final String PHASE_1 = "PHASE_1";

    public Signature_OTE(String creationTimeStamp) {
        super(creationTimeStamp);
    }


    
    




    /**
     * @return the notesList
     */
    public ArrayList getNotesList() {
        return notesList;
    }

    public ArrayList createNotesList(String sr, String area, String dslam, String parent) {
        ArrayList<String> notesListNew = new ArrayList();
        for (String note : notesList) {
            if (sr != null) {
                note = note.replaceAll("\\$SR", sr);
            } else {
                note = note.replaceAll("\\$SR", "N/A");
            }
            //
            if (area != null) {
                note = note.replaceAll("\\$AREA", area);
            } else {
                note = note.replaceAll("\\$AREA", "N/A");
            }
            if (dslam != null) {
                note = note.replaceAll("\\$DSLAM", dslam);
            } else {
                note = note.replaceAll("\\$DSLAM", "N/A");
            }
            //
            if (parent != null) {
                note = note.replaceAll("\\$PARENT", parent);
            } else {
                note = note.replaceAll("\\$PARENT", "N/A");
            }
            notesListNew.add(note);
        }
        notesList.clear();
        notesList.addAll(notesListNew);
        return notesListNew;
    }



}
