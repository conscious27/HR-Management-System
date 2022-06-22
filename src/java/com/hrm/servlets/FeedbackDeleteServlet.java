/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.servlets;

import com.hrm.dao.FeedbackDao;
import com.hrm.entities.Message;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chait
 */
//@WebServlet("deleteFeed")
public class FeedbackDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String feedId = request.getParameter("feedbackid");
        
        FeedbackDao feedDao = new FeedbackDao();
        boolean status = feedDao.feedbackDelete(feedId);
        
        if(status){
                Message msg = new Message("Deleted Successfully!", "success", "alert-success");
                HttpSession s = request.getSession();
                s.setAttribute("msg", msg);
                response.sendRedirect("feedback_view.jsp");
        }
        else{
                Message msg = new Message("Error!", "serror", "alert-danger");
                HttpSession s = request.getSession();
                s.setAttribute("msg", msg);
                response.sendRedirect("feedback_view.jsp");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }


}
