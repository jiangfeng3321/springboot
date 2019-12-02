package com.aishang.springboot.controller;

import com.aishang.springboot.po.PageInfoExt;
import com.aishang.springboot.po.Product;
import com.aishang.springboot.po.ProductExt;
import com.aishang.springboot.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

    /*响应商品列表*/
    @RequestMapping("/getAll.do")
    public PageInfoExt getAll(@RequestBody ProductExt productExt) {
        return productService.getAll(productExt);
    }

    /*添加商品*/
    @RequestMapping("/addproduct.do")
    public String addproduct(@RequestParam("file") MultipartFile multipartFile, Product product) {
        productService.addproduct(multipartFile, product);
        return "ok";
    }

    /*删除商品*/
    @RequestMapping("/productDel.do")
    public String addproduct(Integer pid) {

        productService.productDel(pid);
        return "ok";
    }
    /*获取编辑的商品的信息*/
    @RequestMapping("/handleEdit.do")
    public Product handleEdit(Integer pid) {

        Product product = productService.handleEdit(pid);
        System.out.println(pid);

        return product;
    }


}