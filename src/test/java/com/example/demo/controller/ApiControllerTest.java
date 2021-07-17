package com.example.demo.controller;

import com.example.demo.user.dto.UserDto;
import com.example.demo.user.dto.UserLogInDto;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiControllerTest {

    @Autowired
    ApiController apiController;

    @Test
    public void logInTest() {
        UserDto userDto = new UserDto("steve123", "1234", "steve");
        apiController.enroll(userDto);
        apiController.showAll();

        UserLogInDto userLogInDto = new UserLogInDto("steve123", "234");
        System.out.println(apiController.login(userLogInDto));
    }

}
