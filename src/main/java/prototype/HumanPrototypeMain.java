package main.java.prototype;

import org.junit.jupiter.api.Assertions;

public class HumanPrototypeMain extends Human {

    public static void main(String[] args) {
        Prototype erwan = new Human("Erwan", "Le Tutour", 32);
        Prototype erwanClone = erwan.getClone();
        Assertions.assertEquals(erwan, erwanClone);
    }
}
