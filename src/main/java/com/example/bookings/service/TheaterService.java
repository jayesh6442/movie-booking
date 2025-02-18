package com.example.bookings.service;

import com.example.bookings.model.Theater;

import java.util.List;
import java.util.Optional;

public interface TheaterService {
    Optional<Theater> getTheater(Long theaterId);

    List<Theater> getAllTheaters();

    Theater addTheater(Theater theater);

}
