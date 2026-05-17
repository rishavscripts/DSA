package Patterns;
import java.util.*;
public class Pattern13 {
    static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n: ");
        n = Sc.nextInt();
        pattern13(n);
    }
    public static void pattern13(int n){
        int d=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(d++);
            }
            System.out.println();
        }
    }
}
