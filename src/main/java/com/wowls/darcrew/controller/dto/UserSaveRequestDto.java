package com.wowls.darcrew.controller.dto;

import com.wowls.darcrew.domain.user.entity.User;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Setter
public class UserSaveRequestDto {
    private String name;
    private String email;

    public User toEntity() {
          return User.builder()
                  .name(this.name)
                  .email(this.email)
                  .build();
//        return new ModelMapper().map(this, User.class);
    }
}
