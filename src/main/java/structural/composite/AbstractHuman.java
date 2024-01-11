package main.java.structural.composite;

public abstract class AbstractHuman implements Human{

    private String name;
    private String lastName;

    public AbstractHuman(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
