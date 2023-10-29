package com.example.BlogAppTest.controller;

import com.example.BlogAppTest.domain.request.PostRequest;
import com.example.BlogAppTest.domain.response.PostResponse;
import com.example.BlogAppTest.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class PostController {
    @Autowired
    PostService postService;


    @GetMapping("/{userId}/post")
    public List<PostResponse> getById(@PathVariable int userId){
        return postService.getById(userId);

    }
    @PostMapping()
    public PostResponse create(@RequestBody PostRequest postRequest){
        return postService.create(postRequest);
    }
    @GetMapping("/{userId}/posts/{postId}")
    public PostResponse getByPostId(@PathVariable int userId, @PathVariable int postId){
        return postService.getUserPostByID(userId,postId);
    }


}
