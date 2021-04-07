package com.myblog.blogapi.dto;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Data
public class PostDTO {
    @NotNull
    private String title;
    @NotNull
    private String authorId;
    @NotNull
    private String body;
    @NotNull
    private LocalDate publicationDate;

}
/*
* public PostDTO upgradePost (String id, PostDTO postDTO){
*
*
* }
* */