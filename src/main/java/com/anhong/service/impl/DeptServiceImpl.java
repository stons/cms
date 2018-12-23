package com.anhong.service.impl;

import com.anhong.entity.Dept;
import com.anhong.repository.DeptRepository;
import com.anhong.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptRepository deptRepository;

    @Override
    public void save(Dept dept) {
        deptRepository.save(dept);
    }

    @Override
    public void delete(Long id) {
        deptRepository.delete(deptRepository.getOne(id));
    }

    @Override
    public Dept queryById(Long id) {
        return deptRepository.getOne(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptRepository.findAll();
    }
}
