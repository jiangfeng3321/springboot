package com.aishang.springboot.service.impl;

import com.aishang.springboot.dao.ProductMapper;
import com.aishang.springboot.po.PageInfoExt;
import com.aishang.springboot.po.Product;
import com.aishang.springboot.po.ProductExt;
import com.aishang.springboot.service.ProductService;
import com.aishang.springboot.util.FileUploadUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private FileUploadUtil fileUploadUtil;
    @Resource
    private ProductMapper productMapper;

    @Override
    public PageInfoExt getAll(ProductExt productExt) {

        //设置pageNow和pageSize
        PageHelper.startPage(productExt.getPageNow(),8);

        //查询商品结果集
        List<Product> products = productMapper.getAll(productExt);

        //返回商品结果集，products：商品结果集   navigatePages =7  设置页码数为7
        PageInfoExt pageInfo = new PageInfoExt(products,7);
        pageInfo.setPageNow(productExt.getPageNow());
        pageInfo.setCid(productExt.getCid());
        pageInfo.setCsid(productExt.getCsid());
        pageInfo.setPname(productExt.getPname());

        return pageInfo;
    }
    /*商品添加*/
    @Transactional
    @Override
    public void addproduct(MultipartFile multipartFile, Product product) {
        File localFile = null;
        try {
            //上传文件
            localFile = fileUploadUtil.doUpload(multipartFile);
            //上传数据
            product.setPdate(new Date());
            product.setImage(fileUploadUtil.getImgPath(localFile.getPath()));
            productMapper.addProduct(product);
        } catch (Exception e) {
            fileUploadUtil.delPic(localFile.getPath());
            throw new RuntimeException("上传失败");
        }
    }

    @Override
    public void productDel(Integer pid) {
        productMapper.productDel(pid);
    }
    /*获取编辑的商品的信息*/
    @Override
    public Product handleEdit(Integer pid) {
        return productMapper.handleEdit(pid);
    }


}

