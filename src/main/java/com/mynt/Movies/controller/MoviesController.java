package com.mynt.Movies.controller;

import com.mynt.Movies.model.Genre;
import com.mynt.Movies.model.Movie;
import com.mynt.Movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {
    @Autowired
    MovieService movieService;

    @PostMapping("/movies")
    public Movie saveMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{yearReleased}")
    public List<Movie> getMoviesByYear(@PathVariable Integer yearReleased){
        return movieService.getMoviesByYearReleased(yearReleased);
    }

    @GetMapping("/movies/year-order")
    public List<Movie> getMoviesByOrderByYearReleased(){
        return movieService.getAllMoviesByOrderByYearReleased();
    }

    @GetMapping("/movies/{genre}/{isSequel}")
    public List<Movie> getMoviesByGenreAndIsSequel(@PathVariable("genre") Genre genre, @PathVariable("isSequel") Boolean isSequel){
        return movieService.getMoviesByGenreAndIsSequel(genre, isSequel);
    }
}
