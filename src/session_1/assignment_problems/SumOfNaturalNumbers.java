package session_1.assignment_problems;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    static void calculateSum(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of numbers from 1 to " + n + "  is = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n=");
        int n = sc.nextInt();

        calculateSum(n);

        sc.close();
    }
}