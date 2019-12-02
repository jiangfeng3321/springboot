package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..sales")
public class Sales {
    @Column(name = "stor_id")
    private String storId;

    @Column(name = "ord_num")
    private String ordNum;

    @Column(name = "ord_date")
    private String ordDate;

    private String qty;

    private String payterms;

    @Column(name = "title_id")
    private String titleId;

    /**
     * @return stor_id
     */
    public String getStorId() {
        return storId;
    }

    /**
     * @param storId
     */
    public void setStorId(String storId) {
        this.storId = storId;
    }

    /**
     * @return ord_num
     */
    public String getOrdNum() {
        return ordNum;
    }

    /**
     * @param ordNum
     */
    public void setOrdNum(String ordNum) {
        this.ordNum = ordNum;
    }

    /**
     * @return ord_date
     */
    public String getOrdDate() {
        return ordDate;
    }

    /**
     * @param ordDate
     */
    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    /**
     * @return qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * @return payterms
     */
    public String getPayterms() {
        return payterms;
    }

    /**
     * @param payterms
     */
    public void setPayterms(String payterms) {
        this.payterms = payterms;
    }

    /**
     * @return title_id
     */
    public String getTitleId() {
        return titleId;
    }

    /**
     * @param titleId
     */
    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }
}