package com.entertainment.movie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "movie_name")
    private String movieName;
    private String genre;
    private String director;
    @Column(name = "release_year")
    private int releaseYear;
    private double rating;
    private String description;


}
