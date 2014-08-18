package com.example.facade;

/**
 * Created by Loon on 2014/8/18.
 */
public class Client {

    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        postOffice.sendLetter("test", "address");
    }
}
