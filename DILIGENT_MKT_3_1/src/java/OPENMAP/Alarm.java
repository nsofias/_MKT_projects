/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPENMAP;

/**
 *
 * @author nsofias
 */
public class Alarm
    {
    public static String statusActive="A";
    public static String statusInactive="I";
    public static String typeEquipment="E";
    public static String typeArea="A";
    public static String typeCustomer="C";
    public static String EquipmentBras="B";
    public static String EquipmentDslam="D";
    public static String EquipmentCard="C";
    
    private String source,status,type,eType;
    private Point coords;
    
    public Alarm(String source,String status,String type,String eType)
        {
        this.source=source;
        this.status=status;
        this.type=type;
        this.eType=eType;
        }

    /**
     * @return the source
     */
    public String getSource()
        {
        return source;
        }

    /**
     * @param source the source to set
     */
    public void setSource(String source)
        {
        this.source = source;
        }

    /**
     * @return the status
     */
    public String getStatus()
        {
        return status;
        }

    /**
     * @param status the status to set
     */
    public void setStatus(String status)
        {
        this.status = status;
        }

    /**
     * @return the type
     */
    public String getType()
        {
        return type;
        }

    /**
     * @param type the type to set
     */
    public void setType(String type)
        {
        this.type = type;
        }

    /**
     * @return the eType
     */
    public String geteType()
        {
        return eType;
        }

    /**
     * @param eType the eType to set
     */
    public void seteType(String eType)
        {
        this.eType = eType;
        }

    /**
     * @return the coords
     */
    public Point getCoords()
        {
        return coords;
        }

    /**
     * @param coords the coords to set
     */
    public void setCoords(Point coords)
        {
        this.coords = coords;
        }
    
    }
