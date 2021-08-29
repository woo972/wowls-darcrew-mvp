package com.wowls.darcrew.controller.dto;

import com.wowls.darcrew.domain.community.entity.Community;
import com.wowls.darcrew.domain.user.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class CommunitySaveRequestDto {
    private Long ownerId;
    private String name;

    public Community toEntity() {
        return Community.builder()
                .name(this.name)
                .build();
    }
}
