package com.example.BlogAppTest.coverter;

import com.example.BlogAppTest.domain.User;
import com.example.BlogAppTest.domain.request.UserRequest;
import com.example.BlogAppTest.domain.response.UserResponse;

public class UserConverter {
    public static User toUser(UserRequest userRequest) {
        return userRequest != null ? new User(userRequest.getEmri(), userRequest.getEmail(), userRequest.getPassword()) : null;
    }
    public static UserResponse toResponse(User u){
        return u != null ? new UserResponse(u.getId(),u.getEmri(),u.getEmail()) : null;
    }

}
