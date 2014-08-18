package com.example.facade;

/**
 * Created by Loon on 2014/8/18.
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("write" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("fill");
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("into");
    }

    @Override
    public void sendLetter() {
        System.out.println("send");
    }
}
