package com.demo.service;

import com.demo.dto.CategoryMetaDataFeildDTO;
import com.demo.entity.CategoryMetaDataField;

public interface CategoryMetaDataFeildService {

    CategoryMetaDataFeildDTO covertEntityToDTO(CategoryMetaDataField categoryMetaDataField);

    CategoryMetaDataField convertDTOToEntity(CategoryMetaDataFeildDTO categoryMetaDataFeildDTO);
}
