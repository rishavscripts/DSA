package Patterns;
import java.util.*;
public class Pattern22 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        pattern22(n);
    }
    public static void pattern22(int n){
        for(int i=0;i<=2*(n-1);i++){
            for(int j=0;j<=2*(n-1);j++){
                int top=i,left=2*(n-1)-i,bottom=j,right=2*(n-1)-j;
                int x=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-x);
            }
            System.out.println();
        }
    }
}
