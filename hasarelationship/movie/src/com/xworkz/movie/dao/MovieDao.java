package com.xworkz.movie.dao;

import com.xworkz.movie.dto.MovieDto;

public class MovieDao {
    MovieDto movie;

    public boolean addMovie(MovieDto movie) {
        boolean isAdded = false;
        if (movie != null) {
            this.movie = movie;
            isAdded = true;
            System.out.println("Movie added: " + movie.title);
        }
        return isAdded;
    }

    public void getMovieDetails() {
        System.out.println("Title: " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.println("Release Year: " + movie.releaseYear);
        System.out.println("Genre: " + movie.genre);
        System.out.println("Rating: " + movie.rating);
    }
}
