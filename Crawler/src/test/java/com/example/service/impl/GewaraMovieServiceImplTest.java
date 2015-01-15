package com.example.service.impl;

import com.example.service.MovieService;
import com.example.test.jsoup.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GewaraMovieServiceImplTest {

    private MovieService movieService;

    @Before
    public void setUp() throws Exception {
        this.movieService = new GewaraMovieServiceImpl();
    }

    @Test
    public void testGetMovieList() throws Exception {

    }

    @Test
    public void testGetMovieList1() throws Exception {

    }

    @Test
    public void testGetMovieList2() throws Exception {

        List<Movie> movieList = movieService.getMovieList("博物馆奇妙夜3");

        if (movieList != null) {

            for (Movie movie : movieList) {
                System.out.println("====================");
                System.out.println(movie.toString());
                System.out.println("====================");
            }
        }
    }
}