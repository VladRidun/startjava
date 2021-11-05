package com.startjava.lesson4.game;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Player {
    private String name;
    private int[] numberArray = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberArray(int number, int i) {
        this.numberArray[i] = number; //Заполняем массив элементами, введёнными с клавиатуры
    }

    public int getNumber(int i) {
        return numberArray[i];
    }

    public String getNumberArray(int i) {
        return Arrays.toString(Arrays.copyOf(numberArray, i));
    }

    public void fillArray(int i) {
        Arrays.fill(numberArray, 0, i, 0);
    }
}

