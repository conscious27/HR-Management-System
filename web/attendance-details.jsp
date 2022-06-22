<%@page import="com.hrm.dao.EmployeeDao"%>
<%@page import="com.hrm.dao.AttendanceDao"%>
<%@page import="com.hrm.entities.Admin"%>
<%@page import="com.hrm.entities.Employee"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hrm.entities.Attendance"%>
<%@page errorPage = "error_page.jsp" %>

<%
    Admin admin = (Admin) session.getAttribute("currentAdmin");

    if (admin == null) {
        response.sendRedirect("login.jsp");
    }
%>

<!doctype html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="CSS/index.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/addemp.css" rel="stylesheet" type="text/css"/>
        <title>Attendance Details</title>
    </head>

    <body data-new-gr-c-s-check-loaded="14.1054.0" data-gr-ext-installed="">

        <!--navbar-->
        <%@include file="navbar.jsp" %>
        <!--navbar-end-->


        <div class="container-fluid">
            <div class="row">
                <!--sidebar-->
                <%@include file="sidebarnav.jsp" %>
                <!--sidebar-end-->

                <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
                    
                    <h1 style="margin-left:18vw;"> Previous Month Attendance Details </h1>
<!--                    <div style="margin-left: 8vw;"class="btn-group btn-group-lg" role="group">
                        <a type="button" class="btn btn-outline-primary">Accounts</a>
                        <a type="button" class="btn btn-outline-success">Research and Development</a>
                        <a type="button" class="btn btn-outline-danger">Managements</a>
                        <a type="button" class="btn btn-outline-dark">Information Technology</ba
                        <a type="button" class="btn btn-outline-warning">Services</a>
                        <a type="button" class="btn btn-outline-info">Others</a>
                    </div>-->
                    `                   
                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Department</th>
                                <th scope="col">Post</th>
                                <th scope="col">Present</th>
                                <th scope="col">On Leave</th>
                        </thead>

                        <tbody>
                            <%
//                                FeedbackDao feedDao = new FeedbackDao();
//                                List<Feedback> showfeed = new ArrayList<>();
//                                showfeed = feedDao.feedSearch();
//                                for (Feedback feed : showfeed) {
                                AttendanceDao attendanceDao = new AttendanceDao();
                                List<Attendance> attendanceList = new ArrayList<>();
                                attendanceList = attendanceDao.AttendanceDisplay();

                                for (Attendance attendance : attendanceList) {

                                    EmployeeDao empDao = new EmployeeDao();
                                    List<Employee> empList = new ArrayList<>();
                                    empList = empDao.searchEmpById(attendance.getId());

                                    for (Employee emp : empList) {

                            %>
                            <tr>
                                <td scope="row"><%=attendance.getId()%></td>
                                <td><%=emp.getFname()%>&nbsp;<%=emp.getLname()%></td>
                                <td><%=emp.getDepartment()%></td>
                                <td><%=emp.getPost()%></td>
                                <td><%=attendance.getActive()%></td>
                                <td><%=attendance.getOnLeave()%></td>
                            </tr>
                            <%
                                    }
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
        <!--scripts-->
    </body>

</html>
