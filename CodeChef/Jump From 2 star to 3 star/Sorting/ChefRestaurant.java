import java.util.Scanner;

public class ChefRestaurant {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] l = new long[n];
            long[] r = new long[n];

            for (int i = 0; i < n; i++) {
                l[i] = sc.nextLong();
                r[i] = sc.nextLong();
            }

            for (int q = 0; q < m; q++) {

                long p = sc.nextLong();

                int low = 0;
                int high = n - 1;
                int idx = -1;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (r[mid] > p) {
                        idx = mid;
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }

                if (idx == -1) {
                    System.out.println(-1);
                } else if (l[idx] <= p && p < r[idx]) {
                    System.out.println(0);
                } else {
                    System.out.println(l[idx] - p);
                }
            }
        }
    }
}
