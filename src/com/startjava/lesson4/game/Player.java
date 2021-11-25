package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Заполняем массив элементами, введёнными с клавиатуры
    public void setNumber(int number) {
        numbers[count] = number;
        count++;
    }

    public int getLastNumber() {
        return numbers[count - 1];
    }

    public int getCount() {
        return count;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public void clearArray() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}