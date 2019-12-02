package com.aishang.springboot.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test_02..pro_sal")
public class ProSal {
    @Id
    private Date psdate;

    @Column(name = "psId")
    private String psid;

    @Column(name = "sID")
    private String sid;

    @Column(name = "psNumber")
    private Integer psnumber;

    @Column(name = "psMoney")
    private Integer psmoney;

    /**
     * @return psdate
     */
    public Date getPsdate() {
        return psdate;
    }

    /**
     * @param psdate
     */
    public void setPsdate(Date psdate) {
        this.psdate = psdate;
    }

    /**
     * @return psId
     */
    public String getPsid() {
        return psid;
    }

    /**
     * @param psid
     */
    public void setPsid(String psid) {
        this.psid = psid;
    }

    /**
     * @return sID
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return psNumber
     */
    public Integer getPsnumber() {
        return psnumber;
    }

    /**
     * @param psnumber
     */
    public void setPsnumber(Integer psnumber) {
        this.psnumber = psnumber;
    }

    /**
     * @return psMoney
     */
    public Integer getPsmoney() {
        return psmoney;
    }

    /**
     * @param psmoney
     */
    public void setPsmoney(Integer psmoney) {
        this.psmoney = psmoney;
    }
}