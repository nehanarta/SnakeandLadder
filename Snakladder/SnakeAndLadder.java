package com.bridglabz.Snakladder;

public class SnakeAndLadder {
    static int winning_Position = 100;
    static int playerPosition = 0;


    public static void main(String[] args) {
        System.out.println("startPosition===>" + playerPosition);
        int rollDice = (int) ((Math.random() * 10) % 6 + 1);
        System.out.println("RollDice====>" + rollDice);

        while (playerPosition < winning_Position) {
            int option = (int) ((Math.random() * 10) % 3);
            System.out.println("option===>" + option);
            switch (option) {
                case 0:
                    System.out.println("No play");
                    break;
                case 1:
                    playerPosition = playerPosition + rollDice;
                    if(playerPosition<=winning_Position);
                    System.out.println("ladder==>" + playerPosition);
                    break;
                case 2:
                    playerPosition = playerPosition - rollDice;
                    if (playerPosition < 0)
                        playerPosition = 0;
                    System.out.println("snake==>" + playerPosition);
                    break;
                default:
                    System.out.println("is invalid input");
                    break;
            }


        }
    }
}