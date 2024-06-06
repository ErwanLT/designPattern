package structural.bridge;

import structural.bridge.size.CoffeeSize;

public abstract class Coffee {
    protected CoffeeSize size;

    protected Coffee(CoffeeSize size) {
        this.size = size;
    }

    abstract public void prepare();
}
