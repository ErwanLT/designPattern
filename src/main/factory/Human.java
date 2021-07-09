package main.factory;

abstract class Human {

    protected int age;

    abstract int getAge();

    public void print() {
        System.out.println("==============================");
        System.out.println("age : " + getAge());
        System.out.println("==============================");
    }
}
