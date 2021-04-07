package com.myblog.blogapi.repository;

import com.myblog.blogapi.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MyUserRepository extends MongoRepository <UserModel, String> {
    Optional<UserModel> findByFirstName(String dozie);
    Optional<UserModel> findUserModelById(String id);
}
