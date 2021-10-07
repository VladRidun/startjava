public class JaegerTest {
    public static void main(String[] args) {
        //System.out.println("modelName =  " + Jaeger.getJaegerCount());
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        jaeger1.setWeight(1.850f);
        jaeger1.setHeight(76.2f);
        jaeger1.setStrength(10);
        jaeger1.setArmor(9);

        System.out.println("modelName =  " + jaeger1.getModelName());
        System.out.println("Mark =  " + jaeger1.getMark());
        System.out.println("Origin =  " + jaeger1.getOrigin());
        System.out.println("Weight =  " + jaeger1.getWeight() + "tons");
        System.out.println("Height =  " + jaeger1.getHeight() + "m");
        System.out.println("Strength =  " + jaeger1.getStrength());
        System.out.println("Armor =  " + jaeger1.getArmor());

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Gipsy Danger");
        jaeger2.setMark("Mark-3");
        jaeger2.setOrigin("United States of America");
        jaeger2.setWeight(1.980f);
        jaeger2.setHeight(79.25f);
        jaeger2.setStrength(8);
        jaeger2.setArmor(6);

        System.out.println("modelName =  " + jaeger2.getModelName());
        System.out.println("Mark =  " + jaeger2.getMark());
        System.out.println("Origin =  " + jaeger2.getOrigin());
        System.out.println("Weight =  " + jaeger2.getWeight() + "tons");
        System.out.println("Height =  " + jaeger2.getHeight() + "m");
        System.out.println("Strength =  " + jaeger2.getStrength());
        System.out.println("Armor =  " + jaeger2.getArmor());
    }
}
