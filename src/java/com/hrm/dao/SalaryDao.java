/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.dao;

import com.hrm.entities.Salary;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chait
 */
public class SalaryDao {

    public Salary getSalary(String search) throws ClassNotFoundException, SQLException {
        Salary salary = null;;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MSI:1521:XE", "HR1", "HR1");
            String query = "Select A.Department, A.Post, A.Salary, B.Active, B.OnLeave, C.TargetAchieved, C.Efficiency from "
                    + "Emp A JOIN Attendance B on A.id = B.id JOIN "
                    + "Performance C on C.id=B.id where id= ?";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, search);

            ResultSet result = pst.executeQuery();

            while (result.next()) {
                salary = new Salary();
                Map<String, Integer> lookup = new HashMap<>();
                lookup.put("Accounts Manager", 1);
                lookup.put("Accountant", 2);
                lookup.put("Research Scientist", 3);
                lookup.put("Research Associate", 4);
                lookup.put("Product Manager", 5);
                lookup.put("Human Resource Manager", 6);
                lookup.put("Software Development Engineer", 7);
                lookup.put("Full Stack Developer", 8);
                lookup.put("Office Boy", 9);
                lookup.put("Intern", 10);

                int target = result.getInt(6);
                int efficiency = result.getInt(7);

                switch (lookup.get(result.getString(2))) {
                    case 1:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;

                    case 2:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;
                    case 3:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;
                    case 4:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;

                    case 5:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;

                    case 6:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));
                        break;

                    case 7:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;

                    case 8:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;

                    case 9:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;

                    case 10:
                        salary.setBasic(result.getInt(3));
                        salary.setDA((salary.getBasic() * 5 / 100));
                        salary.setHRA((salary.getBasic() * 10 / 100));
                        salary.setCA(500);
                        salary.setMA((salary.getBasic() * 20 / 100));
                        salary.setLeaveEncashment(0);
                        salary.setHolidayWages((salary.getBasic() * 5 / 100));
                        salary.setSpecialAllowance(5000 * (result.getInt(4)) / 100);
                        salary.setBonus(5000 * ((target + efficiency) / 2) / 100);

                        salary.setPF((salary.getBasic() * 10 / 100));
                        salary.setESI((salary.getBasic() * 1 / 100));
                        salary.setTDS((salary.getBasic() * 1 / 100));
                        salary.setPT((salary.getBasic() * 1 / 100));
                        salary.setEWF((salary.getBasic() * 1 / 100));

                        break;

                    default:
                        System.out.println("Incorerct Post");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return salary;
    }
}
