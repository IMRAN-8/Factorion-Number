public class FactorionUtil {

    // Method to calculate factorial of a digit (0–9)
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a factorion
    public static boolean isFactorion(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == original;
    }
}
