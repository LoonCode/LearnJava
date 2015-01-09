package com.example.test.jsoup;

import com.google.common.base.Objects;

/**
 * Created by Loon on 2015/1/9.
 */
public class Movie {

    private String startTime;
    private String price;
    private String address;
    private String sale;
    private String movieName;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("startTime", startTime)
                .add("price", price)
                .add("address", address)
                .add("sale", sale)
                .add("movieName", movieName)
                .toString();
    }
}
