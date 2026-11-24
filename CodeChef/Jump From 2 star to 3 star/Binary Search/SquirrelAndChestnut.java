import java.util.Arrays;
import java.util.Scanner;

public class SquirrelAndChestnut {
    static Scanner sc = new Scanner(System.in);

    static int m, n;
    static long k;
    static long[] T, P;

    static boolean possible(long time) {

        long[] chestnuts = new long[m];

        for (int i = 0; i < m; i++) {

            if (time < T[i]) {
                chestnuts[i] = 0;
            } else {
                chestnuts[i] = 1 + (time - T[i]) / P[i];
            }
        }

        Arrays.sort(chestnuts);

        long collected = 0;

        int squirrels = Math.min(n, m);

        for (int i = m - 1; i >= 0 && squirrels > 0; i--, squirrels--) {

            collected += chestnuts[i];

            if (collected >= k) {
                return true;
            }
        }

        return collected >= k;
    }

    public static void main(String[] args) {

        int tc = sc.nextInt();

        while (tc-- > 0) {

            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextLong();

            T = new long[m];
            P = new long[m];

            for (int i = 0; i < m; i++) {
                T[i] = sc.nextLong();
            }

            for (int i = 0; i < m; i++) {
                P[i] = sc.nextLong();
            }

            long low = 0;
            long high = (long) 1e18;
            long ans = high;

            while (low <= high) {

                long mid = low + (high - low) / 2;

                if (possible(mid)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
