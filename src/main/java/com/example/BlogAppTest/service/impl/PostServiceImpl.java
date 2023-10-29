package com.example.BlogAppTest.service.impl;

import com.example.BlogAppTest.coverter.PostConverter;
import com.example.BlogAppTest.coverter.UserConverter;
import com.example.BlogAppTest.domain.User;
import com.example.BlogAppTest.domain.request.PostRequest;
import com.example.BlogAppTest.domain.request.UserRequest;
import com.example.BlogAppTest.domain.response.PostResponse;
import com.example.BlogAppTest.repository.PostRepository;
import com.example.BlogAppTest.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;
    @Override
    public List<PostResponse> getById(int id) {
       return PostConverter.toResponse(postRepository.getById(id));
    }

    @Override
    public PostResponse create(PostRequest postRequest) {
     return PostConverter.toResponse(postRepository.create(PostConverter.toPost(postRequest)));
    }

    @Override
    public PostResponse getUserPostByID(int id1, int id) {
        return PostConverter.toResponse(postRepository.getUserPost(id1,id));
    }
}
