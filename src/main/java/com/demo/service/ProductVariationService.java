package com.demo.service;

import com.demo.dto.ProductVariationDTO;
import com.demo.entity.ProductVariation;

public interface ProductVariationService {

    public ProductVariationDTO entityToDTO(ProductVariation productVariation);

    public ProductVariation DTOToEntity(ProductVariationDTO productVariationDTO);
}
