package Patterns;
import java.util.Scanner;
public class Pattern17 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        pattern17(n);
    }
    public static void pattern17(int n){
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){System.out.print(" ");}
            char ch='A';
            for(int k=0;k<=i;k++){System.out.print(ch++);}
            ch--;
            for(int l=1;l<=i;l++){System.out.print(--ch);}
            System.out.println();
        }
    }
}
