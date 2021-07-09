package main.factory;

public class HumanFactory {

    public Human getHuman(HumanPeriodEnum period) {

        switch (period) {
            case CHILD:
                return new Child();
            case PARENT:
                return new Parent();
            case GRANDPARENT:
                return new GrandParent();
        }

        return null;
    }
}
