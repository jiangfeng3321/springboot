package com.aishang.springboot.service;

import com.aishang.springboot.po.PageInfoExt;
import com.aishang.springboot.po.Product;
import com.aishang.springboot.po.ProductExt;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    /*获取商品列表*/
    PageInfoExt getAll(ProductExt productExt);
    /*商品添加*/
    void addproduct(MultipartFile multipartFile, Product product);
    /*删除商品*/
    void productDel(Integer product);
    /*获取编辑的商品的信息*/
    Product handleEdit(Integer csid);
}
