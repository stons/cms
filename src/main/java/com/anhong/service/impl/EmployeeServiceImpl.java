package com.anhong.service.impl;

import com.anhong.entity.Employee;
import com.anhong.repository.EmployeeRepository;
import com.anhong.repository.UserRepository;
import com.anhong.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(long id) {
        employeeRepository.delete(employeeRepository.getOne(id));

    }

    @Override
    public Employee queryById(Long id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public List<Employee> queryAll() {
        return employeeRepository.findAll();
    }
}
