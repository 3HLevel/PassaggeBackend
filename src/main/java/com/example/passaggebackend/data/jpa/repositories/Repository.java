package com.example.passaggebackend.data.jpa.repositories;

import com.example.passaggebackend.data.jpa.entities.UserData;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface Repository<T, I> {
    /*найти все записи*/
    List<UserData> findAll();
    /*найти запись по Id*/
    UserData findById(I id);
    /*создать запись*/
    UserData create(T userData);
    /*обновить запись*/
    UserData update(T userData);
    /*удалить запись*/
    UserData delete(T userData);

}
