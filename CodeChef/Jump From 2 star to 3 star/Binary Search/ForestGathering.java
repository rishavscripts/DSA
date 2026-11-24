import java.util.*;
public class ForestGathering {
    static Scanner sc = new Scanner(System.in);

    static long[] H, R;
    static int N;
    static long W, L;

    static boolean possible(long months) {

        long wood = 0;

        for (int i = 0; i < N; i++) {

            long height = H[i] + R[i] * months;

            if (height >= L) {
                wood += height;

                if (wood >= W) {
                    return true;
                }
            }
        }

        return wood >= W;
    }

    public static void main(String[] args) {

        N = sc.nextInt();
        W = sc.nextLong();
        L = sc.nextLong();

        H = new long[N];
        R = new long[N];

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextLong();
            R[i] = sc.nextLong();
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
