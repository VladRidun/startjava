package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numberArray = new int[10];
    private int count=0;

    public Player(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public void setNumberArray(int number) {
        this.numberArray[count] = number;
        count++;//Заполняем массив элементами, введёнными с клавиатуры
    }

    public  int getNumber(int count) {
        return numberArray[count];
    }

    public int getCount(){
        return count;
    }

    public String getNumberArray(int count) {
        return Arrays.toString(Arrays.copyOf(numberArray,count));

    }

    public void clearArray() {
        Arrays.fill(numberArray, -1);
        count=0;
    }
}