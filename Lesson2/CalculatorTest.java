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
            System.out.println("������� ������ �����");
            int firstNumber = firstNumber1.nextInt();

            System.out.println("������� ��������");
            char operator = operator1.next().charAt(0);

            System.out.println("������� ������ �����");
            int secondNumber = secondNumber2.nextInt();

            System.out.println("��������� ����������:" + calculator.calc(firstNumber, secondNumber, operator));

            System.out.println("������ ���������� ����������? [y/n]:");
            choice = choice1.next().charAt(0);
            if (choice != 'y') {
                break;
            }
        } while (choice != 'n');
    }
}


