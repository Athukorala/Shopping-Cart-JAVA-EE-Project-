/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.controller;

import com.ijse.shoppingcart.dto.ItemCategoryDto;
import com.ijse.shoppingcart.service.ItemCategoryService;
import com.ijse.shoppingcart.service.ItemService;
import com.ijse.shoppingcart.service.serviceFactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ItemCategoryController", urlPatterns = {"/ItemCategoryController"})
public class ItemCategoryController extends HttpServlet {

    private String name = null;

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
            ItemCategoryService ser = (ItemCategoryService) ServiceFactory.getInstance().getServiceFactory(ServiceFactory.ServiceType.ITEM_CATEGORY);

            if (name==request.getParameter("icname")) {

            } else {
                name = request.getParameter("icname");

                ItemCategoryDto dto = new ItemCategoryDto(0, request.getParameter("icname"));

                ItemCategoryService service = (ItemCategoryService) ServiceFactory.getInstance().getServiceFactory(ServiceFactory.ServiceType.ITEM_CATEGORY);
                boolean isAdded = service.add(dto);

                if (isAdded) {
                    request.setAttribute("itemSave", "yes");
                    request.getRequestDispatcher("crudOperations.jsp").forward(request, response);
                } else {
                    request.setAttribute("itemSave", "no");
                    request.getRequestDispatcher("crudOperations.jsp").forward(request, response);
                }

            }

            switch (request.getAttribute("itemController").toString()) {
                case "showAllItemForAdmin":
                    ser = (ItemCategoryService) ServiceFactory.getInstance().getServiceFactory(ServiceFactory.ServiceType.ITEM_CATEGORY);
                    List itemCategoryArray = ser.readAll();
                    request.setAttribute("ItemCategoryArrayViewList", itemCategoryArray);
                    request.getRequestDispatcher("crudOperations.jsp").forward(request, response);
                    break;

                case "showAllItemForCustomer":
                    ser = (ItemCategoryService) ServiceFactory.getInstance().getServiceFactory(ServiceFactory.ServiceType.ITEM_CATEGORY);
                    List itemCategoryCustomerArray = ser.readAll();
                    request.setAttribute("ItemCategoryArrayViewList", itemCategoryCustomerArray);
                    request.getRequestDispatcher("buyItems.jsp").forward(request, response);
                    break;

                case "itemAddForAdmin":

                    break;
                default:
                    out.print("0");
                    break;

            }
        } catch (Exception ex) {
            Logger.getLogger(ItemCategoryController.class.getName()).log(Level.SEVERE, null, ex);
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
