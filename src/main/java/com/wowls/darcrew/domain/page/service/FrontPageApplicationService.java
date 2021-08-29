package com.wowls.darcrew.domain.page.service;

import com.wowls.darcrew.controller.dto.CommunityResponseDto;
import com.wowls.darcrew.controller.dto.FrontPageResponseDto;
import com.wowls.darcrew.controller.dto.FrontPageSaveRequestDto;
import com.wowls.darcrew.domain.page.repogitory.FrontPageRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class FrontPageApplicationService {
    private final FrontPageRepository frontPageRepository;

    @Transactional
    public Long save(FrontPageSaveRequestDto requestDto) {
        return frontPageRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<FrontPageResponseDto> findAllByCommunityId(Long communityId) {
        return frontPageRepository.findAllByCommunityId(communityId).stream()
                .map(frontPage -> new ModelMapper().map(frontPage, FrontPageResponseDto.class))
                .collect(Collectors.toList());
    }
}
