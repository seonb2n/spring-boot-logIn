package com.example.demo.user.repository;

import com.example.demo.user.entity.UserEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    private UserEntity create(String id) {
       var userEntity = new UserEntity();
       userEntity.setId(id);
       userEntity.setPassword("1234");
       userEntity.setNickName("steve");

       return userEntity;
    }

    @Test
    public void enrollTest() {
        var userEntity = create("steve123");
        userRepository.enroll(userEntity);

        var userEntity2 = create("steve345");
        userRepository.enroll(userEntity2);

        System.out.println(userRepository.showAll());
    }



}
