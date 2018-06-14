<%-- 
    Document   : customerManagement
    Created on : Jun 12, 2018, 10:35:02 PM
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
    <script>
        fun
    </script>
        

    <body style="background-color: #d2cbcb;background-image: url(home_back.png);height: 100px">
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
                
                
                <p>Customer CRUD Operations</p>
                
                <div class="animated wobble">
                    <div class="card" style='border-radius: 15px' >

                        <div class="card-header">
                            <center>Customer Management</center>
                        </div>

                        <div class="card-body">
                            <form>


                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Name</label>
                                    <div class="col-sm-10">
                                        <div class="row">
                                            <div class="col-sm-10">
                                                 <input type="text" class="form-control"  placeholder="Customer Name" name="cname" style='border-radius:18px'>
                                        
                                            </div>
                                            
                                            <div class="col-sm-2">
                                                <button type="button" class="btn btn-warning" style='border-radius:18px'>Search</button>

                                            </div>
                                        </div>

                                       
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Address</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Address" name="caddress" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Mobile</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Mobile" name="cmobile" style='border-radius:18px'>
                                    </div>
                                </div>

                                <hr/>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Username</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Username" name="cusername" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Password</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer Password" name="cpassword" style='border-radius:18px'>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-sm-7 col-form-label"> Re-enter Password</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control"  placeholder="Customer REPassword" name="crepassword" style='border-radius:18px'>
                                    </div>
                                </div>

                                <center>
                                    <button type="button" class="btn btn-success" style='border-radius:18px'>Add</button>
                                    <button type="button" class="btn btn-info" style='border-radius:18px'>Update</button>
                                    <button type="button" class="btn btn-danger" style='border-radius:18px'>Remove</button>
                                </center>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


            <div class="col-sm-2">

            </div>
            <div class="col-sm-5">
                
               
                <p> Item CRUD Operations</p>

                <div class="row">
                    <div class="animated zoomIn">
                        <div class="card" style='border-radius: 15px'>


                            <div class="card-header">
                                <center>Item Category Management</center>
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

                                        <button type="button" class="btn btn-danger" style='border-radius:18px'>Remove</button>
                                    </center>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <br/>
                <div class="row">
                    <div class="animated zoomIn">
                        <div class="card" style='border-radius: 15px'  style="width: 58px">


                            <div class="card-header">
                                <center> Item Management </center>
                            </div>                       
                            <div class="card-body">
                                <form>


                                    <div class="form-group row">
                                        <label class="col-sm-7 col-form-label">Item Category Name</label>
                                        <div class="col-sm-10">
                                            <select class="form-control" id="exampleFormControlSelect1" style='border-radius:18px'>
                                                <option>Computers</option>
                                                <option>Laptops</option>
                                                <option>Mobile Phones</option>

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
                                        <button type="button" class="btn btn-success" style='border-radius:18px'>Add</button>
                                        <button type="button" class="btn btn-info" style='border-radius:18px'>Update</button>
                                        <button type="button" class="btn btn-danger" style='border-radius:18px'>Remove</button>
                                    </center>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>



            </div>

        </div>
        <br/>
        <h5 style="color: #138496">Customer View</h5>
        <br/>
        <!-------------------------- table customer--------------------------------------->
                <table class="table table-hover" style="background:#D9D3D3;border-radius: 2px;box-shadow: 1px 2px 3px white" >
                    <thead>
                        <tr >
                            <th scope="col">Ticket Number</th>
                            <th scope="col">Advisor Name</th>
                            <th scope="col">Influencer</th>
                            <th scope="col">Issue</th>
                            <th scope="col">Status</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">#001</th>
                            <td>Byan Admas</td>
                            <td>Monika Kaweka</td>
                            <td>Automatic time stamp</td>
                            <td>Pending</td>

                        </tr>
                    </tbody>
                </table>
                <br/>

                
                <!------------------------------------------------------------------------------->
                <hr/>
                <br/>
                <h5 style="color: #138496">Item View</h5>
                <br/>
                 <!-------------------------- table --------------------------------------->
                <table class="table table-hover"  style="background:#D9D3D3;border-radius: 2px;box-shadow: 1px 2px 3px white">
                    <thead>
                        <tr >
                            <th scope="col">Ticket Number</th>
                            <th scope="col">Advisor Name</th>
                            <th scope="col">Influencer</th>
                            <th scope="col">Issue</th>
                            <th scope="col">Status</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">#001</th>
                            <td>Byan Admas</td>
                            <td>Monika Kaweka</td>
                            <td>Automatic time stamp</td>
                            <td>Pending</td>

                        </tr>
                    </tbody>
                </table>
                <br/>

                
                <!------------------------------------------------------------------------------->
                
                
                
    </div>  
</body>
</html>
