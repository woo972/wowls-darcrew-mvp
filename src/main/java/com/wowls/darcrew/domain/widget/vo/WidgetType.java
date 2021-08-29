package com.wowls.darcrew.domain.widget.vo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public enum WidgetType {
    BUTTON("BUTTON"),
    LISTING("LISTING"),
    NAVIGATOR("NAVIGATOR"),
    BANNER("BANNER");

    private String widgetType;

    WidgetType(String widgetType) {
        this.widgetType = widgetType;
    }
}
