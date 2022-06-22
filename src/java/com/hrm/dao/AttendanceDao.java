/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.dao;

import com.hrm.entities.Attendance;
import com.hrm.entities.Employee;
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
public class AttendanceDao {

    public List<Attendance> AttendanceDisplay() {

        List<Attendance> AttendanceList = new ArrayList<>();
        Attendance attendance = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from attendance";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                attendance = new Attendance();

                attendance.setId(result.getString(1));
                attendance.setActive(result.getInt(2));
                attendance.setOnLeave(result.getInt(3));

                AttendanceList.add(attendance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return AttendanceList;

    }
}
