package udemyCourseChallenges;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long years = minutes / (365 * 24 * 60);
            long days = minutes / (60 * 24);
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
