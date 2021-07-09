package main.prototype;

import java.util.Objects;

public class Human implements Prototype {

    private String name;
    private String lastName;
    private int age;

    public Human() {
        System.out.println(" Human description ");
        System.out.println("---------------------------------");
        System.out.println("Name" + "\t" + "Last Name" + "\t" + "Age");
    }

    public Human(String name, String lastName, int age) {
        this();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        showHuman();
    }

    private void showHuman() {
        System.out.println(name + "\t" + lastName + "\t" + age);
    }

    @Override
    public Prototype getClone() {
        return new Human(name, lastName, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && name.equals(human.name) && lastName.equals(human.lastName);
    }

}
