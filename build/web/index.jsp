<%-- 
    Document   : index
    Created on : Jun 10, 2018, 10:55:31 AM
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
    <body style="background-color: #d2cbcb;background-image: url(home_back.png);height: 100px">
    <center>
        <br/>
        <div class="animated rubberBand">
            <h3 style='color:#666666'><span style='color:orange'>S</span>hopping <span style='color:orange'>C</span>art</h3>
            <small>Smarter Shopping, Better Living!</small>
        </div>
        <hr>
    </center>

    <!--admin and customer login-->
    <div class="container">
        <br/>

        <div class="row">

            <div class="col-sm-5">                

                <div class="animated wobble">
                    <div class="card" style='border-radius: 15px' >

                        <div class="card-header">
                            <center>Admin Sign In</center>
                        </div>

                        <div class="card-body">
                            <form action="AdminLoginController" method="post">
                                <div class="form-group row">
                                    <label for="staticEmail" class="col-sm-3 col-form-label">Email</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="adminEmail" placeholder='Enter Email' class="form-control" style='border-radius: 18px'>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="inputPassword" class="col-sm-3 col-form-label">Password</label>
                                    <div class="col-sm-10">
                                        <input type="password" name="adminPassword" class="form-control"  placeholder="Password" style='border-radius:18px'>
                                    </div>
                                </div>
                                <center>
                                    <button type="submit" class="btn btn-info" style='border-radius:18px'>Admin Login</button>
                                </center>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


            <div class="col-sm-2">

            </div>
            <div class="col-sm-5">
                <div class="animated zoomIn">
                    <div class="card" style='border-radius: 15px'>


                        <div class="card-header">
                            <center>Customer Sign In</center>
                        </div>                       
                        <div class="card-body">
                            <form action="CustomerLoginController"  method="post">
                                <div class="form-group row">
                                    <label for="staticEmail" class="col-sm-3 col-form-label">Email</label>
                                    <div class="col-sm-10">
                                        <input type="text" name='cusEmail' placeholder='Enter Email'  class="form-control" style='border-radius:18px'>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="inputPassword" class="col-sm-3 col-form-label">Password</label>
                                    <div class="col-sm-10">
                                        <input type="password" name='cusPassword' class="form-control" placeholder="Password" style='border-radius:18px'>
                                    </div>
                                </div>
                                <center>
                                    <button type="submit" class="btn btn-info" style='border-radius:18px'>Customer Login</button>
                                </center>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

</body>
</html>
