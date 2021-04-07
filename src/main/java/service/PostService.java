package service;

import com.myblog.blogapi.dto.PostDTO;
import com.myblog.blogapi.exception.PostException;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PostService {

    Optional <PostDTO> getPostByTitle(String postTitle);

    Optional<PostDTO> getPostById(String postId);

    List<PostDTO> getAllPost();

    void createPost(PostDTO post) throws PostException;

    PostDTO getPostByPostDate(LocalDate date);
}
