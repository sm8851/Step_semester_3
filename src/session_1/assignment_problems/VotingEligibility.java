package session_1.assignment_problems;

import java.util.Scanner;

public class VotingEligibility {
    public static boolean
    isEligibileToVote(int age){
        return age>=18;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("age=");
        int age=sc.nextInt();

        boolean result= isEligibileToVote(age);
        if(result){
            System.out.println("Eligibility to vote ");
        }
        else{
            System.out.println("Not eligibility to vote ");
        }
        sc.close();

    }
}
