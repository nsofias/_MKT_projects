/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author nsofias
 */
public class SignatureFactory_OTE
    {

    public static Signature_OTE createSignature(String id)
        {
        Signature_OTE mySignature = new Signature_OTE(new TimeStamp1().getNowUnformated());
        mySignature.setLabel(id);
        switch (id)
            {
            case Signature_OTE.SIGNATURE_1://ΔΕΝ ΕΧΕΙ ΝΤΤ SR /MWTT SR [ Δεν υπήρχε κάποιο ανοιχτό ΝΤΤ SR /MWTT SR που να έκλεισε την τελευταία ώρα ]
                mySignature.setSynopsis("'Abnormal Condition' detected:  Unknown Problem – Customer based  detection");
                mySignature.setPriority("MAJOR");
                mySignature.setMinutesToManage(30);
                mySignature.setMinutesToAutoClose(-1);
                mySignature.getNotesList().add("Anomaly Signature hit: #1 Unknown Problem – Customer based  detection");
                mySignature.getNotesList().add("Πιθανές αιτίες : 1. Δυσλειτουργία κάρτας ή και ολοκλήρου του DSLAM χωρίς σηματοδοσία. 2.Πρόβλημα σε Metro –Ethernet ή Τransport Δίκτυο. 3. Καλωδιακή βλάβη που επηρεάζει πολλούς συνδρομητές του κόμβου");
                mySignature.getNotesList().add("Παρακαλώ να γίνει έλεγχος στο εν λόγω Dslam ή και στην γειτονική περιοχή. Παρατηρούνται αυξημένα παράπονα πελατών. Εφόσον δεν βρεθεί κάποια προφανής αιτία να προωθηθεί για περαιτέρω έλεγχο στα:  ΤΜΗΜΑ BNG&METRO ETHERNET & SUPPORT BROADBAND");
                break;
            case Signature_OTE.SIGNATURE_2://Αfter Maintenance
                mySignature.setPriority("MINOR");
                mySignature.setMinutesToManage(-1);
                mySignature.setMinutesToAutoClose(120);
                mySignature.setSynopsis("'Abnormal Condition' detected  on metrics for Dslam $PARENT->$DSLAM in area: $AREA");
                mySignature.getNotesList().add("Anomaly Signature hit: #2 Αfter Maintenance –  Composite detection");
                mySignature.getNotesList().add("Να γίνει έλεγχος αν το πρόβλημα που αφορούσε το Maintenance SR:$SR έχει επιλυθεί πλήρως.  Θα χρειαστεί  επικοινωνία με ομάδα ΝΜC/NCC & Field που διαχειρίστηκε το MΤΤ SR.");
                mySignature.getNotesList().add("Πιθανές αιτίες: Mετά από προγραμματισμένες εργασίες (Maintenance SR: $SR) παρατηρούνται αυξημένα παράπονα πελατών. Εφόσον δεν βρεθεί κάποια προφανής αιτία  να προωθηθεί για περαιτέρω έλεγχο στα:  ΤΜΗΜΑ BNG&METRO ETHERNET, SUPPORT BROADBAND & SUPPORT OPTICAL");
                break;
            case Signature_OTE.SIGNATURE_3://Problem  Not Solved
                mySignature.setSynopsis("'Abnormal Condition' detected: DSLAM/CARD Problem");
                mySignature.setPriority("MAJOR");
                mySignature.setMinutesToManage(30);
                mySignature.setMinutesToAutoClose(-1);
                mySignature.getNotesList().add("Anomaly Signature hit: #3 Problem  Not Solved –  Composite detection");
                mySignature.getNotesList().add("Πιθανές αιτίες:\n"
                        + " 1. Δυσλειτουργία κάρτας ή και ολοκλήρου του DSLAM με ή χωρίς σηματοδοσία. \n"
                        + "2. Πρόβλημα σε Core, Metro –Ethernet ή Τransport Δίκτυο. \n"
                        + "3. Προηγούμενο ΝΤΤ SR: $SR ");
                mySignature.getNotesList().add("Παρακαλώ να γίνει έλεγχος στο εν λόγω Dslam ή και στην γειτονική περιοχή καθώς παρατηρούνται αυξημένα παράπονα πελατών. Έκλεισε πρόσφατα ΝΤΤ SR. \n"
                        + "Εφόσον δεν βρεθεί κάποια προφανής αιτία  να προωθηθεί για περαιτέρω έλεγχο στo αρμόδιο Field Service / TTΛΠ.\n"
                        + "Nα μην κλείσει το ΝΤΤ SR – Θα κλείσει αυτόματα από CCM-DILIGENT εφόσον επιλυθεί το πρόβλημα.");
                break;
            case Signature_OTE.SIGNATURE_5://Customer Late reaction –  Composite detection
                mySignature.setPriority("MINOR");
                mySignature.setMinutesToManage(-1);
                mySignature.setMinutesToAutoClose(120);
                mySignature.setSynopsis("'Abnormal Condition' detected  on metrics for Dslam $PARENT->$DSLAM in area: $AREA");
                mySignature.getNotesList().add("Anomaly Signature hit: #5 Customer Late reaction –  Composite detection");
                mySignature.getNotesList().add("Να γίνει έλεγχος αν το πρόβλημα που αφορούσε το NTT SR:$SR έχει επιλυθεί πλήρως");
                mySignature.getNotesList().add("Πιθανές αιτίες: Παρατηρoύνται μειωμένα παράπονα  που αφορούν στις υπηρεσίες   του DSLAM $PARENT->$DSLAM στην περιοχη $AREA  που πιθανώς προκύψαν λόγω προηγούμενης διακοπής της υπηρεσίας.");
                break;
            case Signature_OTE.SIGNATURE_6://"Probable Cable Fault";  
                mySignature.setPriority("MINOR");
                mySignature.setMinutesToManage(-1);
                mySignature.setMinutesToAutoClose(120);
                mySignature.setSynopsis("'Abnormal Condition' detected  on metrics for Cable in area: $AREA");
                mySignature.getNotesList().add("Anomaly Signature hit  #6  Probable Cable Fault  - Customer based detection");
                mySignature.getNotesList().add("Πιθανές αιτίες :\n"
                        + " 1. Καλωδιακή βλάβη που επηρεάζει πολλούς συνδρομητές του κόμβου\n"
                        + "2. Τα καλώδια που εξυπηρετούν τους εν λόγω πελάτες είναι τα:  x  -y . Παρακαλώ για έλεγχο στο απερχόμενο δίκτυο.");
                mySignature.getNotesList().add("Παρακαλώ να γίνει έλεγχος στο εν λόγω Dslam ή και στην γειτονική περιοχή. Παρατηρούνται αυξημένα παράπονα πελατών. Εφόσον δεν βρεθεί κάποια προφανής αιτία  να προωθηθεί για περαιτέρω έλεγχο στα αρμόδια τοπικά τμήματα για έλεγχο στο απερχόμενο δίκτυο χαλκού");
                break;
            case Signature_OTE.SIGNATURE_7://Repeated problem
                mySignature.setPriority("MINOR");
                mySignature.setMinutesToManage(-1);
                mySignature.setMinutesToAutoClose(120);
                mySignature.setSynopsis("'Abnormal Condition' detected  on metrics for Dslam $PARENT->$DSLAM in area: $AREA.  Repeated problem");
                mySignature.getNotesList().add("Anomaly Signature hit  #7 Repeated Problem –Composite detection ");
                mySignature.getNotesList().add("Πιθανές αιτίες :\n"
                        + "1. Πρόβλημα σε τροφοδοσία ρεύματος.\n"
                        + "2. Δυσλειτουργία κάρτας ή και ολοκλήρου του DSLAM με ή χωρίς σηματοδοσία. \n"
                        + "3.Πρόβλημα σε Core, Metro –Ethernet ή Τransport Δίκτυο. \n"
                        + "4. Προηγούμενο ΝΤΤ SR: $SR");
                mySignature.getNotesList().add("Παρακαλώ να γίνει έλεγχος στο εν λόγω Dslam ή και στην γειτονική περιοχή. Παρατηρούνται περιστασιακές διακοπές στην υπηρεσία των πελατών με αποτέλεσμα παράπονα πελατών. \n"
                        + "\nΕφόσον δεν βρεθεί κάποια προφανής αιτία  να προωθηθεί για περαιτέρω έλεγχο στα αρμόδια τοπικά τμήματα για έλεγχο στην τροφοδοσία της ΔΕΗ, επιτηρητές τάσεων, μπαταριών καθώς και τυχόν ασύρματης μετάδοσης. \n"
                        + "\nΕπίσης να γίνει έλεγχος στις κάρτες των εξοπλισμών.Να δρομολογηθεί εγκατάσταση/αντικατάσταση μπαταριών. Nα μην κλείσει το ΝΤΤ SR – Θα κλείσει αυτόματα από CCM-DILIGENT εφόσον επιλυθεί το πρόβλημα.");

                break;
            case Signature_OTE.SIGNATURE_9://9 Problem Solved
                mySignature.setPriority("MINOR");
                mySignature.setMinutesToManage(-1);
                mySignature.setMinutesToAutoClose(120);
                mySignature.setSynopsis("'Abnormal Condition' detected  on metrics for Dslam $PARENT->$DSLAM in area: $AREA.  Repeated problem");
                mySignature.getNotesList().add("Το πρόβλημα του SR:$SR φαίνεται ότι έχει επιλυθεί.  Επιβεβαίωση μετά από  παρακολούθηση. Anomaly Signature hit  #9 Problem Solved – No Action Required)");
                break;
            case Signature_OTE.SIGNATURE_11://BRAS/BNG Problem – Composite Detection
                mySignature.setPriority("MAJOR");
                mySignature.setMinutesToManage(30);
                mySignature.setMinutesToAutoClose(-1);
                mySignature.setSynopsis("'Abnormal Condition' detected: BRAS/BNG Problem");
                mySignature.getNotesList().add("Anomaly Signature hit  #11 BRAS/BNG Problem– Composite Detection");
                mySignature.getNotesList().add("Πιθανές αιτίες :\n"
                        + " 1. Δυσλειτουργία συγκεκριμένης κάρτας ή και ολοκλήρου του κόμβου με ή χωρίς σηματοδοσία. \n"
                        + "2.Πρόβλημα από μη προγραμματισμένες εργασίες σε Core, Metro –Ethernet ή Τransport Δίκτυο που επηρεάζει την ευρύτερη περιοχή. \n"
                        + "3. Ύπαρξη software issue (sysdb, other) στον κόμβο\n"
                        + "4. Έλλειψη IP pool (CGN ,other) στον κόμβο.\n"
                        + "5. Άσχημες καιρικές συνθήκες στην περιοχή $AREA");
                mySignature.getNotesList().add("Παρακαλώ να γίνει έλεγχος στο εν λόγω κόμβο ή και στην ευρύτερη περιοχή. Παρατηρούνται αυξημένα παράπονα πελατών. Εφόσον δεν βρεθεί κάποια προφανής αιτία  να προωθηθεί για περαιτέρω έλεγχο στα:  ΤΜΗΜΑ BNG&METRO ETHERNET, SUPPORT BROADBAND & SUPPORT OPTICAL . \n"
                        + "Nα υπάρχει συνεχής παρακολούθηση στο ΝΤΤ SR.\n"
                        + "Eφόσον επιλυθεί το πρόβλημα και βρεθεί η πραγματική αιτία να γυρίσει σε IN-SERVICE και να κλείσει το NTT SR.");
                break;
            }

        return mySignature;
        }

    }
/*
3
Notes:  Παρατηρείται πρόβλημα στις υπηρεσίες  του DSLAM [CODE] in area: [ΕΠΙΣΚΟΠΗ]   by CCM-DILIGENT anomaly detection algorithm (CD-ADA).  Anomaly Signature_OTE hit: #3 Problem  Not Solved –  Composite detection
Notes:   Να γίνει έλεγχος  στο  εν λόγω  DSLAM η και  στην  γειτονική  περιοχή.  Θα χρειαστεί  επικοινωνία με ομάδα ΝΜC/NCC & Field που διαχειρίστηκε την βλάβη (ΝΤΤ SR:1-…)
5
Notes:  Παρατηρoύνται μειωμένα παράπονα  που αφορούν στις υπηρεσίες   του DSLAM [CODE] in area: [ΕΠΙΣΚΟΠΗ]   by CCM-DILIGENT anomaly detection algorithm (CD-ADA).  
Notes:   Να γίνει έλεγχος αν το πρόβλημα που αφορούσε το NTT SR:… [  1- XXXXXX] έχει επιλυθεί πλήρως.  Θα χρειαστεί  επικοινωνία με ομάδα ΝΜC/NCC & Field που διαχειρίστηκε το ΝΤΤ SR.
Νοte3: Anomaly Signature_OTE hit: #5 Customer Late reaction –  Composite detection
 */
