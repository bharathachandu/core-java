package com.xworkz.movie;

import com.xworkz.movie.dao.MovieDao;
import com.xworkz.movie.dto.MovieDto;

public class MovieRunner {
    public static void main(String[] args) {

        MovieDto movie = new MovieDto();
        movie.title = "Inception";
        movie.director = "Christopher Nolan";
        movie.releaseYear = 2010;
        movie.genre = "Science Fiction";
        movie.rating = 8.8;

        MovieDao dao = new MovieDao();
        dao.addMovie(movie);
        dao.getMovieDetails();
    }
}
