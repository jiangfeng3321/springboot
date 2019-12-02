package com.aishang.springboot.dao;

import com.aishang.springboot.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.MyMapper;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> getAll();
}