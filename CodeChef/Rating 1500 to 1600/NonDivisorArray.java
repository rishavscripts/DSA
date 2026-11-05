import java.util.Scanner;

public class NonDivisorArray {
    static final int MAX = 200000;
    static int[] omega = new int[MAX + 1];
    static Scanner sc = new Scanner(System.in);

    static void precompute() {
        for (int i = 2; i <= MAX; i++) {
            if (omega[i] == 0) { // prime
                for (int j = i; j <= MAX; j += i) {
                    int x = j;
                    while (x % i == 0) {
                        omega[j]++;
                        x /= i;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        precompute();

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int maxColor = 1;

            int[] ans = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                ans[i] = omega[i] + 1;
                maxColor = Math.max(maxColor, ans[i]);
            }

            System.out.println(maxColor);

            for (int i = 1; i <= N; i++) {
                System.out.print(ans[i]);
                if (i < N) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
