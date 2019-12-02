package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..employees")
public class Employees {
    @Column(name = "emp_id")
    private String empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_cardid")
    private String empCardid;

    @Column(name = "emp_wage")
    private String empWage;

    @Column(name = "emp_salary")
    private String empSalary;

    @Column(name = "emp_city")
    private String empCity;

    @Column(name = "com_id")
    private String comId;

    @Column(name = "emp_date")
    private String empDate;

    /**
     * @return emp_id
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * @param empId
     */
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    /**
     * @return emp_name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return emp_cardid
     */
    public String getEmpCardid() {
        return empCardid;
    }

    /**
     * @param empCardid
     */
    public void setEmpCardid(String empCardid) {
        this.empCardid = empCardid;
    }

    /**
     * @return emp_wage
     */
    public String getEmpWage() {
        return empWage;
    }

    /**
     * @param empWage
     */
    public void setEmpWage(String empWage) {
        this.empWage = empWage;
    }

    /**
     * @return emp_salary
     */
    public String getEmpSalary() {
        return empSalary;
    }

    /**
     * @param empSalary
     */
    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    /**
     * @return emp_city
     */
    public String getEmpCity() {
        return empCity;
    }

    /**
     * @param empCity
     */
    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    /**
     * @return com_id
     */
    public String getComId() {
        return comId;
    }

    /**
     * @param comId
     */
    public void setComId(String comId) {
        this.comId = comId;
    }

    /**
     * @return emp_date
     */
    public String getEmpDate() {
        return empDate;
    }

    /**
     * @param empDate
     */
    public void setEmpDate(String empDate) {
        this.empDate = empDate;
    }
}