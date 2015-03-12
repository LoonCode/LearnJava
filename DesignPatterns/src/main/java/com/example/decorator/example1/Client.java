package com.example.decorator.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Loon on 2015/3/12.
 */
public class Client {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 21; i++) {
            list.add(Math.random() *100);

        }
        System.out.println(Arrays.toString(list.toArray()));

        CalculatorComponent avg = new AvgCalculator();
        CalculatorDecorator overAvgCalculator= new OverAvgCalculator(avg);
        CalculatorDecorator varianceCalculator= new VarianceCalculator(overAvgCalculator);

        System.out.println(varianceCalculator.getResult(list));

    }

}
