package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..department")
public class Department {
    @Column(name = "com_id")
    private String comId;

    @Column(name = "com_name")
    private String comName;

    @Column(name = "com_manager")
    private String comManager;

    @Column(name = "com_total")
    private String comTotal;

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
     * @return com_name
     */
    public String getComName() {
        return comName;
    }

    /**
     * @param comName
     */
    public void setComName(String comName) {
        this.comName = comName;
    }

    /**
     * @return com_manager
     */
    public String getComManager() {
        return comManager;
    }

    /**
     * @param comManager
     */
    public void setComManager(String comManager) {
        this.comManager = comManager;
    }

    /**
     * @return com_total
     */
    public String getComTotal() {
        return comTotal;
    }

    /**
     * @param comTotal
     */
    public void setComTotal(String comTotal) {
        this.comTotal = comTotal;
    }
}