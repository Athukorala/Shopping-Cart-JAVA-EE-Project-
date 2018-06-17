/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.controller;

import com.ijse.shoppingcart.dto.AdminLoginDto;
import com.ijse.shoppingcart.service.AdminLoginService;
import com.ijse.shoppingcart.service.serviceFactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TD Athukorala
 */
@WebServlet(name = "AdminLoginController", urlPatterns = {"/AdminLoginController"})
public class AdminLoginController extends HttpServlet {

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
            System.out.println("----------Admin Login----------");
            String email = request.getParameter("adminEmail");
            String password = request.getParameter("adminPassword");

            System.out.println("password: " + password);
            System.out.println("email: " + email);

            AdminLoginService service = (AdminLoginService) ServiceFactory.getInstance().getServiceFactory(ServiceFactory.ServiceType.ADMIN_LOGIN);
            if (email.trim().equalsIgnoreCase("") || password.trim().equalsIgnoreCase("")) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                String pass = service.checkLoginPassword(email);
                System.out.println("Result: " + pass);
                if (null == pass) {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    
                } else if (password.equalsIgnoreCase(pass)) {
                    request.getRequestDispatcher("crudOperations.jsp").forward(request, response);
                    
//                
                } else if (!password.equalsIgnoreCase(pass)) {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    
                    
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(AdminLoginController.class.getName()).log(Level.SEVERE, null, ex);
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
        String email = request.getParameter("adminEmail");
        String password = request.getParameter("adminPassword");

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
        try (PrintWriter out = response.getWriter()) {

        }

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
