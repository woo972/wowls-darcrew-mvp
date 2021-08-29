package com.wowls.darcrew.domain.widget.service;

import com.wowls.darcrew.controller.dto.WidgetSaveRequestDto;
import com.wowls.darcrew.domain.widget.repository.WidgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class WidgetApplicationService {
    private final WidgetRepository widgetRepository;

    @Transactional
    public Long save(WidgetSaveRequestDto requestDto) {
        return widgetRepository.save(requestDto.toEntity()).getId();
    }

//    @Transactional(readOnly = true)
//    public List<FrontPageResponseDto> findAllByCommunityId(Long communityId) {
//        return widgetRepository.findAllByPageId(communityId).stream()
//                .map(frontPage -> new ModelMapper().map(frontPage, FrontPageResponseDto.class))
//                .collect(Collectors.toList());
//    }
}
