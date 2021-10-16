import java.util.Scanner;

public class Player {
    String name;
    int number;
    Scanner sc = new Scanner(System.in);
    
    public Player (String name) {
        this.name = name;
     }

    public void guess() {
     System.out.println("Input number " + name);
     number = sc.nextInt();
    }

    @Override
    public String toString() {
        return String.format("name: %s", name);
    }
}
