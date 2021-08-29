package com.wowls.darcrew.domain.page.entity;

import com.wowls.darcrew.domain.BaseEntity;
import com.wowls.darcrew.domain.widget.entity.Widget;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@Entity
@Table(name = "page")
public class FrontPage extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(nullable = false, name = "page_id")
    private Long id;

    @Column(nullable = false, name = "community_id")
    private Long communityId;

    @Column(nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "page_id")
    private List<Widget> widgetList;
}
