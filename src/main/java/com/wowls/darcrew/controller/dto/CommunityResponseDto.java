package com.wowls.darcrew.controller.dto;

import com.wowls.darcrew.domain.page.entity.FrontPage;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CommunityResponseDto {
    private String  communityName;
    private List<FrontPage> pageList;

}
