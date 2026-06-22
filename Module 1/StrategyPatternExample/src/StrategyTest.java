public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        context.setPaymentStrategy(creditCard);
        context.executePayment(150.0);

        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");
        context.setPaymentStrategy(payPal);
        context.executePayment(75.50);
    }
}
