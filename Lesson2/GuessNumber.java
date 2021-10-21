
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private int targetNumber;

    public GuessNumber(Player player1, Player  player2) {
        p1 = player1;
        p2 = player2;
    }

    public void start() {
        targetNumber = (int) (Math.random() * 100);
        //выводится число загаданное компьютером для проверки условий вывода 
        System.out.println("Copmputer guess number : " + targetNumber); 

        while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number " + p1.getName());
        p1.setNumber(sc.nextInt());
        System.out.println("Input number " + p2.getName());
        p2.setNumber(sc.nextInt());

        System.out.println(p1.getName() + " think that " + p1.getNumber());
        System.out.println(p2.getName() + " think that " + p2.getNumber());

        if (p1.getNumber() > targetNumber) {
            System.out.println(p1.getName() + "  intput a number " + p1.getNumber() + " bigger than the computer guessed a number");
        } else if (p1.getNumber() < targetNumber) {
            System.out.println(p1.getName() + "  intput a number " + p1.getNumber() + " smaller than computer guessed a number");
        }
        if (p2.getNumber() > targetNumber) {
            System.out.println(p2.getName() + "  intput a number " + p2.getNumber() + " bigger than computer guessed a number");
        } else if (p2.getNumber() < targetNumber) {
            System.out.println(p2.getName() + "  intput a number " + p2.getNumber() + " smaller than computer guessed a number");
        }
        if (p1.getNumber() == targetNumber) {
            System.out.println("Win player  " + p1.getName());
            break;
        } else if (p2.getNumber() == targetNumber) {
            System.out.println("Win player  " + p2.getName());
            break;
        } else {
            System.out.println("Try again!!!");
        }
        }
    }
}