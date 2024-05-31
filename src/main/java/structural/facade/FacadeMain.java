package structural.facade;

public class FacadeMain {

    public static void main(String[] args) {
        CoffeeShopFacade coffeeShop = new CoffeeShopFacade();
        coffeeShop.completeOrder("Cappucino");
    }
}
