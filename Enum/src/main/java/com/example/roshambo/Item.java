package com.example.roshambo;

import com.example.roshambo.impl.Paper;
import com.example.roshambo.impl.Rock;
import com.example.roshambo.impl.Scissors;

/**
 * Created by Loon on 2015/2/9.
 */
public interface Item {
    OutCome compete(Item item);

    OutCome eval(Paper paper);

    OutCome eval(Scissors scissors);

    OutCome eval(Rock rock);
}
