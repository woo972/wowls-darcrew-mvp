package com.wowls.darcrew.controller;

import com.wowls.darcrew.controller.dto.WidgetSaveRequestDto;
import com.wowls.darcrew.domain.widget.service.WidgetApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class WidgetApiController {

    private final WidgetApplicationService widgetApplicationService;

    @PostMapping("/api/v1/front-pages/{pageId}/widgets")
    public Long save(@PathVariable("pageId") Long pageId,
                     @RequestBody WidgetSaveRequestDto requestDto) {
        requestDto.setPageId(pageId);
        return widgetApplicationService.save(requestDto);
    }
}
