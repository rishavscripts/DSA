import java.util.Arrays;
import java.util.Scanner;

public class ChefAndAdjacentSums {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            if (n == 2) {
                System.out.println("NO");
                continue;
            }

            if (a[0] + a[1] > a[n - 1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
