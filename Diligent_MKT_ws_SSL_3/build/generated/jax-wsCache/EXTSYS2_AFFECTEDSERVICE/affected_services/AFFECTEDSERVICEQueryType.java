
package affected_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFFECTEDSERVICEQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFFECTEDSERVICEQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AFFECTEDSERVICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}QueryClausePropertyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFFECTEDSERVICEQueryType", propOrder = {
    "where",
    "affectedservice"
})
public class AFFECTEDSERVICEQueryType {

    @XmlElement(name = "WHERE")
    protected String where;
    @XmlElement(name = "AFFECTEDSERVICE")
    protected AFFECTEDSERVICEQueryType.AFFECTEDSERVICE affectedservice;
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
     *     {@link AFFECTEDSERVICEQueryType.AFFECTEDSERVICE }
     *     
     */
    public AFFECTEDSERVICEQueryType.AFFECTEDSERVICE getAFFECTEDSERVICE() {
        return affectedservice;
    }

    /**
     * Sets the value of the affectedservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFFECTEDSERVICEQueryType.AFFECTEDSERVICE }
     *     
     */
    public void setAFFECTEDSERVICE(AFFECTEDSERVICEQueryType.AFFECTEDSERVICE value) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "affectedserviceid",
        "cinum",
        "deleteflag",
        "description",
        "enddate",
        "equipmenttype",
        "location",
        "numadsl",
        "numinternet",
        "numiptv",
        "numofimpactedcust",
        "numvoip",
        "numwlr",
        "onetmid",
        "region",
        "serviceinfault",
        "startdate",
        "sysstatus",
        "ticketid"
    })
    public static class AFFECTEDSERVICE {

        @XmlElement(name = "AFFECTEDSERVICEID", nillable = true)
        protected List<MXLongQueryType> affectedserviceid;
        @XmlElement(name = "CINUM")
        protected List<MXStringQueryType> cinum;
        @XmlElement(name = "DELETEFLAG")
        protected List<MXBooleanQueryType> deleteflag;
        @XmlElement(name = "DESCRIPTION")
        protected List<MXStringQueryType> description;
        @XmlElement(name = "ENDDATE", nillable = true)
        protected List<MXDateTimeQueryType> enddate;
        @XmlElement(name = "EQUIPMENTTYPE")
        protected List<MXStringQueryType> equipmenttype;
        @XmlElement(name = "LOCATION")
        protected List<MXStringQueryType> location;
        @XmlElement(name = "NUMADSL", nillable = true)
        protected List<MXLongQueryType> numadsl;
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
        @XmlElement(name = "ONETMID")
        protected List<MXStringQueryType> onetmid;
        @XmlElement(name = "REGION")
        protected List<MXStringQueryType> region;
        @XmlElement(name = "SERVICEINFAULT")
        protected List<MXStringQueryType> serviceinfault;
        @XmlElement(name = "STARTDATE", nillable = true)
        protected List<MXDateTimeQueryType> startdate;
        @XmlElement(name = "SYSSTATUS")
        protected List<MXStringQueryType> sysstatus;
        @XmlElement(name = "TICKETID")
        protected List<MXStringQueryType> ticketid;

        /**
         * Gets the value of the affectedserviceid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedserviceid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAFFECTEDSERVICEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the cinum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cinum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCINUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the deleteflag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deleteflag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDELETEFLAG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the enddate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enddate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the equipmenttype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the equipmenttype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEQUIPMENTTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOCATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the numadsl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numadsl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNUMADSL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the numinternet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numinternet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNUMINTERNET().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numiptv property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNUMIPTV().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numofimpactedcust property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNUMOFIMPACTEDCUST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numvoip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNUMVOIP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numwlr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNUMWLR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the onetmid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the onetmid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getONETMID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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

        /**
         * Gets the value of the region property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the region property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREGION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceinfault property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSERVICEINFAULT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the startdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTARTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the sysstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sysstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSYSSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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

    }

}
