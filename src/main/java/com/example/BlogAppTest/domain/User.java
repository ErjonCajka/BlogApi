package com.example.BlogAppTest.domain;

import lombok.Data;

@Data
public class User extends BaseDomain
{
    private String emri;
    private String email;
    private String password;

    public User(String emri, String email, String password) {
        this.emri = emri;
        this.email = email;
        this.password = password;
    }
}
