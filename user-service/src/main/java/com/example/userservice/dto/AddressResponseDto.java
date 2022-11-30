package com.example.userservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressResponseDto {
    private Long id;
    private Long userId;
    private String addressText;
}
