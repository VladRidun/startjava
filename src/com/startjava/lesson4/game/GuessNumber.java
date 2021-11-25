package com.startjava.lesson4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner sc = new Scanner(System.in);
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        targetNumber = (int) (Math.random() * 101);
        // выводится число загаданное компьютером для проверки условий вывода
        System.out.println("Copmputer guess number : " + targetNumber);
        System.out.println("You  have 10 attempts!");
        for (int i = 0; i < 10; i++) {
            if (makeMove(player1) || makeMove(player2)) {
                break;
            }
        }
        printNumbers(player1);
        printNumbers(player2);
        player1.clearArray();
        player2.clearArray();
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        int attemptCount = player.getCount();
        String bigSmall = player.getLastNumber() > targetNumber ? "bigger" : "smaller";
        System.out.println(player.getName() + "  intput a number " + player.getLastNumber() + " " + bigSmall + " than the computer guessed a number");
        if (player.getLastNumber() == targetNumber) {
            System.out.println("Player  " + player.getName() + " guess number " + targetNumber + " with " + attemptCount + " attempts");
            return true;
        }
        if (attemptCount == 10) {
            System.out.println("Player  " + player.getName() + "  don't have attempts");
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Input number " + player.getName());
        player.setNumber(sc.nextInt());
    }

    private void printNumbers(Player player) {
        System.out.println("Player  " + player.getName() + " input numbers:");
        int[] numbers = player.getNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}