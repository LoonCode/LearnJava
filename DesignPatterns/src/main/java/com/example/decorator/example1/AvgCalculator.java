package com.example.decorator.example1;

import java.util.List;

/**
 * 计算平均值
 * Created by Loon on 2015/3/12.
 */
public class AvgCalculator extends  CalculatorComponent {
    @Override
    public double getResult(List<Double> list) {
        double sum = 0;

        for (Double aList : list) {
            sum += aList;
        }

        return sum / (list.size() == 0 ? 1 : list.size());
    }
}
