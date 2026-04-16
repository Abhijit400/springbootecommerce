package com.demo.service.impl;

import com.demo.entity.CategoryMetaDataField;
import com.demo.repository.CategoryMetaDataFieldRepository;
import com.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMetaDataFieldRepository categoryMetaDataFieldRepository;

    @Override
    public List<CategoryMetaDataField> findAllCategory() {
        return categoryMetaDataFieldRepository.findAll();
    }
}
