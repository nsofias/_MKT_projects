
package affected_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AFFECTEDSERVICEMboQueryType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AFFECTEDSERVICEMboQueryType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDSERVICE" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.ibm.com/maximo}QueryClausePropertyGroup"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFFECTEDSERVICEMboQueryType", propOrder = {
    "where",
    "affectedservice"
})
public class AFFECTEDSERVICEMboQueryType {

    @XmlElement(name = "WHERE")
    protected String where;
    @XmlElement(name = "AFFECTEDSERVICE")
    protected AFFECTEDSERVICEMboQueryType.AFFECTEDSERVICE affectedservice;
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
     * Gets the value of the affectedservice property.
     * 
     * @return
     *     possible object is
     *     {@link AFFECTEDSERVICEMboQueryType.AFFECTEDSERVICE }
     *     
     */
    public AFFECTEDSERVICEMboQueryType.AFFECTEDSERVICE getAFFECTEDSERVICE() {
        return affectedservice;
    }

    /**
     * Sets the value of the affectedservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFFECTEDSERVICEMboQueryType.AFFECTEDSERVICE }
     *     
     */
    public void setAFFECTEDSERVICE(AFFECTEDSERVICEMboQueryType.AFFECTEDSERVICE value) {
        this.affectedservice = value;
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
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedserviceid",
        "description",
        "cinum",
        "equipmenttype",
        "location",
        "numinternet",
        "numiptv",
        "numofimpactedcust",
        "numvoip",
        "numwlr",
        "numadsl",
        "region",
        "serviceinfault",
        "startdate",
        "enddate",
        "deleteflag",
        "sysstatus",
        "changedate",
        "ticketid",
        "onetmid"
    })
    public static class AFFECTEDSERVICE {

        @XmlElement(name = "AFFECTEDSERVICEID", nillable = true)
        protected List<MXLongQueryType> affectedserviceid;
        @XmlElement(name = "DESCRIPTION")
        protected List<MXStringQueryType> description;
        @XmlElement(name = "CINUM")
        protected List<MXStringQueryType> cinum;
        @XmlElement(name = "EQUIPMENTTYPE")
        protected List<MXStringQueryType> equipmenttype;
        @XmlElement(name = "LOCATION")
        protected List<MXStringQueryType> location;
        @XmlElement(name = "NUMINTERNET", nillable = true)
        protected List<MXLongQueryType> numinternet;
        @XmlElement(name = "NUMIPTV", nillable = true)
        protected List<MXLongQueryType> numiptv;
        @XmlElement(name = "NUMOFIMPACTEDCUST", nillable = true)
        protected List<MXLongQueryType> numofimpactedcust;
        @XmlElement(name = "NUMVOIP", nillable = true)
        protected List<MXLongQueryType> numvoip;
        @XmlElement(name = "NUMWLR", nillable = true)
        protected List<MXLongQueryType> numwlr;
        @XmlElement(name = "NUMADSL", nillable = true)
        protected List<MXLongQueryType> numadsl;
        @XmlElement(name = "REGION")
        protected List<MXStringQueryType> region;
        @XmlElement(name = "SERVICEINFAULT")
        protected List<MXStringQueryType> serviceinfault;
        @XmlElement(name = "STARTDATE", nillable = true)
        protected List<MXDateTimeQueryType> startdate;
        @XmlElement(name = "ENDDATE", nillable = true)
        protected List<MXDateTimeQueryType> enddate;
        @XmlElement(name = "DELETEFLAG")
        protected List<MXBooleanQueryType> deleteflag;
        @XmlElement(name = "SYSSTATUS")
        protected List<MXStringQueryType> sysstatus;
        @XmlElement(name = "CHANGEDATE", nillable = true)
        protected List<MXDateTimeQueryType> changedate;
        @XmlElement(name = "TICKETID")
        protected List<MXStringQueryType> ticketid;
        @XmlElement(name = "ONETMID")
        protected List<MXStringQueryType> onetmid;

        /**
         * Gets the value of the affectedserviceid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the affectedserviceid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getAFFECTEDSERVICEID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getAFFECTEDSERVICEID() {
            if (affectedserviceid == null) {
                affectedserviceid = new ArrayList<MXLongQueryType>();
            }
            return this.affectedserviceid;
        }

        /**
         * Gets the value of the description property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the description property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDESCRIPTION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
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
         * Gets the value of the cinum property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the cinum property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCINUM().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCINUM() {
            if (cinum == null) {
                cinum = new ArrayList<MXStringQueryType>();
            }
            return this.cinum;
        }

        /**
         * Gets the value of the equipmenttype property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the equipmenttype property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getEQUIPMENTTYPE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getEQUIPMENTTYPE() {
            if (equipmenttype == null) {
                equipmenttype = new ArrayList<MXStringQueryType>();
            }
            return this.equipmenttype;
        }

        /**
         * Gets the value of the location property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the location property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getLOCATION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLOCATION() {
            if (location == null) {
                location = new ArrayList<MXStringQueryType>();
            }
            return this.location;
        }

        /**
         * Gets the value of the numinternet property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numinternet property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getNUMINTERNET().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getNUMINTERNET() {
            if (numinternet == null) {
                numinternet = new ArrayList<MXLongQueryType>();
            }
            return this.numinternet;
        }

        /**
         * Gets the value of the numiptv property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numiptv property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getNUMIPTV().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getNUMIPTV() {
            if (numiptv == null) {
                numiptv = new ArrayList<MXLongQueryType>();
            }
            return this.numiptv;
        }

        /**
         * Gets the value of the numofimpactedcust property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numofimpactedcust property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getNUMOFIMPACTEDCUST().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getNUMOFIMPACTEDCUST() {
            if (numofimpactedcust == null) {
                numofimpactedcust = new ArrayList<MXLongQueryType>();
            }
            return this.numofimpactedcust;
        }

        /**
         * Gets the value of the numvoip property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numvoip property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getNUMVOIP().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getNUMVOIP() {
            if (numvoip == null) {
                numvoip = new ArrayList<MXLongQueryType>();
            }
            return this.numvoip;
        }

        /**
         * Gets the value of the numwlr property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numwlr property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getNUMWLR().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getNUMWLR() {
            if (numwlr == null) {
                numwlr = new ArrayList<MXLongQueryType>();
            }
            return this.numwlr;
        }

        /**
         * Gets the value of the numadsl property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numadsl property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getNUMADSL().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getNUMADSL() {
            if (numadsl == null) {
                numadsl = new ArrayList<MXLongQueryType>();
            }
            return this.numadsl;
        }

        /**
         * Gets the value of the region property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the region property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREGION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREGION() {
            if (region == null) {
                region = new ArrayList<MXStringQueryType>();
            }
            return this.region;
        }

        /**
         * Gets the value of the serviceinfault property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the serviceinfault property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSERVICEINFAULT().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSERVICEINFAULT() {
            if (serviceinfault == null) {
                serviceinfault = new ArrayList<MXStringQueryType>();
            }
            return this.serviceinfault;
        }

        /**
         * Gets the value of the startdate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the startdate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSTARTDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getSTARTDATE() {
            if (startdate == null) {
                startdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.startdate;
        }

        /**
         * Gets the value of the enddate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the enddate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getENDDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getENDDATE() {
            if (enddate == null) {
                enddate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.enddate;
        }

        /**
         * Gets the value of the deleteflag property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the deleteflag property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDELETEFLAG().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getDELETEFLAG() {
            if (deleteflag == null) {
                deleteflag = new ArrayList<MXBooleanQueryType>();
            }
            return this.deleteflag;
        }

        /**
         * Gets the value of the sysstatus property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sysstatus property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSYSSTATUS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSYSSTATUS() {
            if (sysstatus == null) {
                sysstatus = new ArrayList<MXStringQueryType>();
            }
            return this.sysstatus;
        }

        /**
         * Gets the value of the changedate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the changedate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCHANGEDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
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

        /**
         * Gets the value of the ticketid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ticketid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTICKETID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
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
         * Gets the value of the onetmid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the onetmid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getONETMID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getONETMID() {
            if (onetmid == null) {
                onetmid = new ArrayList<MXStringQueryType>();
            }
            return this.onetmid;
        }

    }

}
