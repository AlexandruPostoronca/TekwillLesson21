import java.util.Collection;

public class Calculator {

    public int sum(Collection<Integer> numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
