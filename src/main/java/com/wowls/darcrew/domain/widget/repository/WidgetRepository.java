package com.wowls.darcrew.domain.widget.repository;

import com.wowls.darcrew.domain.widget.entity.Widget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WidgetRepository extends JpaRepository<Widget, Long> {

}
