package com.aishang.springboot.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test_02..borrow")
public class Borrow {
    @Id
    private Integer 借书记录号;

    private String 会员编号;

    private String 书名;

    private Date 借书日期;

    /**
     * @return 借书记录号
     */
    public Integer get借书记录号() {
        return 借书记录号;
    }

    /**
     * @param 借书记录号
     */
    public void set借书记录号(Integer 借书记录号) {
        this.借书记录号 = 借书记录号;
    }

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
     * @return 书名
     */
    public String get书名() {
        return 书名;
    }

    /**
     * @param 书名
     */
    public void set书名(String 书名) {
        this.书名 = 书名;
    }

    /**
     * @return 借书日期
     */
    public Date get借书日期() {
        return 借书日期;
    }

    /**
     * @param 借书日期
     */
    public void set借书日期(Date 借书日期) {
        this.借书日期 = 借书日期;
    }
}