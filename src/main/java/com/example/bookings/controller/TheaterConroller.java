package com.example.bookings.controller;

import com.example.bookings.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;

public class TheaterConroller {

    private TheaterService theaterService;

    public TheaterConroller(TheaterService theaterService) {
        this.theaterService = theaterService;
    }



}
