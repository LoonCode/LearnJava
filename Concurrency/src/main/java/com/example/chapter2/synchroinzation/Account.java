package com.example.chapter2.synchroinzation;

/**
 * Created by Loon on 2014/4/24.
 */
public class Account {

    private double balance;

    public synchronized void addAmount(double amount) {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += amount;
    }

    public synchronized void subtractAmount(double amount) {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
