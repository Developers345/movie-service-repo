package com.entertainment.movie.controller;

import com.entertainment.movie.dto.MovieDto;
import com.entertainment.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/save-movie")
    public MovieDto saveMovie(@RequestBody MovieDto movieDto) {
             return movieService.saveMovie(movieDto);
    }
    @GetMapping("/movie-list")
    public List<MovieDto> getMovies() {

        return movieService.getAllMovies();
       /* return "[" +
                "{\"id\":1,\"title\":\"Inception\",\"director\":\"Christopher Nolan\",\"releaseYear\":2010,\"genre\":\"Sci-Fi\",\"rating\":8.8}," +
                "{\"id\":2,\"title\":\"The Dark Knight\",\"director\":\"Christopher Nolan\",\"releaseYear\":2008,\"genre\":\"Action\",\"rating\":9.0}," +
                "{\"id\":3,\"title\":\"Interstellar\",\"director\":\"Christopher Nolan\",\"releaseYear\":2014,\"genre\":\"Sci-Fi\",\"rating\":8.7}" +
                "]";*/
    }

    @GetMapping("/movie/{id}")
    public MovieDto getMovieById(@PathVariable("id") int movieId) {
        return movieService.getMovieById(movieId);
    }

}
