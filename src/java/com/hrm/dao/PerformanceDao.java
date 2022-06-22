/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.dao;

import com.hrm.entities.Performance;
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
public class PerformanceDao {

    public List<Performance> PerformanceDisplay() {

        List<Performance> PerformanceList = new ArrayList<>();
        Performance Performance = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from Performance";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                Performance = new Performance();

                Performance.setId(result.getString(1));
                Performance.setTargetAchieved(result.getInt(2));
                Performance.setEfficiency(result.getInt(3));

                PerformanceList.add(Performance);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PerformanceList;

    }
}