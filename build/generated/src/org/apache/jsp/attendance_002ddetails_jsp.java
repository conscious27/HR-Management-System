package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hrm.dao.EmployeeDao;
import com.hrm.dao.AttendanceDao;
import com.hrm.entities.Admin;
import com.hrm.entities.Employee;
import java.util.List;
import java.util.ArrayList;
import com.hrm.entities.Attendance;

public final class attendance_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/sidebarnav.jsp");
  }

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
      			"error_page.jsp", true, 8192, true);
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Admin admin = (Admin) session.getAttribute("currentAdmin");

    if (admin == null) {
        response.sendRedirect("login.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"CSS/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/addemp.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body data-new-gr-c-s-check-loaded=\"14.1054.0\" data-gr-ext-installed=\"\">\n");
      out.write("\n");
      out.write("        <!--navbar-->\n");
      out.write("        ");
      out.write("<header class=\"navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow\">\n");
      out.write("    <a class=\"navbar-brand col-md-3 col-lg-2 me-0 px-3\" href=\"index.jsp\"> <i class=\"fa-brands fa-redhat\"></i> BLUE HATS </a>\n");
      out.write("    <button class=\"navbar-toggler position-absolute d-md-none collapsed\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("            data-bs-target=\"#sidebarMenu\" aria-controls=\"sidebarMenu\" aria-expanded=\"false\"\n");
      out.write("            aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <form class=\"text-center w-100\" action=\"searchresult.jsp\">\n");
      out.write("        <input class=\"form-control form-control-dark w-50 d-inline\" name=\"empSearch\" type=\"text\" placeholder=\"Employee Search\"\n");
      out.write("                   aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-primary d-inline\">search</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <div class=\"navbar-nav\">\n");
      out.write("        <div class=\"nav-item text-nowrap\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\"> <span class=\"fa fa-user fa-fw\"></span>");
      out.print( admin.getName());
      out.write("</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"navbar-nav\">\n");
      out.write("        <div class=\"nav-item text-nowrap\">\n");
      out.write("            <a class=\"nav-link px-3\" href=\"LogoutServlet\"><span class=\"fa Example of sign-out fa-sign-out\"></span> Sign out</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>");
      out.write("\n");
      out.write("        <!--navbar-end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!--sidebar-->\n");
      out.write("                ");
      out.write("\n");
      out.write("<nav style=\"height:94.5vh !important;\" id=\"sidebarMenu\" class=\"col-md-3 col-lg-2 bg-dark d-md-block sidebar collapse\">\n");
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
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"\n");
      out.write("                         fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\"\n");
      out.write("                         stroke-linejoin=\"round\" class=\"feather feather-users\" aria-hidden=\"true\">\n");
      out.write("                        <path d=\"M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2\"></path>\n");
      out.write("                        <circle cx=\"9\" cy=\"7\" r=\"4\"></circle>\n");
      out.write("                        <path d=\"M23 21v-2a4 4 0 0 0-3-3.87\"></path>\n");
      out.write("                        <path d=\"M16 3.13a4 4 0 0 1 0 7.75\"></path>\n");
      out.write("                    </svg>\n");
      out.write("                    Generate Salary Slip\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
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
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <h6\n");
      out.write("            class=\"sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted\">\n");
      out.write("            <span>Details</span>\n");
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
      out.write("\n");
      out.write("                <!--sidebar-end-->\n");
      out.write("\n");
      out.write("                <main class=\"col-md-9 ms-sm-auto col-lg-10 px-md-4\">\n");
      out.write("                    <div style=\"margin-left: 8vw;\"class=\"btn-group btn-group-lg\" role=\"group\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-primary\">Accounts</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-success\">Research and Development</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-danger\">Managements</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-dark\">Information Technology</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-warning\">Services</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-info\">Others</button>\n");
      out.write("                    </div>\n");
      out.write("                    `                   \n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead class=\"thead-dark\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">ID</th>\n");
      out.write("                                <th scope=\"col\">Name</th>\n");
      out.write("                                <th scope=\"col\">Department</th>\n");
      out.write("                                <th scope=\"col\">Post</th>\n");
      out.write("                                <th scope=\"col\">Present</th>\n");
      out.write("                                <th scope=\"col\">On Leave</th>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

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

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td scope=\"row\">");
      out.print(attendance.getId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(emp.getFname());
      out.write("&nbsp;");
      out.print(emp.getLname());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(emp.getDepartment());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(emp.getPost());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(attendance.getActive());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(attendance.getOnLeave());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                    }
                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </main>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--scripts-->\n");
      out.write("        <script src=\"/docs/5.0/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("                integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/8cf25b5050.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!--scripts-->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
