package structural.proxy;

public class Logger {
    public static void logTransaction(String cardNumber, double amount) {
        System.out.println("Logging: Payment of $" + amount + " made with card " + cardNumber);
    }
}
