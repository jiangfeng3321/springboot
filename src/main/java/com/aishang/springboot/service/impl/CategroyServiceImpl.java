package com.aishang.springboot.service.impl;

import com.aishang.springboot.dao.CategorysecondMapper;
import com.aishang.springboot.po.Category;
import com.aishang.springboot.po.Categorysecond;
import com.aishang.springboot.service.CategroyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategroyServiceImpl implements CategroyService {

    @Resource
    private CategorysecondMapper categorysecondMapper;
    //获取一级类目信息
    @Override
    public List<Category> getAllCategory() {
        return categorysecondMapper.getAllCategory();
    }
    //获取二级类目
    @Override
    public List<Categorysecond> getCategorySecond(Integer cid) {
        return categorysecondMapper.getCategorySecond(cid);
    }
    //获取下拉列表
    @Override
    public Integer edit(Integer csid) {
        return categorysecondMapper.edit(csid);
    }


}
