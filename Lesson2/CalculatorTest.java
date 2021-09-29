import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("¬ведите первое число");
            int firstNumber = sc.nextInt();

            System.out.println("¬ведите знак операции");
            char operator = sc.next().charAt(0);

            System.out.println("¬ведите второе число");
            int secondNumber = sc.nextInt();
            System.out.println("–езультат вычислени€:" + calculator.calc(firstNumber, secondNumber, operator));
            System.out.println("’отите продолжить вычислени [yes/no]:");
            choice = sc.next();
            while (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No")) {
                System.out.println("’отите продолжить вычислени [yes/no]:");
                choice = sc.next();
                }
            if (choice.equalsIgnoreCase("No")) {
                break;}
        } while (choice.equalsIgnoreCase("Yes"));
        sc.close();
    }
}




