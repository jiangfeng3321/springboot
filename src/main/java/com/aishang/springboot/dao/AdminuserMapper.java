package com.aishang.springboot.dao;

import com.aishang.springboot.po.Adminuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.MyMapper;
@Mapper
public interface AdminuserMapper extends MyMapper<Adminuser> {
    /*登录*/
    @Select("select uid from Adminuser where username=#{username} and password = #{password}")
    Integer login(Adminuser adminuser);
}