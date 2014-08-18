package com.example.facade;

/**
 * Created by Loon on 2014/8/18.
 */
public interface LetterProcess {

    public void writeContext(String context);

    public void fillEnvelope(String address);

    public void letterIntoEnvelope();

    public void sendLetter();
}
