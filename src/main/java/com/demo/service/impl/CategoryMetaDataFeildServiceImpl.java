package com.demo.service.impl;

import com.demo.dto.CategoryMetaDataFeildDTO;
import com.demo.entity.CategoryMetaDataField;
import com.demo.service.CategoryMetaDataFeildService;
import org.springframework.stereotype.Service;

@Service
public class CategoryMetaDataFeildServiceImpl implements CategoryMetaDataFeildService {
    @Override
    public CategoryMetaDataFeildDTO covertEntityToDTO(CategoryMetaDataField categoryMetaDataField) {
        CategoryMetaDataFeildDTO categoryMetaDataFeildDTO = new CategoryMetaDataFeildDTO();
        categoryMetaDataFeildDTO.setName(categoryMetaDataField.getName());
        return categoryMetaDataFeildDTO;
    }

    @Override
    public CategoryMetaDataField convertDTOToEntity(CategoryMetaDataFeildDTO categoryMetaDataFeildDTO) {
        CategoryMetaDataField categoryMetaDataField = new CategoryMetaDataField();
        categoryMetaDataField.setName(categoryMetaDataFeildDTO.getName());
        return categoryMetaDataField;
    }
}
