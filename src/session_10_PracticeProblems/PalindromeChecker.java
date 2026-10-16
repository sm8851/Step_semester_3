package session_10_PracticeProblems;

import java.util.Scanner;

public class PalindromeChecker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        StringBuilder sb = new StringBuilder() ;
        int r = s.length() - 1;
        while(r>=0){
            sb.append(s.charAt(r));
            r-- ;
        }
        String reverse = sb.toString() ;
        if(reverse.equals(s)) {
            System.out.println(reverse + " - palindrome");
        }else{
            System.out.println(reverse + " - not a palindrome");
        }
    }
}
