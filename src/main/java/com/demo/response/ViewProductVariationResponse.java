package com.demo.response;

import com.demo.entity.Product;
import com.demo.entity.ProductVariation;

public class ViewProductVariationResponse {

    Product product;
    ProductVariation productVariation;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductVariation getProductVariation() {
        return productVariation;
    }

    public void setProductVariation(ProductVariation productVariation) {
        this.productVariation = productVariation;
    }
}
