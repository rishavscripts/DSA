import java.util.*;

public class TwoTrains {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n-1];
            for (int i = 0; i < n-1; i++) {
                p[i] = sc.nextInt();
            }

            // Prefix sums for Train A
            int[] prefix = new int[n];
            prefix[0] = 0;
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i-1] + p[i-1];
            }

            // Simulate Train B
            int timeB = 0;
            for (int i = 0; i < n-1; i++) {
                timeB = Math.max(timeB, prefix[i+1]) + p[i];
            }

            System.out.println(timeB);
        }
    }
}
