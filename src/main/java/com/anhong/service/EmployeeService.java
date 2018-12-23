package com.anhong.service;

import com.anhong.entity.Employee;
import com.anhong.entity.User;

import java.util.List;

public interface EmployeeService {
    void save(Employee employee);
    void delete(long id);
    Employee queryById(Long id);
    List<Employee> queryAll();
}
