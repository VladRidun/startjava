package com.startjava.Lesson2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        //System.out.println("modelName =  " + Jaeger.getJaegerCount());
        Jaeger jaeger1 = new Jaeger("Striker Eureka", "Mark-5", "Australia", 1.850f, 76.2f, 10, 9);

        System.out.println(jaeger1);
        jaeger1.move();
        jaeger1.useVortexCannon();

        System.out.println();

        Jaeger jaeger2 = new Jaeger("Gipsy Danger", "Mark-3", "United States of America", 1.980f, 79.25f, 8, 6);

        System.out.println(jaeger2);
        jaeger2.move();
        System.out.println("scanKaiju operation:  " + jaeger2.scanKaiju());
    }
}