package com.anhong.repository;

import com.anhong.entity.Document;
import com.anhong.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface DocumentRepository extends JpaRepository<Document,Long>, QuerydslPredicateExecutor<Document> {
}
