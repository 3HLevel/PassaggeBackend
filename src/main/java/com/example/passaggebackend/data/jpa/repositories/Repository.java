package com.example.passaggebackend.data.jpa.repositories;

import com.example.passaggebackend.data.jpa.entities.UserData;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Repository<T, I> {
    /*найти все записи*/
    List<UserData> findAll();
    /*найти запись по Id*/
    UserData findById(I id);
    /*создать запись*/
    void create(T userData);
    /*обновить запись*/
    void update(T userData);
    /*удалить запись*/
    void delete(T userData);

}
