package com.anhong.repository;

import com.anhong.condition.UserCondition;
import com.anhong.entity.Employee;
import com.anhong.entity.QUser;
import com.anhong.entity.User;
import com.querydsl.core.BooleanBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Objects;

public interface EmployeeRepository extends JpaRepository<Employee,Long>, QuerydslPredicateExecutor<Employee> {

    }
