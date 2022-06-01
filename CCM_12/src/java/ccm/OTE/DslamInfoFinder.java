package ccm.OTE;

import nsofiasLib.others.Parameters;
import super_repo.FAXInfoType;
import super_repo.OTERepositoryPortType;
import super_repo.OTERepository_Impl;

public class DslamInfoFinder {

    public static PstnNumberInfo getDslamInfo(String DN) {
        System.setProperty("sun.net.client.defaultConnectTimeout", "100");
        System.setProperty("sun.net.client.defaultReadTimeout", "100");
        PstnNumberInfo myPstnNumberInfo = new PstnNumberInfo(DN);
        if (DN!=null && !DN.isEmpty())
        try {
            FAXInfoType myFAXInfoType;
            String trustStore = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "trustStore", "UTF8");
            String trustStorePassword = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "trustStorePassword", "UTF8");
            System.setProperty("javax.net.ssl.trustStore", System.getenv("APPLICATIONS_PATH") + "/common/" + trustStore);
            System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
            //System.out.println(trustStore);
            OTERepository_Impl oTERepository = new OTERepository_Impl();
            OTERepositoryPortType oTERepositoryPort = oTERepository.getOTERepositoryPort();
            myFAXInfoType = oTERepositoryPort.getFAXInfo(DN);
            String BrasName = myFAXInfoType.getBrasName();
            String DslamCode = myFAXInfoType.getDslamCode();
            String DslamSlot = myFAXInfoType.getDslamSlot();
            myPstnNumberInfo.setBrasname(BrasName);
            myPstnNumberInfo.setDslamcode(DslamCode);
            myPstnNumberInfo.setDslamslot(DslamSlot);
            /*
            System.out.println("getBrasSlot="+myFAXInfoType.getBrasSlot()+" / "+myFAXInfoType.getBrasSubSlot());
            System.out.println("getBrasSubSlot="+myFAXInfoType.getBrasSubSlot());
            System.out.println("getBrasPort="+myFAXInfoType.getBrasPort());
            System.out.println("getClassOfService="+myFAXInfoType.getClassOfService());
            System.out.println("getCpeInformation="+myFAXInfoType.getCpeInformation());
            */
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return myPstnNumberInfo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.setProperty("http.proxyHost", "");
            System.setProperty("http.proxyPort", "");
            PstnNumberInfo myPstnNumberInfo = DslamInfoFinder.getDslamInfo("2107623595");
            //
            System.out.println("All= =" + myPstnNumberInfo.getBrasname());
            System.out.println("All= =" + myPstnNumberInfo.getDslamcode());
            System.out.println("All= =" + myPstnNumberInfo.getDslamslot());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
