
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
    String choice;
    Scanner sc = new Scanner(System.in);
    System.out.println("Input name first player");
    String name1 = sc.nextLine();
    Player player1 = new Player(name1);
    System.out.println("Input name second player");
    String name2 = sc.nextLine();
    Player player2 = new Player(name2);

    GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.start();
            do {
                System.out.println("Do you want to continue [yes/no]:");
                choice = sc.next();
            } while (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"));
        } while (!choice.equalsIgnoreCase("No"));
        sc.close();
    }
}