package com.mx.spring.flyway.repository;

import com.mx.spring.flyway.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void findAll() {
        log.info("User Test - Find All");
        List<User> users = userRepository.findAll();

        Assert.assertNotNull(users);
        log.info(users.toString());
    }
}
