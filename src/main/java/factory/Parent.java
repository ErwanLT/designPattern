package main.java.factory;

import java.util.Random;

public class Parent extends Human {

    @Override
    public int getAge() {
        Random r = new Random();
        return r.nextInt((55 - 20) + 1) + 20;
    }
}
