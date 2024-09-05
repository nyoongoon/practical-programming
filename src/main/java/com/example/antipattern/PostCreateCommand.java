package com.example.antipattern;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostCreateCommand {
    private String title;
    private String content;
    private Long writerId;
}
