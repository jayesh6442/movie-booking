package com.example.bookings.service;

import com.example.bookings.model.Theater;
import com.example.bookings.repository.TheatreRepository;

import java.util.List;
import java.util.Optional;

public class TheaterServiceImpl implements TheaterService {


    private TheatreRepository theatreRepository;

    public TheaterServiceImpl(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    public Optional<Theater> getTheater(Long theaterId) {
        return theatreRepository.findById(theaterId);

    }


    @Override
    public List<Theater> getAllTheaters() {
        return theatreRepository.findAll();
    }

    @Override
    public Theater addTheater(Theater theater) {
        return theatreRepository.save(theater);
    }
}
