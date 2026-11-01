import java.util.Scanner;

public class YetAnotherPalindromeProblem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long ans = 0;
            boolean possible = true;
            for (int i = 0; i < n / 2; i++) {
                long diff = a[n - 1 - i] - a[i];
                if (diff < 0) {
                    possible = false;
                    break;
                }
                ans = Math.max(ans, diff);
            }
            System.out.println(possible ? ans : -1);
        }
    }
}
