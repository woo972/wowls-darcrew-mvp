package com.wowls.darcrew.controller.dto;

import com.wowls.darcrew.domain.widget.entity.Widget;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FrontPageResponseDto {
    private Long pageId;
    private Long communityId;
    private String name;
    private List<Widget> widgetList;
}
