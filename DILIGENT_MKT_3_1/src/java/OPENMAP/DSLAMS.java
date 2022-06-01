package OPENMAP;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nsofiasLib.ote.DSLAMs.DslamDetailsFinder;

/**
 *
 * @author nsofias
 */
public class DSLAMS extends HttpServlet
    {

    DslamDetailsFinder myDslamDetailsFinder = new DslamDetailsFinder();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        PrintWriter out = response.getWriter();
        try
            {
            ServletContext myContext = request.getServletContext();
            response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
            response.setHeader("Pragma", "no-cache"); //HTTP 1.0
            response.setDateHeader("Expires", 0); //prevents caching at the proxy server  
            response.setHeader("Content-type", "text/html;charset=Windows-1252");
            String[] resources;
            try
                {
                resources = request.getParameter("DSLAM").split(",");
                }
            catch (Exception e)
                {
                return;
                }
            //-----------------------
            if (resources != null)
                {
                for (String myDslam : resources)
                    {                   
                    try
                        {
                        String[] coords = myDslamDetailsFinder.getDslamDetails(myDslam).getCoords().split(",");
                        String hostName = myDslamDetailsFinder.getDslamDetails(myDslam).getMyHostName();
                        String LAT = coords[0];
                        String LON = coords[1];                        
                        out.print(hostName + "," + LON + "," + LAT + "\n");
                        }
                    catch (Exception e)
                        {
                        }
                    }
                }
            if (resources != null)
                {
                out.print("\n");//this is the header
                }
            }
        catch (Exception e)
            {
            }
        finally
            {
            out.close();
            }
        }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        processRequest(request, response);
        }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        processRequest(request, response);
        }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
        {
        return "Short description";
        }// </editor-fold>

    }
