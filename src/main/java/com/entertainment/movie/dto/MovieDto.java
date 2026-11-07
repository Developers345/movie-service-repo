package com.entertainment.movie.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private String movieName;
    private String genre;
    private String director;
    private int releaseYear;
    private double rating;
    private String description;
}
