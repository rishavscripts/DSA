package Patterns;
import java.util.*;
public class Pattern14 {
    static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n: ");
        n = Sc.nextInt();
        pattern14(n);
    }
    public static void pattern14(int n){
        for(int i =1;i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
