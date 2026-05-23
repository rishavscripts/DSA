package Patterns;
import java.util.*;
public class Pattern18 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        pattern18(n);
    }
    public static void pattern18(int n){
        char end=(char)('A'+n-1);
        for(int i=0;i<n;i++){
            //loop to find the start character
            char start=end;
            for(int j=0;j<i;j++){start--;}
            //loop to print the characters between them.
            for(char x=start;x<=end;x++){System.out.print(x);}
            System.out.println();
        }
    }
}
