import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class PerformanceTesterTest {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testPerformTask() {
        PerformanceTester performanceTester = new PerformanceTester();
        performanceTester.performTask();
    }
}
