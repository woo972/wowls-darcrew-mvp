package com.wowls.darcrew.domain.community.service;

import com.wowls.darcrew.controller.dto.CommunitySaveRequestDto;
import com.wowls.darcrew.domain.community.entity.Community;
import com.wowls.darcrew.domain.community.repository.CommunityRepository;
import com.wowls.darcrew.domain.user.entity.User;
import com.wowls.darcrew.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class CommunityService {

    private final CommunityRepository communityRepository;
    private final UserRepository userRepository;

    @Transactional
    public Long createCommunity(CommunitySaveRequestDto requestDto) {
        if(communityRepository.findByOwnerId(requestDto.getOwnerId()) != null){
            throw new IllegalArgumentException("this user has a community already. ownerId:"+ requestDto.getOwnerId());
        }
        User user =  userRepository.findById(requestDto.getOwnerId())
                .orElseThrow(() -> new IllegalArgumentException("there is no User by userId:"+requestDto.getOwnerId()));

        Community community = communityRepository.save(requestDto.toEntity());
        community.setOwner(user);

//        if(Objects.nonNull(user.getOwnCommunity())){
//            throw new IllegalArgumentException("this user has a community already ownerId:"+ user.getId());
//        }
//
//
//        user.ownCommunity(community);

        return community.getId();
    }
}
