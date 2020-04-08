package com.daji.serviceImpl;

import com.daji.mapper.DetailMapper;
import com.daji.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.daji.pojo.Detail;
import com.daji.service.DetailService;

import java.util.List;
@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailMapper mapper;
    @Override
    public List<Detail> getDetail() {
        return mapper.getDetail();
    }

    @Override
    public List<Category> getCate() {
        return mapper.getCate();
    }
}
