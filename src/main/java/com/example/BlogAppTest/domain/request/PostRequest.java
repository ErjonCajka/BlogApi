package com.example.BlogAppTest.domain.request;

import com.example.BlogAppTest.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor

public class PostRequest {
    private String emri;
    private String body;
    private User user;

    public PostRequest(String emri, String body, User user) {
        this.emri = emri;
        this.body = body;
        this.user = user;
    }
}
