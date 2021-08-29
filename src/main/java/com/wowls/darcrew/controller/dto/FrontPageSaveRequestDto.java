package com.wowls.darcrew.controller.dto;

import com.wowls.darcrew.domain.page.entity.FrontPage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FrontPageSaveRequestDto {
    private Long communityId;
    private String name;

    public FrontPage toEntity() {
        return FrontPage.builder()
                .communityId(this.communityId)
                .name(this.name)
                .build();
    }
}
