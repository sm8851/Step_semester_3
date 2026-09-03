package session_4.class_problems;

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String text) {

        if (text.length() <= 1) {
            return true;
        }

        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return isPalindromeRecursive(
                text.substring(1, text.length() - 1)
        );
    }

    public static boolean isPalindromeArrayReversal(String text) {

        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reversed[i] = original[text.length() - 1 - i];
        }

        String reversedText = new String(reversed);

        return text.equals(reversedText);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println(
                "Iterative: " +
                        (isPalindromeIterative(text)
                                ? "Palindrome"
                                : "Not Palindrome")
        );

        System.out.println(
                "Recursive: " +
                        (isPalindromeRecursive(text)
                                ? "Palindrome"
                                : "Not Palindrome")
        );

        System.out.println(
                "Array Reversal: " +
                        (isPalindromeArrayReversal(text)
                                ? "Palindrome"
                                : "Not Palindrome")
        );
    }
}