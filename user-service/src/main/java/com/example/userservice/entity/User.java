package com.example.userservice.entity;


import com.example.userservice.dto.UserCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    //unique = true,
    @Column(name = "email", nullable = false)
    private String email;

    public static User getUser(UserCreateRequest userCreateRequest) {
        return User.builder()
            .firstName(userCreateRequest.getFirstName())
            .lastName(userCreateRequest.getLastName())
            .email(userCreateRequest.getEmail())
            .build();
    }
}