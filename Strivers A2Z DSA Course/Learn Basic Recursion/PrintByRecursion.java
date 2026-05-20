import java.util.*;
public class PrintByRecursion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        print(n);
    }

    private static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        print(n - 1);
    }
}