package com.anhong.service.impl;

import com.anhong.entity.User;
import com.anhong.repository.UserRepository;
import com.anhong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(userRepository.getOne(id));
    }

    @Override
    public User queryById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> queryAll() {
        return userRepository.findAll();
    }
}
