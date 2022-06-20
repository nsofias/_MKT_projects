package svt_mkt_ws;

/**
 *
 * @author gsofi
 */
public class ServiceTestCharacteristic {

    private String name;
    private String value;

    @Override
    public String toString() {
        return "SVTTest{" + "name=" + getName() + ", value=" + getValue() + '}';
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
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
