package com.startjava.lesson4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private int targetNumber;
    private int count;
    private int i;

    public GuessNumber(Player player1, Player player2) {
        p1 = player1;
        p2 = player2;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 101);
        // выводится число загаданное компьютером для проверки условий вывода
        System.out.println("Copmputer guess number : " + targetNumber);


        System.out.println("You  have 10 attempts!");
        count = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Input number " + p1.getName());
            p1.setNumberArray(sc.nextInt(), i);
            if (p1.getNumber(i) > targetNumber) {
                System.out.println(p1.getName() + "  intput a number " + p1.getNumber(i) + " bigger than the computer guessed a number");
            } else if (p1.getNumber(i) < targetNumber) {
                System.out.println(p1.getName() + "  intput a number " + p1.getNumber(i) + " smaller than computer guessed a number");
            } else {
                System.out.println("Player  " + p1.getName() + " guess number " + targetNumber + " with " + count + " attempts");
                break;
            }
            if (count == 10) {
                System.out.println("Player  " + p1.getName() + "  don't have attempts");
            }

            System.out.println("Input number " + p2.getName());
            p2.setNumberArray(sc.nextInt(), i);

            if (p2.getNumber(i) > targetNumber) {
                System.out.println(p2.getName() + "  intput a number " + p2.getNumber(i) + " bigger than computer guessed a number");
            } else if (p2.getNumber(i) < targetNumber) {
                System.out.println(p2.getName() + "  intput a number " + p2.getNumber(i) + " smaller than computer guessed a number");
            } else {
                System.out.println("Player  " + p2.getName() + " guess number " + targetNumber + " with " + count + " attempts");
                break;
            }
            if (count == 10) {
                System.out.println("Player  " + p2.getName() + "  don't have attempts");

            }
            count++;
        }
        System.out.println("Player "+p1.getName() +" input : " + p1.getNumberArray(i));
        System.out.println("Player "+p2.getName() +" input : "+ p2.getNumberArray(i));
        p1.fillArray(i);
        p2.fillArray(i);
    }
}

