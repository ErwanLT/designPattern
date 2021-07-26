package main.java.factory;

import java.util.Random;

public class Child extends Human {

    @Override
    public int getAge() {
        Random r = new Random();
        return r.nextInt((18 - 1) + 1) + 1;
    }
}
