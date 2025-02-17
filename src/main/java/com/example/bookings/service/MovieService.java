package com.example.bookings.service;

import com.example.bookings.model.Movie;
import java.util.List;

public interface MovieService {
    Movie createMovie(Movie movie);
    Movie getMovieById(Long id);
    List<Movie> getAllMovies();
    List<Movie> getMoviesByTitle(String title);
    List<Movie> getMoviesByGenre(String genre);
    List<Movie> getMoviesByLanguage(String language);
    List<Movie> getMoviesByMinRating(Double rating);
    Movie updateMovie(Long id, Movie movie);
    void deleteMovie(Long id);
} 