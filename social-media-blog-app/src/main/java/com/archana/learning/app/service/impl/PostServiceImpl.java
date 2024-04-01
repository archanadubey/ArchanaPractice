package com.archana.learning.app.service;

import com.archana.learning.app.dto.PostDto;
import com.archana.learning.app.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
   private PostRepository postRepository;


    @Override
    public PostDto createPost(PostDto postDto) {


        return null;
    }
}


}
