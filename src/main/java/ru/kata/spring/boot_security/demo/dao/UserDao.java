package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUserById(int id);
    List<User> getAllUsers();
    User findByUsername(String name);
}

