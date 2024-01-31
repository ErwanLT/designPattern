package structural.composite;

public class CompositeMain {

    public static void main(String[] args) {

        Child mathys = new Child("Mathys", "Le Tutour");
        Parent erwan = new Parent("Erwan", "Le Tutour");
        Parent amelie = new Parent("Amelie", "Le Tutour");

        mathys.addParent(erwan);
        mathys.addParent(amelie);
        erwan.addChild(mathys);
        amelie.addChild(mathys);

        GrandParent philippe = new GrandParent("Philippe", "Le Tutour");

        philippe.addChild(erwan);
        erwan.addParent(philippe);

        philippe.print();
        erwan.print();
        mathys.print();
    }
}
