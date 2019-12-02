package com.aishang.springboot.controller;

import com.aishang.springboot.po.Category;
import com.aishang.springboot.po.Categorysecond;
import com.aishang.springboot.po.Product;
import com.aishang.springboot.service.CategroyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/categroy")
public class CategroyController {
    @Resource
    private CategroyService categroyService;

    //获取一级类目信息
    @RequestMapping("/getAllCategory.do")
    public List<Category> getAllCategory(){
        return categroyService.getAllCategory();
    }

    //获取二姐目录信息
    @RequestMapping("/getCategorySecond.do")
    public List<Categorysecond> getCategorySecond(Integer cid){
        return categroyService.getCategorySecond(cid);
    }


    //获取下拉列表
    @RequestMapping("/edit.do")
    public List<Categorysecond> edit(Integer csid){
        Integer cid = categroyService.edit(csid);
        List<Categorysecond> categorySecond = categroyService.getCategorySecond(cid);
        return categorySecond;
    }

}
