/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Point;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.plot.dial.DialCap;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.DialPointer;
import org.jfree.chart.plot.dial.DialValueIndicator;
import org.jfree.chart.plot.dial.StandardDialFrame;
import org.jfree.chart.plot.dial.StandardDialRange;
import org.jfree.chart.plot.dial.StandardDialScale;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.StandardGradientPaintTransformer;

/**
 *
 * @author nsofias
 */
public class SpeedServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        String units=request.getParameter("units");
//        System.out.println("range="+request.getParameter("range"));
        double range=Double.valueOf(request.getParameter("range"));
        double alarm=Double.valueOf(request.getParameter("alarm")); 
        double value=Double.valueOf(request.getParameter("value"));  
        String tittle=request.getParameter("tittle");
        displayGraph(tittle,units,range,alarm,value,response);
        }    
    
   public void displayGraph(String graphTittle,String units,double maxValue,double alarmValue,double value,HttpServletResponse response)
	{
        try {             
            DefaultValueDataset data = new DefaultValueDataset(value); 
            //---------- 
            DialPlot plot = new DialPlot(data);
            StandardDialFrame dialFrame = new StandardDialFrame();
        //    dialFrame.setBackgroundPaint(Color.white);
            plot.setDialFrame(dialFrame);    
            plot.addLayer(new DialValueIndicator(0));
            GradientPaint gp = new GradientPaint(new Point(), new Color(180, 180, 200), new Point(), new Color(0,0, 0));
            DialBackground db = new DialBackground(gp);
            db.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.VERTICAL));
            plot.setBackground(db);
            StandardDialScale scale = new StandardDialScale(0, maxValue,-120, -300, maxValue/10, 1);
            scale.setTickRadius(0.88);
            scale.setTickLabelOffset(0.15);
            scale.setTickLabelFont(new Font("Dialog", Font.BOLD, 11));
            scale.setTickLabelPaint(Color.white);            
            plot.addScale(0, scale);
            //
            StandardDialRange range = new StandardDialRange(0.0, alarmValue, Color.red);
            range.setInnerRadius(0.52);
            range.setOuterRadius(0.58);
            plot.addLayer(range);
            StandardDialRange range1 = new StandardDialRange(alarmValue, maxValue, Color.blue);
            range1.setInnerRadius(0.52);
            range1.setOuterRadius(0.58);
            plot.addLayer(range1);            
            //
           
            DialPointer needle = new DialPointer.Pin();   
            plot.addLayer(needle);
            DialCap cap = new DialCap();
            cap.setRadius(0.1);
            plot.setCap(cap);            
            //
            JFreeChart chart = new JFreeChart(graphTittle+"("+units+")",JFreeChart.DEFAULT_TITLE_FONT, plot, false);            
        //  chart.setBackgroundPaint(gp);
            response.setContentType("image/png");
            OutputStream out=response.getOutputStream();
            ChartUtilities.writeChartAsPNG(out, chart,250,250);
            }
	catch( Exception throwable )
            {
            System.out.println("CCM:"+throwable.toString());
            }
	finally {}
	}          

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
