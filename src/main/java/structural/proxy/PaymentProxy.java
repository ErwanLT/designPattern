package structural.proxy;

public class PaymentProxy implements Payment {
    private RealPayment realPayment;
    private String cardNumber;
    private boolean isAuthenticated;

    public PaymentProxy(String cardNumber, boolean isAuthenticated) {
        this.cardNumber = cardNumber;
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public void pay(double amount) {
        if (Authenticator.authenticate(cardNumber, isAuthenticated)) {
            if (realPayment == null) {
                realPayment = new RealPayment(cardNumber);
            }
            realPayment.pay(amount);
            Logger.logTransaction(cardNumber, amount);
        } else {
            System.out.println("Authentication required to process payment.");
        }
    }
}
