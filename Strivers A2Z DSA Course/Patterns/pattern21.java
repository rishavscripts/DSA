package Patterns;
import java.util.*;
public class Pattern21{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        pat21(n);
    }
    public static void pat21(int n){
        for(int i=0;i<n;i++){
            if(i==0||i==(n-1)){
                for(int j=0;j<n;j++){System.out.print("*");}
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int k=0;k<n-2;k++){System.out.print(" ");}
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
