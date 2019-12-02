package com.aishang.springboot.service;

import com.aishang.springboot.po.Category;
import com.aishang.springboot.po.Categorysecond;
import com.aishang.springboot.po.Product;

import java.util.List;

public interface CategroyService {
    //获取一级类目信息
     List<Category> getAllCategory();
    //获取二级类目信息
    List<Categorysecond> getCategorySecond(Integer cid);

    //获取下拉列表
    Integer edit(Integer csid);
}
