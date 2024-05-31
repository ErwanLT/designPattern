package structural.facade;

public class Waiter {
    public void takeOrder(String order) {
        System.out.println("Prise de commande: " + order);
    }

    public void serveCoffee(String coffee) {
        System.out.println("Service du café: " + coffee);
    }
}
