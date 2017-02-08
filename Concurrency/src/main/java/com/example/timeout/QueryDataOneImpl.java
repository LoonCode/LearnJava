package com.example.timeout;

import java.util.concurrent.TimeUnit;

/**
 * Created by loon on 17/2/9.
 */
public class QueryDataOneImpl implements QueryData {


    public String getData() {

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "1111";
    }
}
