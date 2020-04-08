package com.daji.service;

import com.daji.pojo.Category;
import com.daji.pojo.Detail;

import java.util.List;

public interface DetailService {
    List<Detail> getDetail();
    List<Category> getCate();
}
