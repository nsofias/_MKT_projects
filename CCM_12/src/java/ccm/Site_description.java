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
public class Site_description
    {
     private String a_number;
    private String area;
    private String onu;
    
    /**
     * @param a_number
     * @param area
     * @param onu
     */        
    public Site_description(String a_number,String area, String onu)
        {
        this.area = area;
        this.onu = onu;
        this.a_number = a_number;
        }

    public String getArea()
        {
        return area;
        }

    /**
     * @param area the area to set
     */
    public void setArea(String area)
        {
        this.area = area;
        }

    /**
     * @return the onu
     */
    public String getOnu()
        {
        return onu;
        }

    /**
     * @param onu the onu to set
     */
    public void setOnu(String onu)
        {
        this.onu = onu;
        }

    /**
     * @return the a_number
     */
    public String getA_number()
        {
        return a_number;
        }

    /**
     * @param a_number the a_number to set
     */
    public void setA_number(String a_number)
        {
        this.a_number = a_number;
        }
    }
