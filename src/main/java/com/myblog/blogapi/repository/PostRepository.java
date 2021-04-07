package com.myblog.blogapi.repository;

import com.myblog.blogapi.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<PostModel, String> {
}
