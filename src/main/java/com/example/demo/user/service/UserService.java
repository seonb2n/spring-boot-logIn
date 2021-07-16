package com.example.demo.user.service;

import com.example.demo.user.dto.UserDto;
import com.example.demo.user.entity.UserEntity;
import com.example.demo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String enroll(UserDto userDto) {
        var entity = dtoToEntity(userDto);
        var saveEntity = userRepository.enroll(entity);
        return saveEntity;
    }

    public List<UserDto> showAll() {
        return userRepository.showAll()
                .stream()
                .map(it -> entityToDto(it))
                .collect(Collectors.toList());
    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }


    private UserDto entityToDto(UserEntity userEntity) {
        var userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setPassword(userEntity.getPassword());
        userDto.setNickName(userEntity.getNickName());

        return userDto;
    }

    private UserEntity dtoToEntity(UserDto userDto) {
        var userEntity = new UserEntity();
        userEntity.setId(userEntity.getId());
        userEntity.setPassword(userEntity.getPassword());
        userEntity.setNickName(userEntity.getNickName());

        return userEntity;
    }

}
