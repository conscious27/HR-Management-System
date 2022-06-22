package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebarnav_002dadjusted_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<nav id=\"sidebarMenu\" class=\"col-md-3 col-lg-2 bg-dark d-md-block sidebar collapse\">\n");
      out.write("    <div class=\"position-sticky pt-3\">\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                         fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                         stroke-linejoin=\"round\" class=\"feather feather-home\" aria-hidden=\"true\">\n");
      out.write("                        <path d=\"M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z\"></path>\n");
      out.write("                        <polyline points=\"9 22 9 12 15 12 15 22\"></polyline>\n");
      out.write("                    </svg>\n");
      out.write("                    Dashboard\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"addemp.jsp\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                         fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                         stroke-linejoin=\"round\" class=\"feather feather-file\" aria-hidden=\"true\">\n");
      out.write("                        <path d=\"M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z\"></path>\n");
      out.write("                        <polyline points=\"13 2 13 9 20 9\"></polyline>\n");
      out.write("                    </svg>\n");
      out.write("                    Add New Employee\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"deleteemp.jsp\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                         fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                         stroke-linejoin=\"round\" class=\"feather feather-shopping-cart\" aria-hidden=\"true\">\n");
      out.write("                        <circle cx=\"9\" cy=\"21\" r=\"1\"></circle>\n");
      out.write("                        <circle cx=\"20\" cy=\"21\" r=\"1\"></circle>\n");
      out.write("                        <path d=\"M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6\"></path>\n");
      out.write("                    </svg>\n");
      out.write("                    Delete Employee Data\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"performance.jsp\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                         fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                         stroke-linejoin=\"round\" class=\"feather feather-bar-chart-2\" aria-hidden=\"true\">\n");
      out.write("                        <line x1=\"18\" y1=\"20\" x2=\"18\" y2=\"10\"></line>\n");
      out.write("                        <line x1=\"12\" y1=\"20\" x2=\"12\" y2=\"4\"></line>\n");
      out.write("                        <line x1=\"6\" y1=\"20\" x2=\"6\" y2=\"14\"></line>\n");
      out.write("                    </svg>\n");
      out.write("                    Performance Reports\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"attendance-details.jsp\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                         fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                         stroke-linejoin=\"round\" class=\"feather feather-file-text\" aria-hidden=\"true\">\n");
      out.write("                        <path d=\"M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z\"></path>\n");
      out.write("                        <polyline points=\"14 2 14 8 20 8\"></polyline>\n");
      out.write("                        <line x1=\"16\" y1=\"13\" x2=\"8\" y2=\"13\"></line>\n");
      out.write("                        <line x1=\"16\" y1=\"17\" x2=\"8\" y2=\"17\"></line>\n");
      out.write("                        <polyline points=\"10 9 9 9 8 9\"></polyline>\n");
      out.write("                    </svg>\n");
      out.write("                    Attendance Details\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <h6\n");
      out.write("            class=\"sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted\">\n");
      out.write("            <span>Utilities</span>\n");
      out.write("            <a class=\"link-secondary\" href=\"#\" aria-label=\"Add a new report\">\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                     fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                     stroke-linejoin=\"round\" class=\"feather feather-plus-circle\" aria-hidden=\"true\">\n");
      out.write("                    <circle cx=\"12\" cy=\"12\" r=\"10\"></circle>\n");
      out.write("                    <line x1=\"12\" y1=\"8\" x2=\"12\" y2=\"16\"></line>\n");
      out.write("                    <line x1=\"8\" y1=\"12\" x2=\"16\" y2=\"12\"></line>\n");
      out.write("                </svg>\n");
      out.write("            </a>\n");
      out.write("        </h6>\n");
      out.write("        <ul class=\"nav flex-column mb-2\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"calendar.jsp\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                         fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                         stroke-linejoin=\"round\" class=\"feather feather-file-text\" aria-hidden=\"true\">\n");
      out.write("                        <path d=\"M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z\"></path>\n");
      out.write("                        <polyline points=\"14 2 14 8 20 8\"></polyline>\n");
      out.write("                        <line x1=\"16\" y1=\"13\" x2=\"8\" y2=\"13\"></line>\n");
      out.write("                        <line x1=\"16\" y1=\"17\" x2=\"8\" y2=\"17\"></line>\n");
      out.write("                        <polyline points=\"10 9 9 9 8 9\"></polyline>\n");
      out.write("                    </svg>\n");
      out.write("                    Calendar\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"feedback_view.jsp\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                         fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                         stroke-linejoin=\"round\" class=\"feather feather-file-text\" aria-hidden=\"true\">\n");
      out.write("                        <path d=\"M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z\"></path>\n");
      out.write("                        <polyline points=\"14 2 14 8 20 8\"></polyline>\n");
      out.write("                        <line x1=\"16\" y1=\"13\" x2=\"8\" y2=\"13\"></line>\n");
      out.write("                        <line x1=\"16\" y1=\"17\" x2=\"8\" y2=\"17\"></line>\n");
      out.write("                        <polyline points=\"10 9 9 9 8 9\"></polyline>\n");
      out.write("                    </svg>\n");
      out.write("                    Feedbacks\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
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
