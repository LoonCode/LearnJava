package com.example.roshambo.impl;

import com.example.roshambo.Item;
import com.example.roshambo.OutCome;

/**
 * Created by Loon on 2015/2/9.
 */
public class Rock implements Item {
    @Override
    public OutCome compete(Item item) {
        return item.eval(this);
    }

    @Override
    public OutCome eval(Paper paper) {
        return OutCome.LOSE;
    }

    @Override
    public OutCome eval(Scissors scissors) {
        return OutCome.WIN;
    }

    @Override
    public OutCome eval(Rock rock) {
        return OutCome.DRAW;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
