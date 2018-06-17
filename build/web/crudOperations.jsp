<%-- 
    Document   : customerManagement
    Created on : Jun 12, 2018, 10:35:02 PM
    Author     : TD Athukorala
--%>

<%@page import="javax.swing.text.Document"%>
<%@page import="com.ijse.shoppingcart.dto.ItemCategoryDto"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="com.ijse.shoppingcart.dto.ItemDto"%>
<%@page import="java.util.List"%>
<%@page import="com.ijse.shoppingcart.dto.CustomerDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
        <title>Shopping Cart</title>
    </head>


    <body style="background-color: #d2cbcb;background-image: url(./images/home_back.png);height: 100px">
    <center>
        <br/>

        <div class="animated rubberBand">
            <h3 style='color:#666666'><span style='color:orange'>S</span>hopping <span style='color:orange'>C</span>art</h3>
            <small>Smarter Shopping, Better Living!</small>
        </div>
       <a href="index.jsp"><button type="button" class="btn btn-default btn-sm" style="float:right" onclick='logoutBtn()'>
            Log out
            </button></a>
        <hr>
    </center>
    <div class="container">

        <div class="row">

            <div class="col-lg-6">


                <a href="customer.jsp"><div class="btn btn-outline-dark" >Customer CRUD Operations</div></a>
                    <hr/>

                    <br/>
                    <h5 style="color: #138496">Customer View</h5>
                    <!-------------------------- table customer--------------------------------------->

                    <div class="animated rubberBand">

                        <table class="table table-hover" style="background:#D9D3D3;border-radius: 2px;box-shadow: 1px 2px 3px white" >
                            <thead>
                                <tr >
                                    <th scope="col">Name</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Mobile</th>
                                    <th scope="col">Username</th>

                                </tr>
                            </thead>
                            <tbody>

                                <%
                                    if (null == request.getAttribute("customerViewList")) {
                                        request.setAttribute("showCustomers", "showCustomers");
                                        request.getRequestDispatcher("AdminCustomerViewController").forward(request, response);
                                    } else {
                                        List<CustomerDto> cusList = (List<CustomerDto>) request.getAttribute("customerViewList");
                                        for (CustomerDto dto : cusList) {
                                            out.print("<tr>");
                                            out.print("<td>" + dto.getCname() + "</td>");
                                            out.print("<td>" + dto.getCaddress() + "</td>");
                                            out.print("<td>" + dto.getCmobile() + "</td>");
                                            out.print("<td>" + dto.getCusername() + "</td>");
                                            out.print("</tr>");
                                        }
                                    }
                                %>


                            </tbody>
                        </table>

                    </div>

            </div>

            <!------------------------------------------------------------------------------->
            <div class="col-lg-1"></div>

            <div class="col-lg-5">

                <a href="item.jsp"><div class="btn btn-outline-info">Item CRUD Operations</div></a>
                    <hr/>

                    <br/>
                    <h5 style="color: #138496">Item View</h5>
                    <!-------------------------- table --------------------------------------->
                    <div class="animated rubberBand">
                        <table class="table table-hover"  style="background:#D9D3D3;border-radius: 2px;box-shadow: 1px 2px 3px white">
                            <thead>
                                <tr >
                                    <th scope="col">Category</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Qty</th>
                                    <th scope="col">Unit Price</th>


                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    if (null == request.getAttribute("ItemViewList")) {
                                        request.setAttribute("showItems", "showItems");
                                        request.getRequestDispatcher("AdminItemViewController").forward(request, response);
                                    } else {
                                        List<ItemDto> itemList = (List<ItemDto>) request.getAttribute("ItemViewList");
                                        for (ItemDto dto : itemList) {
                                            out.print("<tr>");
                                            out.print("<td>" + dto.getIcname() + "</td>");
                                            out.print("<td>" + dto.getIname() + "</td>");
                                            out.print("<td>" + dto.getIqty() + "</td>");
                                            out.print("<td>" + dto.getIprice() + "</td>");
                                            out.print("</tr>");
                                        }
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>

            </div>

        </div>  
    </div>
    <!--customer crud operation alert--> 

    <%
        if (request.getAttribute("customerSave") == "yes") {
            out.print("<script>alert('Successfully')</script>");
        } else if (request.getAttribute("customerSave") == "") {

        } else if (request.getAttribute("customerSave") == "yes") {
            out.print("<script>alert('Failed')</script>");
        }


    %>

    <!--item crud operation alert--> 

    <%            if (request.getAttribute("itemSave") == "yes") {
            out.print("<script>alert('Successfully')</script>");
        } else if (request.getAttribute("itemSave") == "") {

        } else if (request.getAttribute("itemSave") == "yes") {
            out.print("<script>alert('Failed')</script>");
        }


    %>

    


</body>
</html>
