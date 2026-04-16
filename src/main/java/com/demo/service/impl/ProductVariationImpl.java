package com.demo.service.impl;

import com.demo.dto.ProductVariationDTO;
import com.demo.entity.ProductVariation;
import com.demo.service.ProductVariationService;
import org.springframework.stereotype.Service;

@Service
public class ProductVariationImpl implements ProductVariationService {

    @Override
    public ProductVariationDTO entityToDTO(ProductVariation productVariation) {
        ProductVariationDTO productVariationDTO = new ProductVariationDTO();
        productVariationDTO.setMetadata(productVariation.getMetadata());
        productVariationDTO.setPrice(productVariation.getPrice());
        productVariationDTO.setQuantityAvailable(productVariation.getQuantityAvailable());

        return productVariationDTO;
    }

    @Override
    public ProductVariation DTOToEntity(ProductVariationDTO productVariationDTO) {
        ProductVariation productVariation = new ProductVariation();
        productVariation.setMetadata(productVariationDTO.getMetadata());
        productVariation.setQuantityAvailable(productVariationDTO.getQuantityAvailable());
        productVariation.setPrice(productVariationDTO.getPrice());

        return  productVariation;
    }
}
