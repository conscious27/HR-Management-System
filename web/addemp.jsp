<%@page import="com.hrm.entities.Admin"%>
<%@page import="com.hrm.entities.Message"%>
<%@page errorPage = "error_page.jsp" %>
<%
    Admin admin = (Admin) session.getAttribute("currentAdmin");

    if (admin == null) {
        response.sendRedirect("index.jsp");
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
        <title>ADD NEW EMPLOYEE</title>

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

                    <form id = "emp-form" style="margin-left: 300px" action="InsertEmp" method="post">
                        <h2 style="margin-left: 110px"> ADD NEW EMPLOYEE</h2>
                        <table class="styled-table" cellpadding="10">

                            <!------ID------------------------------------------------------------------->
                            <tr>
                                <td>ID</td>
                                <td><input type="text" name="id" maxlength="5" />(max 5 characters)</td>

                            </tr>
                            <!----- First Name ---------------------------------------------------------->
                            <tr>
                                <td>FIRST NAME</td>
                                <td><input type="text" name="fname" maxlength="30" />
                                    (max 30 characters a-z and A-Z)
                                </td>
                            </tr>

                            <!----- Last Name ---------------------------------------------------------->
                            <tr>
                                <td>LAST NAME</td>
                                <td><input type="text" name="lname" maxlength="30" />
                                    (max 30 characters a-z and A-Z)
                                </td>
                            </tr>

                            <!----- Date Of Birth -------------------------------------------------------->
                            <tr>
                                <td>DATE OF BIRTH</td>
                                <td>
                                    <input type="date" name="dob" id="datepicker">
                                </td>
                            </tr>


                            <!----- Email Id ---------------------------------------------------------->
                            <tr>
                                <td>EMAIL ID</td>
                                <td><input type="text" name="email" maxlength="100" /></td>
                            </tr>

                            <!----- Mobile Number ---------------------------------------------------------->
                            <tr>
                                <td>MOBILE NUMBER</td>
                                <td>
                                    <input type="text" name="mobno" maxlength="10" />
                                    (10 digit number)
                                </td>
                            </tr>

                            <!----- Gender ----------------------------------------------------------->
                            <tr>
                                <td>GENDER</td>
                                <td>
                                    Male <input type="radio" name="gender" value="Male" />
                                    Female <input type="radio" name="gender" value="Female" />
                                </td>
                            </tr>

                            <!----- Address ---------------------------------------------------------->
                            <tr>
                                <td>ADDRESS <br /><br /><br /></td>
                                <td><textarea name="address" rows="4" cols="30"></textarea></td>
                            </tr>

                            <!----- City ---------------------------------------------------------->
                            <tr>
                                <td>CITY</td>
                                <td><input type="text" name="city" maxlength="30" />
                                    (max 30 characters a-z and A-Z)
                                </td>
                            </tr>

                            <!----- Pin Code ---------------------------------------------------------->
                            <tr>
                                <td>PIN CODE</td>
                                <td><input type="text" name="pinCode" maxlength="6" />
                                    (6 digit number)
                                </td>
                            </tr>

                            <!----- State ---------------------------------------------------------->
                            <tr>
                                <td>STATE</td>
                                <td><input type="text" name="state" maxlength="30" />
                                    (max 30 characters a-z and A-Z)
                                </td>
                            </tr>

                            <!----- Country ---------------------------------------------------------->
                            <tr>
                                <td>COUNTRY</td>
                                <td><input type="text" name="country" value="India" readonly="readonly" /></td>
                            </tr>

                            <!------DEPARTMENT-------------------------------------------------------------->
                            <tr>
                                <td>DEPARTMENT</td>
                                <td><select type="text" name="department">
                                        <option value="Accounts">Accounts</option>
                                        <option value="R&D">R&D</option>
                                        <option value="Management">Management</option>
                                        <option value="IT">Information Technology</option>
                                        <option value="Services">Services</option>
                                        <option vslue="Others">Others</option>
                                    </select>
                                </td>
                            </tr>

                            <!------POST-------------------------------------------------------------->
                            <tr>
                                <td>POST</td>
                                <td><select type="text" name="post">
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
                                </td>
                            </tr>

                            <!------SALARY------------------------------------------------------------>
                            <tr>
                                <td>SALARY</td>
                                <td><input type="text" name="salary" maxlength="30" />
                                    (max 30 characters a-z and A-Z)
                                </td>
                            </tr>

                            <!--About-->
                            <tr>
                                <td>ABOUT</td>
                                <td>
                                    <textarea type="text" name="about" rows ="10" cols="50"></textarea>
                                </td> 
                            </tr>

                            <!----- Checkbox ------------------------------------------------->
                            <tr>
                                <td colspan="2" align="center">
                                    <input name="check" type="checkbox" class ="form-check-input"/>
                                    <label class="form-check-label">Check the Box for Confirmation </label>
                                </td>
                            </tr>

                            <!--Message-->
                            <tr>
                                <%
                                    Message m = (Message) session.getAttribute("msg");
                                    if (m != null) {
                                %>
                                <td colspan="2" align="center">
                                    <label class="alert <%= m.getCssClass()%>" role="alert"\>
                                        <%= m.getContent()%>
                                    </label>
                                </td>
                                <%
                                        session.removeAttribute("msg");
                                    }
                                %>
                            </tr>
                            <!--Submit and Reset-->
                            <tr>
                                <td colspan="2" align="center">
                                    <input type="submit" value="Submit">
                                    <input type="reset" value="Reset">
                                </td>
                            </tr>




                        </table>

                    </form>
                </main>


                <!--scripts-->
                <script src="/docs/5.0/dist/js/bootstrap.bundle.min.js"
                        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
                crossorigin="anonymous"></script>

                <script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js"
                        integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE"
                crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js"
                        integrity="sha384-zNy6FEbO50N+Cg5wap8IKA4M/ZnLJgzc6w2NqACZaK0u0FXfOWRRJOnQtpZun8ha"
                crossorigin="anonymous"></script>
                <script src="dashboard.js"></script>

                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
                crossorigin="anonymous"></script>

                <script src="https://kit.fontawesome.com/8cf25b5050.js" crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
                <!--scripts-->


                </body>
                </html>
