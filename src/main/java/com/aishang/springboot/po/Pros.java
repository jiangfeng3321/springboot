package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..pros")
public class Pros {
    @Id
    @Column(name = "pId")
    private String pid;

    @Column(name = "pName")
    private String pname;

    @Column(name = "pPrice")
    private Double pprice;

    @Column(name = "pStock")
    private Integer pstock;

    /**
     * @return pId
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return pName
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * @return pPrice
     */
    public Double getPprice() {
        return pprice;
    }

    /**
     * @param pprice
     */
    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    /**
     * @return pStock
     */
    public Integer getPstock() {
        return pstock;
    }

    /**
     * @param pstock
     */
    public void setPstock(Integer pstock) {
        this.pstock = pstock;
    }
}