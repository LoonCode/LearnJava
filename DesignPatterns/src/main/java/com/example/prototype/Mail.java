package com.example.prototype;

/**
 * Created by Loon on 2014/8/20.
 */
public class Mail implements Cloneable {

    private String context;

    public Mail(Template template) {
        this.context = template.getContext();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        return (Mail) super.clone();
    }

    public String getContext() {
        return context;
    }
}
