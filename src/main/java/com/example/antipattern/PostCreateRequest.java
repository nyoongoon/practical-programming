package com.example.antipattern;

import lombok.Data;

@Data
public class PostCreateRequest {
    private String title;
    private String content;

    public PostCreateCommand toPostCreateCommand(long writerId){  //상위가 하위 참조는 가능
        return PostCreateCommand.builder()
                .title(title)
                .content(content)
                .writerId(writerId)
                .build();
    }
}
