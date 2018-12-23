package com.anhong.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import vip.codemonkey.datastore.data.jpa.repository.BaseDataTestCase;
import com.anhong.condition.UserCondition;
import com.anhong.entity.User;

import java.util.Optional;

public class UserRepositoryTest extends BaseDataTestCase {

    @Autowired
    UserRepository repository;

    @Test
    public void testFindById(){
        Optional<User> optionalUser = repository.findById(-1L);
        Assert.assertTrue(optionalUser.isPresent());
        logger.info("test find by id result is {}",optionalUser.get());
    }

}
