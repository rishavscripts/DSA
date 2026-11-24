import java.util.*;
public class MinionChefAndBananas {
    static Scanner sc = new Scanner(System.in);

    static boolean canFinish(long[] arr, int n, long h, long speed) {

        long hours = 0;

        for (int i = 0; i < n; i++) {
            hours += (arr[i] + speed - 1) / speed;

            if (hours > h) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long h = sc.nextLong();

            long[] arr = new long[n];

            long maxPile = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                maxPile = Math.max(maxPile, arr[i]);
            }

            long low = 1;
            long high = maxPile;
            long answer = maxPile;

            while (low <= high) {

                long mid = low + (high - low) / 2;

                if (canFinish(arr, n, h, mid)) {
                    answer = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(answer);
        }
    }
}
