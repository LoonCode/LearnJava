package com.example.service;

import com.example.test.jsoup.Movie;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Loon on 2015/1/9.
 */
public interface MovieService {

    List<Movie> getMovieList();

    List<Movie> getMovieList(String startTime, String movieName);

    List<Movie> getMovieList(String movieName) throws IOException, ExecutionException;

}
