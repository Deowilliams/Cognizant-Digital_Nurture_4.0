// Exercise 4: Adapter Pattern
interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPalGateway {
    void sendPayment(double amount) {
        System.out.println("Paying via PayPal: Rs." + amount);
    }
}

class StripeGateway {
    void makePayment(double amount) {
        System.out.println("Paying via Stripe: Rs." + amount);
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway gateway = new PayPalGateway();
    public void processPayment(double amount) {
        gateway.sendPayment(amount);
    }
}

class StripeAdapter implements PaymentProcessor {
    private StripeGateway gateway = new StripeGateway();
    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }
}

class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new PayPalAdapter();
        processor1.processPayment(1500);

        PaymentProcessor processor2 = new StripeAdapter();
        processor2.processPayment(2500);
    }
}
