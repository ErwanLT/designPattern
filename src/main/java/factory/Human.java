package main.java.factory;

public abstract class Human {

    protected int age;

    public int getAge() {
        return 0;
    }

    public void print() {
        System.out.println("==============================");
        System.out.println("age : " + getAge());
        System.out.println("==============================");
    }
}
