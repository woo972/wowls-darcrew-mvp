package com.wowls.darcrew.domain.widget.entity;

import com.wowls.darcrew.domain.BaseEntity;
import com.wowls.darcrew.domain.widget.vo.WidgetContents;
import com.wowls.darcrew.domain.widget.vo.WidgetType;
import lombok.*;
import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@Entity
@Table(name = "widget")
public class Widget extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "widget_id")
    private Long id;

    @Column(nullable = false, name = "page_id")
    private Long pageId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "widget_type")
    private WidgetType widgetType;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer position;

    @Embedded
    private WidgetContents widgetContents;
}
