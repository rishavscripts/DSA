import java.util.Arrays;
import java.util.Scanner;

public class RemoveOneElement {
    static Scanner sc = new Scanner(System.in);

    static boolean check(long[] a, long[] b, long x) {

        if (x <= 0) return false;

        int n = a.length;

        int i = 0;
        int j = 0;
        int skipped = 0;

        while (i < n && j < n - 1) {

            if (a[i] + x == b[j]) {
                i++;
                j++;
            } else {
                skipped++;
                i++;

                if (skipped > 1) return false;
            }
        }

        skipped += (n - i);

        return skipped == 1;
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n - 1];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n - 1; i++) {
                b[i] = sc.nextLong();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            long ans = Long.MAX_VALUE;

            long x1 = b[0] - a[0];
            long x2 = b[0] - a[1];

            if (check(a, b, x1)) {
                ans = Math.min(ans, x1);
            }

            if (check(a, b, x2)) {
                ans = Math.min(ans, x2);
            }

            System.out.println(ans);
        }
    }
}
