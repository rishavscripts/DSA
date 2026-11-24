import java.util.Scanner;

public class ATempleOfSnakes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] h = new long[n];
            long total = 0;

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextLong();
                total += h[i];
            }

            long[] left = new long[n];
            long[] right = new long[n];

            left[0] = Math.min(h[0], 1);

            for (int i = 1; i < n; i++) {
                left[i] = Math.min(h[i], left[i - 1] + 1);
            }

            right[n - 1] = Math.min(h[n - 1], 1);

            for (int i = n - 2; i >= 0; i--) {
                right[i] = Math.min(h[i], right[i + 1] + 1);
            }

            long bestPeak = 0;
            int peakPos = 0;

            for (int i = 0; i < n; i++) {

                long peak = Math.min(left[i], right[i]);

                if (peak > bestPeak) {
                    bestPeak = peak;
                    peakPos = i;
                }
            }

            long kept = bestPeak;

            long cur = bestPeak;

            for (int i = peakPos - 1; i >= 0; i--) {
                cur = Math.min(cur - 1, h[i]);
                if (cur <= 0) break;
                kept += cur;
            }

            cur = bestPeak;

            for (int i = peakPos + 1; i < n; i++) {
                cur = Math.min(cur - 1, h[i]);
                if (cur <= 0) break;
                kept += cur;
            }

            System.out.println(total - kept);
        }
    }
}
