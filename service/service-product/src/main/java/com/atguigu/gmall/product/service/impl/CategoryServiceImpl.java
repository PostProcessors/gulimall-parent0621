package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.bean.BaseCategory1Entity;
import com.atguigu.gmall.bean.BaseCategory2Entity;
import com.atguigu.gmall.bean.BaseCategory3Entity;
import com.atguigu.gmall.product.mapper.BaseCategory1Mapper;
import com.atguigu.gmall.product.mapper.BaseCategory2Mapper;
import com.atguigu.gmall.product.mapper.BaseCategory3Mapper;
import com.atguigu.gmall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    BaseCategory1Mapper baseCategory1Mapper;
    @Autowired
    BaseCategory2Mapper baseCategory2Mapper;

    @Autowired
    BaseCategory3Mapper baseCategory3Mapper;



    @Override
    public List<BaseCategory1Entity> getCategory1() {
        List<BaseCategory1Entity> baseCategory1EntityList = baseCategory1Mapper.selectList(null);
        return baseCategory1EntityList;
    }

    @Override
    public List<BaseCategory2Entity> getCategory2(Long getCategory1Id) {
        QueryWrapper<BaseCategory2Entity> wrapper = new QueryWrapper<>();
        wrapper.eq("category1_id",getCategory1Id);
        List<BaseCategory2Entity> baseCategory2Entities = baseCategory2Mapper.selectList(wrapper);
        return baseCategory2Entities;
    }

    @Override
    public List<BaseCategory3Entity> getCategory3(Long getCategory2Id) {
        QueryWrapper<BaseCategory3Entity> wrapper = new QueryWrapper<>();
        wrapper.eq("category2_id",getCategory2Id);
        List<BaseCategory3Entity> baseCategory3Entities = baseCategory3Mapper.selectList(wrapper);
        return baseCategory3Entities;
    }


}
