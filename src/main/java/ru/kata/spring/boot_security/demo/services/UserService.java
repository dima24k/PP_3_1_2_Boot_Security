package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByUserName(String username);
}
