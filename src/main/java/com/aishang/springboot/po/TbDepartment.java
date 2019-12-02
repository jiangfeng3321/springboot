package com.aishang.springboot.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test_02..tb_department")
public class TbDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "depName")
    private String depname;

    @Column(name = "depCreateTime")
    private Date depcreatetime;

    private Integer sort;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return depName
     */
    public String getDepname() {
        return depname;
    }

    /**
     * @param depname
     */
    public void setDepname(String depname) {
        this.depname = depname;
    }

    /**
     * @return depCreateTime
     */
    public Date getDepcreatetime() {
        return depcreatetime;
    }

    /**
     * @param depcreatetime
     */
    public void setDepcreatetime(Date depcreatetime) {
        this.depcreatetime = depcreatetime;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}