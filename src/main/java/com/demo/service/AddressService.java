package com.demo.service;

import com.demo.dto.AddressDTO;
import com.demo.entity.Address;

import java.util.Set;

public interface AddressService {

    Address addressConvertDtoToEntity(AddressDTO addressDTO);

    Set<AddressDTO> addressConvertEntityTODto(Set<Address> address);
}
