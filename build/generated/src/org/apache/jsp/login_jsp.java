package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hrm.entities.Message;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"CSS/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>LOGIN</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("            <div class=\"container\" id=\"login_form\" >\n");
      out.write("                <div>\n");
      out.write("                    <img src=\"IMAGES/admin1.png\" alt=\"admin\" class=\"center\"/>\n");
      out.write("                </div>\n");
      out.write("                <div style = \"margin-top:10px\">\n");
      out.write("                    <h4>\n");
      out.write("                        <i class=\"fa-brands fa-redhat\"></i> Enter Login Credentials to enter the System\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--error message-->\n");
      out.write("                ");

                    Message m = (Message) session.getAttribute("msg");
                    if (m != null) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"alert ");
      out.print( m.getCssClass());
      out.write("\" role=\"alert\">\n");
      out.write("                    ");
      out.print( m.getContent());
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                    session.removeAttribute("msg");
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md\">\n");
      out.write("                    <i class=\"fa-solid fa-user\"></i>\n");
      out.write("                    <label for=\"Username\" class=\"form-label\"><b>Username</b></label>\n");
      out.write("                    <input placeholder=\"Username\" type=\"text\" class=\"form-control\" name=\"Username\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md\">\n");
      out.write("                    <i class=\"fa-solid fa-key\"></i>\n");
      out.write("                    <label for=\"Password\" class=\"form-label\"><b>Password</b></label>\n");
      out.write("                    <input placeholder = \"Password\" type=\"password\" class=\"form-control\" name=\"Password\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <button style = \"margin-top:10px;\" type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/8cf25b5050.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</html>");
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
