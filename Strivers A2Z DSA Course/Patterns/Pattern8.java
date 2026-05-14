package Patterns;

import java.util.*;
public class Pattern8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        pattern8(n);
    }
    public static void pattern8(int n){
        for(int i=1;i<=n;i++){
            // Loop for spaces
           for(int j=0;j<=i-1;j++){System.out.print(" ");}
           //Loop for stars
            for(int k=0;k<2*(n-i)+1;k++){System.out.print("*");}
            System.out.println();
        }
    }
}
