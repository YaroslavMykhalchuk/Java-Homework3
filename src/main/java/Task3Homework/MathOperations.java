package Task3Homework;

public class MathOperations {
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static double avg(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The factorial of a negative number is not defined.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
