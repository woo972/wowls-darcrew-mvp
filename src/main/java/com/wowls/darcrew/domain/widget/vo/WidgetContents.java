package com.wowls.darcrew.domain.widget.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class WidgetContents {
    @Column(name = "contents_url")
    private String contentsUrl;
}
