package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hrm.entities.Employee;
import com.hrm.dao.EmployeeDao;
import com.hrm.entities.Salary;
import java.util.List;
import java.util.List;
import java.util.ArrayList;
import com.hrm.dao.SalaryDao;

public final class salaryslip_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("        ");

            String search = request.getParameter("empId");

            Employee emp = new Employee();
            EmployeeDao empDao = new EmployeeDao();

            emp = empDao.empById(search);

            Salary salary = new Salary();
            SalaryDao salaryDao = new SalaryDao();

            salary = salaryDao.getSalary(search);

        
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Salary Slip - ");
      out.print(emp.getFname());
      out.write("&nbsp;");
      out.print(emp.getLname());
      out.write("</title>\n");
      out.write("        <style>\n");
      out.write("            @media print{\n");
      out.write("                #print-button{\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5 mb-5\">\n");
      out.write("            <div class=\"container text-end\"><button id=\"print-button\" type=\"button\" onclick=\"window.print()\" class=\"btn btn-dark\">PRINT</button></div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"text-center lh-1 mb-2\">\n");
      out.write("                        <h6 class=\"fw-bold\">SALARY SLIP</h6> <span class=\"fw-normal\">Payment slip for the month</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex justify-content-end\"> <span>MUMBAI</span> </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-10\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div> <span class=\"fw-bolder\">Id</span> <small class=\"ms-3\">");
      out.print(emp.getId());
      out.write("</small> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div> <span class=\"fw-bolder\">Name</span> <small class=\"ms-3\">");
      out.print(emp.getFname());
      out.write("&nbsp;");
      out.print(emp.getLname());
      out.write("</small> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div> <span class=\"fw-bolder\">Department</span> <small class=\"ms-3\">");
      out.print(emp.getDepartment());
      out.write("</small> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div> <span class=\"fw-bolder\">Post</span> <small class=\"ms-3\">");
      out.print(emp.getPost());
      out.write("</small> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div> <span class=\"fw-bolder\">Mobile No</span> <small class=\"ms-3\">");
      out.print(emp.getMobno());
      out.write("</small> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div> <span class=\"fw-bolder\">Mode of Pay</span> <small class=\"ms-3\">Internet Banking</small> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div> <span class=\"fw-bolder\">Email</span> <small class=\"ms-3\">");
      out.print(emp.getEmail());
      out.write("</small> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div> <span class=\"fw-bolder\">Ac No.</span> <small class=\"ms-3\">100007</small> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <table class=\"mt-4 table table-bordered\">\n");
      out.write("                            <thead class=\"bg-dark text-white\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">Earnings</th>\n");
      out.write("                                    <th scope=\"col\">Amount</th>\n");
      out.write("                                    <th scope=\"col\">Deductions</th>\n");
      out.write("                                    <th scope=\"col\">Amount</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">Basic</th>\n");
      out.write("                                    <td>");
      out.print(salary.getBasic());
      out.write("</td>\n");
      out.write("                                    <td>PF</td>\n");
      out.write("                                    <td>");
      out.print(salary.getPF());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">DA</th>\n");
      out.write("                                    <td>");
      out.print(salary.getDA());
      out.write("</td>\n");
      out.write("                                    <td>ESI</td>\n");
      out.write("                                    <td>");
      out.print(salary.getESI());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">HRA</th>\n");
      out.write("                                    <td>");
      out.print(salary.getHRA());
      out.write("</td>\n");
      out.write("                                    <td>TDS</td>\n");
      out.write("                                    <td>");
      out.print(salary.getTDS());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">CA</th>\n");
      out.write("                                    <td>");
      out.print(salary.getCA());
      out.write("</td>\n");
      out.write("                                    <td>PT</td>\n");
      out.write("                                    <td>");
      out.print(salary.getPT());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">MA</th>\n");
      out.write("                                    <td>");
      out.print(salary.getMA());
      out.write("</td>\n");
      out.write("                                    <td>EWF</td>\n");
      out.write("                                    <td>");
      out.print(salary.getEWF());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">Leave Encashment</th>\n");
      out.write("                                    <td>");
      out.print(salary.getLeaveEncashment());
      out.write("</td>\n");
      out.write("                                    <td colspan=\"2\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">Holiday Wages</th>\n");
      out.write("                                    <td>");
      out.print(salary.getHolidayWages());
      out.write("</td>\n");
      out.write("                                    <td colspan=\"2\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">Special Allowance</th>\n");
      out.write("                                    <td>");
      out.print(salary.getSpecialAllowance());
      out.write("</td>\n");
      out.write("                                    <td colspan=\"2\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">Bonus</th>\n");
      out.write("                                    <td>");
      out.print(salary.getBonus());
      out.write("</td>\n");
      out.write("                                    <td colspan=\"2\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"border-top\">\n");
      out.write("                                    <th scope=\"row\">Total Earning</th>\n");
      out.write("                                    <td>");
      out.print(salary.getTotalEarning());
      out.write("</td>\n");
      out.write("                                    <td>Total Deductions</td>\n");
      out.write("                                    <td>");
      out.print(salary.getTotalDeduction());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\"> <br> <span class=\"fw-bold\">Net Pay : ");
      out.print(salary.getNetPay());
      out.write("</span> </div>\n");
      out.write("                        <div class=\"border col-md-8\">\n");
      out.write("                            <strong>Net Pay(In Words):</strong>\n");
      out.write("                            <div id=\"numberToWord\" class=\"d-flex flex-column\"><span>In Words</span> <span></span> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex justify-content-end\">\n");
      out.write("                        <div class=\"d-flex flex-column mt-2\"> <span class=\"fw-bolder\">Abhaya Chaudhary</span> <span class=\"mt-4\">Human Resources Manager</span> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" data=\"");
      out.print(salary.getNetPay());
      out.write("\">\n");
      out.write("            var temp = document.currentScript.getAttribute('data');\n");
      out.write("            var a = ['', 'one ', 'two ', 'three ', 'four ', 'five ', 'six ', 'seven ', 'eight ', 'nine ', 'ten ', 'eleven ', 'twelve ', 'thirteen ', 'fourteen ', 'fifteen ', 'sixteen ', 'seventeen ', 'eighteen ', 'nineteen '];\n");
      out.write("            var b = ['', '', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety'];\n");
      out.write("\n");
      out.write("            function inWords(num) {\n");
      out.write("                if ((num = num.toString()).length > 9)\n");
      out.write("                    return 'overflow';\n");
      out.write("                n = ('000000000' + num).substr(-9).match(/^(\\d{2})(\\d{2})(\\d{2})(\\d{1})(\\d{2})$/);\n");
      out.write("                if (!n)\n");
      out.write("                    return;\n");
      out.write("                var str = '';\n");
      out.write("//                str += (n[1] !== 0) ? (a[Number(n[1])] || b[n[1][0]] + ' ' + a[n[1][1]]) + 'crore ' : '';\n");
      out.write("                str += (n[2] !== 0) ? (a[Number(n[2])] || b[n[2][0]] + ' ' + a[n[2][1]]) + 'lakh ' : '';\n");
      out.write("                str += (n[3] !== 0) ? (a[Number(n[3])] || b[n[3][0]] + ' ' + a[n[3][1]]) + 'thousand ' : '';\n");
      out.write("                str += (n[4] !== 0) ? (a[Number(n[4])] || b[n[4][0]] + ' ' + a[n[4][1]]) + 'hundred ' : '';\n");
      out.write("                str += (n[5] !== 0) ? ((str !== '') ? 'and ' : '') + (a[Number(n[5])] || b[n[5][0]] + ' ' + a[n[5][1]]) + 'only ' : '';\n");
      out.write("                return str;\n");
      out.write("            }\n");
      out.write("            var result = inWords(temp);\n");
      out.write("            document.getElementById(\"numberToWord\").innerHTML = result;\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
