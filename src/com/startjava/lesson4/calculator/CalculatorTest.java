package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String choice = "yes";
        do {
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Введите выражение");
                System.out.println("Результат вычисления:" + calculator.calc(sc.nextLine()));
            }
            System.out.println("Хотите продолжить вычисления [yes/no]:");
            choice = sc.nextLine();
        } while (!choice.equalsIgnoreCase("no"));
    }
}