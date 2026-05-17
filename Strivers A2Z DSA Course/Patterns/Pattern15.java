package Patterns;
import java.util.*;
public class Pattern15 {
    static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n: ");
        n = Sc.nextInt();
        pattern15(n);
    }
    public static void pattern15(int n){
        for(int i=n;i>=1;i--){
            char ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
