import java.util.*;
public class ShortestRoute {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            int[] left = new int[n + 1];
            int[] right = new int[n + 1];

            Arrays.fill(left, -1);
            Arrays.fill(right, -1);

            int last = -1;

            for (int i = 1; i <= n; i++) {
                if (a[i] == 1) {
                    last = i;
                }
                left[i] = last;
            }

            last = -1;

            for (int i = n; i >= 1; i--) {
                if (a[i] == 2) {
                    last = i;
                }
                right[i] = last;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < m; i++) {

                int x = sc.nextInt();

                if (x == 1) {
                    sb.append(0).append(" ");
                    continue;
                }

                int ans = Integer.MAX_VALUE;

                if (left[x] != -1) {
                    ans = Math.min(ans, x - left[x]);
                }

                if (right[x] != -1) {
                    ans = Math.min(ans, right[x] - x);
                }

                if (ans == Integer.MAX_VALUE) {
                    sb.append(-1).append(" ");
                } else {
                    sb.append(ans).append(" ");
                }
            }

            System.out.println(sb.toString().trim());
        }
    }
}
