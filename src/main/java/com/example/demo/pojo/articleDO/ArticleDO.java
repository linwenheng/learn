package com.example.demo.pojo.articleDO;

import lombok.Data;

@Data
public class ArticleDO {
    private Long id;
    private String title;
    private String content;
    private Long authorId;
}
