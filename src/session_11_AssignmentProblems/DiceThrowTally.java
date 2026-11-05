
package session_11_AssignmentProblems;

import java.util.Scanner;
import java.util.Arrays;

public class DiceThrowTally {

    static int[] diceSort(int[] rolls) {
        int[] count = new int[7];

        // Count occurrences of each dice number
        for (int roll : rolls) {
            count[roll]++;
        }

        // Print frequencies
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ": " + count[i]);
        }

        // Build sorted array
        int[] sorted = new int[rolls.length];
        int index = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < count[i]; j++) {
                sorted[index++] = i;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] rolls = new int[n];

        for (int i = 0; i < n; i++) {
            rolls[i] = sc.nextInt();
        }

        int[] result = diceSort(rolls);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
