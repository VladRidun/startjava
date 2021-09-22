public class MyFirstGame {
    public static void main(String[] args) {
        int targetNumber = 13;
        int playerNumber = 5;

        System.out.println("Ugadaite chislo, kotoroe zagadal computer");

        do { 
            if (playerNumber > targetNumber) {
                System.out.println("Dannoe chislo bolshe togo chto zagadal computer" + playerNumber);
                playerNumber--;
            } else if (playerNumber < targetNumber) {
                System.out.println("Dannoe chislo menshe togo chto zagadal computer" + playerNumber);
                playerNumber++;
            }
        } while (playerNumber != targetNumber);
            System.out.println("Vy ugadali chislo " + targetNumber);       
    }
}

