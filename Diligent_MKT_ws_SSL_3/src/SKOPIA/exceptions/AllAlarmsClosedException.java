/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA.exceptions;

/**
 *
 * @author nsofias
 */
public class AllAlarmsClosedException extends Exception
    {

    public AllAlarmsClosedException()
        {
        super("Alarms closed before Ticket Creation");
        }
    }
