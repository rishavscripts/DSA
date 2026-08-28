import java.util.*;

public class ChefandMean {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum += arr[i];
            }
            
            int ans = -1;
            for (int i = 0; i < n; i++) {
                if (sum == arr[i] * n) {
                    ans = i + 1; // 1-based index
                    break;
                }
            }
            
            if (ans == -1) System.out.println("Impossible");
            else System.out.println(ans);
        }
    }
}
