package com.example.bookings.controller;

import com.example.bookings.model.Users;
import com.example.bookings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getUsers();
    }

    @PostMapping("/save")
    public Users saveUser(@RequestBody Users user) {
        return userService.saveUser(user);
    }

}

