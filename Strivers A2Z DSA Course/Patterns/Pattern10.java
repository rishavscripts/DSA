package Patterns;
// there is an error in this code fix needed.
import java.util.*;
public class Pattern10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        pattern10(n);
    }
    public static void pattern10(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;i++){ System.out.print("*");}
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){System.out.print("*");}
            System.out.println();
        }
    }
}
