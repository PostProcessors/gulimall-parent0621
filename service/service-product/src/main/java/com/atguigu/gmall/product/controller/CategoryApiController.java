package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.bean.BaseCategory1Entity;
import com.atguigu.gmall.bean.BaseCategory2Entity;
import com.atguigu.gmall.bean.BaseCategory3Entity;
import com.atguigu.gmall.product.service.CategoryService;
import com.atguigu.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/admin/product")
public class CategoryApiController {

    @Autowired
    CategoryService categoryService;


    @RequestMapping("/getCategory1")
   public Result getCategory1(){
      List<BaseCategory1Entity> category1List =  categoryService.getCategory1();
        return Result.ok(category1List);
   }


    @RequestMapping("/getCategory2/{getCategory1Id}")
    public Result getCategory2(@PathVariable("getCategory1Id") Long getCategory1Id ){
        List<BaseCategory2Entity> category2List =  categoryService.getCategory2(getCategory1Id);
        return Result.ok(category2List);
    }
    @RequestMapping("/getCategory3/{getCategory2Id}")
    public Result getCategory3(@PathVariable("getCategory2Id") Long getCategory2Id ){
        List<BaseCategory3Entity> category3List =  categoryService.getCategory3(getCategory2Id);
        return Result.ok(category3List);
    }







}
