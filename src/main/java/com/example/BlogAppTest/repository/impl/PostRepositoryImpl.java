package com.example.BlogAppTest.repository.impl;

import com.example.BlogAppTest.domain.Post;
import com.example.BlogAppTest.domain.User;
import com.example.BlogAppTest.repository.PostRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class PostRepositoryImpl implements PostRepository {
    public static List<Post> postList = new ArrayList<>();
    public static int ID = 1;
    @Override
    public List<Post> getById(int id) {
        return postList.stream().filter(u -> u.getId() == id).collect(Collectors.toList());
    }

    @Override
    public Post create(Post postRequest) {
        postRequest.setId(ID++);
        postList.add(postRequest);
        return postRequest;
    }

    @Override
    public Post getUserPost(int id1, int id2) {
        return postList.stream().filter(u -> u.getUserPost().getId() == id1).filter(u -> u.getId() == id2).findFirst().orElse(null);
    }
}
