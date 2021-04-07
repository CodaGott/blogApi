package com.myblog.blogapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostModel {

    @Id
    private String id;
    private String postTitle;
    private String authorId; //this is same as userId
    private String body;
    public LocalDate publicationDate;
}
