package com.wowls.darcrew.domain.user.repository;

import com.wowls.darcrew.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

//    @Query("SELECT u FROM user u ORDER BY u.id DESC")
//    List<User> findAllDesc();
}
