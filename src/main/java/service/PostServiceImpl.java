package service;

import com.myblog.blogapi.dto.PostDTO;
import com.myblog.blogapi.exception.PostException;
import com.myblog.blogapi.model.PostModel;
import com.myblog.blogapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public Optional<PostDTO> getPostByTitle(String postTitle) {
        if(postRepository.findById(postTitle).isPresent()){
            return getPostByTitle(postTitle);
        }else
            throw new NoSuchElementException("Post not found");
    }

    @Override
    public Optional<PostDTO> getPostById(String postId) {
        return Optional.empty();
    }

    @Override
    public List<PostDTO> getAllPost() {
        return null;
    }

    @Override
    public void createPost(PostDTO post) throws PostException {
        Optional<PostModel> optionalPost = postRepository.findById(post.getTitle());
        if(optionalPost.isPresent()){
            throw new PostException("Post already exists");
        }

        PostModel newPost = new PostModel();
        newPost.setPostTitle(post.getTitle());
        newPost.setAuthorId(post.getAuthorId());
        newPost.setBody(post.getBody());
//        newPost.publicationDate(LocalDate.now());
        postRepository.save(newPost);

    }

    @Override
    public PostDTO getPostByPostDate(LocalDate date) {
        return null;
    }
}
