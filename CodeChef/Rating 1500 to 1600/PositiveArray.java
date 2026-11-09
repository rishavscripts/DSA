import java.util.Scanner;

public class PositiveArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;
            }

            int ans = 0;

            for (int x = 1; x <= n; x++) {
                if (freq[x] > 0) {
                    ans = Math.max(ans, (freq[x] + x - 1) / x);
                }
            }

            System.out.println(ans);
        }
    }
}
