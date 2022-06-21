package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    User getById(Long id);

    List<User> findAll();

    void deleteById(Long id);

    Set<Role> getAllRoles();

    void saveUser(User user);

    void updateUser(User user);
}
