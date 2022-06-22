<%-- 
    Document   : salaryslip.jsp
    Created on : 3 Apr, 2022, 10:30:25 PM
    Author     : chait
--%>

<%@page import="com.hrm.entities.Employee"%>
<%@page import="com.hrm.dao.EmployeeDao"%>
<%@page import="com.hrm.entities.Salary"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hrm.dao.SalaryDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <%
            String search = request.getParameter("empId");

            Employee emp = new Employee();
            EmployeeDao empDao = new EmployeeDao();

            emp = empDao.empById(search);

            Salary salary = new Salary();
            SalaryDao salaryDao = new SalaryDao();

            salary = salaryDao.getSalary(search);

        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Salary Slip - <%=emp.getFname()%>&nbsp;<%=emp.getLname()%></title>
        <style>
            @media print{
                #print-button{
                    display: none;
                }
            }
        </style>
    </head>
    <body>

        <div class="container mt-5 mb-5">
            <div class="container text-end"><button id="print-button" type="button" onclick="window.print()" class="btn btn-dark">PRINT</button></div>
            

            <div class="row">
                <div class="col-md-12">
                    <div class="text-center lh-1 mb-2">
                        <h6 class="fw-bold">SALARY SLIP</h6> <span class="fw-normal">Payment slip for the month</span>
                    </div>
                    <div class="d-flex justify-content-end"> <span>MUMBAI</span> </div>
                    <div class="row">
                        <div class="col-md-10">
                            <div class="row">
                                <div class="col-md-6">
                                    <div> <span class="fw-bolder">Id</span> <small class="ms-3"><%=emp.getId()%></small> </div>
                                </div>
                                <div class="col-md-6">
                                    <div> <span class="fw-bolder">Name</span> <small class="ms-3"><%=emp.getFname()%>&nbsp;<%=emp.getLname()%></small> </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div> <span class="fw-bolder">Department</span> <small class="ms-3"><%=emp.getDepartment()%></small> </div>
                                </div>
                                <div class="col-md-6">
                                    <div> <span class="fw-bolder">Post</span> <small class="ms-3"><%=emp.getPost()%></small> </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div> <span class="fw-bolder">Mobile No</span> <small class="ms-3"><%=emp.getMobno()%></small> </div>
                                </div>
                                <div class="col-md-6">
                                    <div> <span class="fw-bolder">Mode of Pay</span> <small class="ms-3">Internet Banking</small> </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div> <span class="fw-bolder">Email</span> <small class="ms-3"><%=emp.getEmail()%></small> </div>
                                </div>
                                <div class="col-md-6">
                                    <div> <span class="fw-bolder">Ac No.</span> <small class="ms-3">100007</small> </div>
                                </div>
                            </div>
                        </div>
                        <table class="mt-4 table table-bordered">
                            <thead class="bg-dark text-white">
                                <tr>
                                    <th scope="col">Earnings</th>
                                    <th scope="col">Amount</th>
                                    <th scope="col">Deductions</th>
                                    <th scope="col">Amount</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th scope="row">Basic</th>
                                    <td><%=salary.getBasic()%></td>
                                    <td>PF</td>
                                    <td><%=salary.getPF()%></td>
                                </tr>
                                <tr>
                                    <th scope="row">DA</th>
                                    <td><%=salary.getDA()%></td>
                                    <td>ESI</td>
                                    <td><%=salary.getESI()%></td>
                                </tr>
                                <tr>
                                    <th scope="row">HRA</th>
                                    <td><%=salary.getHRA()%></td>
                                    <td>TDS</td>
                                    <td><%=salary.getTDS()%></td>
                                </tr>
                                <tr>
                                    <th scope="row">CA</th>
                                    <td><%=salary.getCA()%></td>
                                    <td>PT</td>
                                    <td><%=salary.getPT()%></td>
                                </tr>
                                <tr>
                                    <th scope="row">MA</th>
                                    <td><%=salary.getMA()%></td>
                                    <td>EWF</td>
                                    <td><%=salary.getEWF()%></td>
                                </tr>
                                <tr>
                                    <th scope="row">Leave Encashment</th>
                                    <td><%=salary.getLeaveEncashment()%></td>
                                    <td colspan="2"></td>
                                </tr>
                                <tr>
                                    <th scope="row">Holiday Wages</th>
                                    <td><%=salary.getHolidayWages()%></td>
                                    <td colspan="2"></td>
                                </tr>
                                <tr>
                                    <th scope="row">Special Allowance</th>
                                    <td><%=salary.getSpecialAllowance()%></td>
                                    <td colspan="2"></td>
                                </tr>
                                <tr>
                                    <th scope="row">Bonus</th>
                                    <td><%=salary.getBonus()%></td>
                                    <td colspan="2"></td>
                                </tr>
                                <tr class="border-top">
                                    <th scope="row">Total Earning</th>
                                    <td><%=salary.getTotalEarning()%></td>
                                    <td>Total Deductions</td>
                                    <td><%=salary.getTotalDeduction()%></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="row">
                        <div class="col-md-4"> <br> <span class="fw-bold">Net Pay : <%=salary.getNetPay()%></span> </div>
                        <div class="border col-md-8">
                            <strong>Net Pay(In Words):</strong>
                            <div id="numberToWord" class="d-flex flex-column"><span>In Words</span> <span></span> </div>
                        </div>
                    </div>
                    <div class="d-flex justify-content-end">
                        <div class="d-flex flex-column mt-2"> <span class="fw-bolder">Abhaya Chaudhary</span> <span class="mt-4">Human Resources Manager</span> </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" data="<%=salary.getNetPay()%>">
            var temp = document.currentScript.getAttribute('data');
            var a = ['', 'one ', 'two ', 'three ', 'four ', 'five ', 'six ', 'seven ', 'eight ', 'nine ', 'ten ', 'eleven ', 'twelve ', 'thirteen ', 'fourteen ', 'fifteen ', 'sixteen ', 'seventeen ', 'eighteen ', 'nineteen '];
            var b = ['', '', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety'];

            function inWords(num) {
                if ((num = num.toString()).length > 9)
                    return 'overflow';
                n = ('000000000' + num).substr(-9).match(/^(\d{2})(\d{2})(\d{2})(\d{1})(\d{2})$/);
                if (!n)
                    return;
                var str = '';
//                str += (n[1] !== 0) ? (a[Number(n[1])] || b[n[1][0]] + ' ' + a[n[1][1]]) + 'crore ' : '';
                str += (n[2] !== 0) ? (a[Number(n[2])] || b[n[2][0]] + ' ' + a[n[2][1]]) + 'lakh ' : '';
                str += (n[3] !== 0) ? (a[Number(n[3])] || b[n[3][0]] + ' ' + a[n[3][1]]) + 'thousand ' : '';
                str += (n[4] !== 0) ? (a[Number(n[4])] || b[n[4][0]] + ' ' + a[n[4][1]]) + 'hundred ' : '';
                str += (n[5] !== 0) ? ((str !== '') ? 'and ' : '') + (a[Number(n[5])] || b[n[5][0]] + ' ' + a[n[5][1]]) + 'only ' : '';
                return str;
            }
            var result = inWords(temp);
            document.getElementById("numberToWord").innerHTML = result;
        </script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
