package com.example.bookings.service;

import com.example.bookings.model.Users;

import java.util.List;

public interface UserService {
    Users saveUser(Users user);
    List<Users> getUsers();

}
