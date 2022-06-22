/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tfeedlate file, choose Tools | Tfeedlates
 * and open the tfeedlate in the editor.
 */
package com.hrm.dao;

import com.hrm.entities.Feedback;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chait
 */
public class FeedbackDao {

    boolean f = false;

    public FeedbackDao() {
    }

    public boolean saveFeedback(Feedback feed) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");

            String query = "Insert into feedback values(?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, feed.getId());
            pst.setString(2, feed.getSubject());
            pst.setString(3, feed.getProblem());
            pst.setString(4, feed.getSuggestion());

            pst.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public List<Feedback> feedSearch() {

        List<Feedback> showfeed = new ArrayList<>();
        Feedback feed = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from feedback ";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                feed = new Feedback();

                feed.setId(result.getString(1));
                feed.setProblem(result.getString(2));
                feed.setSubject(result.getString(3));
                feed.setSuggestion(result.getString(4));

                showfeed.add(feed);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return showfeed;
    }
    
//    public Feedback getFeedbackById(String Id)
//    {
//        try{
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
//            String query = "select * from feedback where id = ?";
//            PreparedStatement pst = con.prepareStatement(query);
//            pst.setString(1, result.getString(1));
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
    
    public Feedback getFeedbyId(String fId){
        Feedback feed = new Feedback();
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from feedback where id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, fId);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                feed.setId(rs.getString(1));
                feed.setProblem(rs.getString(2));
                feed.setSubject(rs.getString(3));
                feed.setSuggestion(rs.getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return feed;
    }
    
    public boolean feedbackDelete(String feedId){
        boolean status = false;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "delete from feedback where id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, feedId);
            
            int i = pst.executeUpdate();
            if(i>0){
                status = true;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return status;
    }

}
