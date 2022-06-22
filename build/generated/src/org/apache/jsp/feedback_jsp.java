package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hrm.entities.Message;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <title>Feedback Form</title>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn02.jotfor.ms/static/prototype.forms.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"https://cdn03.jotfor.ms/static/jotform.forms.js?3.3.32303\" type=\"text/javascript\"></script>\n");
      out.write("    <script defer src=\"https://cdnjs.cloudflare.com/ajax/libs/punycode/1.4.1/punycode.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\tJotForm.newDefaultTheme = false;\n");
      out.write("        JotForm.extendsNewTheme = false;\n");
      out.write("        JotForm.newPaymentUIForNewCreatedForms = false;\n");
      out.write("        JotForm.clearFieldOnHide = \"disable\";\n");
      out.write("        JotForm.submitError = \"jumpToFirstError\";\n");
      out.write("\n");
      out.write("        JotForm.prepareCalculationsOnTheFly([null, {\"name\": \"heading\", \"qid\": \"1\", \"text\": \"Employee Feedback Form\", \"type\": \"control_head\"}, {\"name\": \"submit2\", \"qid\": \"2\", \"text\": \"Submit\", \"type\": \"control_button\"}, {\"name\": \"doYou\", \"qid\": \"3\", \"text\": \"Do you have any suggestions on how to make the work environment more fun?\", \"type\": \"control_textarea\"}, {\"name\": \"doYou4\", \"qid\": \"4\", \"text\": \"Do you have any ideas on what the customers say about our services?\", \"type\": \"control_textarea\"}, {\"name\": \"areYou\", \"qid\": \"5\", \"text\": \"Are you having issues with your job in your current position? If yes, then please explain it below:\", \"type\": \"control_textarea\"}, {\"name\": \"pleaseProvide\", \"qid\": \"6\", \"text\": \"Please provide any suggestions or feedback that will help to make your job responsibilities better.\", \"type\": \"control_textarea\"}, {\"name\": \"isThere\", \"qid\": \"7\", \"text\": \"Is there a work style or culture you don't like in the company?\", \"type\": \"control_textarea\"}, {\"name\": \"whatAre\", \"qid\": \"8\", \"text\": \"What are the things, culture, environment, or policy you would like to change? Please identify them below together with an explanation.\", \"type\": \"control_textarea\"}, {\"name\": \"doYou9\", \"qid\": \"9\", \"text\": \"Do you have any ideas on how you would like to be rewarded for a job well done?\", \"type\": \"control_textarea\"}, {\"name\": \"areYou10\", \"qid\": \"10\", \"text\": \"Are you aware of your job responsibilities and role in the company?\", \"type\": \"control_textarea\"}, {\"name\": \"areThere\", \"qid\": \"11\", \"text\": \"Are there things that you wish you have done better?\", \"type\": \"control_textarea\"}, {\"name\": \"inTerms\", \"qid\": \"12\", \"text\": \"In terms of income salary, compensation, and benefits, are you satisfied with it?\", \"type\": \"control_textarea\"}, {\"name\": \"name\", \"qid\": \"13\", \"text\": \"Name\", \"type\": \"control_fullname\"}, {\"name\": \"email\", \"qid\": \"14\", \"subLabel\": \"example@example.com\", \"text\": \"Email\", \"type\": \"control_email\"}, {\"name\": \"hiringDate\", \"qid\": \"15\", \"text\": \"Hiring Date\", \"type\": \"control_datetime\"}, {\"name\": \"jobPosition\", \"qid\": \"16\", \"text\": \"Job Position\", \"type\": \"control_textbox\"}, {\"name\": \"supervisorsName\", \"qid\": \"17\", \"text\": \"Supervisor's Name\", \"type\": \"control_fullname\"}, {\"name\": \"department\", \"qid\": \"18\", \"text\": \"Department\", \"type\": \"control_textbox\"}, {\"name\": \"feedbackId\", \"qid\": \"19\", \"text\": \"Feedback ID\", \"type\": \"control_autoincrement\"}, null, {\"name\": \"howWould\", \"qid\": \"21\", \"text\": \"How would you rate the leadership of your current manager?\", \"type\": \"control_scale\"}, {\"name\": \"doesYour\", \"qid\": \"22\", \"text\": \"Does your manager able to delegate responsibilities or tasks properly?\", \"type\": \"control_scale\"}, {\"name\": \"doesYour23\", \"qid\": \"23\", \"text\": \"Does your manager motivates you in performing effectively in your job?\", \"type\": \"control_scale\"}, {\"name\": \"doesYour24\", \"qid\": \"24\", \"text\": \"Does your manager take ownership and accountability?\", \"type\": \"control_scale\"}, {\"name\": \"commentsFeedback\", \"qid\": \"25\", \"text\": \"Comments, feedback or suggestions to your current manager\", \"type\": \"control_textarea\"}, {\"name\": \"image\", \"qid\": \"26\", \"text\": \"undraw_investing_7u74.5d9d748119d3a5.82002730\", \"type\": \"control_image\"}]);\n");
      out.write("        setTimeout(function () {\n");
      out.write("            JotForm.paymentExtrasOnTheFly([null, {\"name\": \"heading\", \"qid\": \"1\", \"text\": \"Employee Feedback Form\", \"type\": \"control_head\"}, {\"name\": \"submit2\", \"qid\": \"2\", \"text\": \"Submit\", \"type\": \"control_button\"}, {\"name\": \"doYou\", \"qid\": \"3\", \"text\": \"Do you have any suggestions on how to make the work environment more fun?\", \"type\": \"control_textarea\"}, {\"name\": \"doYou4\", \"qid\": \"4\", \"text\": \"Do you have any ideas on what the customers say about our services?\", \"type\": \"control_textarea\"}, {\"name\": \"areYou\", \"qid\": \"5\", \"text\": \"Are you having issues with your job in your current position? If yes, then please explain it below:\", \"type\": \"control_textarea\"}, {\"name\": \"pleaseProvide\", \"qid\": \"6\", \"text\": \"Please provide any suggestions or feedback that will help to make your job responsibilities better.\", \"type\": \"control_textarea\"}, {\"name\": \"isThere\", \"qid\": \"7\", \"text\": \"Is there a work style or culture you don't like in the company?\", \"type\": \"control_textarea\"}, {\"name\": \"whatAre\", \"qid\": \"8\", \"text\": \"What are the things, culture, environment, or policy you would like to change? Please identify them below together with an explanation.\", \"type\": \"control_textarea\"}, {\"name\": \"doYou9\", \"qid\": \"9\", \"text\": \"Do you have any ideas on how you would like to be rewarded for a job well done?\", \"type\": \"control_textarea\"}, {\"name\": \"areYou10\", \"qid\": \"10\", \"text\": \"Are you aware of your job responsibilities and role in the company?\", \"type\": \"control_textarea\"}, {\"name\": \"areThere\", \"qid\": \"11\", \"text\": \"Are there things that you wish you have done better?\", \"type\": \"control_textarea\"}, {\"name\": \"inTerms\", \"qid\": \"12\", \"text\": \"In terms of income salary, compensation, and benefits, are you satisfied with it?\", \"type\": \"control_textarea\"}, {\"name\": \"name\", \"qid\": \"13\", \"text\": \"Name\", \"type\": \"control_fullname\"}, {\"name\": \"email\", \"qid\": \"14\", \"subLabel\": \"example@example.com\", \"text\": \"Email\", \"type\": \"control_email\"}, {\"name\": \"hiringDate\", \"qid\": \"15\", \"text\": \"Hiring Date\", \"type\": \"control_datetime\"}, {\"name\": \"jobPosition\", \"qid\": \"16\", \"text\": \"Job Position\", \"type\": \"control_textbox\"}, {\"name\": \"supervisorsName\", \"qid\": \"17\", \"text\": \"Supervisor's Name\", \"type\": \"control_fullname\"}, {\"name\": \"department\", \"qid\": \"18\", \"text\": \"Department\", \"type\": \"control_textbox\"}, {\"name\": \"feedbackId\", \"qid\": \"19\", \"text\": \"Feedback ID\", \"type\": \"control_autoincrement\"}, null, {\"name\": \"howWould\", \"qid\": \"21\", \"text\": \"How would you rate the leadership of your current manager?\", \"type\": \"control_scale\"}, {\"name\": \"doesYour\", \"qid\": \"22\", \"text\": \"Does your manager able to delegate responsibilities or tasks properly?\", \"type\": \"control_scale\"}, {\"name\": \"doesYour23\", \"qid\": \"23\", \"text\": \"Does your manager motivates you in performing effectively in your job?\", \"type\": \"control_scale\"}, {\"name\": \"doesYour24\", \"qid\": \"24\", \"text\": \"Does your manager take ownership and accountability?\", \"type\": \"control_scale\"}, {\"name\": \"commentsFeedback\", \"qid\": \"25\", \"text\": \"Comments, feedback or suggestions to your current manager\", \"type\": \"control_textarea\"}, {\"name\": \"image\", \"qid\": \"26\", \"text\": \"undraw_investing_7u74.5d9d748119d3a5.82002730\", \"type\": \"control_image\"}]);\n");
      out.write("        }, 20);\n");
      out.write("    </script>\n");
      out.write("    <link href=\"https://cdn01.jotfor.ms/static/formCss.css?3.3.32303\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"https://cdn02.jotfor.ms/css/styles/nova.css?3.3.32303\" />\n");
      out.write("    <style type=\"text/css\">@media print{.form-section{display:inline!important}.form-pagebreak{display:none!important}.form-section-closed{height:auto!important}.page-section{position:initial!important}}</style>\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"https://cdn03.jotfor.ms/themes/CSS/566a91c2977cdfcd478b4567.css?\"/>\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"https://cdn01.jotfor.ms/css/styles/payment/payment_feature.css?3.3.32303\" />\n");
      out.write("    <link href=\"CSS/feedback.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("            ");

            Message m = (Message) session.getAttribute("msg");
            if (m != null) {
        
      out.write("\n");
      out.write("            <div class=\"alert ");
      out.print( m.getCssClass());
      out.write(" text-center\" role=\"alert\"\\>\n");
      out.write("                ");
      out.print( m.getContent());
      out.write("\n");
      out.write("            </div>\n");
      out.write("        ");

                session.removeAttribute("msg");
            }
        
      out.write("\n");
      out.write("    <div style=\"margin-left:28vw;\"class=\"container\">\n");
      out.write("\n");
      out.write("        <form class=\"jotform-form\" action=\"FeedbackServlet\" method=\"post\" accept-charset=\"utf-8\" autocomplete=\"on\">\n");
      out.write("            <div role=\"main\" class=\"form-all\">\n");
      out.write("                <ul class=\"form-section page-section\">\n");
      out.write("                    <li id=\"cid_1\" class=\"form-input-wide\" data-type=\"control_head\">\n");
      out.write("                        <div class=\"form-header-group  header-large\">\n");
      out.write("                            <div class=\"header-text httac htvam\">\n");
      out.write("                                <h1 id=\"header_1\" class=\"form-header\" data-component=\"header\">\n");
      out.write("                                    Employee Feedback Form\n");
      out.write("                                </h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"form-line\" data-type=\"control_id\" id=\"id_1\">\n");
      out.write("                        <label class=\"form-label form-label-top form-label-auto\" id=\"label_1\" for=\"input_1\"> Employee ID </label>\n");
      out.write("\n");
      out.write("                        <div data-wrapper-react=\"true\">\n");
      out.write("                            <span class=\"form-sub-label-container\" style=\"vertical-align:top\" data-input-type=\"first\">\n");
      out.write("                                <input type=\"text\" id=\"input_1\" name=\"id\" class=\"form-textbox\" data-defaultvalue=\"\" autoComplete=\"section-input_13 id\" size=\"15\" value=\"\" data-component=\"first\" aria-labelledby=\"label_1 sublabel_1_id\" />\n");
      out.write("                                <label class=\"form-sub-label\" for=\"first_1\" id=\"sublabel_1_id\" style=\"min-height:13px\" aria-hidden=\"false\"> Employee ID </label>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"form-line\" data-type=\"control_textarea\" id=\"id_2\">\n");
      out.write("                        <label class=\"form-label form-label-top form-label-auto\" id=\"label_2\" for=\"input_2\"> Subject of the Problem </label>\n");
      out.write("                        <div id=\"cid_2\" class=\"form-input-wide\">\n");
      out.write("                            <textarea id=\"input_2\" class=\"form-textarea\" name=\"subject\" cols=\"60\" rows=\"6\" data-component=\"textarea\" aria-labelledby=\"label_2\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"form-line\" data-type=\"control_textarea\" id=\"id_3\">\n");
      out.write("                        <label class=\"form-label form-label-top form-label-auto\" id=\"label_3\" for=\"input_3\"> State the problem in detail </label>\n");
      out.write("                        <div id=\"cid_3\" class=\"form-input-wide\">\n");
      out.write("                            <textarea id=\"input_3\" class=\"form-textarea\" name=\"problem\" cols=\"60\" rows=\"6\" data-component=\"textarea\" aria-labelledby=\"label_3\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"form-line\" data-type=\"control_textarea\" id=\"id_4\">\n");
      out.write("                        <label class=\"form-label form-label-top form-label-auto\" id=\"label_4\" for=\"input_4\"> Any Suggestion to the problem </label>\n");
      out.write("                        <div id=\"cid_4\" class=\"form-input-wide\">\n");
      out.write("                            <textarea id=\"input_4\" class=\"form-textarea\" name=\"suggestion\" cols=\"60\" rows=\"6\" data-component=\"textarea\" aria-labelledby=\"label_4\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"form-line\" data-type=\"control_image\" id=\"id_5\">\n");
      out.write("                        <div id=\"cid_5\" class=\"form-input-wide\">\n");
      out.write("                            <div style=\"text-align:center\">\n");
      out.write("                                <img alt=\"\" loading=\"lazy\" class=\"form-image\" style=\"border:0\" src=\"https://www.jotform.com/uploads/VanessaDavid/form_files/undraw_investing_7u74.5d9d748119d3a5.82002730.png\" height=\"252px\" width=\"318px\" data-component=\"image\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"form-line\" data-type=\"control_button\" id=\"id_6\">\n");
      out.write("                        <div id=\"cid_6\" class=\"form-input-wide\">\n");
      out.write("                            <div style=\"text-align:center\" data-align=\"center\" class=\"form-buttons-wrapper form-buttons-center   jsTest-button-wrapperField\">\n");
      out.write("                                <button id=\"input_6\" type=\"submit\" class=\"form-submit-button submit-button jf-form-buttons jsTest-submitField\" data-component=\"button\" data-content=\"\">\n");
      out.write("                                    Submit\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                var all_spc = document.querySelectorAll(\"form[id='220893560871462'] .si\" + \"mple\" + \"_spc\");\n");
      out.write("                for (var i = 0; i < all_spc.length; i++)\n");
      out.write("                {\n");
      out.write("                    all_spc[i].value = \"220893560871462-220893560871462\";\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\n");
      out.write("    <!--\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("    -->\n");
      out.write("</body>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
