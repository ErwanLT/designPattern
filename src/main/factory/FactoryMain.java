package main.factory;

public class FactoryMain {

    public static void main(String[] args) {

        HumanFactory factory = new HumanFactory();

        factory.getHuman(HumanPeriodEnum.CHILD).print();
        factory.getHuman(HumanPeriodEnum.PARENT).print();
        factory.getHuman(HumanPeriodEnum.GRANDPARENT).print();

    }
}
