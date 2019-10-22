package udemyCourse;

public class DisplayHighScorePosition {
    public static void main(String[] args) {
        displayHighScorePos("Hacek", 5000);
        int a1 = calculateHighScorePosition(1500);
        int a2 = calculateHighScorePosition(900);
        int a3 = calculateHighScorePosition(400);
        int a4 = calculateHighScorePosition(90);
        System.out.println(a1 + a2 + a3 + a4);

    }

    public static void displayHighScorePos(String playerName, int position) {
        String message = playerName + " managed to get into position " + position +
                " on the high score table.";
        System.out.println(message);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
