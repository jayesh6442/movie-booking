package com.example.bookings.impl;

import com.example.bookings.model.Show;
import com.example.bookings.repository.ShowRepository;
import com.example.bookings.service.ShowService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowServiceImpl implements ShowService {


    private ShowRepository showRepository;

    public ShowServiceImpl(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    @Override
    public List<Show> getShows() {
        return showRepository.findAll();
    }

    @Override
    public Optional<Show> getShowById(Long id) {
        return showRepository.findById(id);
    }

    @Override
    public Show createShow(Show show) {
        Show createdShow = showRepository.save(show);
        return createdShow;
    }


    @Override
    public Show deleteShow(Long id) {
        Show findShow = showRepository.findById(id).orElse(null);
        showRepository.delete(findShow);
        return findShow;
    }
}
