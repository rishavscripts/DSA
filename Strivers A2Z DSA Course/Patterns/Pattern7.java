package Patterns;
import java.util.*;
public class Pattern7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        pattern7(n);
    }
    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            // loop for spaces
            for(int j=n-i;j>=1;j--){ System.out.print(" ");}
            //loop for stars
            for(int k=1;k<=2*i-1;k++){System.out.print("*");}
            System.out.println();
        }
    }
}
