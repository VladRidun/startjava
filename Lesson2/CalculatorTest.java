import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("������� ������ �����");
            int firstNumber = sc.nextInt();

            System.out.println("������� ��������");
            char operator = sc.next().charAt(0);

            System.out.println("������� ������ �����");
            int secondNumber = sc.nextInt();

            System.out.println("��������� ����������:" + calculator.calc(firstNumber, secondNumber, operator));

            System.out.println("������ ���������� ����������? [yes/no]:");
            choice = sc.next().charAt(0);
            if (choice != 'y') {
                break;
            }
        } while (choice != 'n');
    }
}


