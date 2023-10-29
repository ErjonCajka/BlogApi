package com.example.BlogAppTest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
public class UserRequest {
    private String emri;
    private String email;
    private String password;

}
