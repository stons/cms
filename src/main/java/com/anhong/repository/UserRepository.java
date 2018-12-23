package com.anhong.repository;

import com.anhong.condition.UserCondition;
import com.anhong.entity.QUser;
import com.anhong.entity.User;
import com.querydsl.core.BooleanBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Objects;

public interface UserRepository extends JpaRepository<User,Long>, QuerydslPredicateExecutor<User> {
    default BooleanBuilder predicateByCondition(UserCondition condition){
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        QUser qUser = QUser.user;
        if(Objects.nonNull(condition.getName())){
            booleanBuilder.and(qUser.loginName.like(condition.getName()));
        }
        if(Objects.nonNull(condition.getId())){
            booleanBuilder.and(qUser.id.eq(condition.getId()));
        }
        return booleanBuilder;
    }
}
