/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import nsofiasLib.utils.Counters1;

/**
 *
 * @author nsofias
 */
public class AggregationsForPeriod {

    private String from = "";
    private String to = "";
    private final ConcurrentHashMap<String, Counters1> currentResourceCounters = new ConcurrentHashMap<>();

    public AggregationsForPeriod(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void include(String resourceType, String resource, String child) {
        if (currentResourceCounters.get(resourceType) == null) {
            Counters1 myCounters = new Counters1(resourceType);
            currentResourceCounters.put(resourceType, myCounters);
            //System.out.println("CCM12:AggregationsForPeriod:include new resourceType: "+resourceType);
        }
        //currentResourceCounters.get(resourceType).updateCounters(resource, "COUNT");
        if (child!=null && !child.isEmpty()) {
            currentResourceCounters.get(resourceType).updateCounters(resource, child);
        }
    }
    
    public void include(String resourceType, String resource) {
        if (currentResourceCounters.get(resourceType) == null) {
            Counters1 myCounters = new Counters1(resourceType);
            currentResourceCounters.put(resourceType, myCounters);
            //System.out.println("CCM12:AggregationsForPeriod:include new resourceType: "+resourceType);
        }
        currentResourceCounters.get(resourceType).updateCounters(resource, "COUNT");
    }
    
    public void include(String resourceType, Counters1 resourceTypeCounters) {
        currentResourceCounters.put(resourceType, resourceTypeCounters);
    }

    public void display() {
        System.out.println("CCM12:AggregationsForPeriod from=" + from+" to=" + to);
        for (String key : currentResourceCounters.keySet()) {
            System.out.println("CCM12:AggregationsForPeriod label:" + key + " size:" + currentResourceCounters.get(key).size());
        }
    }

    public Set<String> getAggregationLabels() {
        return currentResourceCounters.keySet();
    }

    public Counters1 getCurrentResourceCounters(String key) {
        if (currentResourceCounters.get(key) != null) {
            return currentResourceCounters.get(key);
        } else {
            return new Counters1();
        }
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }
}
