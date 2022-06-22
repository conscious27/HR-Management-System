<%-- 
    Document   : searchfeed
    Created on : 31 Mar, 2022, 10:35:46 AM
    Author     : chait
--%>
<%@page import="com.hrm.entities.Feedback"%>
<%@page import="com.hrm.dao.FeedbackDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : deletefeed
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

    String fId = request.getParameter("feedbackid");
    FeedbackDao feedDao = new FeedbackDao();
    Feedback feed = feedDao.getFeedbyId(fId);

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
        <link href="CSS/deletefeed.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/feedback-show.css" rel="stylesheet" type="text/css"/>
        <title>Feedbacks</title>

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
                    <div role="main" class="form-all">
                        <ul id="feedback-ul"class="form-section page-section">
                            <li id="cid_1" class="form-input-wide" data-type="control_head">
                                <div class="form-header-group  header-large">
                                    <div class="header-text httac htvam">
                                        <h1 id="header_1" class="form-header" data-component="header">
                                            Feedback
                                        </h1>
                                    </div>
                                </div>
                            </li>

                            <li class="form-line" data-type="control_id" id="id_1">
                                <label class="form-label form-label-top form-label-auto"> Employee ID </label>

                                <div data-wrapper-react="true">
                                        <%=feed.getId()%>
                                </div>
                            </li>
                            <li class="form-line" data-type="control_textarea" id="id_2">
                                <label class="form-label form-label-top form-label-auto"> Subject of the Problem </label>
                                <div id="cid_2" class="form-input-wide">
                                    <%=feed.getSubject()%>
                                </div>
                            </li>
                            <li class="form-line" data-type="control_textarea" id="id_3">
                                <label class="form-label form-label-top form-label-auto" > State the problem in detail </label>
                                <div id="cid_3" class="form-input-wide">
                                    <%=feed.getProblem()%>
                                </div>
                            </li>
                            <li class="form-line" data-type="control_textarea" id="id_4">
                                <label class="form-label form-label-top form-label-auto"> Any Suggestion to the problem </label>
                                <div id="cid_4" class="form-input-wide">
                                <%=feed.getSuggestion()%>
                                </div>
                            </li>
                        </ul>
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
