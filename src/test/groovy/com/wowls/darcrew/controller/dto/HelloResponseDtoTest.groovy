package com.wowls.darcrew.controller.dto

import spock.lang.Specification

class HelloResponseDtoTest extends Specification {
    def "lombok test"(){
        given:
        String name = "name1"
        int amount = 1000

        when:
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount)

        then:
        helloResponseDto.getName() == "name1"
        helloResponseDto.getAmount() == 1000
    }
}
