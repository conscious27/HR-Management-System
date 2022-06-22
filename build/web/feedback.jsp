<%@page import="com.hrm.entities.Message"%>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Feedback Form</title>

    <script src="https://cdn02.jotfor.ms/static/prototype.forms.js" type="text/javascript"></script>
    <script src="https://cdn03.jotfor.ms/static/jotform.forms.js?3.3.32303" type="text/javascript"></script>
    <script defer src="https://cdnjs.cloudflare.com/ajax/libs/punycode/1.4.1/punycode.js"></script>
    <script type="text/javascript">	JotForm.newDefaultTheme = false;
        JotForm.extendsNewTheme = false;
        JotForm.newPaymentUIForNewCreatedForms = false;
        JotForm.clearFieldOnHide = "disable";
        JotForm.submitError = "jumpToFirstError";

        JotForm.prepareCalculationsOnTheFly([null, {"name": "heading", "qid": "1", "text": "Employee Feedback Form", "type": "control_head"}, {"name": "submit2", "qid": "2", "text": "Submit", "type": "control_button"}, {"name": "doYou", "qid": "3", "text": "Do you have any suggestions on how to make the work environment more fun?", "type": "control_textarea"}, {"name": "doYou4", "qid": "4", "text": "Do you have any ideas on what the customers say about our services?", "type": "control_textarea"}, {"name": "areYou", "qid": "5", "text": "Are you having issues with your job in your current position? If yes, then please explain it below:", "type": "control_textarea"}, {"name": "pleaseProvide", "qid": "6", "text": "Please provide any suggestions or feedback that will help to make your job responsibilities better.", "type": "control_textarea"}, {"name": "isThere", "qid": "7", "text": "Is there a work style or culture you don't like in the company?", "type": "control_textarea"}, {"name": "whatAre", "qid": "8", "text": "What are the things, culture, environment, or policy you would like to change? Please identify them below together with an explanation.", "type": "control_textarea"}, {"name": "doYou9", "qid": "9", "text": "Do you have any ideas on how you would like to be rewarded for a job well done?", "type": "control_textarea"}, {"name": "areYou10", "qid": "10", "text": "Are you aware of your job responsibilities and role in the company?", "type": "control_textarea"}, {"name": "areThere", "qid": "11", "text": "Are there things that you wish you have done better?", "type": "control_textarea"}, {"name": "inTerms", "qid": "12", "text": "In terms of income salary, compensation, and benefits, are you satisfied with it?", "type": "control_textarea"}, {"name": "name", "qid": "13", "text": "Name", "type": "control_fullname"}, {"name": "email", "qid": "14", "subLabel": "example@example.com", "text": "Email", "type": "control_email"}, {"name": "hiringDate", "qid": "15", "text": "Hiring Date", "type": "control_datetime"}, {"name": "jobPosition", "qid": "16", "text": "Job Position", "type": "control_textbox"}, {"name": "supervisorsName", "qid": "17", "text": "Supervisor's Name", "type": "control_fullname"}, {"name": "department", "qid": "18", "text": "Department", "type": "control_textbox"}, {"name": "feedbackId", "qid": "19", "text": "Feedback ID", "type": "control_autoincrement"}, null, {"name": "howWould", "qid": "21", "text": "How would you rate the leadership of your current manager?", "type": "control_scale"}, {"name": "doesYour", "qid": "22", "text": "Does your manager able to delegate responsibilities or tasks properly?", "type": "control_scale"}, {"name": "doesYour23", "qid": "23", "text": "Does your manager motivates you in performing effectively in your job?", "type": "control_scale"}, {"name": "doesYour24", "qid": "24", "text": "Does your manager take ownership and accountability?", "type": "control_scale"}, {"name": "commentsFeedback", "qid": "25", "text": "Comments, feedback or suggestions to your current manager", "type": "control_textarea"}, {"name": "image", "qid": "26", "text": "undraw_investing_7u74.5d9d748119d3a5.82002730", "type": "control_image"}]);
        setTimeout(function () {
            JotForm.paymentExtrasOnTheFly([null, {"name": "heading", "qid": "1", "text": "Employee Feedback Form", "type": "control_head"}, {"name": "submit2", "qid": "2", "text": "Submit", "type": "control_button"}, {"name": "doYou", "qid": "3", "text": "Do you have any suggestions on how to make the work environment more fun?", "type": "control_textarea"}, {"name": "doYou4", "qid": "4", "text": "Do you have any ideas on what the customers say about our services?", "type": "control_textarea"}, {"name": "areYou", "qid": "5", "text": "Are you having issues with your job in your current position? If yes, then please explain it below:", "type": "control_textarea"}, {"name": "pleaseProvide", "qid": "6", "text": "Please provide any suggestions or feedback that will help to make your job responsibilities better.", "type": "control_textarea"}, {"name": "isThere", "qid": "7", "text": "Is there a work style or culture you don't like in the company?", "type": "control_textarea"}, {"name": "whatAre", "qid": "8", "text": "What are the things, culture, environment, or policy you would like to change? Please identify them below together with an explanation.", "type": "control_textarea"}, {"name": "doYou9", "qid": "9", "text": "Do you have any ideas on how you would like to be rewarded for a job well done?", "type": "control_textarea"}, {"name": "areYou10", "qid": "10", "text": "Are you aware of your job responsibilities and role in the company?", "type": "control_textarea"}, {"name": "areThere", "qid": "11", "text": "Are there things that you wish you have done better?", "type": "control_textarea"}, {"name": "inTerms", "qid": "12", "text": "In terms of income salary, compensation, and benefits, are you satisfied with it?", "type": "control_textarea"}, {"name": "name", "qid": "13", "text": "Name", "type": "control_fullname"}, {"name": "email", "qid": "14", "subLabel": "example@example.com", "text": "Email", "type": "control_email"}, {"name": "hiringDate", "qid": "15", "text": "Hiring Date", "type": "control_datetime"}, {"name": "jobPosition", "qid": "16", "text": "Job Position", "type": "control_textbox"}, {"name": "supervisorsName", "qid": "17", "text": "Supervisor's Name", "type": "control_fullname"}, {"name": "department", "qid": "18", "text": "Department", "type": "control_textbox"}, {"name": "feedbackId", "qid": "19", "text": "Feedback ID", "type": "control_autoincrement"}, null, {"name": "howWould", "qid": "21", "text": "How would you rate the leadership of your current manager?", "type": "control_scale"}, {"name": "doesYour", "qid": "22", "text": "Does your manager able to delegate responsibilities or tasks properly?", "type": "control_scale"}, {"name": "doesYour23", "qid": "23", "text": "Does your manager motivates you in performing effectively in your job?", "type": "control_scale"}, {"name": "doesYour24", "qid": "24", "text": "Does your manager take ownership and accountability?", "type": "control_scale"}, {"name": "commentsFeedback", "qid": "25", "text": "Comments, feedback or suggestions to your current manager", "type": "control_textarea"}, {"name": "image", "qid": "26", "text": "undraw_investing_7u74.5d9d748119d3a5.82002730", "type": "control_image"}]);
        }, 20);
    </script>
    <link href="https://cdn01.jotfor.ms/static/formCss.css?3.3.32303" rel="stylesheet" type="text/css" />
    <link type="text/css" rel="stylesheet" href="https://cdn02.jotfor.ms/css/styles/nova.css?3.3.32303" />
    <style type="text/css">@media print{.form-section{display:inline!important}.form-pagebreak{display:none!important}.form-section-closed{height:auto!important}.page-section{position:initial!important}}</style>
    <link type="text/css" rel="stylesheet" href="https://cdn03.jotfor.ms/themes/CSS/566a91c2977cdfcd478b4567.css?"/>
    <link type="text/css" rel="stylesheet" href="https://cdn01.jotfor.ms/css/styles/payment/payment_feature.css?3.3.32303" />
    <link href="CSS/feedback.css" rel="stylesheet" type="text/css"/>
</head>

<body>
            <%
            Message m = (Message) session.getAttribute("msg");
            if (m != null) {
        %>
            <div class="alert <%= m.getCssClass()%> text-center" role="alert"\>
                <%= m.getContent()%>
            </div>
        <%
                session.removeAttribute("msg");
            }
        %>
    <div style="margin-left:28vw;"class="container">

        <form class="jotform-form" action="FeedbackServlet" method="post" accept-charset="utf-8" autocomplete="on">
            <div role="main" class="form-all">
                <ul class="form-section page-section">
                    <li id="cid_1" class="form-input-wide" data-type="control_head">
                        <div class="form-header-group  header-large">
                            <div class="header-text httac htvam">
                                <h1 id="header_1" class="form-header" data-component="header">
                                    Employee Feedback Form
                                </h1>
                            </div>
                        </div>
                    </li>

                    <li class="form-line" data-type="control_id" id="id_1">
                        <label class="form-label form-label-top form-label-auto" id="label_1" for="input_1"> Employee ID </label>

                        <div data-wrapper-react="true">
                            <span class="form-sub-label-container" style="vertical-align:top" data-input-type="first">
                                <input type="text" id="input_1" name="id" class="form-textbox" data-defaultvalue="" autoComplete="section-input_13 id" size="15" value="" data-component="first" aria-labelledby="label_1 sublabel_1_id" />
                                <label class="form-sub-label" for="first_1" id="sublabel_1_id" style="min-height:13px" aria-hidden="false"> Employee ID </label>
                            </span>
                        </div>
                    </li>
                    <li class="form-line" data-type="control_textarea" id="id_2">
                        <label class="form-label form-label-top form-label-auto" id="label_2" for="input_2"> Subject of the Problem </label>
                        <div id="cid_2" class="form-input-wide">
                            <textarea id="input_2" class="form-textarea" name="subject" cols="60" rows="6" data-component="textarea" aria-labelledby="label_2"></textarea>
                        </div>
                    </li>
                    <li class="form-line" data-type="control_textarea" id="id_3">
                        <label class="form-label form-label-top form-label-auto" id="label_3" for="input_3"> State the problem in detail </label>
                        <div id="cid_3" class="form-input-wide">
                            <textarea id="input_3" class="form-textarea" name="problem" cols="60" rows="6" data-component="textarea" aria-labelledby="label_3"></textarea>
                        </div>
                    </li>
                    <li class="form-line" data-type="control_textarea" id="id_4">
                        <label class="form-label form-label-top form-label-auto" id="label_4" for="input_4"> Any Suggestion to the problem </label>
                        <div id="cid_4" class="form-input-wide">
                            <textarea id="input_4" class="form-textarea" name="suggestion" cols="60" rows="6" data-component="textarea" aria-labelledby="label_4"></textarea>
                        </div>
                    </li>

                    <li class="form-line" data-type="control_image" id="id_5">
                        <div id="cid_5" class="form-input-wide">
                            <div style="text-align:center">
                                <img alt="" loading="lazy" class="form-image" style="border:0" src="https://www.jotform.com/uploads/VanessaDavid/form_files/undraw_investing_7u74.5d9d748119d3a5.82002730.png" height="252px" width="318px" data-component="image" />
                            </div>
                        </div>
                    </li>
                    <li class="form-line" data-type="control_button" id="id_6">
                        <div id="cid_6" class="form-input-wide">
                            <div style="text-align:center" data-align="center" class="form-buttons-wrapper form-buttons-center   jsTest-button-wrapperField">
                                <button id="input_6" type="submit" class="form-submit-button submit-button jf-form-buttons jsTest-submitField" data-component="button" data-content="">
                                    Submit
                                </button>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>


            <script type="text/javascript">
                var all_spc = document.querySelectorAll("form[id='220893560871462'] .si" + "mple" + "_spc");
                for (var i = 0; i < all_spc.length; i++)
                {
                    all_spc[i].value = "220893560871462-220893560871462";
                }
            </script>
        </form>
    </div>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
</body>

