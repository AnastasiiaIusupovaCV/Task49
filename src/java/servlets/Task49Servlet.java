/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a.yusupova
 */
public class Task49Servlet extends HttpServlet {

    String name = "Анастасия";
    String surname = "Юсупова";
    String patronimicName = "Юрьевна";
    String pic = "res/cat.jpg";
    
    
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Task49Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Task49</h1>");
            out.println("<table>");
            
             out.println("<tr>");
             out.println("<th></th>");
             out.println("<th></th>");
             out.println("</tr>");
             
             out.println("<tr>");
             out.println("<td>Имя</td>");
             out.println("<td>"+name+"</td>");
             out.println("</tr>");
             
             out.println("<tr>");
             out.println("<td>Отчество</td>");
             out.println("<td>"+patronimicName+"</td>");
             out.println("</tr>");
             
             out.println("<tr>");
             out.println("<td>Фамилия</td>");
             out.println("<td>"+surname+"</td>");
             out.println("</tr>");
             
             
             out.println("<tr>");
             out.println("<td></td>");
             out.println("<td>"+"<img src=\""+pic+"\" alt=\"Description\">"+"</td>");
             out.println("</tr>");
             
             
             out.println("<tr>");
             out.println("<td>Дата</td>");
             Date x = java.util.Calendar.getInstance().getTime();
             out.println("<td>"+x.toString()+"</td>");
             out.println("</tr>");

            out.println("</table>");
            
            out.println("</body>");
            out.println("</html>");
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
            throws ServletException, IOException {
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
