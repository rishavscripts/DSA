import java.util.*;
public class SnakeEating {
    static Scanner sc = new Scanner(System.in);

    static int lowerBound(long[] arr, long x) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = (l + r) / 2;

            if (arr[mid] >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    public static void main(String[] args) {

        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long[] prefix = new long[n + 1];

            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + a[i];
            }

            while (q-- > 0) {

                long k = sc.nextLong();

                int pos = lowerBound(a, k);

                int low = 0;
                int high = pos;
                int best = pos;

                while (low <= high) {

                    int mid = (low + high) / 2;

                    int cnt = pos - mid;

                    long sum = prefix[pos] - prefix[mid];

                    long need = k * cnt - sum;

                    if (need <= mid) {
                        best = mid;
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }

                System.out.println(n - best);
            }
        }
    }
}
