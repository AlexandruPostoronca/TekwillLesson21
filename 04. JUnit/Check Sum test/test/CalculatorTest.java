import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void returnsTrueWithAllPositiveNumbers() {
        boolean sum = calculator.checkTheSum(10, 10, 10);
        Assert.assertTrue(sum);
    }

    @Test
    public void returnsFalseWithAllPositiveNumbers() {
        boolean sum = calculator.checkTheSum(15, 15, 15);
        Assert.assertFalse(sum);
    }

    @Test
    public void returnsTrueWithANegativeNumbers() {
        boolean sum = calculator.checkTheSum(30, -10, -10);
        Assert.assertTrue(sum);
    }

    @Test
    public void returnsFalseWithANegativeNumbers() {
        boolean sum = calculator.checkTheSum(20, -10, -10);
        Assert.assertFalse(sum);
    }

    @Test
    public void allNegativeNumbers() {
        boolean sum = calculator.checkTheSum(-10, -10, -10);
        Assert.assertFalse(sum);
    }

    @Test
    public void allZeroTest() {
        boolean sum = calculator.checkTheSum(0, 0, 0);
        Assert.assertFalse(sum);
    }

    @Test
    public void allNumbersEqualTo20() {
        boolean sum = calculator.checkTheSum(20, 20, 20);
        Assert.assertFalse(sum);
    }
}