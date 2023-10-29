package com.example.BlogAppTest.repository;

import com.example.BlogAppTest.domain.Post;
import com.example.BlogAppTest.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepository {
    List<Post> getById(int id);
    Post create (Post postRequest);
    Post getUserPost (int id1, int id2);



}
