package com.entertainment.movie.exception;

public class MovieIdNotFoundException  extends RuntimeException{

    public MovieIdNotFoundException(String message) {
        super(message);
    }
}
