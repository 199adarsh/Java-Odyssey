import java.util.Scanner;

public class FindDuplicates {

    public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size =sc.nextInt();

        String[] s1 = new String[size] ;
        String[] s2 = new String[size] ;
        for(int i = 0; i < size; i++) {
            System.out.print("Enter value for S1 :");
            s1[i] = sc.next();
            System.out.print("Enter value for S2 :");
            s2[i] = sc.next();
            System.out.println("");
        }

        for(String s : s1){
            for(String x : s2){
                if(s.equals(x)){
                    System.out.println(s+" : Present in both Array Strings ");
                }

            }
        }
    }

}
