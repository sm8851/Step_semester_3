package session_5.AssignmentProblems;

import java.util.Scanner;

public class MatchDayGridAnalyzer {

    static double rowAverage(int[] row) {

        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }

        return (double) sum / row.length;
    }

    static String classifyMatches(int[][] runsPerOver, int threshold) {

        String result = "";

        for (int i = 0; i < runsPerOver.length; i++) {

            double avg = rowAverage(runsPerOver[i]);

            if (avg >= threshold) {
                result += "Match " + i + ": Power Surge";
            } else {
                result += "Match " + i + ": Normal";
            }

            if (i != runsPerOver.length - 1) {
                result += " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of matches: ");
        int rows = sc.nextInt();

        int[][] runsPerOver = new int[rows][];

        for (int i = 0; i < rows; i++) {

            System.out.print("Enter overs in match " + i + ": ");
            int cols = sc.nextInt();

            runsPerOver[i] = new int[cols];

            System.out.println("Enter runs:");

            for (int j = 0; j < cols; j++) {
                runsPerOver[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        System.out.println(classifyMatches(runsPerOver, threshold));

        sc.close();
    }
}