package com.kodilla.rps.com.kodilla;

import java.util.Random;
import java.util.Scanner;

public class Rps {
    static Scanner sc = new Scanner(System.in);
    static Random randomGenerator = new Random();
    static int numberOfUserWins = 0;
    static int numberOfComputerWins = 0;
    static String userMove;
    static int userMoveInt;
    static int computerMove;
    static String userChoose;
    static String computerChose;
    static String decision = "";
    static int numberOfWins;
    static String name;

    public static void main(String[] args) {

        startTheGame();
        do {
            System.out.println("Please make a move.");
            userMove = sc.next();
            if (userMove.equals("1") || userMove.equals("2") || userMove.equals("3")) {
                userMoveInt = Integer.valueOf(userMove);
                computerMove = randomGenerator.nextInt(3) + 1;
                userChoose = move(userMoveInt);
                computerChose = move(computerMove);
                winChecker();
            }
            if (userMove.equals("x")) {
                System.out.println("Do you want end the game? y - Yes, n - No");
                decision = sc.next();
                if (decision.equals("y")) {
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
                    startTheGame();
                }
            } else {
                System.out.println("You chose wrong key. Please try again.");
            }
        }
        while (numberOfUserWins != numberOfWins && numberOfComputerWins != numberOfWins);
        System.out.println("End the game.");
    }

    public static String move(int userMove) {
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

    public static void startTheGame() {
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

    public static void winChecker() {
        System.out.println(name + " choose " + userChoose + ", computer choose " + computerChose);
        if ((userMoveInt == 1 && computerMove == 1) || (userMoveInt == 2 && computerMove == 2) || (userMoveInt == 3 && computerMove == 3)) {
            System.out.println("Nobody wins.");
        }
        if ((userMoveInt == 2 && computerMove == 1) || (userMoveInt == 3 && computerMove == 2) || (userMoveInt == 1 && computerMove == 3)) {
            System.out.println(name + " win.");
            numberOfUserWins = numberOfUserWins + 1;
        }
        if ((userMoveInt == 1 && computerMove == 2) || (userMoveInt == 2 && computerMove == 3) || (userMoveInt == 3 && computerMove == 1)) {
            System.out.println("Computer win.");
            numberOfComputerWins = numberOfComputerWins + 1;
        }
        System.out.println("Computer:" + numberOfComputerWins + " " + name + " " + numberOfUserWins);
    }
}
