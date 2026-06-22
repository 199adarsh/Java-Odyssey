import java.util.Scanner;

public class StringRev {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to Reverse : ");
        String s1 = sc.next();
        String s2 ="";
        for(int i = 0; i < s1.length(); i++) {
            s2  += String.valueOf(s1.charAt(s1.length() - i-1));
        }

        System.out.println("Normal String : "+ s1 +" \nReversed String : "+s2);
    }

}
