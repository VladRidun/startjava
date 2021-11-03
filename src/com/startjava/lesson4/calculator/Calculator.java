package com.startjava.lesson4.calculator;

public class Calculator {
    public int calc(String expression) {
        String[] symbols = expression.split(" ");
        int firstNumber = Integer.parseInt(symbols[0]);
        int secondNumber = Integer.parseInt(symbols[2]);
        char mathSign = symbols[1].charAt(0);
        switch (mathSign) {
            case '+':
                return Math.addExact(firstNumber, secondNumber);

            case '-':
                return Math.subtractExact(firstNumber, secondNumber);

            case '*':
                return Math.multiplyExact(firstNumber, secondNumber);

            case '/':
                return (int) Math.ceil(firstNumber / secondNumber);

            case '%':
                return (int) Math.IEEEremainder(firstNumber, secondNumber);

            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("Выражение неправильно введено!!!");
                return 0;
        }
    }
}
