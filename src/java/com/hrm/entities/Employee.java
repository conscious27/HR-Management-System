/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.entities;

import java.sql.Date;

/**
 *
 * @author chait
 */
public class Employee {

    private String id;
    private String fname;
    private String lname;
    private Date date;
    private String email;
    private String mobno;
    private String gender;
    private String address;
    private String city;
    private int pinCode;
    private String state;
    private String Country;
    private String Department;
    private String post;
    private int salary;
    private String about;

    public Employee() {
        super();
    }

    
    public Employee(String id, String fname, String lname, Date date, String email, String mobno, String gender, String address, String city, int pinCode, String state, String Country, String Department, String post, int Salary, String about) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.email = email;
        this.mobno = mobno;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
        this.Country = Country;
        this.Department = Department;
        this.post = post;
        this.salary = Salary;
        this.about = about;
    }

    public Employee(String fname, String lname, Date date, String email, String mobno, String gender, String address, String city, int pinCode, String state, String Country, String Department, String post, int Salary, String about) {
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.email = email;
        this.mobno = mobno;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
        this.Country = Country;
        this.Department = Department;
        this.post = post;
        this.salary = Salary;
        this.about = about;
    }

    public Employee(String id, String fname, String lname, String Department, String post) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.Department = Department;
        this.post = post;
    }

    public Employee(String id, String fname, String lname, String email, String mobno, String Department, String post) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.mobno = mobno;
        this.Department = Department;
        this.post = post;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int Salary) {
        this.salary = salary;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    
}
