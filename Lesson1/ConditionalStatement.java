public class ConditionalStatement {   
    public static void main(String[] args) {
        int a = 31;
        if (a > 20) {
        System.out.println("Возраст больше 20 лет!");    
        }
        char m = 'M';
        char s = 'M';
        if (s == m) {
        System.out.println("Пол мужской!");
        }
        if  (s != m) {
         System.out.println("Пол женский!");
        }
        double x =1.80;
        double h = 1.71;
        if (h < x) {
        System.out.println("Рост меньше 1.80");
        } else {
         System.out.println("Рост больше 1.80");
        }
        char n = 'V';
        char w = 'M';
        char i = 'I';
        if (n == w) {
        System.out.println("имя начинается с буквы М");
        } else if (n == i) {
         System.out.println("имя начинается с буквы I");
        } else {
        System.out.println("What it is your name?");
        }
        }
    }