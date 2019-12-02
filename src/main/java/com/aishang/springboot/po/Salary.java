package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..salary")
public class Salary {
    @Column(name = "salaryID")
    private String salaryid;

    @Column(name = "employeeID")
    private String employeeid;

    private String position;

    private Integer wage;

    /**
     * @return salaryID
     */
    public String getSalaryid() {
        return salaryid;
    }

    /**
     * @param salaryid
     */
    public void setSalaryid(String salaryid) {
        this.salaryid = salaryid;
    }

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
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return wage
     */
    public Integer getWage() {
        return wage;
    }

    /**
     * @param wage
     */
    public void setWage(Integer wage) {
        this.wage = wage;
    }
}