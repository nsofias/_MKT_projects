
package customerLineService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUSTOMERLINEIDMboQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERLINEIDMboQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERLINEID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTOMERLINEIDID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ENDTIME" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LINEID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}QueryClausePropertyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOMERLINEIDMboQueryType", propOrder = {
    "where",
    "customerlineid"
})
public class CUSTOMERLINEIDMboQueryType {

    @XmlElement(name = "WHERE")
    protected String where;
    @XmlElement(name = "CUSTOMERLINEID")
    protected CUSTOMERLINEIDMboQueryType.CUSTOMERLINEID customerlineid;
    @XmlAttribute(name = "orderby")
    protected String orderby;
    @XmlAttribute(name = "operandMode")
    protected OperandModeType operandMode;

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHERE() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHERE(String value) {
        this.where = value;
    }

    /**
     * Gets the value of the customerlineid property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERLINEIDMboQueryType.CUSTOMERLINEID }
     *     
     */
    public CUSTOMERLINEIDMboQueryType.CUSTOMERLINEID getCUSTOMERLINEID() {
        return customerlineid;
    }

    /**
     * Sets the value of the customerlineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERLINEIDMboQueryType.CUSTOMERLINEID }
     *     
     */
    public void setCUSTOMERLINEID(CUSTOMERLINEIDMboQueryType.CUSTOMERLINEID value) {
        this.customerlineid = value;
    }

    /**
     * Gets the value of the orderby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderby() {
        return orderby;
    }

    /**
     * Sets the value of the orderby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderby(String value) {
        this.orderby = value;
    }

    /**
     * Gets the value of the operandMode property.
     * 
     * @return
     *     possible object is
     *     {@link OperandModeType }
     *     
     */
    public OperandModeType getOperandMode() {
        if (operandMode == null) {
            return OperandModeType.AND;
        } else {
            return operandMode;
        }
    }

    /**
     * Sets the value of the operandMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperandModeType }
     *     
     */
    public void setOperandMode(OperandModeType value) {
        this.operandMode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CUSTOMERLINEIDID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ENDTIME" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LINEID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TICKETID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerlineidid",
        "description",
        "endtime",
        "lineid",
        "ticketid",
        "type",
        "changedate"
    })
    public static class CUSTOMERLINEID {

        @XmlElement(name = "CUSTOMERLINEIDID", nillable = true)
        protected List<MXLongQueryType> customerlineidid;
        @XmlElement(name = "DESCRIPTION")
        protected List<MXStringQueryType> description;
        @XmlElement(name = "ENDTIME", nillable = true)
        protected List<MXDateTimeQueryType> endtime;
        @XmlElement(name = "LINEID")
        protected List<MXStringQueryType> lineid;
        @XmlElement(name = "TICKETID")
        protected List<MXStringQueryType> ticketid;
        @XmlElement(name = "TYPE")
        protected List<MXStringQueryType> type;
        @XmlElement(name = "CHANGEDATE", nillable = true)
        protected List<MXDateTimeQueryType> changedate;

        /**
         * Gets the value of the customerlineidid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerlineidid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUSTOMERLINEIDID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getCUSTOMERLINEIDID() {
            if (customerlineidid == null) {
                customerlineidid = new ArrayList<MXLongQueryType>();
            }
            return this.customerlineidid;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDESCRIPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDESCRIPTION() {
            if (description == null) {
                description = new ArrayList<MXStringQueryType>();
            }
            return this.description;
        }

        /**
         * Gets the value of the endtime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getENDTIME() {
            if (endtime == null) {
                endtime = new ArrayList<MXDateTimeQueryType>();
            }
            return this.endtime;
        }

        /**
         * Gets the value of the lineid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLINEID() {
            if (lineid == null) {
                lineid = new ArrayList<MXStringQueryType>();
            }
            return this.lineid;
        }

        /**
         * Gets the value of the ticketid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTICKETID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTICKETID() {
            if (ticketid == null) {
                ticketid = new ArrayList<MXStringQueryType>();
            }
            return this.ticketid;
        }

        /**
         * Gets the value of the type property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the type property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTYPE() {
            if (type == null) {
                type = new ArrayList<MXStringQueryType>();
            }
            return this.type;
        }

        /**
         * Gets the value of the changedate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the changedate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHANGEDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getCHANGEDATE() {
            if (changedate == null) {
                changedate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.changedate;
        }

    }

}
