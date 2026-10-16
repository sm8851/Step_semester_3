package session_10_PracticeProblems;
import java.util.* ;
public class Counter_VC {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        int v = 0 ;
        int c = 0 ;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v++ ;
            }
            else{
                c++ ;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c) ;
    }
}
