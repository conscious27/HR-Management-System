/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.dao;

import java.sql.*;
import com.hrm.entities.Admin;

/**
 *
 * @author chait
 */
public class AdminDao {

    public Admin getAdminByEmailAndPassword(String username, String password) {
        Admin admin = null;

        try {
//            System.out.println(username);
//            System.out.println(password);
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            
            String query = "Select name, address, post, username, password from login where username = ? and password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
//                System.out.println("inside if");
                admin = new Admin();

                admin.setName(rs.getString(1));
                admin.setAddress(rs.getString(2));
                admin.setPost(rs.getString(3));
                admin.setUsername(rs.getString(4));
                admin.setPassword(rs.getString(5));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }

}
