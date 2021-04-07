package com.myblog.blogapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class UserModel {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
