package com.example.BlogAppTest.domain.response;

import com.example.BlogAppTest.domain.User;
import lombok.Data;

@Data

public class PostResponse extends BaseDomain {
    private String emri;
    private String body;
    private User user;
 public PostResponse(int id, String emri,String body, User user){
     super.setId(id);
     this.emri = emri;
     this.body = body;
     this.user = user;
 }
}
