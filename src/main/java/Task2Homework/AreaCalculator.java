package Task2Homework;

public class AreaCalculator {
    private static int calculationCount = 0;

    public static double triangleArea(double a, double b, double c) {
        calculationCount++;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double rectangleArea(double length, double width) {
        calculationCount++;
        return length * width;
    }

    public static double squareArea(double side) {
        calculationCount++;
        return side * side;
    }

    public static double rhombusArea(double d1, double d2) {
        calculationCount++;
        return (d1 * d2) / 2;
    }

    public static int getCalculationCount() {
        return calculationCount;
    }
}

