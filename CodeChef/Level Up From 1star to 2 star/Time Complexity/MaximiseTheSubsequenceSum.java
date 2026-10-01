import java.util.*;
public class MaximiseTheSubsequenceSum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Arrays.sort(a); // sort ascending

            // Flip up to k negative numbers
            for (int i = 0; i < n && k > 0; i++) {
                if (a[i] < 0) {
                    a[i] = -a[i];
                    k--;
                }
            }

            long sum = 0;
            for (int val : a) {
                if (val > 0) sum += val;
            }

            System.out.println(sum);
        }
    }
}
