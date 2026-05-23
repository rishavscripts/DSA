package Patterns;
import java.util.*;
public class Pattern20 {
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        pattern20(n);
    }
    public static void pattern20(int n){
        for(int i=0;i<n;i++){
            //loop for first triangle
            for(int j=0;j<=i;j++){System.out.print("*");}
            //loop for spaces
            for(int k=n-1;k>i;k--){System.out.print(" ");}
            //loop for other spaces
            for(int m=n-1;m>i;m--){System.out.print(" ");}
            //loop for second triangle
            for(int l=0;l<=i;l++){System.out.print("*");}
            System.out.println();
        }
        for(int i=0;i<n;i++){
            //loop for first triangle
            for(int j=n-1;j>i;j--){System.out.print("*");}
            //loop for spaces
            for(int k=0;k<=i;k++){System.out.print(" ");}
            //loop for other half spaces
            for(int m=0;m<=i;m++){System.out.print(" ");}
            //loop for second triangle
            for(int l=n-1;l>i;l--){System.out.print("*");}
            System.out.println();
        }
    }
}
