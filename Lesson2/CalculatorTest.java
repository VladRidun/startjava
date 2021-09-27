import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("¬ведите первое число");
            int firstNumber = sc.nextInt();

            System.out.println("¬ведите оператор");
            char operator = sc.next().charAt(0);

            System.out.println("¬ведите второе число");
            int secondNumber = sc.nextInt();

            System.out.println("–езультат вычислени€:" + calculator.calc(firstNumber, secondNumber, operator));

            System.out.println("’отите продолжить вычислени€? [yes/no]:");
            choice = sc.next().charAt(0);
            if (choice != 'y') {
                break;
            }
        } while (choice != 'n');
    }
}


