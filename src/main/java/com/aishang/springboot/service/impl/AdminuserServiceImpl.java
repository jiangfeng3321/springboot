package com.aishang.springboot.service.impl;

import com.aishang.springboot.dao.AdminuserMapper;
import com.aishang.springboot.po.Adminuser;
import com.aishang.springboot.service.AdminuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class AdminuserServiceImpl implements AdminuserService {
    @Resource
    private AdminuserMapper adminuserMapper;

    @Override
    public Integer login(Adminuser adminuser) {
        return adminuserMapper.login(adminuser);
    }
}
