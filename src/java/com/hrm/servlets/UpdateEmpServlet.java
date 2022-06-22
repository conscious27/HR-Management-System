/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.servlets;

import com.hrm.dao.EmployeeDao;
import com.hrm.entities.Employee;
import com.hrm.entities.Message;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chait
 */
public class UpdateEmpServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                String check = request.getParameter("check");

                if (check == null) {
                    Message msg = new Message("Please Check the box for confirmation...", "error", "alert-warning");
                    HttpSession s = request.getSession();
                    s.setAttribute("msg", msg);
                    response.sendRedirect("updateemp.jsp");

                } else {
                    String id = request.getParameter("id");
                    String fname = request.getParameter("fname");
                    String lname = request.getParameter("lname");
                    Date dob = Date.valueOf(request.getParameter("dob"));
                    String email = request.getParameter("email");
                    String mobno = request.getParameter("mobno");
                    String gender = request.getParameter("gender");
                    String address = request.getParameter("address");
                    String city = request.getParameter("city");
                    int pinCode = Integer.parseInt(request.getParameter("pinCode"));
                    String state = request.getParameter("state");
                    String country = request.getParameter("country");
                    String department = request.getParameter("department");
                    String post = request.getParameter("post");
                    int salary = Integer.parseInt(request.getParameter("salary"));
                    String about = request.getParameter("about");

                    Employee emp = new Employee(id, fname, lname, dob, email, mobno, gender, address, city, pinCode,
                            state, country, department, post, salary, about);
                    EmployeeDao e = new EmployeeDao();

                    if (e.updateEmp(emp)) {
                        Message msg = new Message("Data Successfully Updated...", "success", "alert-success");
                        HttpSession s = request.getSession();
                        s.setAttribute("msg", msg);
                        response.sendRedirect("updateemp.jsp?empId="+id);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}