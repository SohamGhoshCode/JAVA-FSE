public class DecoratorTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier emailAndSms = new SMSNotifierDecorator(emailNotifier);
        Notifier fullyDecorated = new SlackNotifierDecorator(emailAndSms);

        System.out.println("Testing basic Email notifier:");
        emailNotifier.send("Hello World");

        System.out.println("\nTesting Email + SMS + Slack notifier:");
        fullyDecorated.send("Hello World");
    }
}
