package com.example.BlogAppTest.service;

import com.example.BlogAppTest.domain.User;
import com.example.BlogAppTest.domain.request.PostRequest;
import com.example.BlogAppTest.domain.request.UserRequest;
import com.example.BlogAppTest.domain.response.PostResponse;

import java.util.List;

public interface PostService {
    List<PostResponse> getById(int id);
    PostResponse create (PostRequest postRequest);
    PostResponse getUserPostByID(int id1, int id2);
}
