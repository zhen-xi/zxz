package com.daji.mapper;

import com.daji.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import com.daji.pojo.Detail;

import java.util.List;
@Mapper
public interface DetailMapper {
    List<Detail> getDetail();
    List<Category> getCate();
}
