import java.util.*;
public class Equality {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                total += a[i];
            }
            
            long S = total / (n - 1); // sum of all x's
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = S - a[i];
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }
    }
}
