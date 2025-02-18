package com.example.bookings.service;

import com.example.bookings.model.Show;

import java.util.List;
import java.util.Optional;

public interface ShowService {
    List<Show> getShows();

    Optional<Show> getShowById(Long id);

    Show createShow(Show show);


    Show deleteShow(Long id);


}
