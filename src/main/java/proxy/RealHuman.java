package main.java.proxy;

public class RealHuman implements Human{

    private String name;

    public RealHuman(String name){
        this.name = name;
        creating();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void display() {
        System.out.println("Displaying real human " + name);
    }

    private void creating() {
        System.out.println("Creating real human " + name);
    }
}
