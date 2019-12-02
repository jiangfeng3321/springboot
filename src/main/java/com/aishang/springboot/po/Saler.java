package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..saler")
public class Saler {
    @Id
    @Column(name = "sID")
    private String sid;

    @Column(name = "sName")
    private String sname;

    @Column(name = "sRegion")
    private String sregion;

    @Column(name = "sPerson")
    private String sperson;

    @Column(name = "sTel")
    private String stel;

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
     * @return sName
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * @return sRegion
     */
    public String getSregion() {
        return sregion;
    }

    /**
     * @param sregion
     */
    public void setSregion(String sregion) {
        this.sregion = sregion;
    }

    /**
     * @return sPerson
     */
    public String getSperson() {
        return sperson;
    }

    /**
     * @param sperson
     */
    public void setSperson(String sperson) {
        this.sperson = sperson;
    }

    /**
     * @return sTel
     */
    public String getStel() {
        return stel;
    }

    /**
     * @param stel
     */
    public void setStel(String stel) {
        this.stel = stel;
    }
}