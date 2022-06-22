<%@page import="com.hrm.entities.Admin"%>
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
        <title>Home</title>
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


                    <div>
                        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                            <div class="btn-toolbar mb-2 mb-md-0">
                                <!--carousel-->
                                <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
                                    <div class="carousel-indicators">
                                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0"
                                                class="active" aria-current="true" aria-label="Slide 1"></button>
                                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
                                                aria-label="Slide 2"></button>
                                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
                                                aria-label="Slide 3"></button>
                                    </div>
                                    <div class="carousel-inner">
                                        <div class="carousel-item active">
                                            <!--                                    <img src="..." class="d-block w-100" alt="...">-->
                                            <img src="IMAGES/company offcie 1.jpg" alt=""/>
                                        </div>
                                        <div class="carousel-item">
                                            <!--                                    <img src="..." class="d-block w-100" alt="...">-->
                                            <img src="https://source.unsplash.com/random/1250x350/?Buildings" alt="" />
                                        </div>
                                        <div class="carousel-item">
                                            <!--                                    <img src="..." class="d-block w-100" alt="...">-->
                                            <img src="https://source.unsplash.com/random/1250x350/?office" alt="" />
                                        </div>
                                    </div>
                                    <button class="carousel-control-prev" type="button"
                                            data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                        <span class="visually-hidden">Previous</span>
                                    </button>
                                    <button class="carousel-control-next" type="button"
                                            data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                        <span class="visually-hidden">Next</span>
                                    </button>
                                </div>
                                <!--carousel-end-->
                            </div>
                        </div>


                        <h2>DASHBOARD</h2>
                        <!--info Table-->
                        <div class="table-responsive">
                            <table class="table table-striped table-sm">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Department</th>
                                        <th scope="col">Total Employee</th>
                                        <th scope="col">Active</th>
                                        <th scope="col">On Leave</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td> 1 </td>
                                        <td>Accounts</td>
                                        <td>100</td>
                                        <td>89</td>
                                        <td>11</td>
                                    </tr>
                                    <tr>
                                        <td> 2 </td>
                                        <td>Management</td>
                                        <td>25</td>
                                        <td>24</td>
                                        <td>1</td>
                                    </tr>
                                    <tr>
                                        <td> 3 </td>
                                        <td>Research & Development</td>
                                        <td>50</td>
                                        <td>47</td>
                                        <td>3</td>
                                    </tr>
                                    <tr>
                                        <td> 4 </td>
                                        <td>Information Technology</td>
                                        <td>75</td>
                                        <td>70</td>
                                        <td>5</td>
                                    </tr>
                                    <tr>
                                        <td> 5 </td>
                                        <td>Services</td>
                                        <td>125</td>
                                        <td>122</td>
                                        <td>3</td>
                                    </tr>
                                    <tr>
                                        <td> 6 </td>
                                        <td>Others</td>
                                        <td>150</td>
                                        <td>150</td>
                                        <td>0</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <!--info Table-end-->
                </main>
            </div>

        </div>

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
        <!--scripts-->
    </body>

</html>
