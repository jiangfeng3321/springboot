package com.aishang.springboot.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test_02..tb_news")
public class TbNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private Integer typeid;

    /**
     * 0,未审核；1.审核通过
     */
    private Integer flag;

    private Date createtime;

    private Integer uid;

    private String content;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return typeid
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * 获取0,未审核；1.审核通过
     *
     * @return flag - 0,未审核；1.审核通过
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置0,未审核；1.审核通过
     *
     * @param flag 0,未审核；1.审核通过
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}