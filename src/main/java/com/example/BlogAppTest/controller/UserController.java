package com.example.BlogAppTest.controller;

import com.example.BlogAppTest.domain.request.UserRequest;
import com.example.BlogAppTest.domain.response.UserResponse;
import com.example.BlogAppTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
@Autowired
    UserService userService;

@GetMapping("/{userId}")
public UserResponse getById(@PathVariable int userId){
    return userService.findById(userId);
}
@PostMapping
    public boolean save(@RequestBody UserRequest userRequest){
    userService.create(userRequest);
    return true;
}
    @DeleteMapping("/{userId}")
    public boolean deletePlayer(@PathVariable int userId){
        userService.delete(userId);
        return true;
    }

@PutMapping("/{userId}")
    public boolean update(@PathVariable int userId, @RequestBody UserRequest userRequest){
   userService.update(userRequest,userId);
   return true;
}
}
