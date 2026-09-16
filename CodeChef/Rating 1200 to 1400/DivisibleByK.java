import java.util.*;

public class DivisibleByK {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int g = 1;
            for (int num : arr) {
                g = gcd(g * num, k); // keep gcd with k
                if (g == k) break;   // early exit if already divisible
            }

            System.out.println(g == k ? "YES" : "NO");
        }
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
