import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        int sum = calculator.add(10, 15);
        Assert.assertEquals(25, sum);
    }
}