package com.example.bookings.impl;

import com.example.bookings.model.Movie;
import com.example.bookings.repository.MovieRepository;
import com.example.bookings.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> getMoviesByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    @Override
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    @Override
    public List<Movie> getMoviesByLanguage(String language) {
        return movieRepository.findByLanguage(language);
    }

    @Override
    public List<Movie> getMoviesByDurationBetween(Integer minDuration, Integer maxDuration) {
        return movieRepository.findByDurationBetween(minDuration, maxDuration);
    }

    @Override
    public Movie updateMovie(Long id, Movie movie) {
        Movie existingMovie = getMovieById(id);
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setGenre(movie.getGenre());
        existingMovie.setLanguage(movie.getLanguage());
        existingMovie.setDuration(movie.getDuration());
        return movieRepository.save(existingMovie);
    }

    @Override
    public void deleteMovie(Long id) {
        Movie movie = getMovieById(id);
        movieRepository.delete(movie);
    }
}