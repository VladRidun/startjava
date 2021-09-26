import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator ();
        Scanner firstNumber1 = new Scanner(System.in);
        Scanner secondNumber2 = new Scanner(System.in);
        Scanner operator1 = new Scanner(System.in);
        Scanner choice1 = new Scanner(System.in);
        char choice;
            do {
            System.out.println("¬ведите первое число");
            int firstNumber = firstNumber1.nextInt();

            System.out.println("¬ведите оператор");
            char operator = operator1.next().charAt(0);

            System.out.println("¬ведите второе число");
            int secondNumber = secondNumber2.nextInt();

            System.out.println("–езультат вычислени€:" + calculator.calc(firstNumber, secondNumber, operator));

            System.out.println("’отите продолжить вычислени€? [y/n]:");
            choice = choice1.next().charAt(0);
            if (choice != 'y') {
                break;
            }
        } while (choice != 'n');
    }
}


