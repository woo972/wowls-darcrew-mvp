package com.wowls.darcrew.domain.page.repogitory;


import com.wowls.darcrew.domain.page.entity.FrontPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FrontPageRepository extends JpaRepository<FrontPage, Long> {
    List<FrontPage> findAllByCommunityId(Long communityId);
}
