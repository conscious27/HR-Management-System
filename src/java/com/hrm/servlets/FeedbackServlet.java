/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.servlets;

import com.hrm.dao.EmployeeDao;
import com.hrm.dao.FeedbackDao;
import com.hrm.entities.Feedback;
import com.hrm.entities.Message;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chait
 */
public class FeedbackServlet extends HttpServlet {

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
            String id = request.getParameter("id");
            EmployeeDao dao = new EmployeeDao();
            if (dao.empSearchById(id)) {
                String subject = request.getParameter("subject");
                String problem = request.getParameter("problem");
                String suggestion = request.getParameter("suggestion");

                Feedback feed = new Feedback(id, subject, problem, suggestion);

                FeedbackDao fdao = new FeedbackDao();

                boolean f = fdao.saveFeedback(feed);

                if (f == true) {
                    Message msg = new Message("Form Submitted!\n Thanks! for Your Input.", "success", "alert-success");
                    HttpSession s = request.getSession();
                    s.setAttribute("msg", msg);
                    response.sendRedirect("feedback.jsp");
                }
                else{
                    Message msg = new Message("Some Unexpected Error", "error", "alert-danger");
                    HttpSession s = request.getSession();
                    s.setAttribute("msg", msg);
                    response.sendRedirect("feedback.jsp");
                }

            } else {
                Message msg = new Message("Employee ID is incorrrect!\n Please Try Again...", "warning", "alert-warning");
                HttpSession s = request.getSession();
                s.setAttribute("msg", msg);
                response.sendRedirect("feedback.jsp");
            }

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
