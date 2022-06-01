package ccm.OTE;

import super_repo.FAXInfoType;

public class PstnInfoFinder {

    public static PstnNumberInfo getAnumberInfo(String DN) {
        System.setProperty("sun.net.client.defaultConnectTimeout", "100");
        System.setProperty("sun.net.client.defaultReadTimeout", "100");

        if (DN != null && !DN.isEmpty() && DN.startsWith("2")) {
            System.out.println("CCM12: searchingPstnNumberInfo for " + DN);
            try {
                FAXInfoType myFAXInfoType = super_repo.FAXInfoFinder.get(DN);
                String BrasName = myFAXInfoType.getBrasName();
                String DslamCode = myFAXInfoType.getDslamCode();
                String DslamSlot = myFAXInfoType.getDslamSlot();
                PstnNumberInfo myPstnNumberInfo = new PstnNumberInfo(String.valueOf(DN.hashCode()));
                myPstnNumberInfo.setBrasname(BrasName);
                myPstnNumberInfo.setDslamcode(DslamCode);
                myPstnNumberInfo.setDslamslot(DslamSlot);
                //
                System.out.println("PstnNumberInfo for " + DN + " = " + BrasName + "/" + DslamCode + "/" + DslamSlot);
                return myPstnNumberInfo;
                /*
                System.out.println("getBrasSubSlot="+myFAXInfoType.getBrasSubSlot());
                System.out.println("getBrasPort="+myFAXInfoType.getBrasPort());
                System.out.println("getClassOfService="+myFAXInfoType.getClassOfService());
                System.out.println("getCpeInformation="+myFAXInfoType.getCpeInformation());     
                 */
            } catch (Exception e) {
                //e.printStackTrace(System.out);
                System.out.println("CCM12:cliResources:Exception " + e.toString());
                return null;
            }
        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.setProperty("http.proxyHost", "");
            System.setProperty("http.proxyPort", "");
            PstnNumberInfo myPstnNumberInfo = PstnInfoFinder.getAnumberInfo("2109493236");
            //
            System.out.println("All= =" + myPstnNumberInfo.getBrasname());
            System.out.println("All= =" + myPstnNumberInfo.getDslamcode());
            System.out.println("All= =" + myPstnNumberInfo.getDslamslot());
            //
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
