<%-- 
    Document   : Customer
    Created on : Jun 17, 2018, 11:53:23 AM
    Author     : TD Athukorala
--%>

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
        <button type="button" class="btn btn-default btn-sm" style="float:right" onclick='logoutBtn()'>
            Log out
        </button>
        <hr>
    </center>
    <div class="container">
        <div class="row">

            <div class="col-sm-5">
                <a href="crudOperations.jsp"><div class="btn btn-outline-dark" >Customer view</div></a>
                <br/><br/>
                <div class="animated wobble">
                    <div class="card" style='border-radius: 15px' >

                        <div class="card-header">
                            <center>Add Customer Form</center>
                        </div>

                        <div class="card-body">
                            <form action="CustomersController" method="post">


                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> User Name</label>
                                    <div class="col-sm-10">
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <input type="text" class="form-control"  placeholder="Customer User Name" name="username" style='border-radius:18px'>

                                            </div>

                                            <!--                                            <div class="col-sm-2">
                                                                                            <button type="button" class="btn btn-warning" style='border-radius:18px'>Search</button>
                                            
                                                                                        </div>-->
                                        </div>


                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Name</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Name" name="name" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Address</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Address" name="address" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Mobile</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Mobile" name="mobile" style='border-radius:18px'>
                                    </div>
                                </div>

                                <hr/>



                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Password</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Password" name="password" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Re-enter Password</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer REPassword" name="crepassword" style='border-radius:18px'>
                                    </div>
                                </div>

                                <center>
                                    <button type="submit" class="btn btn-success" style='border-radius:18px'>Add</button>
                                    <!--                                    <button type="submit" class="btn btn-info" style='border-radius:18px'>Update</button>
                                                                        <button type="submit" class="btn btn-danger" style='border-radius:18px'>Remove</button>-->
                                </center>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


            <div class="col-sm-2">

            </div>

            <div class="col-sm-5">



                <div class="animated flip">       
                    <div class="row">
                        <p> Search Cutomer </p>
                        <div class="col-sm-10">
                            <input type="text" class="form-control"  placeholder="Customer User Name" name="username" style='border-radius:18px'>

                        </div>

                        <div class="col-sm-2">
                            <button type="button" class="btn btn-warning" style='border-radius:18px'>Search</button>

                        </div>
                    </div>
                </div>
                <br/>
                <div class="animated wobble">
                    <div class="card" style='border-radius: 15px' >

                        <div class="card-header">
                            <center>Update Customer Form</center>
                        </div>

                        <div class="card-body">
                            <form action="CustomersController" method="post">


                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> User Name</label>
                                    <div class="col-sm-10">
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <input type="text" class="form-control"  placeholder="Customer User Name" name="username" style='border-radius:18px'>

                                            </div>


                                        </div>


                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Name</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Name" name="name" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Address</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Address" name="address" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Mobile</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Mobile" name="mobile" style='border-radius:18px'>
                                    </div>
                                </div>

                                <hr/>



                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Password</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Password" name="password" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Re-enter Password</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer REPassword" name="crepassword" style='border-radius:18px'>
                                    </div>
                                </div>

                                <center>

                                    <button type="submit" class="btn btn-info" style='border-radius:18px'>Update</button>
                                </center>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="animated flip">                
                    <div class="row">
                        <p> Remove Cutomer </p>
                        <div class="col-sm-10">
                            <input type="text" class="form-control"  placeholder="Customer User Name" name="username" style='border-radius:18px'>

                        </div>

                        <div class="col-sm-2">
                            <button type="submit" class="btn btn-danger" style='border-radius:18px'>Remove</button>

                        </div>
                    </div>
                </div>
                <br/><br/><br/><br/>
            </div>
            </body>
            </html>
