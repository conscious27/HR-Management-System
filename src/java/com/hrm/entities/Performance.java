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
public class Performance {
    private String id;
    private int targetAchieved;
    private int efficiency;

    public Performance(String id, int targetAchieved, int efficiency) {
        this.id = id;
        this.targetAchieved = targetAchieved;
        this.efficiency = efficiency;
    }

    public Performance() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTargetAchieved() {
        return targetAchieved;
    }

    public void setTargetAchieved(int targetAchieved) {
        this.targetAchieved = targetAchieved;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
    
    
}
