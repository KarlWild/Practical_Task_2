package com.company.secondtask;

import java.util.Random;

public class Player implements PlayerPossibilities{
    private final String name;
    private int wins;
    private int roundPoints;

    public Player(String name) {
        this.name = name;
        wins = 0;
    }

    @Override
    public void throwDice(int K) {
        Random r = new Random();
        int sum = 0;
        this.setRoundPoints(sum);
        roundPoints = 0;
        for (int i = 0; i < K; i++) {
            int dice = r.nextInt(6) + 1;
            sum += dice;
            System.out.print(dice + " ");
        }
        this.setRoundPoints(sum);
    }

    @Override
    public void setRoundPoints(int roundPoints) {
        this.roundPoints = roundPoints;
    }

    @Override
    public int getRoundPoints() {
        return roundPoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWins() {
        return wins;
    }

    @Override
    public void setWins() {
        this.wins++;
    }
}
