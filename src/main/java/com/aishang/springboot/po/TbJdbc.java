package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..tb_jdbc")
public class TbJdbc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private Integer password;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(Integer password) {
        this.password = password;
    }
}