package com.startjava.Lesson2_3.robot;

public class Jaeger {
    private static int jaegerCount;
    private String modelName;
    private String mark;
    private String origin;
    private float weight;
    private float height;
    private int strength;
    private int armor;
   
    public Jaeger (String modelName, String mark, String origin, float weight, float height, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.weight = weight;
        this.height = height;
        this.strength = strength;
        this.armor = armor;
    }

    public Jaeger() {
        jaegerCount++;
        System.out.println("Number of created jaeger =  " + jaegerCount);
    }

    public int getJaegerCount() {
        return jaegerCount;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }

    @Override
    public String toString() {
        return String.format("modelName: %s \nmark: %s \norigin: %s \nweight: %.2f \nheight: %.2f \nstrength: %d \narmor: %d",
                modelName, mark, origin, weight, height, strength, armor);
    }
}