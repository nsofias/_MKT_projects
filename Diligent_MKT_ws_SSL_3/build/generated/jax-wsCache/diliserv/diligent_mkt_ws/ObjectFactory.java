
package diligent_mkt_ws;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the diligent_mkt_ws package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenericFault_QNAME = new QName("diligent.services.all", "GenericFault");
    private final static QName _BulletinSearchCurrent_QNAME = new QName("diligent.services.all", "Bulletin_search_current");
    private final static QName _BulletinSearchCurrentSimple_QNAME = new QName("diligent.services.all", "Bulletin_search_current_simple");
    private final static QName _BulletinSearchFuture_QNAME = new QName("diligent.services.all", "Bulletin_search_future");
    private final static QName _AFFECTEDSERVICE_QNAME = new QName("diligent.services.all", "AFFECTEDSERVICE");
    private final static QName _ANNOUNCEMENTSALLSIMPLE_QNAME = new QName("diligent.services.all", "ANNOUNCEMENTS_ALL_SIMPLE");
    private final static QName _LINEIDSRESULT_QNAME = new QName("diligent.services.all", "LINEIDSRESULT");
    private final static QName _CinumsAll_QNAME = new QName("diligent.services.all", "cinums_all");
    private final static QName _CinumsDetailsAll_QNAME = new QName("diligent.services.all", "cinums_details_all");
    private final static QName _StringArray_QNAME = new QName("diligent.services.all", "stringArray");
    private final static QName _BulletinSearch_QNAME = new QName("diligent.services.all", "Bulletin_search");
    private final static QName _BulletinSearchSimple_QNAME = new QName("diligent.services.all", "Bulletin_search_simple");
    private final static QName _QueryTT_QNAME = new QName("diligent.services.all", "Query_TT");
    private final static QName _CinumsAllArray_QNAME = new QName("diligent.services.all", "cinums_allArray");
    private final static QName _AFFECTEDSERVICEArray_QNAME = new QName("diligent.services.all", "AFFECTEDSERVICEArray");
    private final static QName _CinumsDetailsAllArray_QNAME = new QName("diligent.services.all", "cinums_details_allArray");
    private final static QName _BulletinSearchCurrentSimpleResponse_QNAME = new QName("diligent.services.all", "Bulletin_search_current_simpleResponse");
    private final static QName _BulletinSearchSimpleResponse_QNAME = new QName("diligent.services.all", "Bulletin_search_simpleResponse");
    private final static QName _GetDyingGaspCount_QNAME = new QName("diligent.services.all", "get_DyingGasp_count");
    private final static QName _GetDyingGaspCountResponse_QNAME = new QName("diligent.services.all", "get_DyingGasp_countResponse");
    private final static QName _ANNOUNCEMENTS_QNAME = new QName("diligent.services.all", "ANNOUNCEMENTS");
    private final static QName _INCIDENT_QNAME = new QName("diligent.services.all", "INCIDENT");
    private final static QName _ANNOUNCEMENTSArray_QNAME = new QName("diligent.services.all", "ANNOUNCEMENTSArray");
    private final static QName _INCIDENTArray_QNAME = new QName("diligent.services.all", "INCIDENTArray");
    private final static QName _ANNOUNCEMENTSALL_QNAME = new QName("diligent.services.all", "ANNOUNCEMENTS_ALL");
    private final static QName _INCIDENTSALL_QNAME = new QName("diligent.services.all", "INCIDENTS_ALL");
    private final static QName _BulletinSearchResponse_QNAME = new QName("diligent.services.all", "Bulletin_searchResponse");
    private final static QName _BulletinSearchCurrentResponse_QNAME = new QName("diligent.services.all", "Bulletin_search_currentResponse");
    private final static QName _BulletinSearchFutureResponse_QNAME = new QName("diligent.services.all", "Bulletin_search_futureResponse");
    private final static QName _QueryTTResponse_QNAME = new QName("diligent.services.all", "Query_TTResponse");
    private final static QName _QueryTTResponseQueryTTResult_QNAME = new QName("diligent.services.all", "Query_TTResult");
    private final static QName _BulletinSearchFutureResponseBulletinSearchFutureResult_QNAME = new QName("diligent.services.all", "Bulletin_search_futureResult");
    private final static QName _BulletinSearchCurrentResponseBulletinSearchCurrentResult_QNAME = new QName("diligent.services.all", "Bulletin_search_currentResult");
    private final static QName _BulletinSearchResponseBulletinSearchResult_QNAME = new QName("diligent.services.all", "Bulletin_searchResult");
    private final static QName _INCIDENTSALLINCIDENTS_QNAME = new QName("diligent.services.all", "INCIDENTS");
    private final static QName _ANNOUNCEMENTSALLRECORDS_QNAME = new QName("diligent.services.all", "RECORDS");
    private final static QName _INCIDENTACTUALCONTACTDATE_QNAME = new QName("diligent.services.all", "ACTUALCONTACTDATE");
    private final static QName _INCIDENTACTUALFINISH_QNAME = new QName("diligent.services.all", "ACTUALFINISH");
    private final static QName _INCIDENTAFFECTEDDATE_QNAME = new QName("diligent.services.all", "AFFECTEDDATE");
    private final static QName _INCIDENTASSIGNEDOWNERGROUP_QNAME = new QName("diligent.services.all", "ASSIGNEDOWNERGROUP");
    private final static QName _INCIDENTCABLEGROUP_QNAME = new QName("diligent.services.all", "CABLEGROUP");
    private final static QName _INCIDENTCENTRALA_QNAME = new QName("diligent.services.all", "CENTRALA");
    private final static QName _INCIDENTCINUM_QNAME = new QName("diligent.services.all", "CINUM");
    private final static QName _INCIDENTCLASS_QNAME = new QName("diligent.services.all", "CLASS");
    private final static QName _INCIDENTCLASSIFICATIONID_QNAME = new QName("diligent.services.all", "CLASSIFICATIONID");
    private final static QName _INCIDENTCLASSSTRUCTUREID_QNAME = new QName("diligent.services.all", "CLASSSTRUCTUREID");
    private final static QName _INCIDENTDESCRIPTION_QNAME = new QName("diligent.services.all", "DESCRIPTION");
    private final static QName _INCIDENTDESCRIPTIONLONGDESCRIPTION_QNAME = new QName("diligent.services.all", "DESCRIPTION_LONGDESCRIPTION");
    private final static QName _INCIDENTDEVICENAME_QNAME = new QName("diligent.services.all", "DEVICENAME");
    private final static QName _INCIDENTEXTERNALSYSTEM_QNAME = new QName("diligent.services.all", "EXTERNALSYSTEM");
    private final static QName _INCIDENTFAULTCAUSE_QNAME = new QName("diligent.services.all", "FAULTCAUSE");
    private final static QName _INCIDENTFAULTLOCATION_QNAME = new QName("diligent.services.all", "FAULTLOCATION");
    private final static QName _INCIDENTHISTORYFLAG_QNAME = new QName("diligent.services.all", "HISTORYFLAG");
    private final static QName _INCIDENTIMPACT_QNAME = new QName("diligent.services.all", "IMPACT");
    private final static QName _INCIDENTINDICATEDPRIORITY_QNAME = new QName("diligent.services.all", "INDICATEDPRIORITY");
    private final static QName _INCIDENTINTERNALPRIORITY_QNAME = new QName("diligent.services.all", "INTERNALPRIORITY");
    private final static QName _INCIDENTISGLOBAL_QNAME = new QName("diligent.services.all", "ISGLOBAL");
    private final static QName _INCIDENTKABEL_QNAME = new QName("diligent.services.all", "KABEL");
    private final static QName _INCIDENTKATEGORIJA_QNAME = new QName("diligent.services.all", "KATEGORIJA");
    private final static QName _INCIDENTLINEID_QNAME = new QName("diligent.services.all", "LINEID");
    private final static QName _INCIDENTLINISKAOPREMA_QNAME = new QName("diligent.services.all", "LINISKAOPREMA");
    private final static QName _INCIDENTLOCATION_QNAME = new QName("diligent.services.all", "LOCATION");
    private final static QName _INCIDENTNUMBEROFAFFECTEDCUSTOMERS_QNAME = new QName("diligent.services.all", "NUMBEROFAFFECTEDCUSTOMERS");
    private final static QName _INCIDENTORIGINATEDCOMPANY_QNAME = new QName("diligent.services.all", "ORIGINATEDCOMPANY");
    private final static QName _INCIDENTORIGINATEDDEVICE_QNAME = new QName("diligent.services.all", "ORIGINATEDDEVICE");
    private final static QName _INCIDENTOWNER_QNAME = new QName("diligent.services.all", "OWNER");
    private final static QName _INCIDENTOWNERGROUP_QNAME = new QName("diligent.services.all", "OWNERGROUP");
    private final static QName _INCIDENTPAKET_QNAME = new QName("diligent.services.all", "PAKET");
    private final static QName _INCIDENTPRECKAID_QNAME = new QName("diligent.services.all", "PRECKAID");
    private final static QName _INCIDENTREASON_QNAME = new QName("diligent.services.all", "REASON");
    private final static QName _INCIDENTREGIONNAME_QNAME = new QName("diligent.services.all", "REGIONNAME");
    private final static QName _INCIDENTRELATEDTOGLOBAL_QNAME = new QName("diligent.services.all", "RELATEDTOGLOBAL");
    private final static QName _INCIDENTREPORTDATE_QNAME = new QName("diligent.services.all", "REPORTDATE");
    private final static QName _INCIDENTREPORTEDBY_QNAME = new QName("diligent.services.all", "REPORTEDBY");
    private final static QName _INCIDENTREPORTEDPRIORITY_QNAME = new QName("diligent.services.all", "REPORTEDPRIORITY");
    private final static QName _INCIDENTRESOLVEDBY_QNAME = new QName("diligent.services.all", "RESOLVEDBY");
    private final static QName _INCIDENTRESOLVER_QNAME = new QName("diligent.services.all", "RESOLVER");
    private final static QName _INCIDENTROOTCAUSE_QNAME = new QName("diligent.services.all", "ROOTCAUSE");
    private final static QName _INCIDENTSERVICESINFAULT_QNAME = new QName("diligent.services.all", "SERVICESINFAULT");
    private final static QName _INCIDENTSLATIPSERVIS_QNAME = new QName("diligent.services.all", "SLATIPSERVIS");
    private final static QName _INCIDENTSOLUTION_QNAME = new QName("diligent.services.all", "SOLUTION");
    private final static QName _INCIDENTSTATUS_QNAME = new QName("diligent.services.all", "STATUS");
    private final static QName _INCIDENTSTATUSDATE_QNAME = new QName("diligent.services.all", "STATUSDATE");
    private final static QName _INCIDENTTARGETCONTACTDATE_QNAME = new QName("diligent.services.all", "TARGETCONTACTDATE");
    private final static QName _INCIDENTTARGETFINISH_QNAME = new QName("diligent.services.all", "TARGETFINISH");
    private final static QName _INCIDENTTICKETID_QNAME = new QName("diligent.services.all", "TICKETID");
    private final static QName _INCIDENTTICKETUID_QNAME = new QName("diligent.services.all", "TICKETUID");
    private final static QName _INCIDENTTIPPREKIN_QNAME = new QName("diligent.services.all", "TIPPREKIN");
    private final static QName _INCIDENTTKTYPE_QNAME = new QName("diligent.services.all", "TKTYPE");
    private final static QName _INCIDENTURGENCY_QNAME = new QName("diligent.services.all", "URGENCY");
    private final static QName _INCIDENTWAYOFREPAIR_QNAME = new QName("diligent.services.all", "WAYOFREPAIR");
    private final static QName _INCIDENTWOCATALOG_QNAME = new QName("diligent.services.all", "WOCATALOG");
    private final static QName _INCIDENTWORKAROUND_QNAME = new QName("diligent.services.all", "WORKAROUND");
    private final static QName _INCIDENTWORKAROUNDDESC_QNAME = new QName("diligent.services.all", "WORKAROUNDDESC");
    private final static QName _INCIDENTAFFECTEDSERVICE_QNAME = new QName("diligent.services.all", "AFFECTED_SERVICE");
    private final static QName _ANNOUNCEMENTSBulletinid_QNAME = new QName("diligent.services.all", "bulletinid");
    private final static QName _ANNOUNCEMENTSStartdate_QNAME = new QName("diligent.services.all", "startdate");
    private final static QName _ANNOUNCEMENTSEnddate_QNAME = new QName("diligent.services.all", "enddate");
    private final static QName _ANNOUNCEMENTSDescription_QNAME = new QName("diligent.services.all", "description");
    private final static QName _ANNOUNCEMENTSMessage_QNAME = new QName("diligent.services.all", "message");
    private final static QName _ANNOUNCEMENTSNumbus_QNAME = new QName("diligent.services.all", "numbus");
    private final static QName _ANNOUNCEMENTSNumresidential_QNAME = new QName("diligent.services.all", "numresidential");
    private final static QName _ANNOUNCEMENTSPostby_QNAME = new QName("diligent.services.all", "postby");
    private final static QName _ANNOUNCEMENTSSubject_QNAME = new QName("diligent.services.all", "subject");
    private final static QName _ANNOUNCEMENTSCinumDetails_QNAME = new QName("diligent.services.all", "cinum_details");
    private final static QName _ANNOUNCEMENTSCinums_QNAME = new QName("diligent.services.all", "cinums");
    private final static QName _GetDyingGaspCountResponseGetDyingGaspCountResult_QNAME = new QName("diligent.services.all", "get_DyingGasp_countResult");
    private final static QName _GetDyingGaspCountLineids_QNAME = new QName("diligent.services.all", "lineids");
    private final static QName _BulletinSearchSimpleResponseBulletinSearchSimpleResult_QNAME = new QName("diligent.services.all", "Bulletin_search_simpleResult");
    private final static QName _BulletinSearchCurrentSimpleResponseBulletinSearchCurrentSimpleResult_QNAME = new QName("diligent.services.all", "Bulletin_search_current_simpleResult");
    private final static QName _QueryTTTicket_QNAME = new QName("diligent.services.all", "ticket");
    private final static QName _QueryTTCinum_QNAME = new QName("diligent.services.all", "cinum");
    private final static QName _CinumsDetailsAllServiceinfault_QNAME = new QName("diligent.services.all", "serviceinfault");
    private final static QName _CinumsDetailsAllTypeimpact_QNAME = new QName("diligent.services.all", "typeimpact");
    private final static QName _CinumsDetailsAllString1_QNAME = new QName("diligent.services.all", "string1");
    private final static QName _LINEIDSRESULTRESULT_QNAME = new QName("diligent.services.all", "RESULT");
    private final static QName _AFFECTEDSERVICEAFFECTEDSERVICEID_QNAME = new QName("diligent.services.all", "AFFECTEDSERVICEID");
    private final static QName _AFFECTEDSERVICESTARTDATE_QNAME = new QName("diligent.services.all", "STARTDATE");
    private final static QName _AFFECTEDSERVICEENDDATE_QNAME = new QName("diligent.services.all", "ENDDATE");
    private final static QName _AFFECTEDSERVICEEQUIPMENTTYPE_QNAME = new QName("diligent.services.all", "EQUIPMENTTYPE");
    private final static QName _AFFECTEDSERVICENUMADSL_QNAME = new QName("diligent.services.all", "NUMADSL");
    private final static QName _AFFECTEDSERVICENUMINTERNET_QNAME = new QName("diligent.services.all", "NUMINTERNET");
    private final static QName _AFFECTEDSERVICENUMIPTV_QNAME = new QName("diligent.services.all", "NUMIPTV");
    private final static QName _AFFECTEDSERVICENUMOFIMPACTEDCUST_QNAME = new QName("diligent.services.all", "NUMOFIMPACTEDCUST");
    private final static QName _AFFECTEDSERVICENUMVOIP_QNAME = new QName("diligent.services.all", "NUMVOIP");
    private final static QName _AFFECTEDSERVICENUMWLR_QNAME = new QName("diligent.services.all", "NUMWLR");
    private final static QName _AFFECTEDSERVICEREGION_QNAME = new QName("diligent.services.all", "REGION");
    private final static QName _AFFECTEDSERVICESERVICEINFAULT_QNAME = new QName("diligent.services.all", "SERVICEINFAULT");
    private final static QName _AFFECTEDSERVICESYSSTATUS_QNAME = new QName("diligent.services.all", "SYSSTATUS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: diligent_mkt_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenericFault }
     * 
     */
    public GenericFault createGenericFault() {
        return new GenericFault();
    }

    /**
     * Create an instance of {@link BulletinSearchCurrent }
     * 
     */
    public BulletinSearchCurrent createBulletinSearchCurrent() {
        return new BulletinSearchCurrent();
    }

    /**
     * Create an instance of {@link BulletinSearchCurrentSimple }
     * 
     */
    public BulletinSearchCurrentSimple createBulletinSearchCurrentSimple() {
        return new BulletinSearchCurrentSimple();
    }

    /**
     * Create an instance of {@link BulletinSearchFuture }
     * 
     */
    public BulletinSearchFuture createBulletinSearchFuture() {
        return new BulletinSearchFuture();
    }

    /**
     * Create an instance of {@link AFFECTEDSERVICE }
     * 
     */
    public AFFECTEDSERVICE createAFFECTEDSERVICE() {
        return new AFFECTEDSERVICE();
    }

    /**
     * Create an instance of {@link ANNOUNCEMENTSALLSIMPLE }
     * 
     */
    public ANNOUNCEMENTSALLSIMPLE createANNOUNCEMENTSALLSIMPLE() {
        return new ANNOUNCEMENTSALLSIMPLE();
    }

    /**
     * Create an instance of {@link LINEIDSRESULT }
     * 
     */
    public LINEIDSRESULT createLINEIDSRESULT() {
        return new LINEIDSRESULT();
    }

    /**
     * Create an instance of {@link CinumsAll }
     * 
     */
    public CinumsAll createCinumsAll() {
        return new CinumsAll();
    }

    /**
     * Create an instance of {@link CinumsDetailsAll }
     * 
     */
    public CinumsDetailsAll createCinumsDetailsAll() {
        return new CinumsDetailsAll();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link BulletinSearch }
     * 
     */
    public BulletinSearch createBulletinSearch() {
        return new BulletinSearch();
    }

    /**
     * Create an instance of {@link BulletinSearchSimple }
     * 
     */
    public BulletinSearchSimple createBulletinSearchSimple() {
        return new BulletinSearchSimple();
    }

    /**
     * Create an instance of {@link QueryTT }
     * 
     */
    public QueryTT createQueryTT() {
        return new QueryTT();
    }

    /**
     * Create an instance of {@link CinumsAllArray }
     * 
     */
    public CinumsAllArray createCinumsAllArray() {
        return new CinumsAllArray();
    }

    /**
     * Create an instance of {@link AFFECTEDSERVICEArray }
     * 
     */
    public AFFECTEDSERVICEArray createAFFECTEDSERVICEArray() {
        return new AFFECTEDSERVICEArray();
    }

    /**
     * Create an instance of {@link CinumsDetailsAllArray }
     * 
     */
    public CinumsDetailsAllArray createCinumsDetailsAllArray() {
        return new CinumsDetailsAllArray();
    }

    /**
     * Create an instance of {@link BulletinSearchCurrentSimpleResponse }
     * 
     */
    public BulletinSearchCurrentSimpleResponse createBulletinSearchCurrentSimpleResponse() {
        return new BulletinSearchCurrentSimpleResponse();
    }

    /**
     * Create an instance of {@link BulletinSearchSimpleResponse }
     * 
     */
    public BulletinSearchSimpleResponse createBulletinSearchSimpleResponse() {
        return new BulletinSearchSimpleResponse();
    }

    /**
     * Create an instance of {@link GetDyingGaspCount }
     * 
     */
    public GetDyingGaspCount createGetDyingGaspCount() {
        return new GetDyingGaspCount();
    }

    /**
     * Create an instance of {@link GetDyingGaspCountResponse }
     * 
     */
    public GetDyingGaspCountResponse createGetDyingGaspCountResponse() {
        return new GetDyingGaspCountResponse();
    }

    /**
     * Create an instance of {@link ANNOUNCEMENTS }
     * 
     */
    public ANNOUNCEMENTS createANNOUNCEMENTS() {
        return new ANNOUNCEMENTS();
    }

    /**
     * Create an instance of {@link INCIDENT }
     * 
     */
    public INCIDENT createINCIDENT() {
        return new INCIDENT();
    }

    /**
     * Create an instance of {@link ANNOUNCEMENTSArray }
     * 
     */
    public ANNOUNCEMENTSArray createANNOUNCEMENTSArray() {
        return new ANNOUNCEMENTSArray();
    }

    /**
     * Create an instance of {@link INCIDENTArray }
     * 
     */
    public INCIDENTArray createINCIDENTArray() {
        return new INCIDENTArray();
    }

    /**
     * Create an instance of {@link ANNOUNCEMENTSALL }
     * 
     */
    public ANNOUNCEMENTSALL createANNOUNCEMENTSALL() {
        return new ANNOUNCEMENTSALL();
    }

    /**
     * Create an instance of {@link INCIDENTSALL }
     * 
     */
    public INCIDENTSALL createINCIDENTSALL() {
        return new INCIDENTSALL();
    }

    /**
     * Create an instance of {@link BulletinSearchResponse }
     * 
     */
    public BulletinSearchResponse createBulletinSearchResponse() {
        return new BulletinSearchResponse();
    }

    /**
     * Create an instance of {@link BulletinSearchCurrentResponse }
     * 
     */
    public BulletinSearchCurrentResponse createBulletinSearchCurrentResponse() {
        return new BulletinSearchCurrentResponse();
    }

    /**
     * Create an instance of {@link BulletinSearchFutureResponse }
     * 
     */
    public BulletinSearchFutureResponse createBulletinSearchFutureResponse() {
        return new BulletinSearchFutureResponse();
    }

    /**
     * Create an instance of {@link QueryTTResponse }
     * 
     */
    public QueryTTResponse createQueryTTResponse() {
        return new QueryTTResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenericFault }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "GenericFault")
    public JAXBElement<GenericFault> createGenericFault(GenericFault value) {
        return new JAXBElement<GenericFault>(_GenericFault_QNAME, GenericFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchCurrent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchCurrent }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_current")
    public JAXBElement<BulletinSearchCurrent> createBulletinSearchCurrent(BulletinSearchCurrent value) {
        return new JAXBElement<BulletinSearchCurrent>(_BulletinSearchCurrent_QNAME, BulletinSearchCurrent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchCurrentSimple }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchCurrentSimple }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_current_simple")
    public JAXBElement<BulletinSearchCurrentSimple> createBulletinSearchCurrentSimple(BulletinSearchCurrentSimple value) {
        return new JAXBElement<BulletinSearchCurrentSimple>(_BulletinSearchCurrentSimple_QNAME, BulletinSearchCurrentSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchFuture }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchFuture }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_future")
    public JAXBElement<BulletinSearchFuture> createBulletinSearchFuture(BulletinSearchFuture value) {
        return new JAXBElement<BulletinSearchFuture>(_BulletinSearchFuture_QNAME, BulletinSearchFuture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AFFECTEDSERVICE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AFFECTEDSERVICE }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "AFFECTEDSERVICE")
    public JAXBElement<AFFECTEDSERVICE> createAFFECTEDSERVICE(AFFECTEDSERVICE value) {
        return new JAXBElement<AFFECTEDSERVICE>(_AFFECTEDSERVICE_QNAME, AFFECTEDSERVICE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALLSIMPLE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALLSIMPLE }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ANNOUNCEMENTS_ALL_SIMPLE")
    public JAXBElement<ANNOUNCEMENTSALLSIMPLE> createANNOUNCEMENTSALLSIMPLE(ANNOUNCEMENTSALLSIMPLE value) {
        return new JAXBElement<ANNOUNCEMENTSALLSIMPLE>(_ANNOUNCEMENTSALLSIMPLE_QNAME, ANNOUNCEMENTSALLSIMPLE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LINEIDSRESULT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LINEIDSRESULT }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "LINEIDSRESULT")
    public JAXBElement<LINEIDSRESULT> createLINEIDSRESULT(LINEIDSRESULT value) {
        return new JAXBElement<LINEIDSRESULT>(_LINEIDSRESULT_QNAME, LINEIDSRESULT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CinumsAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CinumsAll }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinums_all")
    public JAXBElement<CinumsAll> createCinumsAll(CinumsAll value) {
        return new JAXBElement<CinumsAll>(_CinumsAll_QNAME, CinumsAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CinumsDetailsAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CinumsDetailsAll }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinums_details_all")
    public JAXBElement<CinumsDetailsAll> createCinumsDetailsAll(CinumsDetailsAll value) {
        return new JAXBElement<CinumsDetailsAll>(_CinumsDetailsAll_QNAME, CinumsDetailsAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearch }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search")
    public JAXBElement<BulletinSearch> createBulletinSearch(BulletinSearch value) {
        return new JAXBElement<BulletinSearch>(_BulletinSearch_QNAME, BulletinSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchSimple }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchSimple }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_simple")
    public JAXBElement<BulletinSearchSimple> createBulletinSearchSimple(BulletinSearchSimple value) {
        return new JAXBElement<BulletinSearchSimple>(_BulletinSearchSimple_QNAME, BulletinSearchSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTT }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Query_TT")
    public JAXBElement<QueryTT> createQueryTT(QueryTT value) {
        return new JAXBElement<QueryTT>(_QueryTT_QNAME, QueryTT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CinumsAllArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CinumsAllArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinums_allArray")
    public JAXBElement<CinumsAllArray> createCinumsAllArray(CinumsAllArray value) {
        return new JAXBElement<CinumsAllArray>(_CinumsAllArray_QNAME, CinumsAllArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AFFECTEDSERVICEArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AFFECTEDSERVICEArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "AFFECTEDSERVICEArray")
    public JAXBElement<AFFECTEDSERVICEArray> createAFFECTEDSERVICEArray(AFFECTEDSERVICEArray value) {
        return new JAXBElement<AFFECTEDSERVICEArray>(_AFFECTEDSERVICEArray_QNAME, AFFECTEDSERVICEArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CinumsDetailsAllArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CinumsDetailsAllArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinums_details_allArray")
    public JAXBElement<CinumsDetailsAllArray> createCinumsDetailsAllArray(CinumsDetailsAllArray value) {
        return new JAXBElement<CinumsDetailsAllArray>(_CinumsDetailsAllArray_QNAME, CinumsDetailsAllArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchCurrentSimpleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchCurrentSimpleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_current_simpleResponse")
    public JAXBElement<BulletinSearchCurrentSimpleResponse> createBulletinSearchCurrentSimpleResponse(BulletinSearchCurrentSimpleResponse value) {
        return new JAXBElement<BulletinSearchCurrentSimpleResponse>(_BulletinSearchCurrentSimpleResponse_QNAME, BulletinSearchCurrentSimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchSimpleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchSimpleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_simpleResponse")
    public JAXBElement<BulletinSearchSimpleResponse> createBulletinSearchSimpleResponse(BulletinSearchSimpleResponse value) {
        return new JAXBElement<BulletinSearchSimpleResponse>(_BulletinSearchSimpleResponse_QNAME, BulletinSearchSimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDyingGaspCount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDyingGaspCount }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "get_DyingGasp_count")
    public JAXBElement<GetDyingGaspCount> createGetDyingGaspCount(GetDyingGaspCount value) {
        return new JAXBElement<GetDyingGaspCount>(_GetDyingGaspCount_QNAME, GetDyingGaspCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDyingGaspCountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDyingGaspCountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "get_DyingGasp_countResponse")
    public JAXBElement<GetDyingGaspCountResponse> createGetDyingGaspCountResponse(GetDyingGaspCountResponse value) {
        return new JAXBElement<GetDyingGaspCountResponse>(_GetDyingGaspCountResponse_QNAME, GetDyingGaspCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTS }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ANNOUNCEMENTS")
    public JAXBElement<ANNOUNCEMENTS> createANNOUNCEMENTS(ANNOUNCEMENTS value) {
        return new JAXBElement<ANNOUNCEMENTS>(_ANNOUNCEMENTS_QNAME, ANNOUNCEMENTS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INCIDENT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INCIDENT }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "INCIDENT")
    public JAXBElement<INCIDENT> createINCIDENT(INCIDENT value) {
        return new JAXBElement<INCIDENT>(_INCIDENT_QNAME, INCIDENT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ANNOUNCEMENTSArray")
    public JAXBElement<ANNOUNCEMENTSArray> createANNOUNCEMENTSArray(ANNOUNCEMENTSArray value) {
        return new JAXBElement<ANNOUNCEMENTSArray>(_ANNOUNCEMENTSArray_QNAME, ANNOUNCEMENTSArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INCIDENTArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INCIDENTArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "INCIDENTArray")
    public JAXBElement<INCIDENTArray> createINCIDENTArray(INCIDENTArray value) {
        return new JAXBElement<INCIDENTArray>(_INCIDENTArray_QNAME, INCIDENTArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ANNOUNCEMENTS_ALL")
    public JAXBElement<ANNOUNCEMENTSALL> createANNOUNCEMENTSALL(ANNOUNCEMENTSALL value) {
        return new JAXBElement<ANNOUNCEMENTSALL>(_ANNOUNCEMENTSALL_QNAME, ANNOUNCEMENTSALL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INCIDENTSALL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INCIDENTSALL }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "INCIDENTS_ALL")
    public JAXBElement<INCIDENTSALL> createINCIDENTSALL(INCIDENTSALL value) {
        return new JAXBElement<INCIDENTSALL>(_INCIDENTSALL_QNAME, INCIDENTSALL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_searchResponse")
    public JAXBElement<BulletinSearchResponse> createBulletinSearchResponse(BulletinSearchResponse value) {
        return new JAXBElement<BulletinSearchResponse>(_BulletinSearchResponse_QNAME, BulletinSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchCurrentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchCurrentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_currentResponse")
    public JAXBElement<BulletinSearchCurrentResponse> createBulletinSearchCurrentResponse(BulletinSearchCurrentResponse value) {
        return new JAXBElement<BulletinSearchCurrentResponse>(_BulletinSearchCurrentResponse_QNAME, BulletinSearchCurrentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletinSearchFutureResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BulletinSearchFutureResponse }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_futureResponse")
    public JAXBElement<BulletinSearchFutureResponse> createBulletinSearchFutureResponse(BulletinSearchFutureResponse value) {
        return new JAXBElement<BulletinSearchFutureResponse>(_BulletinSearchFutureResponse_QNAME, BulletinSearchFutureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTResponse }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Query_TTResponse")
    public JAXBElement<QueryTTResponse> createQueryTTResponse(QueryTTResponse value) {
        return new JAXBElement<QueryTTResponse>(_QueryTTResponse_QNAME, QueryTTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INCIDENTSALL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INCIDENTSALL }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Query_TTResult", scope = QueryTTResponse.class)
    public JAXBElement<INCIDENTSALL> createQueryTTResponseQueryTTResult(INCIDENTSALL value) {
        return new JAXBElement<INCIDENTSALL>(_QueryTTResponseQueryTTResult_QNAME, INCIDENTSALL.class, QueryTTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_futureResult", scope = BulletinSearchFutureResponse.class)
    public JAXBElement<ANNOUNCEMENTSALL> createBulletinSearchFutureResponseBulletinSearchFutureResult(ANNOUNCEMENTSALL value) {
        return new JAXBElement<ANNOUNCEMENTSALL>(_BulletinSearchFutureResponseBulletinSearchFutureResult_QNAME, ANNOUNCEMENTSALL.class, BulletinSearchFutureResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_currentResult", scope = BulletinSearchCurrentResponse.class)
    public JAXBElement<ANNOUNCEMENTSALL> createBulletinSearchCurrentResponseBulletinSearchCurrentResult(ANNOUNCEMENTSALL value) {
        return new JAXBElement<ANNOUNCEMENTSALL>(_BulletinSearchCurrentResponseBulletinSearchCurrentResult_QNAME, ANNOUNCEMENTSALL.class, BulletinSearchCurrentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_searchResult", scope = BulletinSearchResponse.class)
    public JAXBElement<ANNOUNCEMENTSALL> createBulletinSearchResponseBulletinSearchResult(ANNOUNCEMENTSALL value) {
        return new JAXBElement<ANNOUNCEMENTSALL>(_BulletinSearchResponseBulletinSearchResult_QNAME, ANNOUNCEMENTSALL.class, BulletinSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INCIDENTArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INCIDENTArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "INCIDENTS", scope = INCIDENTSALL.class)
    public JAXBElement<INCIDENTArray> createINCIDENTSALLINCIDENTS(INCIDENTArray value) {
        return new JAXBElement<INCIDENTArray>(_INCIDENTSALLINCIDENTS_QNAME, INCIDENTArray.class, INCIDENTSALL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "RECORDS", scope = ANNOUNCEMENTSALL.class)
    public JAXBElement<ANNOUNCEMENTSArray> createANNOUNCEMENTSALLRECORDS(ANNOUNCEMENTSArray value) {
        return new JAXBElement<ANNOUNCEMENTSArray>(_ANNOUNCEMENTSALLRECORDS_QNAME, ANNOUNCEMENTSArray.class, ANNOUNCEMENTSALL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ACTUALCONTACTDATE", scope = INCIDENT.class)
    public JAXBElement<XMLGregorianCalendar> createINCIDENTACTUALCONTACTDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_INCIDENTACTUALCONTACTDATE_QNAME, XMLGregorianCalendar.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ACTUALFINISH", scope = INCIDENT.class)
    public JAXBElement<XMLGregorianCalendar> createINCIDENTACTUALFINISH(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_INCIDENTACTUALFINISH_QNAME, XMLGregorianCalendar.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "AFFECTEDDATE", scope = INCIDENT.class)
    public JAXBElement<XMLGregorianCalendar> createINCIDENTAFFECTEDDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_INCIDENTAFFECTEDDATE_QNAME, XMLGregorianCalendar.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ASSIGNEDOWNERGROUP", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTASSIGNEDOWNERGROUP(String value) {
        return new JAXBElement<String>(_INCIDENTASSIGNEDOWNERGROUP_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "CABLEGROUP", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTCABLEGROUP(String value) {
        return new JAXBElement<String>(_INCIDENTCABLEGROUP_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "CENTRALA", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTCENTRALA(String value) {
        return new JAXBElement<String>(_INCIDENTCENTRALA_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "CINUM", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTCINUM(String value) {
        return new JAXBElement<String>(_INCIDENTCINUM_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "CLASS", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTCLASS(String value) {
        return new JAXBElement<String>(_INCIDENTCLASS_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "CLASSIFICATIONID", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTCLASSIFICATIONID(String value) {
        return new JAXBElement<String>(_INCIDENTCLASSIFICATIONID_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "CLASSSTRUCTUREID", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTCLASSSTRUCTUREID(String value) {
        return new JAXBElement<String>(_INCIDENTCLASSSTRUCTUREID_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "DESCRIPTION", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTDESCRIPTION(String value) {
        return new JAXBElement<String>(_INCIDENTDESCRIPTION_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "DESCRIPTION_LONGDESCRIPTION", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTDESCRIPTIONLONGDESCRIPTION(String value) {
        return new JAXBElement<String>(_INCIDENTDESCRIPTIONLONGDESCRIPTION_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "DEVICENAME", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTDEVICENAME(String value) {
        return new JAXBElement<String>(_INCIDENTDEVICENAME_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "EXTERNALSYSTEM", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTEXTERNALSYSTEM(String value) {
        return new JAXBElement<String>(_INCIDENTEXTERNALSYSTEM_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "FAULTCAUSE", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTFAULTCAUSE(String value) {
        return new JAXBElement<String>(_INCIDENTFAULTCAUSE_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "FAULTLOCATION", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTFAULTLOCATION(String value) {
        return new JAXBElement<String>(_INCIDENTFAULTLOCATION_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "HISTORYFLAG", scope = INCIDENT.class)
    public JAXBElement<Boolean> createINCIDENTHISTORYFLAG(Boolean value) {
        return new JAXBElement<Boolean>(_INCIDENTHISTORYFLAG_QNAME, Boolean.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "IMPACT", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTIMPACT(String value) {
        return new JAXBElement<String>(_INCIDENTIMPACT_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "INDICATEDPRIORITY", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTINDICATEDPRIORITY(String value) {
        return new JAXBElement<String>(_INCIDENTINDICATEDPRIORITY_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "INTERNALPRIORITY", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTINTERNALPRIORITY(String value) {
        return new JAXBElement<String>(_INCIDENTINTERNALPRIORITY_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ISGLOBAL", scope = INCIDENT.class)
    public JAXBElement<Boolean> createINCIDENTISGLOBAL(Boolean value) {
        return new JAXBElement<Boolean>(_INCIDENTISGLOBAL_QNAME, Boolean.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "KABEL", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTKABEL(String value) {
        return new JAXBElement<String>(_INCIDENTKABEL_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "KATEGORIJA", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTKATEGORIJA(String value) {
        return new JAXBElement<String>(_INCIDENTKATEGORIJA_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "LINEID", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTLINEID(String value) {
        return new JAXBElement<String>(_INCIDENTLINEID_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "LINISKAOPREMA", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTLINISKAOPREMA(String value) {
        return new JAXBElement<String>(_INCIDENTLINISKAOPREMA_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "LOCATION", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTLOCATION(String value) {
        return new JAXBElement<String>(_INCIDENTLOCATION_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "NUMBEROFAFFECTEDCUSTOMERS", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTNUMBEROFAFFECTEDCUSTOMERS(String value) {
        return new JAXBElement<String>(_INCIDENTNUMBEROFAFFECTEDCUSTOMERS_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ORIGINATEDCOMPANY", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTORIGINATEDCOMPANY(String value) {
        return new JAXBElement<String>(_INCIDENTORIGINATEDCOMPANY_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ORIGINATEDDEVICE", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTORIGINATEDDEVICE(String value) {
        return new JAXBElement<String>(_INCIDENTORIGINATEDDEVICE_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "OWNER", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTOWNER(String value) {
        return new JAXBElement<String>(_INCIDENTOWNER_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "OWNERGROUP", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTOWNERGROUP(String value) {
        return new JAXBElement<String>(_INCIDENTOWNERGROUP_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "PAKET", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTPAKET(String value) {
        return new JAXBElement<String>(_INCIDENTPAKET_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "PRECKAID", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTPRECKAID(String value) {
        return new JAXBElement<String>(_INCIDENTPRECKAID_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "REASON", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTREASON(String value) {
        return new JAXBElement<String>(_INCIDENTREASON_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "REGIONNAME", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTREGIONNAME(String value) {
        return new JAXBElement<String>(_INCIDENTREGIONNAME_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "RELATEDTOGLOBAL", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTRELATEDTOGLOBAL(String value) {
        return new JAXBElement<String>(_INCIDENTRELATEDTOGLOBAL_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "REPORTDATE", scope = INCIDENT.class)
    public JAXBElement<XMLGregorianCalendar> createINCIDENTREPORTDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_INCIDENTREPORTDATE_QNAME, XMLGregorianCalendar.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "REPORTEDBY", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTREPORTEDBY(String value) {
        return new JAXBElement<String>(_INCIDENTREPORTEDBY_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "REPORTEDPRIORITY", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTREPORTEDPRIORITY(String value) {
        return new JAXBElement<String>(_INCIDENTREPORTEDPRIORITY_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "RESOLVEDBY", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTRESOLVEDBY(String value) {
        return new JAXBElement<String>(_INCIDENTRESOLVEDBY_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "RESOLVER", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTRESOLVER(String value) {
        return new JAXBElement<String>(_INCIDENTRESOLVER_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ROOTCAUSE", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTROOTCAUSE(String value) {
        return new JAXBElement<String>(_INCIDENTROOTCAUSE_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "SERVICESINFAULT", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTSERVICESINFAULT(String value) {
        return new JAXBElement<String>(_INCIDENTSERVICESINFAULT_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "SLATIPSERVIS", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTSLATIPSERVIS(String value) {
        return new JAXBElement<String>(_INCIDENTSLATIPSERVIS_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "SOLUTION", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTSOLUTION(String value) {
        return new JAXBElement<String>(_INCIDENTSOLUTION_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "STATUS", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTSTATUS(String value) {
        return new JAXBElement<String>(_INCIDENTSTATUS_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "STATUSDATE", scope = INCIDENT.class)
    public JAXBElement<XMLGregorianCalendar> createINCIDENTSTATUSDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_INCIDENTSTATUSDATE_QNAME, XMLGregorianCalendar.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "TARGETCONTACTDATE", scope = INCIDENT.class)
    public JAXBElement<XMLGregorianCalendar> createINCIDENTTARGETCONTACTDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_INCIDENTTARGETCONTACTDATE_QNAME, XMLGregorianCalendar.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "TARGETFINISH", scope = INCIDENT.class)
    public JAXBElement<XMLGregorianCalendar> createINCIDENTTARGETFINISH(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_INCIDENTTARGETFINISH_QNAME, XMLGregorianCalendar.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "TICKETID", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTTICKETID(String value) {
        return new JAXBElement<String>(_INCIDENTTICKETID_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "TICKETUID", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTTICKETUID(String value) {
        return new JAXBElement<String>(_INCIDENTTICKETUID_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "TIPPREKIN", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTTIPPREKIN(String value) {
        return new JAXBElement<String>(_INCIDENTTIPPREKIN_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "TKTYPE", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTTKTYPE(String value) {
        return new JAXBElement<String>(_INCIDENTTKTYPE_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "URGENCY", scope = INCIDENT.class)
    public JAXBElement<BigInteger> createINCIDENTURGENCY(BigInteger value) {
        return new JAXBElement<BigInteger>(_INCIDENTURGENCY_QNAME, BigInteger.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "WAYOFREPAIR", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTWAYOFREPAIR(String value) {
        return new JAXBElement<String>(_INCIDENTWAYOFREPAIR_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "WOCATALOG", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTWOCATALOG(String value) {
        return new JAXBElement<String>(_INCIDENTWOCATALOG_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "WORKAROUND", scope = INCIDENT.class)
    public JAXBElement<Boolean> createINCIDENTWORKAROUND(Boolean value) {
        return new JAXBElement<Boolean>(_INCIDENTWORKAROUND_QNAME, Boolean.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "WORKAROUNDDESC", scope = INCIDENT.class)
    public JAXBElement<String> createINCIDENTWORKAROUNDDESC(String value) {
        return new JAXBElement<String>(_INCIDENTWORKAROUNDDESC_QNAME, String.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AFFECTEDSERVICEArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AFFECTEDSERVICEArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "AFFECTED_SERVICE", scope = INCIDENT.class)
    public JAXBElement<AFFECTEDSERVICEArray> createINCIDENTAFFECTEDSERVICE(AFFECTEDSERVICEArray value) {
        return new JAXBElement<AFFECTEDSERVICEArray>(_INCIDENTAFFECTEDSERVICE_QNAME, AFFECTEDSERVICEArray.class, INCIDENT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "bulletinid", scope = ANNOUNCEMENTS.class)
    public JAXBElement<String> createANNOUNCEMENTSBulletinid(String value) {
        return new JAXBElement<String>(_ANNOUNCEMENTSBulletinid_QNAME, String.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "startdate", scope = ANNOUNCEMENTS.class)
    public JAXBElement<XMLGregorianCalendar> createANNOUNCEMENTSStartdate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ANNOUNCEMENTSStartdate_QNAME, XMLGregorianCalendar.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "enddate", scope = ANNOUNCEMENTS.class)
    public JAXBElement<XMLGregorianCalendar> createANNOUNCEMENTSEnddate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ANNOUNCEMENTSEnddate_QNAME, XMLGregorianCalendar.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "description", scope = ANNOUNCEMENTS.class)
    public JAXBElement<String> createANNOUNCEMENTSDescription(String value) {
        return new JAXBElement<String>(_ANNOUNCEMENTSDescription_QNAME, String.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "message", scope = ANNOUNCEMENTS.class)
    public JAXBElement<String> createANNOUNCEMENTSMessage(String value) {
        return new JAXBElement<String>(_ANNOUNCEMENTSMessage_QNAME, String.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "numbus", scope = ANNOUNCEMENTS.class)
    public JAXBElement<BigInteger> createANNOUNCEMENTSNumbus(BigInteger value) {
        return new JAXBElement<BigInteger>(_ANNOUNCEMENTSNumbus_QNAME, BigInteger.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "numresidential", scope = ANNOUNCEMENTS.class)
    public JAXBElement<BigInteger> createANNOUNCEMENTSNumresidential(BigInteger value) {
        return new JAXBElement<BigInteger>(_ANNOUNCEMENTSNumresidential_QNAME, BigInteger.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "postby", scope = ANNOUNCEMENTS.class)
    public JAXBElement<String> createANNOUNCEMENTSPostby(String value) {
        return new JAXBElement<String>(_ANNOUNCEMENTSPostby_QNAME, String.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "subject", scope = ANNOUNCEMENTS.class)
    public JAXBElement<String> createANNOUNCEMENTSSubject(String value) {
        return new JAXBElement<String>(_ANNOUNCEMENTSSubject_QNAME, String.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CinumsDetailsAllArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CinumsDetailsAllArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinum_details", scope = ANNOUNCEMENTS.class)
    public JAXBElement<CinumsDetailsAllArray> createANNOUNCEMENTSCinumDetails(CinumsDetailsAllArray value) {
        return new JAXBElement<CinumsDetailsAllArray>(_ANNOUNCEMENTSCinumDetails_QNAME, CinumsDetailsAllArray.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CinumsAllArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CinumsAllArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinums", scope = ANNOUNCEMENTS.class)
    public JAXBElement<CinumsAllArray> createANNOUNCEMENTSCinums(CinumsAllArray value) {
        return new JAXBElement<CinumsAllArray>(_ANNOUNCEMENTSCinums_QNAME, CinumsAllArray.class, ANNOUNCEMENTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LINEIDSRESULT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LINEIDSRESULT }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "get_DyingGasp_countResult", scope = GetDyingGaspCountResponse.class)
    public JAXBElement<LINEIDSRESULT> createGetDyingGaspCountResponseGetDyingGaspCountResult(LINEIDSRESULT value) {
        return new JAXBElement<LINEIDSRESULT>(_GetDyingGaspCountResponseGetDyingGaspCountResult_QNAME, LINEIDSRESULT.class, GetDyingGaspCountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "lineids", scope = GetDyingGaspCount.class)
    public JAXBElement<StringArray> createGetDyingGaspCountLineids(StringArray value) {
        return new JAXBElement<StringArray>(_GetDyingGaspCountLineids_QNAME, StringArray.class, GetDyingGaspCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALLSIMPLE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALLSIMPLE }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_simpleResult", scope = BulletinSearchSimpleResponse.class)
    public JAXBElement<ANNOUNCEMENTSALLSIMPLE> createBulletinSearchSimpleResponseBulletinSearchSimpleResult(ANNOUNCEMENTSALLSIMPLE value) {
        return new JAXBElement<ANNOUNCEMENTSALLSIMPLE>(_BulletinSearchSimpleResponseBulletinSearchSimpleResult_QNAME, ANNOUNCEMENTSALLSIMPLE.class, BulletinSearchSimpleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALLSIMPLE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALLSIMPLE }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "Bulletin_search_current_simpleResult", scope = BulletinSearchCurrentSimpleResponse.class)
    public JAXBElement<ANNOUNCEMENTSALLSIMPLE> createBulletinSearchCurrentSimpleResponseBulletinSearchCurrentSimpleResult(ANNOUNCEMENTSALLSIMPLE value) {
        return new JAXBElement<ANNOUNCEMENTSALLSIMPLE>(_BulletinSearchCurrentSimpleResponseBulletinSearchCurrentSimpleResult_QNAME, ANNOUNCEMENTSALLSIMPLE.class, BulletinSearchCurrentSimpleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ticket", scope = QueryTT.class)
    public JAXBElement<String> createQueryTTTicket(String value) {
        return new JAXBElement<String>(_QueryTTTicket_QNAME, String.class, QueryTT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinum", scope = QueryTT.class)
    public JAXBElement<String> createQueryTTCinum(String value) {
        return new JAXBElement<String>(_QueryTTCinum_QNAME, String.class, QueryTT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinum", scope = BulletinSearchSimple.class)
    public JAXBElement<String> createBulletinSearchSimpleCinum(String value) {
        return new JAXBElement<String>(_QueryTTCinum_QNAME, String.class, BulletinSearchSimple.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinum", scope = BulletinSearch.class)
    public JAXBElement<String> createBulletinSearchCinum(String value) {
        return new JAXBElement<String>(_QueryTTCinum_QNAME, String.class, BulletinSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinum", scope = CinumsDetailsAll.class)
    public JAXBElement<String> createCinumsDetailsAllCinum(String value) {
        return new JAXBElement<String>(_QueryTTCinum_QNAME, String.class, CinumsDetailsAll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "serviceinfault", scope = CinumsDetailsAll.class)
    public JAXBElement<String> createCinumsDetailsAllServiceinfault(String value) {
        return new JAXBElement<String>(_CinumsDetailsAllServiceinfault_QNAME, String.class, CinumsDetailsAll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "typeimpact", scope = CinumsDetailsAll.class)
    public JAXBElement<String> createCinumsDetailsAllTypeimpact(String value) {
        return new JAXBElement<String>(_CinumsDetailsAllTypeimpact_QNAME, String.class, CinumsDetailsAll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "string1", scope = CinumsDetailsAll.class)
    public JAXBElement<String> createCinumsDetailsAllString1(String value) {
        return new JAXBElement<String>(_CinumsDetailsAllString1_QNAME, String.class, CinumsDetailsAll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "cinum", scope = CinumsAll.class)
    public JAXBElement<String> createCinumsAllCinum(String value) {
        return new JAXBElement<String>(_QueryTTCinum_QNAME, String.class, CinumsAll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "RESULT", scope = LINEIDSRESULT.class)
    public JAXBElement<BigInteger> createLINEIDSRESULTRESULT(BigInteger value) {
        return new JAXBElement<BigInteger>(_LINEIDSRESULTRESULT_QNAME, BigInteger.class, LINEIDSRESULT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "RESULT", scope = ANNOUNCEMENTSALLSIMPLE.class)
    public JAXBElement<String> createANNOUNCEMENTSALLSIMPLERESULT(String value) {
        return new JAXBElement<String>(_LINEIDSRESULTRESULT_QNAME, String.class, ANNOUNCEMENTSALLSIMPLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "AFFECTEDSERVICEID", scope = AFFECTEDSERVICE.class)
    public JAXBElement<BigInteger> createAFFECTEDSERVICEAFFECTEDSERVICEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_AFFECTEDSERVICEAFFECTEDSERVICEID_QNAME, BigInteger.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "CINUM", scope = AFFECTEDSERVICE.class)
    public JAXBElement<String> createAFFECTEDSERVICECINUM(String value) {
        return new JAXBElement<String>(_INCIDENTCINUM_QNAME, String.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "STARTDATE", scope = AFFECTEDSERVICE.class)
    public JAXBElement<XMLGregorianCalendar> createAFFECTEDSERVICESTARTDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFFECTEDSERVICESTARTDATE_QNAME, XMLGregorianCalendar.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "ENDDATE", scope = AFFECTEDSERVICE.class)
    public JAXBElement<XMLGregorianCalendar> createAFFECTEDSERVICEENDDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AFFECTEDSERVICEENDDATE_QNAME, XMLGregorianCalendar.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "DESCRIPTION", scope = AFFECTEDSERVICE.class)
    public JAXBElement<String> createAFFECTEDSERVICEDESCRIPTION(String value) {
        return new JAXBElement<String>(_INCIDENTDESCRIPTION_QNAME, String.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "EQUIPMENTTYPE", scope = AFFECTEDSERVICE.class)
    public JAXBElement<String> createAFFECTEDSERVICEEQUIPMENTTYPE(String value) {
        return new JAXBElement<String>(_AFFECTEDSERVICEEQUIPMENTTYPE_QNAME, String.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "LOCATION", scope = AFFECTEDSERVICE.class)
    public JAXBElement<String> createAFFECTEDSERVICELOCATION(String value) {
        return new JAXBElement<String>(_INCIDENTLOCATION_QNAME, String.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "NUMADSL", scope = AFFECTEDSERVICE.class)
    public JAXBElement<BigInteger> createAFFECTEDSERVICENUMADSL(BigInteger value) {
        return new JAXBElement<BigInteger>(_AFFECTEDSERVICENUMADSL_QNAME, BigInteger.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "NUMINTERNET", scope = AFFECTEDSERVICE.class)
    public JAXBElement<BigInteger> createAFFECTEDSERVICENUMINTERNET(BigInteger value) {
        return new JAXBElement<BigInteger>(_AFFECTEDSERVICENUMINTERNET_QNAME, BigInteger.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "NUMIPTV", scope = AFFECTEDSERVICE.class)
    public JAXBElement<BigInteger> createAFFECTEDSERVICENUMIPTV(BigInteger value) {
        return new JAXBElement<BigInteger>(_AFFECTEDSERVICENUMIPTV_QNAME, BigInteger.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "NUMOFIMPACTEDCUST", scope = AFFECTEDSERVICE.class)
    public JAXBElement<BigInteger> createAFFECTEDSERVICENUMOFIMPACTEDCUST(BigInteger value) {
        return new JAXBElement<BigInteger>(_AFFECTEDSERVICENUMOFIMPACTEDCUST_QNAME, BigInteger.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "NUMVOIP", scope = AFFECTEDSERVICE.class)
    public JAXBElement<BigInteger> createAFFECTEDSERVICENUMVOIP(BigInteger value) {
        return new JAXBElement<BigInteger>(_AFFECTEDSERVICENUMVOIP_QNAME, BigInteger.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "NUMWLR", scope = AFFECTEDSERVICE.class)
    public JAXBElement<BigInteger> createAFFECTEDSERVICENUMWLR(BigInteger value) {
        return new JAXBElement<BigInteger>(_AFFECTEDSERVICENUMWLR_QNAME, BigInteger.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "REGION", scope = AFFECTEDSERVICE.class)
    public JAXBElement<String> createAFFECTEDSERVICEREGION(String value) {
        return new JAXBElement<String>(_AFFECTEDSERVICEREGION_QNAME, String.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "SERVICEINFAULT", scope = AFFECTEDSERVICE.class)
    public JAXBElement<String> createAFFECTEDSERVICESERVICEINFAULT(String value) {
        return new JAXBElement<String>(_AFFECTEDSERVICESERVICEINFAULT_QNAME, String.class, AFFECTEDSERVICE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "diligent.services.all", name = "SYSSTATUS", scope = AFFECTEDSERVICE.class)
    public JAXBElement<String> createAFFECTEDSERVICESYSSTATUS(String value) {
        return new JAXBElement<String>(_AFFECTEDSERVICESYSSTATUS_QNAME, String.class, AFFECTEDSERVICE.class, value);
    }

}
