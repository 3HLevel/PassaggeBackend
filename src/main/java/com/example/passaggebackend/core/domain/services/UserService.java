package com.example.passaggebackend.core.domain.services;

import com.example.passaggebackend.core.usecases.user.UserRepository;
import com.example.passaggebackend.data.jpa.entities.UserData;
import com.example.passaggebackend.data.jpa.repositories.UserRepositoryImpl;

import java.util.List;

public class UserService {
    private final UserRepository uri = new UserRepositoryImpl();

    public UserData findUserById(Long id) {
        return  uri.findById(id);
    }

    public UserData findUserByEmail(String email) {
        return uri.findByEmail(email);
    }

    public UserData findUserByNickname(String nickname) {
        return uri.findByNickname(nickname);
    }

    public void createUser(UserData userData) {
        uri.create(userData);
    }

    public void updateUser(UserData userData) {
        uri.update(userData);
    }

    public void deleteUser(UserData userData) {
        uri.delete(userData);
    }

    public List<UserData> findAllUsers() {
        return uri.findAll();
    }
}
