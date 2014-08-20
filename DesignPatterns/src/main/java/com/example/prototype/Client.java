package com.example.prototype;

/**
 * Created by Loon on 2014/8/20.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Mail mail = new Mail(new Template());

        for (int i = 0; i < 2; i++) {
            Mail cloneMail = mail.clone();
            sendMail(cloneMail);
        }
    }

    private static void sendMail(Mail cloneMail) {
        System.out.println("send Mail finish" + cloneMail.getContext());
    }
}
