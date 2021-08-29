package com.wowls.darcrew.controller;

import com.wowls.darcrew.controller.dto.*;
import com.wowls.darcrew.domain.community.service.CommunityApplicationService;
import com.wowls.darcrew.domain.user.service.UserApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserApiController {

    private final UserApplicationService userApplicationService;

    @PostMapping("/api/v1/users")
    public Long save(@RequestBody UserSaveRequestDto requestDto) {
        return userApplicationService.save(requestDto);
    }

//    @PutMapping("/api/v1/users/{id}")
//    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
//        return userApplicationService.update(id, requestDto);
//    }

//    @DeleteMapping("/api/v1/users/{id}")
//    public Long delete(@PathVariable Long id) {
//        userApplicationService.delete(id);
//        return id;
//    }

//    @GetMapping("/api/v1/users/{id}")
//    public PostsResponseDto findById(@PathVariable Long id) {
//        return userApplicationService.findById(id);
//    }

    @GetMapping("/api/v1/users")
    public List<UserResponseDto> findAll() {
        return userApplicationService.findAllDesc();
    }



}
