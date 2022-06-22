<%-- 
    Document   : error_page
    Created on : 29 Mar, 2022, 2:57:39 PM
    Author     : chait
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
<!--    <style>
        #error-png{
            margin-left: auto;
            margin-right: auto;
            display: block;
            margin-top: 20vh;
        }
        
        h1{
            margin-left: 35vw;
            margin-top: 7vh;
        }
        
        a{
            margin-left: 45vw;
            margin-top: 7vh;
        }
    </style>-->
    <title>Something Went Wrong!...</title>
  </head>
  <body>
      <div class="container text-center">
      <img id="error-png" src="IMAGES/error.png" alt="" class ="img-fluid"/>
      <h1>Something went Wrong!!!!........</h1>
      <p><%= exception%></p>
      <a href= "index.jsp" class="btn btn-primary">return to homepage</a>
  </body>
</html>