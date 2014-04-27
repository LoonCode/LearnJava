package com.example.chapter2.section3;

/**
 * Created by Loon on 2014/4/27.
 */
public class Cinema {
    private final Object controlCinema1, controlCinema2;
    private long vacanciesCinema1;
    private long vacanciesCinema2;

    public Cinema() {
        this.vacanciesCinema1 = 20;
        this.vacanciesCinema2 = 20;
        this.controlCinema1 = new Object();
        this.controlCinema2 = new Object();
    }

    public boolean sellTickets1(int number) {
//        synchronized (controlCinema1) {
        if (number < vacanciesCinema1) {
            vacanciesCinema1 -= number;
            return true;
        } else {
            return false;
        }
//        }
    }

    public boolean sellTickets2(int number) {
//        synchronized (controlCinema2) {
        if (number < vacanciesCinema2) {
            vacanciesCinema2 -= number;
            return true;
        } else {
            return false;
        }
//        }
    }

    public boolean returnTickets1(int number) {
//        synchronized (controlCinema1) {
        vacanciesCinema1 += number;
        return true;
//        }
    }

    public boolean returnTickets2(int number) {
//        synchronized (controlCinema2) {
        vacanciesCinema2 += number;
        return true;
//        }
    }

    public long getVacanciesCinema1() {
        return vacanciesCinema1;
    }

    public long getVacanciesCinema2() {
        return vacanciesCinema2;
    }
}
