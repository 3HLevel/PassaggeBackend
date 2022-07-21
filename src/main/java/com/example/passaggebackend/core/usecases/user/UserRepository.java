package com.example.passaggebackend.core.usecases.user;

import com.example.passaggebackend.data.jpa.entities.UserData;
import com.example.passaggebackend.data.jpa.repositories.Repository;

public interface UserRepository extends Repository<UserData, Long> {
    /*тип данных Optional<UserData>*/
    /*найти запись по nickname*/
    UserData findByNickname(String nickname);
    /*найти запись по email*/
    UserData findByEmail(String email);
}
