public class Calculator {
        int resultOperation;
        public int calc (int firstNumber, int secondNumber, char operator) { 
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
            resultOperation = firstNumber % secondNumber;
            System.out.println("Delenie po moduliu " + firstNumber + "%" + secondNumber + "=" + resultOperation);
            break;
            case '^':
            resultOperation = 1;
            for (int i = 1; i <= secondNumber; i++) {
                resultOperation *= firstNumber;
            }
            System.out.println(firstNumber + " v stepeni " + secondNumber + " = " + resultOperation);
            break;
            }
        return resultOperation;
        }
}
