package com.startjava.Lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        // здесь меняем значение переменных a and b 
        int firstNumber = 5;
        int secondNumber = 2;
        // для выбора  меняем значение переменной
        char operator = '%';
        int resultOperation = 0;

        if (operator == '+') {
            resultOperation = firstNumber + secondNumber;
            System.out.println("Summa " + firstNumber + "+" + secondNumber + "=" + resultOperation);
        } else if (operator == '-') {
            resultOperation = firstNumber - secondNumber;
            System.out.println("Raznost " + firstNumber + "-" + secondNumber + "=" + resultOperation);
        } else if (operator == '*') {
            resultOperation = firstNumber * secondNumber;
            System.out.println("Proizvedenie " + firstNumber + "*" + secondNumber + "=" + resultOperation);
        } else if (operator == '/') {
            resultOperation = firstNumber / secondNumber;
            System.out.println("Delenie " + firstNumber + "/" + secondNumber + "=" + resultOperation);
        } else if (operator == '%') {
            resultOperation = firstNumber % secondNumber;
            System.out.println("Delenie po moduliu " + firstNumber + "%" + secondNumber + "=" + resultOperation);
        } else if (operator == '^') {
            int resultDegree = 1;
            for (int i = 1; i <= secondNumber; i++) {
                resultDegree *= firstNumber;
            }
            System.out.println(firstNumber + " v stepeni " + secondNumber + " = " + resultDegree);
        }
    }
}