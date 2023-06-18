package com.bridglabz.Snakladder;

public class SnakeAndLadder {
    static int startPosition = 0;

    public static void main(String[] args) {
        System.out.println("startPosition===>"+startPosition);
        int rollDice = (int) ((Math.random() * 10) % 6 + 1);
        System.out.println("RollDice====>"+rollDice);


    }
}