package structural.bridge;

import structural.bridge.size.CoffeeSize;

class Latte extends Coffee {

    public Latte(CoffeeSize size) {
        super(size);
    }

    @Override
    public void prepare() {
        System.out.print("Latte: ");
        size.applySize();
    }
}