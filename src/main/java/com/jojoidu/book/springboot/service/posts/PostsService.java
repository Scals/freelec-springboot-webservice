package com.jojoidu.book.springboot.service.posts;

import com.jojoidu.book.springboot.domain.posts.PostsRepository;
import com.jojoidu.book.springboot.web.dto.PostsSaveRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService
{
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDTO requestDTO)
    {
        return postsRepository.save(requestDTO.toEntity()).getId();
    }
}
