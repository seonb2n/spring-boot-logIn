package com.example.demo.user.entity;

import com.example.demo.db.MeMoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity extends MeMoryDbEntity {

    private String password;
    private String nickName;

}
