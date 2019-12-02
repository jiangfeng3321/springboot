package com.aishang.springboot.po;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class PageInfoExt extends PageInfo<Product> {

    public PageInfoExt(List<Product> list, int navigatePages) {
        /* compiled code */
        super(list,navigatePages);
    }

    private Integer pageNow;
    private Integer pageSize;
    private Integer cid;
    private Integer csid;
    private String pname;

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }



    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
