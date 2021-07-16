package com.example.demo.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class MemoryDbRepositoryAbstract<T extends MeMoryDbEntity> implements MemoryDbRepositoryIfs<T> {

    private final List<T> db = new ArrayList<>();
    private int index = 0;

    @Override
    public Optional<T> findById(String id) {
        return db.stream().filter(it -> it.getId() == id).findFirst();
    }

    @Override
    public String enroll(T entity) {
        var optionalEntity = db.stream().filter(it -> it.getId() == entity.getId()).findFirst();

        if(optionalEntity.isEmpty()) {
            index++;
            entity.setIndex(index);
            db.add(entity);
            return "회원 가입이 성공했습니다.";
        } else {
            return "이미 존재하는 아이디입니다.";
        }
    }

    @Override
    public void deleteById(String id) {
        var optionalEntity = db.stream().filter(it -> it.getId() == id).findFirst();
        if(optionalEntity.isPresent()) {
            db.remove(optionalEntity.get());
        }
    }

    @Override
    public T update(T entity) {
        var optionalEntity = db.stream().filter(it -> it.getId() == entity.getId()).findFirst();
        deleteById(optionalEntity.get().getId());
        enroll(entity);
        return entity;
    }

    @Override
    public List<T> showAll() {
        return db;
    }


}
