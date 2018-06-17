<%-- 
    Document   : buyItems
    Created on : Jun 15, 2018, 12:46:31 AM
    Author     : TD Athukorala
--%>

<%@page import="com.ijse.shoppingcart.dto.ItemDto"%>
<%@page import="com.ijse.shoppingcart.dto.ItemCategoryDto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <title>Shopping Cart</title>
    </head>
    <body style="background-color: #d2cbcb;background-image: url(./images/home_back.png);height: 100px">


        <div class="row">

            <div class="col-sm-3">
                <div class="animated fadeInDownBig">
                    <div class="w3-content w3-section">
                        <img class="mySlides" src="./images/phones1.jpg" style="width:100%">
                        <img class="mySlides" src="./images/computer.jpg" style="width:100%">
                        <img class="mySlides" src="./images/veg.jpg" style="width:100%">
                        <img class="mySlides12" src="./images/3.jpg" style="width:100%">
                        <img class="mySlides12" src="./images/2.jpg" style="width:100%">
                        <img class="mySlides12" src="./images/1.jpg" style="width:100%">
                    </div>
                </div>

            </div>
            <div class="col-sm-6">
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

                <center>
                    <p style="color: #00cc99;font-size: 20px">Select your choice </p>

                    <div class="col-sm-6">
                        <form name='myForm' action="ItemViewController" method="Post">
                            <select class="form-control" id="itemSelector" name='itemName' style='border-radius:18px' onchange="itemCategoryOnChange()"> 

                                <%
                                    if (null == request.getAttribute("ItemCategoryArrayViewList")) {
                                        request.setAttribute("itemController", "showAllItemForCustomer");
                                        request.getRequestDispatcher("ItemCategoryController").forward(request, response);
                                    } else {
                                        List<ItemCategoryDto> itemCategoryList = (List<ItemCategoryDto>) request.getAttribute("ItemCategoryArrayViewList");
                                        for (ItemCategoryDto dto : itemCategoryList) {

                                            out.print("<option>" + dto.getIcname() + "</option>");

                                        }
                                    }
                                %>

                            </select>
                        </form>
                    </div>
                    <br/>
                    <%
                        if (null == request.getAttribute("categoryName")) {

                        } else {
                            String name = request.getAttribute("categoryName").toString();
                            out.print("<h5 style='color:red'>ITEM CATEGORY : " + name + "</h5>");

                        }
                    %>

                    <br/>


                    <!--item buy table ----------------->

                    <div class="animated rubberBand">
                        <table class="table table-hover" style="background:#D9D3D3;border-radius: 2px;box-shadow: 1px 2px 3px white" >
                            <thead>
                                <tr >
                                    <th scope="col">Item Name</th>
                                    <th scope="col">price</th>
                                    <th scope="col">Qty</th>                                
                                    <th scope="col">Enter Qty</th>

                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    if (null == request.getAttribute("ItemArrayViewList")) {
                                        request.setAttribute("showItems", "showItems");
                                        request.getRequestDispatcher("ItemViewController").forward(request, response);
                                    } else {
                                        List<ItemDto> itemList = (List<ItemDto>) request.getAttribute("ItemArrayViewList");
                                        for (ItemDto dto : itemList) {
                                            out.print("<tr>");
                                            out.print("<td>" + dto.getIname() + "</td>");
                                            out.print("<td>" + dto.getIqty() + "</td>");
                                            out.print("<td>" + dto.getIprice() + "</td>");
                                            out.print("<td><input type='number' class='form-control' style='border-radius:18px;width:70%'></td>");
                                            out.print("<td><button class='btn btn-info' style='border-radius:17px'>BUY</button></td>");
                                            out.print("</tr>");
                                        }
                                    }
                                %>



                            </tbody>
                        </table>
                    </div>
                </center>


            </div>
            <div class="col-sm-3">
                <div class="animated fadeInDownBig">
                    <div class="w3-content w3-section">
                        <img class="mySlides1" src="./images/6.jpg" style="width:100%">
                        <img class="mySlides1" src="./images/Computers.jpg" style="width:100%">
                        <img class="mySlides1" src="./images/images.jpg" style="width:100%">
                        <img class="mySlides12" src="./images/5.jpg" style="width:100%">
                        <img class="mySlides12" src="./images/4.jpg" style="width:100%">
                        <img class="mySlides12" src="./images/fruits.jpg" style="width:100%">
                    </div>
                </div>
            </div>
        </div>



        <script>
            var urlParams = new URLSearchParams(window.location.search);


            console.log(urlParams.toString());
            document.getElementById("itemSelector").value = urlParams.toString();

            function itemCategoryOnChange() {
                var name = document.getElementById("itemSelector").value;

                myForm.submit();

            }


            var myIndex = 0;
            carousel();

            function carousel() {
                var i;
                var x = document.getElementsByClassName("mySlides");
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                myIndex++;
                if (myIndex > x.length) {
                    myIndex = 1
                }
                x[myIndex - 1].style.display = "block";
                setTimeout(carousel, 2000); // Change image every 2 seconds
            }

            var myIndex1 = 0;
            carousel1();

            function carousel1() {
                var i;
                var x = document.getElementsByClassName("mySlides1");
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                myIndex1++;
                if (myIndex1 > x.length) {
                    myIndex1 = 1
                }
                x[myIndex1 - 1].style.display = "block";
                setTimeout(carousel1, 2000); // Change image every 2 seconds
            }
        </script>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    </div>
</html>
