/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 18452
 */
public class submitComments extends HttpServlet {
    private java.sql.Connection conn;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
        Statement st;
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession(true);
        receiveComments rc = new receiveComments();
        session.setAttribute("rc",rc);
        
        //open the DBMS and insert the record
        try{            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String connectionURL = "jdbc:derby://localhost:1527/JIS103";
            conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560");
  
            st = conn.createStatement();
            String q1 = new String("INSERT INTO COMMENTS (NAME, EMAIL, COMMENTS)"+
                " VALUES ('" +
                request.getParameter("name") + "', '" +
                request.getParameter("email")+ "', '" +
                request.getParameter("comments") + "')" );
                System.out.println(q1);
                st.execute(q1);
                conn.close();
        }        
        catch (SQLException se)
        {
            se.printStackTrace();  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rc.setName(request.getParameter("name"));
        rc.setEmail(request.getParameter("email"));
        rc.setComments(request.getParameter("comments"));
        
        RequestDispatcher rd = session.getServletContext().getRequestDispatcher("/receive.jsp");
        rd.forward(request, response);
    }
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}