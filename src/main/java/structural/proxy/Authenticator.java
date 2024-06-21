package structural.proxy;

public class Authenticator {
    public static boolean authenticate(String cardNumber, boolean isAuthenticated) {
        if (isAuthenticated) {
            System.out.println("Authentication successful for card " + cardNumber);
            return true;
        } else {
            System.out.println("Authentication failed for card " + cardNumber);
            return false;
        }
    }
}
