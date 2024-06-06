package structural.bridge;

import structural.bridge.size.CoffeeSize;

class Espresso extends Coffee {

    public Espresso(CoffeeSize size) {
        super(size);
    }

    @Override
    public void prepare() {
        System.out.print("Espresso: ");
        size.applySize();
    }
}