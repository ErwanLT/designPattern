package structural;

import org.junit.jupiter.api.Test;
import structural.proxy.Payment;
import structural.proxy.PaymentProxy;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentProxyTest {

    @Test
    public void testAuthenticatedPayment() {
        Payment payment = new PaymentProxy("1234-5678-9876-5432", true);
        // Rediriger la sortie standard pour vérifier les messages de sortie
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        payment.pay(100.00);

        String expectedOutput = "Authentication successful for card 1234-5678-9876-5432\n" +
                                "Payment of $100.0 using card 1234-5678-9876-5432 processed.\n" +
                                "Logging: Payment of $100.0 made with card 1234-5678-9876-5432\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testUnauthenticatedPayment() {
        Payment payment = new PaymentProxy("1234-5678-9876-5432", false);
        // Rediriger la sortie standard pour vérifier les messages de sortie
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        payment.pay(200.00);

        String expectedOutput = "Authentication failed for card 1234-5678-9876-5432\n" +
                                "Authentication required to process payment.\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
