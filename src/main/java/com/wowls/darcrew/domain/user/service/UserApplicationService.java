package com.wowls.darcrew.domain.user.service;

import com.wowls.darcrew.controller.dto.*;
import com.wowls.darcrew.domain.community.repository.CommunityRepository;
import com.wowls.darcrew.domain.post.entity.Post;
import com.wowls.darcrew.domain.user.entity.User;
import com.wowls.darcrew.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserApplicationService {
    private final UserRepository userRepository;

    @Transactional
    public Long save(UserSaveRequestDto requestDto) {
        return userRepository.save(requestDto.toEntity()).getId();
    }

//    @Transactional
//    public Long update(Long id, UserUpdateRequestDto requestDto) {
//        User user = userRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
//
//        user.update(requestDto);
//
//        return id;
//    }

//    @Transactional
//    public void delete (Long id) {
//        Post post = userRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
//        userRepository.delete(post);
//    }
//
    @Transactional(readOnly = true)
    public UserResponseDto findById(Long id) {
        User entity = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
        Thread.dumpStack();

        return new ModelMapper().map(entity, UserResponseDto.class);
    }

    @Transactional(readOnly = true)
    public List<UserResponseDto> findAllDesc() {
        return userRepository.findAll().stream()
                .map(UserResponseDto::new)
                .collect(Collectors.toList());
    }
}
