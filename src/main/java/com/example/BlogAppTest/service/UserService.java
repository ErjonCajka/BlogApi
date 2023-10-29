package com.example.BlogAppTest.service;

import com.example.BlogAppTest.domain.User;
import com.example.BlogAppTest.domain.request.UserRequest;
import com.example.BlogAppTest.domain.response.UserResponse;

public interface UserService {
    UserResponse findById(int id);
    UserResponse create (UserRequest userRequest);
    UserResponse delete (int id);
    UserResponse update (UserRequest userRequest,int id);
}
