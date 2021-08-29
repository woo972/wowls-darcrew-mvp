package com.wowls.darcrew.controller;

import com.wowls.darcrew.controller.dto.CommunityResponseDto;
import com.wowls.darcrew.controller.dto.CommunitySaveRequestDto;
import com.wowls.darcrew.controller.dto.FrontPageResponseDto;
import com.wowls.darcrew.controller.dto.FrontPageSaveRequestDto;
import com.wowls.darcrew.domain.community.service.CommunityApplicationService;
import com.wowls.darcrew.domain.community.service.CommunityService;
import com.wowls.darcrew.domain.page.repogitory.FrontPageRepository;
import com.wowls.darcrew.domain.page.service.FrontPageApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FrontPageApiController {

    private final FrontPageApplicationService frontPageApplicationService;

    @PostMapping("/api/v1/communities/{communityId}/front-pages")
    public Long save(@PathVariable("communityId") Long communityId,
                     @RequestBody FrontPageSaveRequestDto requestDto) {
        requestDto.setCommunityId(communityId);
        return frontPageApplicationService.save(requestDto);
    }

    @GetMapping("/api/v1/communities/{communityId}/front-pages")
    public List<FrontPageResponseDto> findAllByCommunityId(@PathVariable("communityId") Long communityId) {
        return frontPageApplicationService.findAllByCommunityId(communityId);
    }
}
