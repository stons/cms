package com.anhong.service;

import com.anhong.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);
    void delete(Long id);
    User queryById(Long id);
    List<User> queryAll();
}
