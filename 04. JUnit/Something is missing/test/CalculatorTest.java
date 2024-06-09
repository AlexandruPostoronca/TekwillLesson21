import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int sum=calculator.sum(numbers);
        Assert.assertEquals(21, sum);
    }
}