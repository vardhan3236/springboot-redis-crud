package com.example.redis.service;

import com.example.redis.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(long id);

    boolean deleteUser(Long id);
}
