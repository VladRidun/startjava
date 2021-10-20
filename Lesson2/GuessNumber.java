
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player p1;
    Player p2;

    public GuessNumber(Player player1, Player  player2) {
    p1 = player1;
    p2 = player2;
    }

        public void start() {
            int guessp1;
            int guessp2;
            String namep1;
            String namep2;

            int targetNumber = (int) (Math.random() * 100);
            System.out.println("Copmputer guess number : " + targetNumber); //для проверки 

            while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input number " + p1.getName());
            guessp1 = sc.nextInt();
            p1.setNumber(guessp1);
            guessp1 = p1.getNumber();
            System.out.println("Input number " + p2.getName());
            guessp2 = sc.nextInt();
            p2.setNumber(guessp2);
            guessp2 = p1.getNumber();
            namep1 = p1.getName();
            namep2 = p2.getName();

            System.out.println(namep1 + " think that " + guessp1);
            System.out.println(namep2 + " think that " + guessp2);

                if (guessp1 > targetNumber) {
                    System.out.println(namep1 +"  intput a number "+guessp1+" bigger than the computer guessed a number");
                } else if (guessp1 < targetNumber) {
                    System.out.println(namep1 +"  intput a number "+guessp1+" smaller than computer guessed a number");
                }
                if (guessp2 > targetNumber) {
                    System.out.println(namep2 +"  intput a number "+guessp2+" bigger than computer guessed a number");
                } else if (guessp2 < targetNumber) {
                    System.out.println(namep2 +"  intput a number "+guessp2+" smaller than computer guessed a number");
                }
                
                if (guessp1 == targetNumber) {
                    System.out.println("Win player  " + namep1);
                    break;
                }
                if (guessp2 == targetNumber) {
                    System.out.println("Win player  " + namep2);
                    break;
                } else {
                    System.out.println("Try again!!!");
            }
        }
    }
}