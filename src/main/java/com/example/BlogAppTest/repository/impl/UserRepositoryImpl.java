package com.example.BlogAppTest.repository.impl;

import com.example.BlogAppTest.domain.User;
import com.example.BlogAppTest.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final List<User> userList = new ArrayList<>();
    private static int Id = 1;

    static {
User user = new User("Erjon","erioncajka123@gmail.com","zzz");
user.setId(Id++);
userList.add(user);

    }
    @Override
    public User findById(int id) {

       return userList.stream().filter(u->u.getId() == id).findFirst().orElse(null);
    }

    @Override
    public User create(User userRequest) {
        userRequest.setId(Id++);
        userList.add(userRequest);
        return userRequest;
    }

    @Override
    public User delete(int id) {
        User user = userList.get(id);
        userList.remove(id);
        return user;
    }

    @Override
    public User update(User userRequest, int id) {
        userList.set(id,userRequest);
        return userRequest;
    }
}
