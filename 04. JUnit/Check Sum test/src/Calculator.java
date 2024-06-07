public class Calculator {

    /**
     * Checks if there's a pair of parameters that adds up to exactly 20.
     *
     * @param a first number
     * @param b second number
     * @param c third number
     *
     * @return <code>true</code> if there's a pair of parameters that adds up to exactly 20, <code>false</code> otherwise
     */
    public boolean checkTheSum(int a, int b, int c) {
        return a + b == 20 || a + c == 20 || b + c == 20;
    }

}