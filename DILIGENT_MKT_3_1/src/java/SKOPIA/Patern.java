package SKOPIA;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nsofias
 */
public class Patern

    {    
    private String resource;
    private final double averageValue,minValue,maxValue;

    public Patern(String[] myPatern)
        {
        resource = myPatern[0];
        averageValue = Double.parseDouble(myPatern[1]);
        maxValue = Double.parseDouble(myPatern[2]);
        minValue = Double.parseDouble(myPatern[3]);                        
        }  
  
    public Patern(String resourceStr)
        {
        resource = resourceStr;
        averageValue = 0.0;
        maxValue = 0.0;
        minValue = 0.0;        
        }     
     
    @Override
    public String toString()
        {
        return resource+"&"+String.valueOf(averageValue)+"&"+String.valueOf(maxValue)+"&"+String.valueOf(minValue);
        }
    @Override
    public boolean equals(Object otherObj)
        {
        if(!otherObj.getClass().getName().equals("DSLMON_SKOPIA.Patern"))return false;
        return resource.equals(((Patern)otherObj).getResource());
        }  


    @Override
    public int hashCode()
        {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.resource);
        return hash;
        }
    /**
     * @return the resource
     */
    public String getResource()
        {
        return resource;
        }

    /**
     * @param resource the resource to set
     */
    public void setResource(String resource)
        {
        this.resource = resource;
        }

    /**
     * @return the minValue
     */
    public double getMinValue()
        {
        return minValue;
        }
    double getMaxValue()
        {
        return maxValue;
        }

    /**
     * @return the averageValue
     */
    public double getAverageValue()
        {
        return averageValue;
        }
    
  
    }
