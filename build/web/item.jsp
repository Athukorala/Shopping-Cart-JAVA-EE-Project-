<%-- 
    Document   : item
    Created on : Jun 17, 2018, 12:33:16 PM
    Author     : TD Athukorala
--%>

<%@page import="com.ijse.shoppingcart.dto.ItemCategoryDto"%>
<%@page import="java.util.List"%>
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


            <div class="row">
                <!--- item category --->
                <div class="col-sm-3">
                    <a href="crudOperations.jsp"><div class="btn btn-outline-info" style="width:50%">Item view</div></a>
                    <br/><br/>
                    <div class="animated flipInX">
                        <div class="card" style='border-radius: 15px'>


                            <div class="card-header">
                                <center>Add Item Category Form</center>
                            </div>                       
                            <div class="card-body">
                                <form>


                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Category Name</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control"  placeholder="Item Category Name" name="icname" style='border-radius:18px'>
                                        </div>
                                    </div>


                                    <center>
                                        <button type="button" class="btn btn-success" style='border-radius:18px'>Add</button>

                                        <!--                                        <button type="button" class="btn btn-danger" style='border-radius:18px'>Remove</button>-->
                                    </center>
                                </form>
                            </div>
                        </div>
                    </div>
                    <br/>



                    <div class="animated flipInX">
                        <div class="card" style='border-radius: 15px'>


                            <div class="card-header">
                                <center>Remove Item Category Form</center>
                            </div>                       
                            <div class="card-body">
                                <form>


                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Category Name</label>
                                        <div class="col-sm-10">
                                            <select class="form-control" id="exampleFormControlSelect1" style='border-radius:18px'>
                                                <%
                                                    if (null == request.getAttribute("ItemCategoryArrayViewList")) {
                                                        //                                                    request.setAttribute("itemController", "showAllItemForAdmin");
                                                        //                                                    request.getRequestDispatcher("ItemCategoryController").forward(request, response);
                                                    } else {
                                                        List<ItemCategoryDto> itemCategoryList = (List<ItemCategoryDto>) request.getAttribute("ItemCategoryArrayViewList");
                                                        for (ItemCategoryDto dto : itemCategoryList) {

                                                            out.print("<option>" + dto.getIcname() + "</option>");

                                                        }
                                                    }
                                                %>

                                            </select>

                                        </div>
                                    </div>


                                    <center>

                                        <button type="button" class="btn btn-danger" style='border-radius:18px'>Remove</button>
                                    </center>
                                </form>
                            </div>
                        </div>
                    </div>


                </div>


                <!----------------------->
                <div class="col-sm-3">

                    <div class="animated zoomIn">
                        <div class="card" style='border-radius: 15px'  style="width: 58px">


                            <div class="card-header">
                                <center>Add Item Form </center>
                            </div>                       
                            <div class="card-body">
                                <form action="AdminItemViewController" method="post">


                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Category Name</label>
                                        <div class="col-sm-10">
                                            <select class="form-control" id="exampleFormControlSelect1" style='border-radius:18px'>
                                                <%
                                                    if (null == request.getAttribute("ItemCategoryArrayViewList")) {
                                                        //                                                    request.setAttribute("itemController", "showAllItemForAdmin");
                                                        //                                                    request.getRequestDispatcher("ItemCategoryController").forward(request, response);
                                                    } else {
                                                        List<ItemCategoryDto> itemCategoryList = (List<ItemCategoryDto>) request.getAttribute("ItemCategoryArrayViewList");
                                                        for (ItemCategoryDto dto : itemCategoryList) {

                                                            out.print("<option>" + dto.getIcname() + "</option>");

                                                        }
                                                    }
                                                %>

                                            </select>
                                        </div>

                                    </div>
                                    <hr/>
                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Item Name</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control"  placeholder="Item Name" name="iname" style='border-radius:18px'>
                                        </div>

                                    </div>

                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Item Qty</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control"  placeholder="Item Qty" name="iqty" style='border-radius:18px'>
                                        </div>

                                    </div>

                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Item Price</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control"  placeholder="Item Price" name="iprice" style='border-radius:18px'>
                                        </div>

                                    </div>


                                    <center>
                                        <button type="submit" class="btn btn-success" style='border-radius:18px'>Add</button>

                                    </center>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-3">

                    <div class="animated flip">
                        <div class="card" style='border-radius: 15px'  style="width: 58px">


                            <div class="card-header">
                                <center>Update Item Form </center>
                            </div>                       
                            <div class="card-body">
                                <form action="AdminItemViewController" method="post">


                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Category Name</label>
                                        <div class="col-sm-10">
                                            <select class="form-control" id="exampleFormControlSelect1" style='border-radius:18px'>
                                                <%
                                                    if (null == request.getAttribute("ItemCategoryArrayViewList")) {
                                                        //                                                    request.setAttribute("itemController", "showAllItemForAdmin");
                                                        //                                                    request.getRequestDispatcher("ItemCategoryController").forward(request, response);
                                                    } else {
                                                        List<ItemCategoryDto> itemCategoryList = (List<ItemCategoryDto>) request.getAttribute("ItemCategoryArrayViewList");
                                                        for (ItemCategoryDto dto : itemCategoryList) {

                                                            out.print("<option>" + dto.getIcname() + "</option>");

                                                        }
                                                    }
                                                %>

                                            </select>
                                        </div>

                                    </div>
                                    <hr/>
                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Item Name</label>
                                        <div class="col-sm-10">
                                            <select class="form-control" id="exampleFormControlSelect1" style='border-radius:18px'>
                                                <%
                                                    if (null == request.getAttribute("ItemCategoryArrayViewList")) {
                                                        //                                                    request.setAttribute("itemController", "showAllItemForAdmin");
                                                        //                                                    request.getRequestDispatcher("ItemCategoryController").forward(request, response);
                                                    } else {
                                                        List<ItemCategoryDto> itemCategoryList = (List<ItemCategoryDto>) request.getAttribute("ItemCategoryArrayViewList");
                                                        for (ItemCategoryDto dto : itemCategoryList) {

                                                            out.print("<option>" + dto.getIcname() + "</option>");

                                                        }
                                                    }
                                                %>

                                            </select>
                                        </div>

                                    </div>

                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Item Qty</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control"  placeholder="Item Qty" name="iqty" style='border-radius:18px'>
                                        </div>

                                    </div>

                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Item Price</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control"  placeholder="Item Price" name="iprice" style='border-radius:18px'>
                                        </div>

                                    </div>


                                    <center>
                                        
                                        <button type="button" class="btn btn-info" style='border-radius:18px'>Update</button>
                                    </center>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-sm-3">
                    <div class="animated flipInX">
                        <div class="card" style='border-radius: 15px'>


                            <div class="card-header">
                                <center>Remove Item Form</center>
                            </div>                       
                            <div class="card-body">
                                <form>


                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Item Name</label>
                                        <div class="col-sm-10">
                                            <select class="form-control" id="exampleFormControlSelect1" style='border-radius:18px'>
                                                <%
                                                    if (null == request.getAttribute("ItemCategoryArrayViewList")) {
                                                        //                                                    request.setAttribute("itemController", "showAllItemForAdmin");
                                                        //                                                    request.getRequestDispatcher("ItemCategoryController").forward(request, response);
                                                    } else {
                                                        List<ItemCategoryDto> itemCategoryList = (List<ItemCategoryDto>) request.getAttribute("ItemCategoryArrayViewList");
                                                        for (ItemCategoryDto dto : itemCategoryList) {

                                                            out.print("<option>" + dto.getIcname() + "</option>");

                                                        }
                                                    }
                                                %>

                                            </select>

                                        </div>
                                    </div>


                                    <center>

                                        <button type="button" class="btn btn-danger" style='border-radius:18px'>Remove</button>
                                    </center>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

</body>
</html>
