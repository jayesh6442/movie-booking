package com.example.bookings.controller;

import com.example.bookings.model.Show;
import com.example.bookings.service.ShowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    private ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping("/all")
    public List<Show> getAllShows() {
        return showService.getShows();
    }

    @PostMapping("/add")
    public Show addShow(@RequestBody Show show) {
        Show created = showService.createShow(show);
        return created;

    }
}
