package structural.proxy;

public class RealPayment implements Payment {
    private String cardNumber;

    public RealPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " using card " + cardNumber + " processed.");
    }
}
