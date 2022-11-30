package com.example.useraddressservice.consumers.model;

import com.example.useraddressservice.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCreatedEvent {
    private Long id;
    private String addressText;

    public static Address getAddressEntityFromEvent(UserCreatedEvent event) {
        return Address.builder()
            .userId(event.getId())
            .addressText(event.getAddressText())
            .build();
    }
}
