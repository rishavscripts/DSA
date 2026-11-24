import java.util.Scanner;

public class ModularEquation {
    static Scanner sc = new Scanner(System.in);

    static class Fenwick {
        long[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new long[n + 2];
        }

        void update(int idx, int val) {
            while (idx <= n) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        long query(int idx) {
            long sum = 0;

            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }

            return sum;
        }
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int N = sc.nextInt();
            long M = sc.nextLong();

            Fenwick ft = new Fenwick(N);

            long ans = 0;

            ft.update(1, 1);

            for (int b = 2; b <= N; b++) {

                int r = (int)(M % b);

                ans += ft.query(b - 1) - ft.query(r);

                ft.update(b, 1);
            }

            System.out.println(ans);
        }
    }
}
