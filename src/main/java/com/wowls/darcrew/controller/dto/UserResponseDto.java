package com.wowls.darcrew.controller.dto;

import com.wowls.darcrew.domain.user.entity.User;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private LocalDateTime modifiedDate;

    public UserResponseDto(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.modifiedDate = entity.getModifiedDate();
    }
}
