package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..member")
public class Member {
    @Id
    private String 会员编号;

    private String 会员名;

    private String 会员班级;

    /**
     * @return 会员编号
     */
    public String get会员编号() {
        return 会员编号;
    }

    /**
     * @param 会员编号
     */
    public void set会员编号(String 会员编号) {
        this.会员编号 = 会员编号;
    }

    /**
     * @return 会员名
     */
    public String get会员名() {
        return 会员名;
    }

    /**
     * @param 会员名
     */
    public void set会员名(String 会员名) {
        this.会员名 = 会员名;
    }

    /**
     * @return 会员班级
     */
    public String get会员班级() {
        return 会员班级;
    }

    /**
     * @param 会员班级
     */
    public void set会员班级(String 会员班级) {
        this.会员班级 = 会员班级;
    }
}