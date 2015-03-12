package com.example.decorator.example1;

import java.util.List;

/**
 * 计算器指针，包装类
 * Created by Loon on 2015/3/12.
 */
public abstract class CalculatorDecorator extends  CalculatorComponent {

    protected CalculatorComponent calculatorComponent;

    public CalculatorDecorator(CalculatorComponent calculatorComponent) {
        this.calculatorComponent = calculatorComponent;
    }

    public abstract double getResult(List<Double> list);
}
