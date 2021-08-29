package com.wowls.darcrew.controller.dto;

import com.wowls.darcrew.domain.widget.entity.Widget;
import com.wowls.darcrew.domain.widget.vo.WidgetContents;
import com.wowls.darcrew.domain.widget.vo.WidgetType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WidgetSaveRequestDto {
    private Long pageId;
    private String name;
    private WidgetType widgetType;
    private Integer position;
    private WidgetContents widgetContents;

    public Widget toEntity(){
        return Widget.builder()
                .pageId(this.pageId)
                .name(this.name)
                .position(this.position)
                .widgetType(this.widgetType)
                .widgetContents(this.widgetContents)
                .build();
    }
}
