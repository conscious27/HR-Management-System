<%-- 
    Document   : login
    Created on : 23 Mar, 2022, 8:23:31 PM
    Author     : chait
--%>
<%@page import="com.hrm.entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="CSS/login.css" rel="stylesheet" type="text/css"/>

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <title>LOGIN</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            <div class="container" id="login_form" >
                <div>
                    <img src="IMAGES/admin1.png" alt="admin" class="center"/>
                </div>
                <div style = "margin-top:10px">
                    <h4>
                        <i class="fa-brands fa-redhat"></i> Enter Login Credentials to enter the System
                    </h4>
                </div>

                <!--error message-->
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


                <div class="col-md">
                    <i class="fa-solid fa-user"></i>
                    <label for="Username" class="form-label"><b>Username</b></label>
                    <input placeholder="Username" type="text" class="form-control" name="Username" >
                </div>
                <div class="col-md">
                    <i class="fa-solid fa-key"></i>
                    <label for="Password" class="form-label"><b>Password</b></label>
                    <input placeholder = "Password" type="password" class="form-control" name="Password">
                </div>
                <div>
                    <button style = "margin-top:10px;" type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

        <script src="https://kit.fontawesome.com/8cf25b5050.js" crossorigin="anonymous"></script>
</html>