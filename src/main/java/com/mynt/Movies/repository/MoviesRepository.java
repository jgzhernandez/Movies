package com.mynt.Movies.repository;

import com.mynt.Movies.model.Genre;
import com.mynt.Movies.model.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MoviesRepository extends CrudRepository<Movie,Long> {
    List<Movie> getMovieByYearReleased(Integer yearReleased);
    List<Movie> getAllMoviesByOrderByYearReleased();
    List<Movie> getMoviesByGenreAndIsSequel(Genre genre, boolean isSequel);
}
