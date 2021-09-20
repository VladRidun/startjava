public class WolfTest {
    public static void main(String[] args) {

    Wolf WolfTest = new Wolf();
    
    WolfTest.name = "Rich";
    WolfTest.sex= "Male";
    WolfTest.colour= "brown";
    WolfTest.age = 7;
    WolfTest.weight= 36;

    System.out.println("Name =  " + WolfTest.name);
    System.out.println("Sex =  " + WolfTest.sex);
    System.out.println("Colour =  " + WolfTest.colour);
    System.out.println("Age =  " + WolfTest.age);
    System.out.println("Weight =  " + WolfTest.weight);

        WolfTest.go();

        WolfTest.sit();

        WolfTest.run();

        WolfTest.bark();

        WolfTest.hunt();

    }
}