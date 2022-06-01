/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

/**
 *
 * @author stb
 */
public class LineEvent
    {    
    private long eventTimestamp;//ms
    private String line_id;
    private int eventType;// 0:disconnect 1:connect

    public LineEvent( String line_id, long eventTimestamp, int eventType)
        {
        this.eventTimestamp = eventTimestamp;
        this.line_id = line_id;
        this.eventType = eventType;
        }
    
    
        /**
     * @return the eventTimestamp
     */
    public long getEventTimestamp()
        {
        return eventTimestamp;
        }

    /**
     * @param eventTimestamp the eventTimestamp to set
     */
    public void setEventTimestamp(long eventTimestamp)
        {
        this.eventTimestamp = eventTimestamp;
        }

    /**
     * @return the line_id
     */
    public String getLine_id()
        {
        return line_id;
        }

    /**
     * @param line_id the line_id to set
     */
    public void setLine_id(String line_id)
        {
        this.line_id = line_id;
        }

    /**
     * @return the eventType
     */
    public int getEventType()
        {
        return eventType;
        }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(int eventType)
        {
        this.eventType = eventType;
        }
    }
