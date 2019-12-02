package com.aishang.springboot.dao;

import com.aishang.springboot.po.Category;
import com.aishang.springboot.po.Categorysecond;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.MyMapper;

import java.util.List;

@Mapper
public interface CategorysecondMapper extends MyMapper<Categorysecond> {

    //获取一级类目信息
    @Select("select * from category")
    List<Category> getAllCategory();


    //获取二级目录信息
    @Select("select * from categorysecond where cid = #{cid}")
    List<Categorysecond> getCategorySecond(Integer cid);

    //获取下拉列表
    @Select("select cid from categorysecond where csid = #{csid}")
    Integer edit(Integer csid);
}