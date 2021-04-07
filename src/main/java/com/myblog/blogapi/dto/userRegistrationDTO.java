package com.myblog.blogapi.dto;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class userRegistrationDTO {
    @NotNull
    private String firstName;
    @NotNull
    private String lastNAme;
    @NotNull
    private String email;
    @NotNull
    private String password;
}
