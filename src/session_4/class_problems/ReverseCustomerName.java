package session_4.class_problems;

import java.util.Scanner;

public class ReverseCustomerName {

    public static String reverseCustomerName(String customerName) {

        String reversed = "";

        for (int i = customerName.length() - 1; i >= 0; i--) {

            reversed += customerName.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String customerName = sc.nextLine();

        System.out.println("Original Name: " + customerName);

        System.out.println(
                "Reversed Name: " +
                        reverseCustomerName(customerName)
        );
    }
}