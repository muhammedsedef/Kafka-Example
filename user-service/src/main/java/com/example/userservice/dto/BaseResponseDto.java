package com.example.userservice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class BaseResponseDto {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
