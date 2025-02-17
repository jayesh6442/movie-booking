package com.example.bookings.service;

import com.example.bookings.model.Movie;
import com.example.bookings.model.Users;
import com.example.bookings.repository.MovieRepository;
import com.example.bookings.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Users saveUser(Users user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public List<Users> getUsers() {
        return userRepository.findAll();

    }
}
