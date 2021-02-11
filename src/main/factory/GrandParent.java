package main.factory;

import java.util.Random;

public class GrandParent extends Human{

    @Override
    int getAge() {
        Random r = new Random();
        return r.nextInt((99 - 55) + 1) + 55;
    }
}
