package com.demo.service;

import com.demo.dto.AddressDTO;
import com.demo.dto.CustomerDTO;
import com.demo.entity.Customer;
import com.demo.entity.User;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;


public interface CustomerService {

    public List<CustomerDTO> getCustomers();

    CustomerDTO customerConvertEntityToDto(Customer customer);

    Customer customerConvertDtoToEntity(CustomerDTO customerDTO);

    public CustomerDTO saveCustomer(CustomerDTO customerDTO);


    @Transactional
    String resendToken(User user);

    String checkEmail(String email);

    void sendEmail(User user);

    public String confirmToken(String token);

    public  Set<AddressDTO> getCustomerAddress(String email);
}
