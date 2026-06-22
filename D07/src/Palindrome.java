import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to check palindrome : ");
        String s1 = sc.next();

        for(int i = 0; i < s1.length()/2; i++) {
            if(s1.charAt(i) != s1.charAt(s1.length()-i-1)){
                System.out.println("This is not a Palindrome !");
                return;
            }
        }
        System.out.println("This is a a Palindrome");

    }
}
