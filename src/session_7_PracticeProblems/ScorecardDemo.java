package session_7_PracticeProblems;

class Scorecard {

    private boolean[] results;
    private int currentIndex;

    public Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        currentIndex = 0;
    }

    public void recordAnswer(boolean result) {

        if (currentIndex >= results.length) {
            System.out.println("Cannot record more answers");
            return;
        }

        results[currentIndex] = result;
        currentIndex++;
    }

    public int getScore() {

        int score = 0;

        for (int i = 0; i < currentIndex; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}

public class ScorecardDemo {

    public static void main(String[] args) {

        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score = " + sc.getScore());
    }
}