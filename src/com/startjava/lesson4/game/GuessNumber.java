package com.startjava.lesson4.game;

import java.util.Scanner;


public class GuessNumber {
    private Player player1;
    private Player player2;
    Scanner sc = new Scanner(System.in);
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
        player1.clearArray();
        player2.clearArray();
        for (int i = 0; i < 10; i++) {
            if (makeMove(player1)) {
                break;
            }
            if (makeMove(player2)) {
                break;
            }
        }
        System.out.println("Player  " + player1.getName() + " input numbers " + player1.getNumberArray((player1.getCount())));
        System.out.println("Player  " + player2.getName() + " input numbers " + player2.getNumberArray((player2.getCount())));
    }

    public void inputNumber(Player player) {
        System.out.println("Input number " + player.getName());
        player.setNumberArray(sc.nextInt());
    }

    public boolean makeMove(Player player) {
        inputNumber(player);
        if (player.getNumber(player.getCount() - 1) > targetNumber) {
            System.out.println(player.getName() + "  intput a number " + player.getNumber(player.getCount() - 1) + " bigger than the computer guessed a number");
        } else if (player.getNumber(player.getCount() - 1) < targetNumber) {
            System.out.println(player.getName() + "  intput a number " + player.getNumber(player.getCount() - 1) + " smaller than computer guessed a number");
        } else {
            System.out.println("Player  " + player.getName() + " guess number " + targetNumber + " with " + player.getCount() + " attempts");
            return true;
        }
        if (player.getCount() == 10) {
            System.out.println("Player  " + player.getName() + "  don't have attempts");
        }
        return false;
    }

}