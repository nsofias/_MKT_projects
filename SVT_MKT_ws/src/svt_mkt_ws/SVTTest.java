package svt_mkt_ws;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/**
 *
 * @author gsofi
 */
public class SVTTest {

    private String name;
    private String description;
    private String startDateTime;
    private String endDateTime;
    private String id;
    private String mode;
    private String state;
    private ServiceTestCharacteristic[] serviceTestCharacteristic;
    private final RelatedService relatedService;
    private final RelatedServiceTestSpecification relatedServiceTestSpecification;

    public SVTTest() {
        this.relatedService = new RelatedService();
        this.relatedServiceTestSpecification = new RelatedServiceTestSpecification();
    }

    @Override
    public String toString() {
        return "SVTTest{" + "name=" + name + ", description=" + description + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime + ", id=" + id + ", mode=" + mode + ", state=" + state + ", serviceTestCharacteristic=" + Arrays.toString(serviceTestCharacteristic) + ", relatedService=" + relatedService + ", relatedServiceTestSpecification=" + relatedServiceTestSpecification + '}';
    }



    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the startDateTime
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * @param startDateTime the startDateTime to set
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * @return the endDateTime
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * @param endDateTime the endDateTime to set
     */
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the myServiceTestCharacteristic
     */
    public ServiceTestCharacteristic[] getMyServiceTestCharacteristic() {
        return serviceTestCharacteristic;
    }

    /**
     * @param myServiceTestCharacteristic the myServiceTestCharacteristic to set
     */
    public void setMyServiceTestCharacteristic(ServiceTestCharacteristic[] myServiceTestCharacteristic) {
        this.serviceTestCharacteristic = myServiceTestCharacteristic;
    }

    public static void main(String[] args) {
        //String[] a = new String[]{"1",\n"2",\nnull};
        //String[] b = new String[10];
        //System.out.println(b[2]);
/*
        SVTTest mySVTTest = new Gson().fromJson(s, SVTTest.class);
        System.out.println(mySVTTest);
        ServiceTestCharacteristic[] myServiceTestCharacteristiclist = mySVTTest.getMyServiceTestCharacteristic();
        System.out.println(Arrays.asList(myServiceTestCharacteristiclist));
        Map<String, String> myServiceTestCharacteristicMap
                = Arrays.asList(myServiceTestCharacteristiclist)
                        .stream()
                        .collect(Collectors.toMap(v -> v.getName(), v -> v.getValue()));
        System.out.println(Arrays.asList(myServiceTestCharacteristicMap));*/
    }
}

class RelatedService {

    public String href="/tmf-api/serviceManagement/v3/service/2";
    public String id="2";
    public String name="iptvService";
}

class RelatedServiceTestSpecification {
    public String href="https://mycsp.com:8080/tmf- api/serviceTestManagement/v3/serviceTestSpecification/4";
    public String id="4";
    @SerializedName(value = "@referredType")
    public String referredType ="GetTVAccountStatus";
    
}
