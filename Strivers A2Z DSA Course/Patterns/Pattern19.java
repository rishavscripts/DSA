package Patterns;
import java.util.*;
public class Pattern19 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        pattern19(n);
        /*System.out.println();
        pat19(n);*/
    }
    public static void pattern19(int n){
        //Code for upper half
        for(int i=0;i<n;i++){
            //loop for first triangle
            for(int j=n;j>i;j--){System.out.print("*");}
            //loop for spaces
            for(int k=1;k<=i;k++){System.out.print(" ");}
            //loop for other half spaces
            for(int m=0;m<i;m++){System.out.print(" ");}
            //loop for second triangle
            for(int l=n;l>i;l--){System.out.print("*");}
            System.out.println();
        }
        //Code for second half
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
    }
    //another optimized approach //error in this code
    public static void pat19(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){System.out.print("*");}
            for(int k=0;k<2*i;k++){System.out.print(" ");}
            for(int l=n;l>i;l--){System.out.print("*");}
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){System.out.print("*");}
            for(int k=0;k<2*i;k++){System.out.print(" ");} 
            for(int l=0;l<=i;l++){System.out.print("*");}
            System.out.println();
        }
    }
}
