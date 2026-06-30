import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String user = "Alice";
        int age = 30;
        logger.info("User: {}, Age: {}", user, age);
        logger.debug("Processing user: {}", user);
        logger.warn("User {} is approaching age limit: {}", user, age);
        logger.error("Failed to process user: {}", user);
    }
}
