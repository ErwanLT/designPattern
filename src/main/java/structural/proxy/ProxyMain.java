package structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Payment payment1 = new PaymentProxy("1111-1111-1111-1111", true);
        payment1.pay(100.00);

        Payment payment2 = new PaymentProxy("2222-2222-2222-2222", false);
        payment2.pay(200.00);
    }
}
