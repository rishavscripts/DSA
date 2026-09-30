import java.util.*;

public class ICPCBalloons {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean[] f = new boolean[7];
            int distinct = 0;
            int count = 0;

            for (int val : a) {
                count++;
                if (val >= 1 && val <= 7 && !f[val - 1]) {
                    f[val - 1] = true;
                    distinct++;
                }
                if (distinct == 7) break;
            }

            System.out.println(count);
        }
    }
}
