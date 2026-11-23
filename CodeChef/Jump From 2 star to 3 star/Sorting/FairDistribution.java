import java.util.Arrays;
import java.util.Scanner;

public class FairDistribution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            long ans = Long.MAX_VALUE;

            for (int i = 0; i + k - 1 < n; i++) {
                ans = Math.min(ans, arr[i + k - 1] - arr[i]);
            }

            System.out.println(ans);
        }
    }
}
