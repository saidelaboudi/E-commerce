package com.ecommerce.controller;

import com.ecommerce.model.User;
import com.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(name = "/")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(name = "/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping(name = "/{id}")
    public Long delUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return id;
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/login/")
    public void login(@RequestBody User user) {
        User user1 = userService.getUserByUsername(user.getUsername());
        if (user1.getPassword().equals(user.getPassword())) {
            System.out.println("Hello world !");
        }

    }
}
