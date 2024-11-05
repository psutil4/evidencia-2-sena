/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.mavenproject1.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soporte1
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/login"})
public class loginServlet extends HttpServlet {

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
        String usuario =request.getParameter("usuario");
        String password =request.getParameter("password");
            try {
                Class.forName("com.sql.cj.jdbc.Drive");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            String url="jdbc:mysql://localhost:3306/brotherstore";
            Connection cnx;
            Statement st;
            ResultSet rs;
            try {
                cnx=DriverManager.getConnection(url, "root", "root");
                st=cnx.createStatement();
                rs=st.executeQuery("select * from usuarios where nomusu='"+usuario+"' and passusu='"+password+"' ");
                if(rs.next()){
                    request.getSession().setAttribute("nomusu",usuario);
                    response.sendRedirect("inicio.jsp");
                }else{
                    response.sendRedirect("index.html");
                }
            } catch (SQLException ex) {
                Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
          }

                 
    }

