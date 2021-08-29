package com.wowls.darcrew.domain.community.service;

import com.wowls.darcrew.controller.dto.*;
import com.wowls.darcrew.domain.community.entity.Community;
import com.wowls.darcrew.domain.community.repository.CommunityRepository;
import com.wowls.darcrew.domain.post.entity.Post;
import com.wowls.darcrew.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CommunityApplicationService {
    private final CommunityRepository communityRepository;

    @Transactional
    public CommunityResponseDto save(CommunitySaveRequestDto requestDto) {
        Community community = communityRepository.save(new ModelMapper().map(requestDto, Community.class));
        return new ModelMapper().map(community, CommunityResponseDto.class);
    }
//
//    @Transactional
//    public Long update(Long id, PostsUpdateRequestDto requestDto) {
//        Post post = postRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
//
//        post.update(requestDto.getTitle(), requestDto.getContent());
//
//        return id;
//    }
//
//    @Transactional
//    public void delete (Long id) {
//        Post post = postRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
//        postRepository.delete(post);
//    }
//
//    @Transactional(readOnly = true)
//    public PostsResponseDto findById(Long id) {
//        Post entity = postRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
//        Thread.dumpStack();
//
//        return new PostsResponseDto(entity);
//    }
//
    @Transactional(readOnly = true)
    public CommunityResponseDto findCommunityByOwnerId(Long ownerId) {
        Community community = communityRepository.findByOwnerId(ownerId);
        return new ModelMapper().map(community, CommunityResponseDto.class);
    }
}
