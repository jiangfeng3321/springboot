package com.aishang.springboot.dao;

import com.aishang.springboot.po.PageInfoExt;
import com.aishang.springboot.po.Product;
import com.aishang.springboot.po.ProductExt;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.MyMapper;

import java.util.List;
@Mapper
public interface ProductMapper extends MyMapper<Product> {
    /*查询商品列表*/
    List<Product> getAll(ProductExt productExt);
    /*添加商品*/
    @Insert("insert into product value(default,#{pname},#{marketPrice},#{shopPrice},#{image},#{pdesc},#{isHot},#{pdate},#{csid})")
    void addProduct(Product product);
    /*删除商品*/
    @Delete("DELETE from product where pid = #{pid}")
    void productDel(Integer pid);

    /*获取编辑的商品的信息*/
    Product handleEdit(Integer pid);
}