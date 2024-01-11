package main.java.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Child extends AbstractHuman {

    public Child(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void print() {
        System.out.println("==============================");
        System.out.println("Name : " + getName());
        System.out.println("Last name : " + getLastName());
        System.out.println("Parents :");
        for (Human parent : parents) {
            System.out.println("  - Name : " + parent.getName());
        }
        System.out.println("==============================");
    }

    @Override
    public void addChild(Human child) {

    }

    private List<Human> parents = new ArrayList<>();

    @Override
    public void addParent(Human parent) {
        parents.add(parent);
    }
}
