package SKOPIA;

import java.util.Objects;
import nsofiasLib.utils.CounterObj;

public class Visitor implements CounterObj, Comparable
    {
    private String IPAdress;
    private String objTime;
    private String user;
    //
    
    
    public Visitor(String IPAdress,String objTime)
        {
        this.IPAdress=IPAdress;
        this.objTime=objTime;
        }
    
    @Override
    public void include(CounterObj myCounterObj)
        {
        this.objTime = ((Visitor)myCounterObj).getObjTime();
        }
    
    @Override
    public int compareTo(Object myCounterObj)
        {
        String OtherObjTime = ((Visitor)myCounterObj).getObjTime();
        return OtherObjTime.compareTo(this.objTime);
        }               
           
    @Override
    public void reset()
        {}                        
    
    @Override
    public boolean equals(Object otherObj)
        {
//        if(!otherObj.getClass().getName().equals("Visitor"))return false;
        Visitor otherVisitor = (Visitor)otherObj;
        return this.IPAdress.equals(otherVisitor.getIPAdress());
        }  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.IPAdress);
        return hash;
    }
    
    @Override
    public String toString()
        {
        return(IPAdress+" "+objTime+"\n");
        }

  
    public String getObjTime() {
        return objTime;
    }

    /**
     * @param objTime the objTime to set
     */
    public void setObjTime(String objTime) {
        this.objTime = objTime;
    }

    /**
     * @return the IPAdress
     */
    public String getIPAdress() {
        return IPAdress;
    }

    /**
     * @param IPAdress the IPAdress to set
     */
    public void setIPAdress(String IPAdress) {
        this.IPAdress = IPAdress;
    }

    @Override
    public String getLabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDesc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getCounterValue() {
        return -1;
    }

    /**
     * @return the user
     */
    public String getUser()
        {
        return user;
        }

    /**
     * @param user the user to set
     */
    public void setUser(String user)
        {
        this.user = user;
        }
    }        
