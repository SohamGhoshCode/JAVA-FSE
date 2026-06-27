import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;

        int result = calculator.add(a, b);

        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 3;

        int result = calculator.subtract(a, b);

        assertEquals(2, result);
    }
}
