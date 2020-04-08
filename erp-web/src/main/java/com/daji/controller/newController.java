package com.daji.controller;

import com.daji.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.daji.pojo.Detail;
import com.daji.service.DetailService;

import java.util.List;

@Controller
public class newController {
    @Autowired
    DetailService service;
    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        return page;
    }
    @RequestMapping("getIndex")
    @ResponseBody
    public Object getIndex(){
        List<Detail> list = service.getDetail();
        for (Detail d:list) {
            System.out.println(d);
        }
        return list;
    }
    @RequestMapping("getCategory")
    @ResponseBody
    public Object getCategory(){
        List<Category> list = service.getCate();
        return list;
    }
}
