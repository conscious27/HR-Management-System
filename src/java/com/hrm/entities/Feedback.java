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
public class Feedback {
    private String id;
    private String subject;
    private String problem;
    private String suggestion;

    public Feedback() {
    }

    public Feedback(String id, String subject, String problem, String suggestion) {
        this.id = id;
        this.subject = subject;
        this.problem = problem;
        this.suggestion = suggestion;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
    
    
}
