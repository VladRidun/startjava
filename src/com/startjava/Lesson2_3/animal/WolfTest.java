package com.startjava.Lesson2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
    
        wolf.setName("Rich");
        wolf.setSex("Male");
        wolf.setColour("brown");
        wolf.setAge(7);
        wolf.setWeight(36);

        System.out.println("Name =  " + wolf.getName());
        System.out.println("Sex =  " + wolf.getSex());
        System.out.println("Colour =  " + wolf.getColour());
        System.out.println("Age =  " + wolf.getAge());
        System.out.println("Weight =  " + wolf.getWeight());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.bark();
        wolf.hunt();
    }
}