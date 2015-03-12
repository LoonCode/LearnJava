package com.example.decorator.example1;

import java.util.List;

/**
 * Created by Loon on 2015/3/12.
 */
public class OverAvgCalculator extends  CalculatorDecorator {

    public OverAvgCalculator(CalculatorComponent calculatorComponent) {
        super(calculatorComponent);
    }

    @Override
    public double getResult(List<Double> list) {
        double result = calculatorComponent.getResult(list);
        int count = 0;
        for (Double aList : list) {
            if (aList >= result) {
                count++;
            }
        }
        System.out.println(count + "个高于平均值");

        return result;
    }
}
