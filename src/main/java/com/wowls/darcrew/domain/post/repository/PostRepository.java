package com.wowls.darcrew.domain.post.repository;

import com.wowls.darcrew.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

//    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
//    List<Post> findAllDesc();


}
