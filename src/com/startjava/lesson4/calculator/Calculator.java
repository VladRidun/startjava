package com.startjava.lesson4.calculator;

public class Calculator {
    public int calc(String expression) {
        int resultOperation = 0;
        String[] symbols = expression.split(" ");
        for (String symbol : symbols) {
            System.out.println(symbol);
        }
          int firstNumber  = Integer.parseInt(symbols[0]);
           int secondNumber = Integer.parseInt(symbols[2]);
           char operator= expression.charAt(2) ;
        switch (operator) {
            case '+':
                resultOperation = firstNumber + secondNumber;
                System.out.println("Summa " + firstNumber + "+" + secondNumber + "=" + resultOperation);
                break;
            case '-':
                resultOperation = firstNumber - secondNumber;
                System.out.println("Raznost " + firstNumber + "-" + secondNumber + "=" + resultOperation);
                break;
            case '*':
                resultOperation = firstNumber * secondNumber;
                System.out.println("Proizvedenie " + firstNumber + "*" + secondNumber + "=" + resultOperation);
                break;
            case '/':
                resultOperation = firstNumber / secondNumber;
                System.out.println("Delenie " + firstNumber + "/" + secondNumber + "=" + resultOperation);
                break;
            case '%':
                resultOperation = Math.floorDiv(firstNumber, secondNumber);
                System.out.println("Delenie po moduliu " + firstNumber + "%" + secondNumber + "=" + resultOperation);
                break;
            case '^':
                resultOperation = (int) Math.pow(firstNumber,secondNumber);
                System.out.println(firstNumber + " v stepeni " + secondNumber + " = " + resultOperation);
                break;
        }
        expression = null;
        return resultOperation;
    }
}
