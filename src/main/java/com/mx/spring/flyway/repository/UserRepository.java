package com.mx.spring.flyway.repository;

import com.mx.spring.flyway.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
    public User findById(long id);
    public List<User> findAll();
}
