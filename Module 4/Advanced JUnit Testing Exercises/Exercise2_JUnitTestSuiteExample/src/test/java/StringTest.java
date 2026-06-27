import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @Test
    public void testStringLength() {
        assertEquals(5, "hello".length());
    }
}
