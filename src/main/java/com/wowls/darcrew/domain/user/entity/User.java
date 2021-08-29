package com.wowls.darcrew.domain.user.entity;

import com.wowls.darcrew.domain.BaseEntity;
import com.wowls.darcrew.domain.community.entity.Community;
import com.wowls.darcrew.domain.user.Role;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "user")
public class User extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String picture;

    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
    private Role role;

//    @Column(name = "own_community")
//    @JoinColumn(name = "community_id")
//    private Community ownCommunity;

    @Builder
    public User(String name, String email, String picture, Role role) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }

//    public void ownCommunity(Community community) {
//        this.ownCommunity = community;
//    }

    public User update(String name, String picture) {
        this.name = name;
        this.picture = picture;
        return this;
    }
}
