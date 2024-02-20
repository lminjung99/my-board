package com.example.demo.domain;

import java.time.LocalDateTime;

public class Article {
    //core data
    private Long id;
    private String title;
    private String content;
    private String hashtag;

    //meta data
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

}
