package com.example.demo.user.service;

import com.example.demo.user.dto.UserDto;
import com.example.demo.user.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    private UserDto create(String id) {
        var userDto = new UserDto();
        userDto.setId(id);
        userDto.setPassword("1234");
        userDto.setNickName("steve");

        return userDto;
    }


    @Test
    public void logInTest() {
        UserDto userDto = create("steve123");
        userService.enroll(userDto);

        System.out.println(userService.login("steve123","12"));
        System.out.println(userService.login("steve123","1234"));
    }

    @Test
    public void enrollTest() {
        UserDto userDto = create("steve123");
        userService.enroll(userDto);
        System.out.println(userService.showAll());
    }

    @Test
    public void deleteTest() {
        UserDto userDto = create("steve123");
        userService.enroll(userDto);
        System.out.println(userService.showAll());

        System.out.println("------------");

        userService.delete("steve123");
        System.out.println(userService.showAll());

    }

}
