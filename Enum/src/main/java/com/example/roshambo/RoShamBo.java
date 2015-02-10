package com.example.roshambo;

import com.example.roshambo.impl.Paper;
import com.example.roshambo.impl.Rock;
import com.example.roshambo.impl.Scissors;

import java.util.Random;

/**
 * 自动分发
 * Created by Loon on 2015/2/9.
 */
public class RoShamBo {
    private  static Random random =new Random(47);

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            match(newItem(), newItem());
        }
    }

    private static void match(Item a, Item b) {

        System.out.println(a + " vs " + b + ":" + a.compete(b));
    }

    private static Item newItem() {

        switch (random.nextInt(7) / 3) {
            default:
            case 0:
                return new Scissors();
            case 1:
                return new Paper();
            case 2:
                return new Rock();
        }
    }
}
