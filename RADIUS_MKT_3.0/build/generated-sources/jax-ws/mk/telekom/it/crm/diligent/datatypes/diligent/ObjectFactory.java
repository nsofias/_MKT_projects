
package mk.telekom.it.crm.diligent.datatypes.diligent;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mk.telekom.it.crm.diligent.datatypes.diligent package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mk.telekom.it.crm.diligent.datatypes.diligent
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckMassiveFaultByLine }
     * 
     */
    public CheckMassiveFaultByLine createCheckMassiveFaultByLine() {
        return new CheckMassiveFaultByLine();
    }

    /**
     * Create an instance of {@link CheckMassiveFaultByLineOutput }
     * 
     */
    public CheckMassiveFaultByLineOutput createCheckMassiveFaultByLineOutput() {
        return new CheckMassiveFaultByLineOutput();
    }

    /**
     * Create an instance of {@link GetLineMetrics }
     * 
     */
    public GetLineMetrics createGetLineMetrics() {
        return new GetLineMetrics();
    }

    /**
     * Create an instance of {@link GetLineMetricsOutput }
     * 
     */
    public GetLineMetricsOutput createGetLineMetricsOutput() {
        return new GetLineMetricsOutput();
    }

    /**
     * Create an instance of {@link LineMetric }
     * 
     */
    public LineMetric createLineMetric() {
        return new LineMetric();
    }

    /**
     * Create an instance of {@link MassiveFault }
     * 
     */
    public MassiveFault createMassiveFault() {
        return new MassiveFault();
    }

}
