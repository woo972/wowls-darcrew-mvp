package com.wowls.darcrew.domain.community.repository;

import com.wowls.darcrew.domain.community.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CommunityRepository extends JpaRepository<Community, Long> {
    Community findByOwnerId(Long ownerId);
}
