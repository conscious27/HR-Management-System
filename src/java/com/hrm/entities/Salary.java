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
public class Salary {
    private int Basic;
    private int DA;
    private int HRA;
    private int CA;
    private int MA;
    private int LeaveEncashment;
    private int HolidayWages;
    private int SpecialAllowance;
    private int Bonus;
    private int TotalEarning ;

    private int PF;
    private int ESI;
    private int TDS;
    private int PT;
    private int EWF;
    private int TotalDeduction;
    
    private int NetPay;

    public Salary() {
    }

    public Salary(int Basic, int DA, int HRA, int CA, int MA, int LeaveEncashment, int HolidayWages, int SpecialAllowance, int Bonus, int PF, int ESI, int TDS, int PT, int EWF) {
        this.Basic = Basic;
        this.DA = DA;
        this.HRA = HRA;
        this.CA = CA;
        this.MA = MA;
        this.LeaveEncashment = LeaveEncashment;
        this.HolidayWages = HolidayWages;
        this.SpecialAllowance = SpecialAllowance;
        this.Bonus = Bonus;
        this.PF = PF;
        this.ESI = ESI;
        this.TDS = TDS;
        this.PT = PT;
        this.EWF = EWF;
    }

    public int getBasic() {
        return Basic;
    }

    public void setBasic(int Basic) {
        this.Basic = Basic;
    }

    public int getDA() {
        return DA;
    }

    public void setDA(int DA) {
        this.DA = DA;
    }

    public int getHRA() {
        return HRA;
    }

    public void setHRA(int HRA) {
        this.HRA = HRA;
    }

    public int getCA() {
        return CA;
    }

    public void setCA(int CA) {
        this.CA = CA;
    }

    public int getMA() {
        return MA;
    }

    public void setMA(int MA) {
        this.MA = MA;
    }

    public int getLeaveEncashment() {
        return LeaveEncashment;
    }

    public void setLeaveEncashment(int LeaveEncashment) {
        this.LeaveEncashment = LeaveEncashment;
    }

    public int getHolidayWages() {
        return HolidayWages;
    }

    public void setHolidayWages(int HolidayWages) {
        this.HolidayWages = HolidayWages;
    }

    public int getSpecialAllowance() {
        return SpecialAllowance;
    }

    public void setSpecialAllowance(int SpecialAllowance) {
        this.SpecialAllowance = SpecialAllowance;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }


    public int getPF() {
        return PF;
    }

    public void setPF(int PF) {
        this.PF = PF;
    }

    public int getESI() {
        return ESI;
    }

    public void setESI(int ESI) {
        this.ESI = ESI;
    }

    public int getTDS() {
        return TDS;
    }

    public void setTDS(int TDS) {
        this.TDS = TDS;
    }

    public int getPT() {
        return PT;
    }

    public void setPT(int PT) {
        this.PT = PT;
    }

    public int getEWF() {
        return EWF;
    }

    public void setEWF(int EWF) {
        this.EWF = EWF;
    }

    public int getTotalDeduction() {
        return PF +ESI + TDS + PT + EWF;
    }

    public int getTotalEarning(){
        return Basic + DA + HRA + CA + MA + LeaveEncashment + HolidayWages + SpecialAllowance + Bonus;
    }

    public int getNetPay() {
        return (Basic + DA + HRA + CA + MA + LeaveEncashment + HolidayWages + SpecialAllowance + Bonus)-(PF +ESI + TDS + PT + EWF);
    }

    
}
