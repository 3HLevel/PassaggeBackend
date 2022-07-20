package com.example.passaggebackend.data.jpa.repositories;

import com.example.passaggebackend.core.usecases.user.UserRepository;
import com.example.passaggebackend.data.jpa.entities.UserData;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public Optional<UserData> findByNickname(String nickname) {
        return Optional.empty();
    }

    @Override
    public Optional<UserData> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<UserData> findAll() {
        return null;
    }

    @Override
    public UserData findById(Long id) {
        return null;
    }

    @Override
    public UserData create(UserData userData) {
        return null;
    }

    @Override
    public UserData update(UserData userData) {
        return null;
    }

    @Override
    public UserData delete(UserData userData) {
        return null;
    }
}
