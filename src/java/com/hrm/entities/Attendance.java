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
public class Attendance {
    private String id;
    private int active;
    private int onLeave;

    public Attendance() {
    }

    public Attendance(String id, int active, int OnLeave) {
        this.id = id;
        this.active = active;
        this.onLeave = onLeave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getOnLeave() {
        return onLeave;
    }

    public void setOnLeave(int onLeave) {
        this.onLeave = onLeave;
    }
   
    
    
}
