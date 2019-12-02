package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..emp")
public class Emp {
    @Column(name = "employeeID")
    private String employeeid;

    @Column(name = "employeeName")
    private String employeename;

    @Column(name = "employeeAge")
    private String employeeage;

    @Column(name = "joinDate")
    private String joindate;

    @Column(name = "employeeTel")
    private String employeetel;

    /**
     * @return employeeID
     */
    public String getEmployeeid() {
        return employeeid;
    }

    /**
     * @param employeeid
     */
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    /**
     * @return employeeName
     */
    public String getEmployeename() {
        return employeename;
    }

    /**
     * @param employeename
     */
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    /**
     * @return employeeAge
     */
    public String getEmployeeage() {
        return employeeage;
    }

    /**
     * @param employeeage
     */
    public void setEmployeeage(String employeeage) {
        this.employeeage = employeeage;
    }

    /**
     * @return joinDate
     */
    public String getJoindate() {
        return joindate;
    }

    /**
     * @param joindate
     */
    public void setJoindate(String joindate) {
        this.joindate = joindate;
    }

    /**
     * @return employeeTel
     */
    public String getEmployeetel() {
        return employeetel;
    }

    /**
     * @param employeetel
     */
    public void setEmployeetel(String employeetel) {
        this.employeetel = employeetel;
    }
}