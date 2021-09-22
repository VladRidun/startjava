public class ConditionalStatement {   
    public static void main(String[] args) {
        int ageUser = 31;
        if (ageUser > 20) {
            System.out.println("Возраст больше 20 лет!");    
        }

        char sexUser = 'M';
        char sex = 'M';
        if (sex == sexUser) {
            System.out.println("Пол мужской!");
        }
        if  (sex != sexUser) {
            System.out.println("Пол женский!");
        }

        double heigth = 1.80;
        double heigthUser = 1.71;
        if (heigthUser < heigth) {
        System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }

        char nameUser = 'V';
        char nameStartM = 'M';
        char nameStartI = 'I';
        if (nameUser == nameStartM) {
            System.out.println("имя начинается с буквы М");
        } else if (nameUser == nameStartI) {
            System.out.println("имя начинается с буквы I");
        } else { 
            System.out.println("What it is your name?");
        }
    }
}