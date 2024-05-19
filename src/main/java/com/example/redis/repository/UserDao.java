package com.example.redis.repository;

import com.example.redis.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(long id);

    boolean deleteUser(Long id);
}
