/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.entities;

/**
 *
 * @author chait
 */
public class Admin {
    private String name;
    private String address;
    private String post;
    private String username;
    private String password;

    public Admin(String name, String address, String post, String username, String password) {
        this.name = name;
        this.address = address;
        this.post = post;
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
