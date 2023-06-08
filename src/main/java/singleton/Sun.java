package main.java.singleton;

public class Sun {

    private static Sun instance;
    private String name;

    private Sun(String name) {
        this.name = name;
    }

    public static Sun getInstance() {
        return instance==null?instance = new Sun("Sun"):instance;
    }

    public String getName() {
        return name;
    }
}
