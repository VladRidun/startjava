package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumbers(int number) {
        numbers[count] = number;
        count++;//Заполняем массив элементами, введёнными с клавиатуры
    }

    public int getLastNumber(int count) {
        return numbers[count];
    }

    public int getCount() {
        return count;
    }

    public int[] getNumbers(int count) {
        return Arrays.copyOf(numbers, count);
    }

    public void clearArray(int i) {
        Arrays.fill(numbers, 0, i, 0);
        count = 0;
    }
}