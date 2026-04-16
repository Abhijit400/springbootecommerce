package com.demo.service;

import com.demo.dto.SellerDTO;
import com.demo.entity.Seller;
import com.demo.entity.User;
import java.util.List;

public interface SellerService {
    
    public List<SellerDTO> getSellers();

    SellerDTO sellerConvertEntityToDto(Seller Seller);

    Seller sellerConvertDtoToEntity(SellerDTO SellerDTO);

    public SellerDTO saveSeller(SellerDTO SellerDTO);
    
    void sendEmail(User user);
    
}
