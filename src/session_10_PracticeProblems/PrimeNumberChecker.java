
package session_10_PracticeProblems;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            boolean prime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }

        sc.close();
    }
}
