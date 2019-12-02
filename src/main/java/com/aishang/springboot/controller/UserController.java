package com.aishang.springboot.controller;

import com.aishang.springboot.po.User;
import com.aishang.springboot.service.UserService;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/getAll.do")
    public List<User> getAll(){
        return userService.getAll();
    }
}
