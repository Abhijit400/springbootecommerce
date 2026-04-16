package com.demo.service.impl;

import com.demo.dto.AddressDTO;
import com.demo.entity.Address;
import com.demo.service.AddressService;
import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public Address addressConvertDtoToEntity(AddressDTO addressDTO) {

        Address address = new Address();
        address.setCity(addressDTO.getCity());
        address.setState(addressDTO.getState());
        address.setCountry(addressDTO.getCountry());
        address.setAddressline(addressDTO.getAddressline());
        address.setZipcode(addressDTO.getZipcode());
        address.setLabel(addressDTO.getLabel());
        return address;
    }

    @Override
    public Set<AddressDTO> addressConvertEntityTODto(Set<Address> address) {
        return address.stream().map(o->new AddressDTO(o.getCity(),o.getState(),
                o.getCountry(),o.getAddressline(),o.getZipcode(),o.getLabel())).collect(Collectors.toSet());
    }
}
