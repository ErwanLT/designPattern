package structural.bridge;

import structural.bridge.size.LargeSize;
import structural.bridge.size.MediumSize;
import structural.bridge.size.SmallSize;

public class BridgeMain {
    public static void main(String[] args) {
        Coffee smallEspresso = new Espresso(new SmallSize());
        Coffee mediumLatte = new Latte(new MediumSize());
        Coffee largeEspresso = new Espresso(new LargeSize());

        smallEspresso.prepare();
        mediumLatte.prepare();
        largeEspresso.prepare();
    }
}
