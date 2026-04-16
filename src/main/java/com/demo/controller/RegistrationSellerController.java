package com.demo.controller;

import com.demo.customexception.JsonFormatExceptionClass;
import com.demo.dto.SellerDTO;
import com.demo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("register/seller")
public class RegistrationSellerController {

        @Autowired
        SellerService SellerService;


        @PostMapping
        public void saveSeller(@Valid @RequestBody SellerDTO SellerDTO , HttpServletRequest request, HttpServletResponse response) throws Exception{
            SellerDTO SellerDTO1 = SellerService.saveSeller(SellerDTO);
            JsonFormatExceptionClass.getJsonMessage("Seller successfully registered",request,response);
        }

}
