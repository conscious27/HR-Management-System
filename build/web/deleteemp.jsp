<%-- 
    Document   : deleteemp
    Created on : 30 Mar, 2022, 7:14:13 PM
    Author     : chait
--%>
<%@page import="com.hrm.entities.Admin"%>
<%@page errorPage = "error_page.jsp" %>
<%@page import="com.hrm.entities.Message"%>
<%
    Admin admin = (Admin) session.getAttribute("currentAdmin");

    if (admin == null) {
        response.sendRedirect("index.jsp");
    }
%>

<!doctype html>
<html lang="en">
    <!--head-->
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="CSS/index.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/deleteemp.css" rel="stylesheet" type="text/css"/>
        <title>DELTE EMPLOYEE DATA</title>

    </head>

    <body data-new-gr-c-s-check-loaded="14.1054.0" data-gr-ext-installed="">

        <!--navbar-->
        <%@include file="navbar.jsp" %>
        <!--navbar-end-->


        <div class="container-fluid">
            <div class="row">
                <!--sidebar-->
                <%@include file="sidebarnav-adjusted.jsp" %>
                <!--sidebar-end-->

                <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">

                    <div class="container w-50" style="margin-top:60px;">
                        <div class="text-center">
                            <h3>Enter Employee Data to delete them from database</h3>
                        </div>
                        <form action="DeleteServlet" method="post">
                            <div class="row">
                                <div  class="col-md-6 w-50">
                                    <input class="form-control" type="text" name="id" placeholder="Employee ID"/>
                                </div>
                                <div  class="col-md-6"></div>
                                <div  style="margin-top:5vh" class="col-md-6 w-50">
                                    <input class="form-control" type="text" name="fname" placeholder="First Name"/>
                                </div>
                                <div  style="margin-top:5vh"class="col-md-6 w-50">
                                    <input class="form-control" type="text" name="lname" placeholder="Last Name"/>
                                </div>

                                <div  style="margin-top:5vh;" class="col-md-6 w-50">             
                                    <select type="text" name="department" class="form-control">
                                        <option value="Accounts">Accounts</option>
                                        <option value="R&D">R&D</option>
                                        <option value="Management">Management</option>
                                        <option value="IT">Information Technology</option>
                                        <option value="Services">Services</option>
                                        <option vslue="Others">Others</option></select>
                                </div>

                                <!--                                    <input class="form-control" type="text" name="department" placeholder="Department"/>-->

                                <div style="margin-top:5vh" class="col-md-6 w-50">
                                    <!--                                    <input class="form-control" type="text" name="post" placeholder="Post"/>-->
                                        <select type="text" name="post" class="form-control">
                                                <option value="Accounts Manager">Accounts Manager</option>
                                                <option value="Accountant">Accountant</option>
                                                <option value="Research Scientist">Research Scientist</option>
                                                <option value="Research Associate">Research Associate</option>
                                                <option value="Product Manager">Product Manager</option>
                                                <option value="Human Resource Manager">Human Resource Manager</option>
                                                <option value="Software Development Engineer">Software Development Engineer</option>
                                                <option value="Full Stack Developer">Full Stack Developer</option>
                                                <option value="Office Boy">Office Boy</option>
                                                <option value="Intern">Intern</option>
                                            </select>
                                        
                                </div>
                                <div  style="margin-top:5vh" class="col-md-6 w-50">
                                    <input class="form-control" type="text" name="admin_id" placeholder="Enter User ID"/>
                                </div>
                                <div  class="col-md-6" style="margin-top:5vh"></div>
                                <div class="col-md-1" style="margin-top:5vh">
                                    <input type="checkbox" name="check" class="checkbox1"/>
                                </div>
                                <div class="col-md-11" style="margin-top:5vh"><h4>Confirming the deletion of data</h4></div>

                            </div>

                            <%
                                Message m = (Message) session.getAttribute("msg");
                                if (m != null) {
                            %>

                            <div class="alert <%= m.getCssClass()%>" role="alert">
                                <%= m.getContent()%>
                            </div>
                            <%
                                    session.removeAttribute("msg");
                                }
                            %>
                            <button type="submit"style="align:center" class="btn btn-danger">Delete</button>
                        </form>

                        <p><h4>Please Note the Following:</h4>
                        <p>1. All fields are compulsory.</p>
                        <p>2. Once deleted the employee data is removed from database permanently.</p>
                        <p>3. Admin need to enter his ID in the User ID Field.</p>
                        </p>

                    </div>
                </main>
            </div>
        </div>


        <!--scripts-->
        <script src="/docs/5.0/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

        <script src="https://kit.fontawesome.com/8cf25b5050.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <!--scripts-->


    </body>

</html>
