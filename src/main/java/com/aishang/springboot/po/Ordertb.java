package com.aishang.springboot.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test_02..ordertb")
public class Ordertb {
    @Id
    @Column(name = "orderID")
    private Integer orderid;

    @Column(name = "webName")
    private String webname;

    @Column(name = "productName")
    private String productname;

    @Column(name = "productType")
    private String producttype;

    @Column(name = "orderCount")
    private Integer ordercount;

    @Column(name = "orderDate")
    private Date orderdate;

    private String agent;

    /**
     * @return orderID
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * @param orderid
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * @return webName
     */
    public String getWebname() {
        return webname;
    }

    /**
     * @param webname
     */
    public void setWebname(String webname) {
        this.webname = webname;
    }

    /**
     * @return productName
     */
    public String getProductname() {
        return productname;
    }

    /**
     * @param productname
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * @return productType
     */
    public String getProducttype() {
        return producttype;
    }

    /**
     * @param producttype
     */
    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    /**
     * @return orderCount
     */
    public Integer getOrdercount() {
        return ordercount;
    }

    /**
     * @param ordercount
     */
    public void setOrdercount(Integer ordercount) {
        this.ordercount = ordercount;
    }

    /**
     * @return orderDate
     */
    public Date getOrderdate() {
        return orderdate;
    }

    /**
     * @param orderdate
     */
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * @return agent
     */
    public String getAgent() {
        return agent;
    }

    /**
     * @param agent
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }
}