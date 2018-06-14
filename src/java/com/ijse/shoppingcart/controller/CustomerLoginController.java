/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.controller;

import com.ijse.shoppingcart.service.AdminLoginService;
import com.ijse.shoppingcart.service.CustomerService;
import com.ijse.shoppingcart.service.serviceFactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TD Athukorala
 */
@WebServlet(name = "CustomerLoginController", urlPatterns = {"/CustomerLoginController"})
public class CustomerLoginController extends HttpServlet {

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
            String email = request.getParameter("cusEmail");
            String password = request.getParameter("cusPassword");

            System.out.println("password: " + password);
            System.out.println("email: " + email);

            CustomerService service = (CustomerService) ServiceFactory.getInstance().getServiceFactory(ServiceFactory.ServiceType.CUSTOMER);
            if (email.trim().equalsIgnoreCase("") || password.trim().equalsIgnoreCase("")) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                String pass = service.checkLoginPassword(email);
                System.out.println("Result: " + pass);
                if (null == pass) {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    out.print("<script>alert('Incorrect username')</script>");
                } else if (password.equalsIgnoreCase(pass)) {
                    request.getRequestDispatcher("buyItems.jsp").forward(request, response);
                    
//                
                } else if (!password.equalsIgnoreCase(pass)) {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    out.print("<script>alert('Incorrect password')</script>");
                    
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
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
