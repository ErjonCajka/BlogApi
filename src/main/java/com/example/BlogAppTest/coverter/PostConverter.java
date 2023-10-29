package com.example.BlogAppTest.coverter;

import com.example.BlogAppTest.domain.Post;
import com.example.BlogAppTest.domain.request.PostRequest;
import com.example.BlogAppTest.domain.response.PostResponse;

import java.util.ArrayList;
import java.util.List;

public class PostConverter {

    public static PostResponse toResponse(Post post) {
        return new PostResponse(post.getId(), post.getEmri(), post.getBody(), post.getUserPost());
    }

    public static Post toPost(PostRequest postRequest) {
        return new Post(postRequest.getEmri(), postRequest.getBody(), postRequest.getUser());
    }

    public static List<PostResponse> toResponse(List<Post> list) {

        List<PostResponse> l = new ArrayList<>();
        for (Post p : list) {
            l.add(new PostResponse(p.getId(), p.getEmri(), p.getBody(), p.getUserPost()));
        }
        return l;
    }
}