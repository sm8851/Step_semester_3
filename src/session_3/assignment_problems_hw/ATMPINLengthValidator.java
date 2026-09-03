package session_3.assignment_problems;

import java.util.Scanner;

public class ATMPINLengthValidator {

    public static void checkPinLength(String pin) {

        if (pin.length() != 4) {
            System.out.println("Invalid PIN - must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pin = sc.nextLine();

        checkPinLength(pin);
    }
}