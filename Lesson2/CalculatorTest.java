import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner firstNumber1 = new Scanner(System.in);
        Scanner secondNumber2 = new Scanner(System.in);
        Scanner operator1 = new Scanner(System.in);

            System.out.println("Введите первое число");
            int firstNumber = firstNumber1.nextInt();

            System.out.println("Введите второе число");
            int secondNumber = secondNumber2.nextInt();

            System.out.println("Введите оператор");
            char operator = operator1.next().charAt(0);

            System.out.println("Результат вычисления:" + calculator.Calc(int firstNumber,int secondNumber, char operator));
        }
    }
