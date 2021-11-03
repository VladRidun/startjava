package com.startjava.lesson4.game;

import java.util.Scanner;

public class Player {
    private String name;
    private int number;
    private int[] numberArray = new int[10];


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number; //Заполняем массив элементами, введёнными с клавиатуры
        }
    public int getNumber() {
        return number;
    }
}