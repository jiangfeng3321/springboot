package com.aishang.springboot.service.impl;

import com.aishang.springboot.dao.UserMapper;
import com.aishang.springboot.po.User;
import com.aishang.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
