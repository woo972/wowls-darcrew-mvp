package com.wowls.darcrew.controller;

import com.wowls.darcrew.controller.dto.CommunityResponseDto;
import com.wowls.darcrew.controller.dto.CommunitySaveRequestDto;
import com.wowls.darcrew.controller.dto.UserResponseDto;
import com.wowls.darcrew.controller.dto.UserSaveRequestDto;
import com.wowls.darcrew.domain.community.service.CommunityApplicationService;
import com.wowls.darcrew.domain.community.service.CommunityService;
import com.wowls.darcrew.domain.user.service.UserApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommunityApiController {

    private final CommunityApplicationService communityApplicationService;
    private final CommunityService communityService;

    @PostMapping("/api/v1/owner/{ownerId}/communities")
    public Long save(@PathVariable("ownerId") Long ownerId,
                     @RequestBody CommunitySaveRequestDto requestDto) {
        requestDto.setOwnerId(ownerId);
        return communityService.createCommunity(requestDto);
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

    @GetMapping("/api/v1/owners/{ownerId}/communities")
    public CommunityResponseDto findCommunityByOwnerId(@PathVariable("ownerId") Long ownerId) {
        return communityApplicationService.findCommunityByOwnerId(ownerId);
    }
}
