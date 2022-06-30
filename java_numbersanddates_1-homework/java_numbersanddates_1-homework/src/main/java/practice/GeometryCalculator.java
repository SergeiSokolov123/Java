package practice;

public class GeometryCalculator {

    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        if (radius < 0) {
            return -1;
        }

        double pi = Math.PI;
        double square = pi * Math.pow(Math.abs(radius), 2);
        return square;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        if (radius < 0) {
            return -1;
        }

        double pi = 4.0 / 3 * Math.PI;
        double square = pi * Math.pow(Math.abs(radius), 3);
        return square;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (b + c > a && a + c > b && a + b > c) {
            return true;
        } else {
            return false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (!isTrianglePossible(a, b, c)) return -1;

        double p = (a + b + c) / 2.0;
        double square = Math.abs(Math.sqrt((p) * (p - a) * (p - b) * (p - c)));
        return square;

    }
}
