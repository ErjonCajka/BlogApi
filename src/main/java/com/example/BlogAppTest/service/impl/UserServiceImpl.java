package com.example.BlogAppTest.service.impl;

import com.example.BlogAppTest.coverter.UserConverter;
import com.example.BlogAppTest.domain.request.UserRequest;
import com.example.BlogAppTest.domain.response.UserResponse;
import com.example.BlogAppTest.repository.UserRepository;
import com.example.BlogAppTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponse findById(int id) {
        return UserConverter.toResponse(userRepository.findById(id));
    }

    @Override
    public UserResponse create(UserRequest userRequest) {
       return UserConverter.toResponse(userRepository.create(UserConverter.toUser(userRequest)));
    }

    @Override
    public UserResponse delete(int id) {
       return UserConverter.toResponse(userRepository.delete(id));
    }

    @Override
    public UserResponse update(UserRequest userRequest, int id) {
        return UserConverter.toResponse(userRepository.update(UserConverter.toUser(userRequest), id));
    }
}
