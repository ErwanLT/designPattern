package main.java.builder;

public class HumanMain {

    public static void main(String[] args) {

        Human erwan = new Human.HumanBuilder()
                .withName("Erwan")
                .withAge(30)
                .withBirthPlace("Saint Cyr l'Ecole")
                .isMarried(true)
                .withNumberOfSibling(2)
                .build();

        System.out.println(erwan.toString());
    }
}
