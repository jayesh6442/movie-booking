package com.example.bookings.controller;

import com.example.bookings.model.Movie;
import com.example.bookings.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.createMovie(movie);
        return ResponseEntity.ok(createdMovie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        Movie movie = movieService.getMovieById(id);
        return ResponseEntity.ok(movie);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> getMoviesByTitle(@RequestParam String title) {
        List<Movie> movies = movieService.getMoviesByTitle(title);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/genre")
    public ResponseEntity<List<Movie>> getMoviesByGenre(@RequestParam String genre) {
        List<Movie> movies = movieService.getMoviesByGenre(genre);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/language")
    public ResponseEntity<List<Movie>> getMoviesByLanguage(@RequestParam String language) {
        List<Movie> movies = movieService.getMoviesByLanguage(language);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/duration")
    public ResponseEntity<List<Movie>> getMoviesByDurationBetween(
            @RequestParam Integer minDuration, @RequestParam Integer maxDuration) {
        List<Movie> movies = movieService.getMoviesByDurationBetween(minDuration, maxDuration);
        return ResponseEntity.ok(movies);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        Movie updatedMovie = movieService.updateMovie(id, movie);
        return ResponseEntity.ok(updatedMovie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
} 