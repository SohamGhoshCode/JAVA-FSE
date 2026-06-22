public class AdapterTest {
    public static void main(String[] args) {
        PaypalGateway paypal = new PaypalGateway();
        PaymentProcessor paypalProcessor = new PaypalAdapter(paypal);
        paypalProcessor.processPayment(100.0);

        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(250.0);
    }
}
