public class WolfTest {
    public static void main(String[] args) {
        Wolf WolfTest = new Wolf();
    
        WolfTest.setName ("Rich");
        WolfTest.setSex ("Male");
        WolfTest.setColour ("brown");
        WolfTest.setAge (7);
        WolfTest.setWeight (36);

        System.out.println("Name =  " + WolfTest.getName());
        System.out.println("Sex =  " + WolfTest.getSex());
        System.out.println("Colour =  " + WolfTest.getColour());
        System.out.println("Age =  " + WolfTest.getAge());
        System.out.println("Weight =  " + WolfTest.getWeight());

        WolfTest.go();

        WolfTest.sit();

        WolfTest.run();

        WolfTest.bark();

        WolfTest.hunt();
    }
}