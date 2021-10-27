package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String expression;
        String choice;
        do {
            System.out.println("Введите выражение");
            expression = sc.nextLine();
            System.out.println("Результат вычисления:" + calculator.calc(expression));
            do {
                System.out.println("Хотите продолжить вычисления [yes/no]:");
                choice = sc.next();
            } while (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"));
            sc.nextLine();
        } while (!choice.equalsIgnoreCase("No"));

    }
}
