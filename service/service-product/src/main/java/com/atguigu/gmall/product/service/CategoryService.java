package com.atguigu.gmall.product.service;

import com.atguigu.gmall.bean.BaseCategory1Entity;
import com.atguigu.gmall.bean.BaseCategory2Entity;
import com.atguigu.gmall.bean.BaseCategory3Entity;

import java.util.List;

public interface CategoryService {
    List<BaseCategory1Entity> getCategory1();

    List<BaseCategory2Entity> getCategory2(Long getCategory1Id);

    List<BaseCategory3Entity> getCategory3(Long getCategory2Id);
}
