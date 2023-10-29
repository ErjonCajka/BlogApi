package com.example.BlogAppTest.domain;

import com.example.BlogAppTest.domain.response.BaseDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class Post extends BaseDomain {
    private String emri;
    private String body;
    private User userPost;


   public Post(String emri,String body, User u){
        this.emri = emri;
        this.body = body;
        userPost = u;
    }

}
