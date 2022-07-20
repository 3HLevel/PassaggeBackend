package com.example.passaggebackend.core.usecases.user;

import com.example.passaggebackend.data.jpa.entities.UserData;
import com.example.passaggebackend.data.jpa.repositories.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<UserData, Long> {
    /*найти запись по nickname*/
    Optional<UserData> findByNickname(String nickname);
    /*найти запись по email*/
    Optional<UserData> findByEmail(String email);
}
