package com.example.service.impl;

import com.example.cache.gewara.CinemaCache;
import com.example.cache.gewara.MovieCache;
import com.example.service.MovieService;
import com.example.test.jsoup.Movie;
import com.google.common.collect.Lists;
import com.google.inject.Guice;
import com.google.inject.Inject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Loon on 2015/1/9.
 */
public class GewaraMovieServiceImpl implements MovieService {


    @Inject
    private MovieCache movieCache;
    @Inject
    private CinemaCache cinemaCache;

    public GewaraMovieServiceImpl() {
        Guice.createInjector().injectMembers(this);
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
    public List<Movie> getMovieList(String movieName) throws IOException, ExecutionException {

        List<String> cinemaIds = Lists.newArrayList("", "", "");

        String movieId = this.movieCache.getCache().getUnchecked(movieName);
//        String cinemaId = this.cinemaCache.getCache().getAll();

        Document doc = Jsoup.connect("http://www.gewara.com/movie/ajax/getOpiItem.xhtml?movieid=" + movieId + "&fyrq=2015-01-15&cid=1").userAgent("Mozilla").get();

        Element element = doc.select("div.chooseOpi_body").first();
        Elements lis = element.select("li");

        for (Element li : lis) {

            Movie movie = new Movie();
            movie.setStartTime(li.select("span.opitime").first().child(0).text());
            movie.setPrice(li.select("span.opiPrice").first().child(0).text());
//            if (li.select("span.opiSales").first() != null){
//                movie.setSale(li.select("span.opiSales").first().tagName("b").child(1).text() +li.select("span.opiSales").first().tagName("b").child(1).text());
//            }
            System.out.println(movie.toString());
        }


        return null;
    }

    public void setMovieCache(MovieCache movieCache) {
        this.movieCache = movieCache;
    }

    public void setCinemaCache(CinemaCache cinemaCache) {
        this.cinemaCache = cinemaCache;
    }
}
