package com.example.roshambo.impl;

import com.example.roshambo.Item;
import com.example.roshambo.OutCome;

/**
 * Created by Loon on 2015/2/9.
 */
public class Paper implements Item {
    @Override
    public OutCome compete(Item item) {
        return item.eval(this);
    }

    @Override
    public OutCome eval(Paper paper) {
        return OutCome.DRAW;
    }

    @Override
    public OutCome eval(Scissors scissors) {
        return OutCome.LOSE;
    }

    @Override
    public OutCome eval(Rock rock) {
        return OutCome.WIN;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
