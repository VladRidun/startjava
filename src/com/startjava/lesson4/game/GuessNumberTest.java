package com.startjava.lesson4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name first player");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Input name second player");
        Player player2 = new Player(sc.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        String choice;
        do {
            game.start();
            do {
                System.out.println("Do you want to continue [yes/no]:");
                choice = sc.nextLine();
            } while (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"));
        } while (!choice.equalsIgnoreCase("No"));
        sc.close();
    }
}