package com.example.decorator.example1;

import java.util.List;

/**
 * Created by Loon on 2015/3/12.
 */
public class VarianceCalculator extends  CalculatorDecorator {

    public VarianceCalculator(CalculatorComponent calculatorComponent) {
        super(calculatorComponent);
    }

    @Override
    public double getResult(List<Double> list) {
        double result = calculatorComponent.getResult(list);

        if (list.size() > 20) {
            double num = 0;
            for (Double aList : list) {
                num += (aList - result) * (aList - result);
            }
            System.out.println(list.size() + "个数的方差是 " + (num / list.size()));
        } else {
            System.out.println("样本数量不足20个不计算方差");
        }

        return result;
    }
}
