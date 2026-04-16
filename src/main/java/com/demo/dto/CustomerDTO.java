package com.demo.dto;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class CustomerDTO {


    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
            message = "Phone number not vaild")
    String contactNumber;
    @Valid
    UserDTO userDTO;

    public CustomerDTO(String contactNumber, UserDTO userDTO) {
        this.contactNumber = contactNumber;
        this.userDTO = userDTO;
    }


    public CustomerDTO(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
