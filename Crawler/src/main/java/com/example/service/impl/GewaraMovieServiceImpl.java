package com.example.service.impl;

import com.example.service.MovieService;
import com.example.test.jsoup.Movie;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * Created by Loon on 2015/1/9.
 */
public class GewaraMovieServiceImpl implements MovieService {

    private Map<String, String> movieMap = Maps.newHashMap();
    private Map<String, String> cinemaMap = Maps.newHashMap();

    public GewaraMovieServiceImpl() {

        movieMap.put("", "");

        cinemaMap.put("", "");


    }

    @Override
    public List<Movie> getMovieList() {

        return null;
    }

    @Override
    public List<Movie> getMovieList(String startTime, String movieName) {
        return null;
    }

    @Override
    public List<Movie> getMovieList(String movieName) {
        return null;
    }
}
