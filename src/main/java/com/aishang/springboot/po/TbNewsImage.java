package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..tb_news_image")
public class TbNewsImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer nid;

    private String image;

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
     * @return nid
     */
    public Integer getNid() {
        return nid;
    }

    /**
     * @param nid
     */
    public void setNid(Integer nid) {
        this.nid = nid;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }
}