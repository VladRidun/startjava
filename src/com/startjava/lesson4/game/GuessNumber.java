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
        int i;
        for (i = 0; i < 10; i++) {
            if (makeMove(player1) || makeMove(player2)) {
                break;
            }
        }
        printNumbers(player1);
        printNumbers(player2);
        player1.clearArray(i);
        player2.clearArray(i);
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        int attemptCount = player.getCount();
        if (player.getLastNumber() > targetNumber) {
            System.out.println(player.getName() + "  intput a number " + player.getLastNumber() + " bigger than the computer guessed a number");
        } else if (player.getLastNumber() < targetNumber) {
            System.out.println(player.getName() + "  intput a number " + player.getLastNumber() + " smaller than computer guessed a number");
        } else {
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
        int[] array = player.getNumbers();
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}