package com.example.demo.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    //core data
    private Long id;
    private Article article;
    private String content;


    //meta data
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
