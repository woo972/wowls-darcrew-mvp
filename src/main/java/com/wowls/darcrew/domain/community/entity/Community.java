package com.wowls.darcrew.domain.community.entity;


import com.wowls.darcrew.domain.BaseEntity;
import com.wowls.darcrew.domain.page.entity.FrontPage;
import com.wowls.darcrew.domain.user.entity.User;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name="community")
@Builder
public class Community extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User owner;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "community_id")
    private List<FrontPage> pageList;


    public void setOwner(User owner) {
        this.owner = owner;
    }
}
