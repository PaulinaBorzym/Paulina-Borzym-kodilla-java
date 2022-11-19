package com.kodilla.rps.com.kodilla;

import java.util.Random;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        Rps rps = new Rps();
        Scanner sc = new Scanner(System.in);
        Random randomGenerator = new Random();
        int numberOfUserWins =0;
        int numberOfComputerWins = 0;
        String userMove;
        int userMoveInt;
        int computerMove;
        String userChoose;
        String computerChose;
        String decision = "";

        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter number of wins to win all game");
        int numberOfWins = sc.nextInt();
        System.out.println("Hello " + name + " !");
        System.out.print("Here's how to play the game:\n" +
                "1 - rock \n" +
                "2- paper \n" +
                "3 - scissors \n" +
                "x - ed the game \n" +
                "n - start new game \n");
        do {
            System.out.println("Please make a move.");
            userMove = sc.next();
            if(userMove.equals("1") || userMove.equals("2") || userMove.equals("3")){
                userMoveInt = Integer.valueOf(userMove);
                computerMove = randomGenerator.nextInt(3)+1;
                userChoose = rps.move(userMoveInt);
                computerChose = rps.move(computerMove);
                System.out.println(name + " choose " + userChoose + ", computer choose " + computerChose );
                if ((userMoveInt == 1 && computerMove == 1) || (userMoveInt == 2 && computerMove == 2)|| (userMoveInt == 3 && computerMove == 3) ) {
                    System.out.println("Nobody wins.");
                }
                if ((userMoveInt == 2 && computerMove == 1) || (userMoveInt == 3 && computerMove == 2)|| (userMoveInt == 1 && computerMove == 3) ) {
                    System.out.println(name + " win.");
                    numberOfUserWins = numberOfUserWins +1;
                }
                if ((userMoveInt == 1 && computerMove == 2) || (userMoveInt == 2 && computerMove == 3)|| (userMoveInt == 3 && computerMove == 1) ) {
                    System.out.println("Computer win.");
                    numberOfComputerWins = numberOfComputerWins +1;

                }
                System.out.println("Computer:" + numberOfComputerWins + " " + name + " " + numberOfUserWins);
            }
            if (userMove.equals("x")){
                System.out.println("Do you want end the game? y - Yes, n - No");
                decision = sc.next();
                if (decision.equals("y")){
                    break;
                } else {
                    continue;
                }
            }
            if (userMove.equals("n")) {
                System.out.println("Do you want end the game? y - Yes, n - No");
                decision = sc.next();
                if (decision.equals("n")) {
                    continue;
                }
                if (decision.equals("y")) {
                    numberOfComputerWins = 0;
                    numberOfUserWins = 0;
                    System.out.println("Enter your name");
                    name = sc.next();
                    System.out.println("Enter number of wins to win all game");
                    numberOfWins = sc.nextInt();
                    System.out.println("Hello " + name + " !");
                    System.out.print("Here's how to play the game:\n" +
                            "1 - rock \n" +
                            "2- paper \n" +
                            "3 - scissors \n" +
                            "x - ed the game \n" +
                            "n - start new game \n");
                }
            }
            System.out.println("End the game.");
        }
        while ( numberOfUserWins != numberOfWins && numberOfComputerWins  != numberOfWins);
    }
public String move (int userMove) {
    if (userMove == 1) {
        return "rock";
    }
    if (userMove == 2) {
        return "paper";
    }
    if (userMove == 3) {
        return "scissors";
    }
    return "";
}
}
