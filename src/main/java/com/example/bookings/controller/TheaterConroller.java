package com.example.bookings.controller;

import com.example.bookings.model.Theater;
import com.example.bookings.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/theater")
public class TheaterConroller {

    private TheaterService theaterService;

    public TheaterConroller(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @GetMapping("/theater")
    public List<Theater> getAllTheaters() {
        return theaterService.getAllTheaters();
    }
    @PostMapping("/add")
    public Theater addTheater(@RequestBody Theater theater) {
        return theaterService.addTheater(theater);
    }
}
