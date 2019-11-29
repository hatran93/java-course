package udemyCourseChallenges;

public class AreaCalculator {
    public static double area(double radius) {
        // handle invalid value
        if (radius < 0) {
            return -1.0;
        } else {
            return Math.PI * radius * radius;
        }
    }

    public static double area(double x, double y) {
        // handle invalid value
        if (x < 0 || y < 0) {
            return -1.0;
        }
        // return x*y
        else {
            return x * y;
        }
    }
}
