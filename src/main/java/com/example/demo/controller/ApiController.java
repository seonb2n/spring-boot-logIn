package com.example.demo.controller;

import com.example.demo.user.dto.UserDto;
import com.example.demo.user.dto.UserLogInDto;
import com.example.demo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final UserService userService;

    @PostMapping("/enroll")
    public String enroll(@RequestBody UserDto userDto) {
        log.info("{}", userDto);

        return userService.enroll(userDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        userService.delete(id);
    }

    @PostMapping("")
    public UserDto update(@RequestBody UserDto userDto) {
        log.info("{}", userDto);

        return userService.update(userDto);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLogInDto userLogInDto) {
        String id = userLogInDto.getId();
        String password = userLogInDto.getPassword();
        return userService.login(id, password);
    }

}
