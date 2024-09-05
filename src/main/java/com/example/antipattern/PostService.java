package com.example.antipattern;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    public void create(PostCreateRequest request){ // API 요청 받는 모델인데 비즈니스 레이어에서 사용 중
        //..
    }
}
