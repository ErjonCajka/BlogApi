package com.example.BlogAppTest.repository;

import com.example.BlogAppTest.domain.User;

public interface UserRepository {
    User findById(int id);
    User create (User userRequest);
    User delete (int id);
    User update (User userRequest,int id2);

}
