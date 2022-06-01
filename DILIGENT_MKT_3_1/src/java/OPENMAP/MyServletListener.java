package OPENMAP;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import nsofiasLib.fileIO.CSV_LineParser;
import nsofiasLib.fileIO.FileParser2;

/**
 * Web application lifecycle listener.
 *
 * @author nsofias
 */
@WebListener()
public class MyServletListener implements ServletContextListener
    {

    @Override
    public void contextInitialized(ServletContextEvent sce)
        { 
        try {
            ServletContext myContext=sce.getServletContext();     
            CSV_LineParser myCSVLineParser = new CSV_LineParser();
            FileParser2 myFileParser = new FileParser2(myCSVLineParser);
            myFileParser.setEncoding("Windows-1252");
            myCSVLineParser.setSplitterStr(";");
            myCSVLineParser.setKeepResults(true);
            }
        catch(Exception e){System.out.println(e.toString());}                        
        }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
        {
        
        }
    }
