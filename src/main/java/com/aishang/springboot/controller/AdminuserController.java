package com.aishang.springboot.controller;


import com.aishang.springboot.po.Adminuser;
import com.aishang.springboot.service.AdminuserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/adminuser")
public class AdminuserController {
    @Resource
    private AdminuserService adminuserService;
    @Resource
    private HttpSession session;

    @RequestMapping("/login")
    public Adminuser login(@RequestBody Adminuser adminuser){
        Integer uid = adminuserService.login(adminuser);
        if (uid!=null){
            adminuser.setUid(uid);
            session.setAttribute("user",adminuser);
            return adminuser;
        }else {
            return null;
        }

    }
}
