package Patterns;

import java.util.*;
public class Pattern6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        pattern6(n);
    }
    public static void pattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }  
}
