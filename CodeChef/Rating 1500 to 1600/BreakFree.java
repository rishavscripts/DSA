import java.util.Scanner;

public class BreakFree {
    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;

    static long power(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }

            a = (a * a) % MOD;
            b >>= 1;
        }

        return res;
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int even = 0;
            int odd = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                if ((x & 1) == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            long ans = power(2, even);

            if (odd == 0) {
                ans = (ans - 1 + MOD) % MOD;
            }

            System.out.println(ans);
        }
    }
}
