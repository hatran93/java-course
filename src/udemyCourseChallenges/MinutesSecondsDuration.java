package udemyCourseChallenges;

public class MinutesSecondsDuration {
    public static String getDurationString(int minutes, int seconds) {
        // check parameters have valid values
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid values";

            // if valid, do the calculation
        } else {
            int numOfHours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return minutes + " min and " + seconds + " seconds = "
                    + numOfHours + " h " + remainingMinutes + " min "
                    + seconds + " s.";
        }

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid values!";
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
