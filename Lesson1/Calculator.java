public class Calculator {
    public static void main(String[] args) {
        // здесь меняем значение переменных a and b 
        int firstNumber = 5;
        int secondNumber = 2;
        char operator = '%';// для выбора  меняем значение переменной
        //переменный с операторами
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
            int resultStepen = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(firstNumber + " v stepeni " + secondNumber + " = " + resultStepen);
        }
    }
}



