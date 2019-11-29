package udemyCourseChallenges;

public class MinutesSecondsDuration {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static String getDurationString(int minutes, int seconds) {
        // check parameters have valid values
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;

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
            return INVALID_VALUE_MESSAGE;
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
