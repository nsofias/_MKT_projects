/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.CounterObjsGrouper;

/**
 * Web application lifecycle listener.
 *
 * @author nsofias
 */
public class CounterListener implements ServletRequestListener
    {

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent)
        {
        try
            {
            CounterObjsGrouper visitors = (CounterObjsGrouper) servletRequestEvent.getServletContext().getAttribute("visitors");
            if (visitors == null)
                {
                visitors = new CounterObjsGrouper();
                servletRequestEvent.getServletContext().setAttribute("visitors", visitors);
                }
            String IPAdress = servletRequestEvent.getServletRequest().getRemoteAddr();
            String objTime = new TimeStamp1().getNowUnformated();
            Visitor myVisitor = new Visitor(IPAdress, objTime);
            visitors.updateCounters(myVisitor);
            } catch (Exception e)
            {
            System.out.println("CCM12:requestInitialized error " + e.toString());
            e.printStackTrace(System.out);
            }
        }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent)
        {

        /*servletRequestEvent.getServletRequest().getRemoteAddr();
        CounterObjsGrouper visitors = (CounterObjsGrouper)servletRequestEvent.getServletContext().getAttribute("visitors");
        if (visitors!=null)
            {
            String IPAdress = servletRequestEvent.getServletRequest().getRemoteAddr();
            visitors.removeObject(new Visitor(IPAdress,""), 1);
            }*/
        }

    }//close class CounterListener
