package com.example.facade;

/**
 * Created by Loon on 2014/8/18.
 */
public class PostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {

        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();

    }
}
