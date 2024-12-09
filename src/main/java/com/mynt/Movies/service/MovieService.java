package com.mynt.Movies.service;

import com.mynt.Movies.model.Genre;
import com.mynt.Movies.model.Movie;

import java.util.List;

public interface MovieService {
    Movie saveMovie(Movie movie);
    List<Movie> getAllMovies();

    List<Movie> getMoviesByYearReleased(Integer yearReleased);
    List<Movie> getAllMoviesByOrderByYearReleased();
    List<Movie> getMoviesByGenreAndIsSequel(Genre genre, Boolean isSequel);

    String getSecurity();
}
