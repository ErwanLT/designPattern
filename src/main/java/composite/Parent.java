package main.java.composite;

import java.util.ArrayList;
import java.util.List;

public class Parent extends AbstractHuman {

    public Parent(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void print() {
        System.out.println("==============================");
        System.out.println("Name : " + getName());
        System.out.println("Last name : " + getLastName());
        System.out.println("Parents :");
        for (Human parent : grandParents) {
            System.out.println("  - Name : " + parent.getName());
        }
        System.out.println("Childs :");
        for (Human child : childs) {
            System.out.println("  - Name : " + child.getName());
        }
        System.out.println("==============================");
    }

    private List<Human> childs = new ArrayList<>();

    @Override
    public void addChild(Human child) {
        childs.add(child);
    }

    private List<Human> grandParents = new ArrayList<>();

    @Override
    public void addParent(Human parent) {
        grandParents.add(parent);
    }
}
