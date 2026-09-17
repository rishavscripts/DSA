import java.util.*;

public class ChefFeedsCats {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }

            int[] count = new int[n]; // 0-based: cat i is count[i-1]
            boolean fair = true;

            for (int x : arr) {
                count[x - 1]++;

                // compute min and max
                int min = count[0];
                int max = count[0];
                for (int i = 1; i < n; i++) {
                    if (count[i] < min) min = count[i];
                    if (count[i] > max) max = count[i];
                }

                if (max - min > 1) {
                    fair = false;
                    break;
                }
            }

            if (fair) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}