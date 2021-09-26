public class Calculator {
    public static void main(String[] args) {
        private int firstNumber;
        private int secondNumber;
        private char operator;
        private int resultOperation;

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
                result *= firstNumber;
            }
            System.out.println(firstNumber + " v stepeni " + secondNumber + " = " + resultDegree);
        }
    }
}