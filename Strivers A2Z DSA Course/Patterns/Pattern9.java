package Patterns;

import java.util.*;
public class Pattern9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
            int n;
            System.out.println("Enter the value of n: ");
            n=sc.nextInt();
            pattern9(n);
    }
    public static void pattern9(int n){
        // Upper triangle
        for(int i=1;i<=n;i++){
            //Loop for spaces
            for(int j=n-i;j>=1;j--){System.out.print(" ");}
            //Loop for stars
            for(int k=1;k<=2*i-1;k++){ System.out.print("*");}
            System.out.println();
        }
        //Lower triangle
        for(int i=1;i<=n;i++){
            //Loop for spaces
            for(int j=1;j<=i-1;j++){System.out.print(" ");}
            //Loop for stars
            for(int k=2*(n-i)+1;k>=1;k--){System.out.print("*");}
            System.out.println();
        }
    }
}
