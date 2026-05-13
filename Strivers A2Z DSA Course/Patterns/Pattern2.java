package Patterns;

import java.util.*;
public class Pattern2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        Pattern_2(n);
    }
    public static void Pattern_2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
