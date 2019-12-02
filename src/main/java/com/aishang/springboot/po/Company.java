package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..company")
public class Company {
    @Column(name = "emp_no")
    private String empNo;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "manager_no")
    private String managerNo;

    /**
     * @return emp_no
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * @param empNo
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
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
     * @return manager_no
     */
    public String getManagerNo() {
        return managerNo;
    }

    /**
     * @param managerNo
     */
    public void setManagerNo(String managerNo) {
        this.managerNo = managerNo;
    }
}