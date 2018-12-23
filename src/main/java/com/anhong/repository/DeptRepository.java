package com.anhong.repository;

import com.anhong.entity.Dept;
import com.anhong.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface DeptRepository  extends JpaRepository<Dept,Long>, QuerydslPredicateExecutor<Dept> {
}
