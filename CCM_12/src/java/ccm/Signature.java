/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

/**
 *
 * @author nsofias
 */
public class Signature {

    private String label;
    private String synopsis;
    private String creationTimeStamp;
    private String priority;
    private int minutesToManage = -1;// -1 = never
    private int minutesToAutoClose = -1;// -1 = never 

    @Override
    public String toString() {
        return "Signature{" + "label=" + label + ", synopsis=" + synopsis + ", creationTimeStamp=" + creationTimeStamp + ", priority=" + priority + ", minutesToManage=" + minutesToManage + ", minutesToAutoClose=" + minutesToAutoClose + '}';
    }


    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the synopsis
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * @param synopsis the synopsis to set
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * @return the creationTimeStamp
     */
    public String getCreationTimeStamp() {
        return creationTimeStamp;
    }

    /**
     * @param creationTimeStamp the creationTimeStamp to set
     */
    public void setCreationTimeStamp(String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * @return the minutesToManage
     */
    public int getMinutesToManage() {
        return minutesToManage;
    }

    /**
     * @param minutesToManage the minutesToManage to set
     */
    public void setMinutesToManage(int minutesToManage) {
        this.minutesToManage = minutesToManage;
    }

    /**
     * @return the minutesToAutoClose
     */
    public int getMinutesToAutoClose() {
        return minutesToAutoClose;
    }

    /**
     * @param minutesToAutoClose the minutesToAutoClose to set
     */
    public void setMinutesToAutoClose(int minutesToAutoClose) {
        this.minutesToAutoClose = minutesToAutoClose;
    }

    public Signature(String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

}
