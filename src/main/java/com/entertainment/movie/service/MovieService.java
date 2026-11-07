package com.entertainment.movie.service;

import com.entertainment.movie.dto.MovieDto;
import com.entertainment.movie.entities.Movie;
import com.entertainment.movie.exception.MovieIdNotFoundException;
import com.entertainment.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieDto saveMovie(MovieDto movieDto) {

        //Convert MovieDto to Movie entity
        Movie movie = new Movie();
        movie.setMovieName(movieDto.getMovieName());
        movie.setGenre(movieDto.getGenre());
        movie.setDirector(movieDto.getDirector());
        movie.setReleaseYear(movieDto.getReleaseYear());
        movie.setRating(movieDto.getRating());
        movie.setDescription(movieDto.getDescription());

        //Save Movie entity to database
        Movie savedMovie = movieRepository.save(movie);

        //Convert saved Movie entity back to MovieDto
        MovieDto savedMovieDto = new MovieDto();
        savedMovieDto.setMovieName(savedMovie.getMovieName());
        savedMovieDto.setGenre(savedMovie.getGenre());
        savedMovieDto.setDirector(savedMovie.getDirector());
        savedMovieDto.setReleaseYear(savedMovie.getReleaseYear());
        savedMovieDto.setRating(savedMovie.getRating());
        savedMovieDto.setDescription(savedMovie.getDescription());

        return savedMovieDto;
    }

    public List<MovieDto> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies.stream().map(movie -> {
            MovieDto movieDto = new MovieDto();
            movieDto.setMovieName(movie.getMovieName());
            movieDto.setGenre(movie.getGenre());
            movieDto.setDirector(movie.getDirector());
            movieDto.setReleaseYear(movie.getReleaseYear());
            movieDto.setRating(movie.getRating());
            movieDto.setDescription(movie.getDescription());
            return movieDto;
        }).toList();
    }

    public MovieDto getMovieById(int id) {
        Movie movie = movieRepository.findById(id).orElse(null);
        if (movie == null) {
            throw new MovieIdNotFoundException("movie with id " + id + " not found");
        }
        MovieDto movieDto = new MovieDto();
        movieDto.setMovieName(movie.getMovieName());
        movieDto.setGenre(movie.getGenre());
        movieDto.setDirector(movie.getDirector());
        movieDto.setReleaseYear(movie.getReleaseYear());
        movieDto.setRating(movie.getRating());
        movieDto.setDescription(movie.getDescription());
        return movieDto;

    }
}
