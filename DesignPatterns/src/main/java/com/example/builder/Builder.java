package com.example.builder;

/**
 * Created by Loon on 2014/7/14.
 */
public abstract class Builder {
    protected BuildProduct product;

    abstract public void buildPartA(char c);

    abstract public void buildPartB(char c);
}
