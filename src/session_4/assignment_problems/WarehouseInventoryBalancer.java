package session_3.assignment_problems;

import java.util.Scanner;

public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        int max = sectionA[0];
        String section = "Section A";
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {

            totalA += sectionA[i];

            if (sectionA[i] > max) {
                max = sectionA[i];
                section = "Section A";
                index = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {

            totalB += sectionB[i];

            if (sectionB[i] > max) {
                max = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        String status;

        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        System.out.println(
                "Section A Total: " + totalA +
                        " | Section B Total: " + totalB +
                        " | Status: " + status +
                        " | Highest Quantity: " + max +
                        " (" + section + ", Item " + (index + 1) + ")"
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }

        analyzeInventory(sectionA, sectionB);
    }
}