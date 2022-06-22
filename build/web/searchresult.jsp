<%-- 
    Document   : searchemp
    Created on : 31 Mar, 2022, 10:35:46 AM
    Author     : chait
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hrm.entities.Employee"%>
<%@page import="com.hrm.dao.EmployeeDao"%>
<%@page import="com.hrm.dao.EmployeeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Employee List</title>



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


                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Department</th>
                                <th scope="col">Post</th>
                                <th scope="col">Email Address</th>
                                <th scope="col">Mobile No</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                String search = request.getParameter("empSearch");

                                EmployeeDao empDao = new EmployeeDao();
                                List<Employee> showemp = new ArrayList<>();
                                showemp = empDao.empSearch(search);

                                for (Employee emp : showemp) {
                            %>
                            <tr>
                                <td scope="row"><%=emp.getId()%></td>
                                <td><%=emp.getFname()%>&nbsp;<%=emp.getLname()%></td>
                                <td><%=emp.getDepartment()%></td>
                                <td><%=emp.getPost()%></td>
                                <td><%=emp.getEmail()%></td>
                                <td><%=emp.getMobno()%></td>
                                <td>
                                    <a class="btn btn-danger" id="red" href="profile.jsp?empId=<%=emp.getId()%>">Profile</a>

                                    <a class="btn btn-success" id="green" href="updateemp.jsp?empId=<%=emp.getId()%>">Edit</a>
                                    <a class="btn btn-primary" id="blue" href="salaryslip.jsp?empId=<%=emp.getId()%>">Salary Slip</a>

                                </td>
                            </tr>
                            <%
                                }
                            %>

                        </tbody>
                    </table>
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
        <script src="JS/toward.js" type="text/javascript"></script>

    </body>

</html>
