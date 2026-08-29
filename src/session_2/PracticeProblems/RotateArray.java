package session_2.PracticeProblems;

import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}