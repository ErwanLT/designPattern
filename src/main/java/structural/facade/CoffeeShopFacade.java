package structural.facade;

public class CoffeeShopFacade {
    private Waiter waiter;
    private Barista barista;
    private Cashier cashier;

    public CoffeeShopFacade() {
        this.waiter = new Waiter();
        this.barista = new Barista();
        this.cashier = new Cashier();
    }

    public void completeOrder(String order) {
        waiter.takeOrder(order);
        barista.prepareCoffee(order);
        waiter.serveCoffee(order);
        cashier.processPayment(order);
    }
}
