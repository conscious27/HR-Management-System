/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.dao;

import com.hrm.entities.Attendance;
import java.util.ArrayList;
import java.util.List;
import com.hrm.entities.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.tomcat.util.codec.binary.StringUtils;

/**
 *
 * @author chait
 */
public class EmployeeDao {

    public EmployeeDao() {
    }

    public boolean saveEmp(Employee emp) {
        boolean f = false;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");

            String query = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, emp.getId());
            pst.setString(2, emp.getFname());
            pst.setString(3, emp.getLname());
//          String dob = emp.getDate();
//            java.text.DateFormat format = new java.text.SimpleDateFormat("dd/MM/yyyy");
//           java.util.Date dt = format.parse(dob);
//           java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
            pst.setDate(4, emp.getDate());
            pst.setString(5, emp.getEmail());
            pst.setString(6, emp.getMobno());
            pst.setString(7, emp.getGender());
            pst.setString(8, emp.getAddress());
            pst.setString(9, emp.getCity());
            pst.setInt(10, emp.getPinCode());
            pst.setString(11, emp.getState());
            pst.setString(12, emp.getCountry());
            pst.setString(13, emp.getDepartment());
            pst.setString(14, emp.getPost());
            pst.setInt(15, emp.getSalary());
            pst.setString(16, emp.getAbout());

            pst.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public int deleteEmp(Employee emp) {
        int count = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "delete from emp where id =? and fname = ? and lname=? and department=? and post=?";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, emp.getId());
            pst.setString(2, emp.getFname());
            pst.setString(3, emp.getLname());
            pst.setString(4, emp.getDepartment());
            pst.setString(5, emp.getPost());

            count = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public List<Employee> empSearch(String search) {

        List<Employee> showemp = new ArrayList<Employee>();
        Employee emp = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from emp where id like ? or fname like ? or lname like ? or department like ? or post like ? or mobno like ? order by fname asc";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "%" + search + "%");

            pst.setString(2, "%" + search + "%");
            pst.setString(3, "%" + search + "%");
            pst.setString(4, "%" + search + "%");
            pst.setString(5, "%" + search + "%");
            pst.setString(6, "%" + search + "%");

            ResultSet result = pst.executeQuery();
            while (result.next()) {
                emp = new Employee();

                emp.setId(result.getString(1));
                emp.setFname(result.getString(2));
                emp.setLname(result.getString(3));
                emp.setDate(result.getDate(4));
                emp.setEmail(result.getString(5));
                emp.setMobno(result.getString(6));
                emp.setGender(result.getString(7));
                emp.setAddress(result.getString(8));
                emp.setCity(result.getString(9));
                emp.setPinCode(result.getInt(10));
                emp.setState(result.getString(11));
                emp.setCountry(result.getString(12));
                emp.setDepartment(result.getString(13));
                emp.setPost(result.getString(14));
                emp.setSalary(result.getInt(15));
                emp.setAbout(result.getString(16));

                showemp.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return showemp;
    }

    public boolean empSearchById(String search) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from emp where id like ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "%" + search + "%");
            ResultSet result = pst.executeQuery();

            if (result.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public Employee empById(String search) {

        Employee emp = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from emp where id=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, search);
            ResultSet result = pst.executeQuery();

            while (result.next()) {
                emp = new Employee();

                emp.setId(result.getString(1));
                emp.setFname(result.getString(2));
                emp.setLname(result.getString(3));
                emp.setDate(result.getDate(4));
                emp.setEmail(result.getString(5));
                emp.setMobno(result.getString(6));
                emp.setGender(result.getString(7));
                emp.setAddress(result.getString(8));
                emp.setCity(result.getString(9));
                emp.setPinCode(result.getInt(10));
                emp.setState(result.getString(11));
                emp.setCountry(result.getString(12));
                emp.setDepartment(result.getString(13));
                emp.setPost(result.getString(14));
                emp.setSalary(result.getInt(15));
                emp.setAbout(result.getString(16));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return emp;

    }

    public boolean updateEmp(Employee emp) {
        boolean f = false;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");

            String query = "update emp set id=?,fname=?, lname=?, dob=?, email=?, mobno=?, gender=?, address=?, city=?, pincode=?, "
                    + "state=?, country=?, department=?, post=?, salary=?, about=? where id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, emp.getId());
            pst.setString(2, emp.getFname());
            pst.setString(3, emp.getLname());
//          String dob = emp.getDate();
//            java.text.DateFormat format = new java.text.SimpleDateFormat("dd/MM/yyyy");
//           java.util.Date dt = format.parse(dob);
//           java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
            pst.setDate(4, emp.getDate());
            pst.setString(5, emp.getEmail());
            pst.setString(6, emp.getMobno());
            pst.setString(7, emp.getGender());
            pst.setString(8, emp.getAddress());
            pst.setString(9, emp.getCity());
            pst.setInt(10, emp.getPinCode());
            pst.setString(11, emp.getState());
            pst.setString(12, emp.getCountry());
            pst.setString(13, emp.getDepartment());
            pst.setString(14, emp.getPost());
            pst.setInt(15, emp.getSalary());
            pst.setString(16, emp.getAbout());
            pst.setString(17, emp.getId());

            pst.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public List<Employee> searchEmpById(String search) {

        Employee emp = null;
        List<Employee> EmployeeList = new ArrayList<>();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from emp where id=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, search);
            ResultSet result = pst.executeQuery();

            while (result.next()) {
                emp = new Employee();

                emp.setFname(result.getString(2));
                emp.setLname(result.getString(3));
                emp.setDepartment(result.getString(13));
                emp.setPost(result.getString(14));

                EmployeeList.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return EmployeeList;

    }

    public List<Employee> getSalaryDetails(String search) {
        Employee emp = null;
        List<Employee> EmployeeList = new ArrayList<>();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "select * from emp where id=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, search);
            ResultSet result = pst.executeQuery();

            while (result.next()) {
                emp = new Employee();
                emp.setId(result.getString(1));
                emp.setFname(result.getString(2));
                emp.setLname(result.getString(3));
                emp.setEmail(result.getString(4));
                emp.setMobno(result.getString(5));
                emp.setDepartment(result.getString(13));
                emp.setPost(result.getString(14));
                emp.setSalary(result.getInt(15));

                EmployeeList.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return EmployeeList;

    }

}
