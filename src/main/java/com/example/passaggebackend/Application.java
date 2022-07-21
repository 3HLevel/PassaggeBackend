package com.example.passaggebackend;

import com.example.passaggebackend.core.domain.services.UserService;
import com.example.passaggebackend.data.jpa.entities.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws SQLException {
//		SpringApplication.run(Application.class, args);

		UserService userService = new UserService();
		UserData user = new UserData("Ficuse", "login", "password");

		userService.createUser(user);

	}

}
