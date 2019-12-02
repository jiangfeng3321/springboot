package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..posmess")
public class Posmess {
    @Column(name = "positionID")
    private String positionid;

    @Column(name = "positionName")
    private String positionname;

    /**
     * @return positionID
     */
    public String getPositionid() {
        return positionid;
    }

    /**
     * @param positionid
     */
    public void setPositionid(String positionid) {
        this.positionid = positionid;
    }

    /**
     * @return positionName
     */
    public String getPositionname() {
        return positionname;
    }

    /**
     * @param positionname
     */
    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }
}