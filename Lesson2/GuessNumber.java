
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player p1;
    Player p2; 

    public void startGame(Player player1, Player  player2) {
        p1 = player1;
        p2 = player2;
        int guessp1;
        int guessp2;

        int targetNumber = (int) (Math.random() * 100);

        System.out.println("Copmputer guess number : " + targetNumber); //для проверки 

        while (true) {
        p1.guess();
        p2.guess();
        guessp1 = p1.number;
        guessp2 = p2.number;
        System.out.println(p1.name + " think that " + guessp1);
        System.out.println(p2.name + " think that " + guessp2);
            if (guessp1 > targetNumber) {
                System.out.println(p1.name +"  intput a number "+guessp1+" bigger than the computer guessed a number");
            } else if (guessp1 < targetNumber) {
                System.out.println(p1.name +"  intput a number "+guessp1+" smaller than computer guessed a number");
            }
            if (guessp2 > targetNumber) {
                System.out.println(p2.name +"  intput a number "+guessp2+" bigger than computer guessed a number");
            } else if (guessp2 < targetNumber) {
                System.out.println(p2.name +"  intput a number "+guessp2+" smaller than computer guessed a number");
            }
            if (guessp1 == targetNumber) {
                System.out.println("Win player  " + p1.name);
                break;
            }
            if (guessp2 == targetNumber) {
                System.out.println("Win player  " + p2.name);
                break;
            } else {
                System.out.println("Try again!!!");
            }
        }
    }
}