package com.example.demo.user.repository;

import com.example.demo.db.MemoryDbRepositoryAbstract;
import com.example.demo.user.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserRepository extends MemoryDbRepositoryAbstract<UserEntity> {
}
