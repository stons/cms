package com.anhong.service;

import com.anhong.entity.Dept;

import java.util.List;

public interface DeptService {
    void save(Dept dept);
    void delete(Long id);
    Dept queryById(Long id);
    List<Dept> queryAll();
}
