package com.anhong.service;

import com.anhong.entity.User;

public interface UserService {

    void save();
    void delete();
    User queryById(Long id);
}
