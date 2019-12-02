package com.aishang.springboot.service;

import com.aishang.springboot.po.User;

import java.util.List;

public interface UserService {
    /*获取所有USER信息*/
    List<User> getAll();
}
