
package session_10_PracticeProblems;

import java.util.Scanner;
import java.util.ArrayList;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int even = 0, odd = 0;

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        for (int num : numbers) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
}
