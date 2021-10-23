package com.startjava.Lesson2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Введите первое число");
            int firstNumber = sc.nextInt();

            System.out.println("введите знак операции");
            char operator = sc.next().charAt(0);

            System.out.println("Введите второе число");
            int secondNumber = sc.nextInt();

            System.out.println("Результат вычисления:" + calculator.calc(firstNumber, secondNumber, operator));
            do {
                System.out.println("Хотите продолжить вычисления [yes/no]:");
                choice = sc.next();
            } while (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"));
        } while (!choice.equalsIgnoreCase("No"));
        sc.close();
    }
}