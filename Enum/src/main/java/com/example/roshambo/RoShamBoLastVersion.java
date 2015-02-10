package com.example.roshambo;

import java.util.Random;

/**
 * 借助表驱动法
 * Created by Loon on 2015/2/10.
 */
public enum RoShamBoLastVersion {

    PAPER(OutCome.DRAW, OutCome.LOSE, OutCome.WIN),
    SCISSORS(OutCome.WIN, OutCome.DRAW, OutCome.LOSE),
    ROCK(OutCome.LOSE, OutCome.WIN, OutCome.DRAW);

    private OutCome vPAPER, vSCISSORS, vROCK;
    private static Random random = new Random();

    RoShamBoLastVersion(OutCome vPAPER, OutCome vSCISSORS, OutCome vROCK) {
        this.vPAPER = vPAPER;
        this.vSCISSORS = vSCISSORS;
        this.vROCK = vROCK;
    }

    public OutCome compete(RoShamBoLastVersion roShamBoLastVersion) {
        switch (roShamBoLastVersion) {
            default:
            case PAPER:
                return vPAPER;
            case SCISSORS:
                return vSCISSORS;
            case ROCK:
                return vROCK;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            match(newRoShamBoLastVersion(), newRoShamBoLastVersion());
        }
    }

    private static void match(RoShamBoLastVersion a, RoShamBoLastVersion b) {

        System.out.println(a + " vs " + b + ":" + a.compete(b));
    }


    private static RoShamBoLastVersion newRoShamBoLastVersion() {

        switch (random.nextInt(7) / 3) {
            default:
            case 0:
                return RoShamBoLastVersion.SCISSORS;
            case 1:
                return RoShamBoLastVersion.PAPER;
            case 2:
                return RoShamBoLastVersion.ROCK;
        }
    }


}
