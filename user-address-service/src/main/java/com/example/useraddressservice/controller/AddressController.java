package com.example.useraddressservice.controller;

import com.example.useraddressservice.entity.Address;
import com.example.useraddressservice.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/{userId}")
    public Address getAddressByUserId(@PathVariable Long userId) {
        return addressService.getAddressByUserId(userId);
    }
}
