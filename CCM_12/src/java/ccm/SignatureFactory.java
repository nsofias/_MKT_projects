/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import nsofiasLib.others.Helpme;
import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author nsofias
 */
public class SignatureFactory {

    public static Signature createSignature(String label) throws IOException {
        String filename = System.getenv("APPLICATIONS_PATH") + "/ccm/conf/signatures.yml";
        List<Signature> l = Helpme.getObjectsListFromYAML(filename, "SIGNATURES", Signature[].class);
        Optional<Signature> sig = l.stream().filter(s -> s.getLabel().equals(label)).findAny();
        if (sig.isPresent()) {
            Signature mySignature = sig.get();
            mySignature.setCreationTimeStamp(new TimeStamp1().getNowUnformated());
            return mySignature;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Signature l = SignatureFactory.createSignature("SIGNATURE_6");
            System.out.println("CCM12:SignatureFactory_MKT:"+l);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
