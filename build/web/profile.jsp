<%-- 
    Document   : profile.jsp
    Created on : 3 Apr, 2022, 2:50:42 PM
    Author     : chait
--%>
<%@page import="com.hrm.entities.Admin"%>
<%@page import="com.hrm.entities.Employee"%>
<%@page import="com.hrm.dao.EmployeeDao"%>
<%
    Admin admin = (Admin) session.getAttribute("currentAdmin");

    if (admin == null) {
        response.sendRedirect("index.jsp");
    }

    String empId = request.getParameter("empId");
    EmployeeDao empDao = new EmployeeDao();
    Employee emp = empDao.empById(empId);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PROFILE PAGE</title>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="CSS/index.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/addemp.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <body data-new-gr-c-s-check-loaded="14.1054.0" data-gr-ext-installed="">

        <!--navbar-->
        <%@include file="navbar.jsp" %>
        <!--navbar-end-->


        <div class="container-fluid" id="view">
            <div class="row">
                <!--sidebar-->
                <%@include file="sidebarnav.jsp" %>
                <!--sidebar-end-->

                <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
                    <form id = "emp-form" style="margin-left: 300px" action="InsertEmp" method="post">
                        <h2 style="margin-left: 110px"> <%=emp.getFname()%>&nbsp;<%=emp.getLname()%></h2>
                        <table class="styled-table" cellpadding="10">

                            <!------ID------------------------------------------------------------------->
                            <tr>
                                <td>ID</td>
                                <td style="color:darkblue"><%= emp.getId()%></td>

                            </tr>
                            <!----- First Name ---------------------------------------------------------->
                            <tr>
                                <td>FIRST NAME</td>
                                <td>   <%= emp.getFname()%>
                                </td>
                            </tr>

                            <!----- Last Name ---------------------------------------------------------->
                            <tr>
                                <td>LAST NAME</td>
                                <td><%= emp.getLname()%>
                                </td>
                            </tr>

                            <!----- Date Of Birth -------------------------------------------------------->
                            <tr>
                                <td>DATE OF BIRTH</td>
                                <td>
                                    <%= emp.getDate()%>
                                </td>
                            </tr>


                            <!----- Email Id ---------------------------------------------------------->
                            <tr>
                                <td>EMAIL ID</td>
                                <td><%= emp.getEmail()%></td>
                            </tr>

                            <!----- Mobile Number ---------------------------------------------------------->
                            <tr>
                                <td>MOBILE NUMBER</td>
                                <td>
                                    <%= emp.getMobno()%>
                                </td>
                            </tr>

                            <!----- Gender ----------------------------------------------------------->
                            <tr>
                                <td>GENDER</td>
                                <td><%= emp.getGender()%>
                                </td>
                            </tr>

                            <!----- Address ---------------------------------------------------------->
                            <tr>
                                <td>ADDRESS <br /><br /><br /></td>
                                <td><%= emp.getAddress()%></td>
                            </tr>

                            <!----- City ---------------------------------------------------------->
                            <tr>
                                <td>CITY</td>
                                <td><%= emp.getCity()%>
                                </td>
                            </tr>

                            <!----- Pin Code ---------------------------------------------------------->
                            <tr>
                                <td>PIN CODE</td>
                                <td><%= emp.getPinCode()%>
                                </td>
                            </tr>

                            <!----- State ---------------------------------------------------------->
                            <tr>
                                <td>STATE</td>
                                <td><%= emp.getState()%>
                                </td>
                            </tr>

                            <!----- Country ---------------------------------------------------------->
                            <tr>
                                <td>Country</td>
                                <td><%= emp.getCountry()%></td>
                            </tr>

                            <!------DEPARTMENT-------------------------------------------------------------->
                            <tr>
                                <td>DEPARTMENT</td>
                                <td><%= emp.getDepartment()%>
                                </td>
                            </tr>

                            <!------POST-------------------------------------------------------------->
                            <tr>
                                <td>POST</td>
                                <td><%= emp.getPost()%>
                                </td>
                            </tr>

                            <!------SALARY------------------------------------------------------------>
                            <tr>
                                <td>SALARY</td>
                                <td><%= emp.getSalary()%>
                                </td>
                            </tr>

                            <!--About-->
                            <tr>
                                <td>ABOUT</td>
                                <td>
                                    <%= emp.getAbout()%>
                                </td> 
                            </tr>

                        </table>

                    </form>
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
