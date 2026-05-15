package Patterns;
import java.util.*;
public class Pattern12{
    static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        System.out.println("Enter the value of n: ");
        n = Sc.nextInt();
        pattern12(n);
    }
    public static void pattern12(int n){
        for (int i = 1; i <= n; i++) {
            // print left increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // print middle spaces
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            // print right decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}