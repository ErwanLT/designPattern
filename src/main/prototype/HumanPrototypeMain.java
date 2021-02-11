package main.prototype;

public class HumanPrototypeMain extends Human {

    public static void main(String[] args) {
        Human human1 = new Human("Erwan", "Le Tutour", 30);

        Human human2 = (Human) human1.getClone();

        if (human1.equals(human2)){
            System.out.println("Equals");
        }
    }
}
