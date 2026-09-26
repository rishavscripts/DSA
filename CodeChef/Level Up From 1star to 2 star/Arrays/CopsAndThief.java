import java.util.*;

public class CopsAndThief {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] cops = new int[m];
            for (int i = 0; i < m; i++) {
                cops[i] = sc.nextInt();
            }

            boolean[] unsafe = new boolean[101];
            int range = x * y;

            for (int h : cops) {
                int left = Math.max(1, h - range);
                int right = Math.min(100, h + range);
                for (int i = left; i <= right; i++) {
                    unsafe[i] = true;
                }
            }

            int safeCount = 0;
            for (int i = 1; i <= 100; i++) {
                if (!unsafe[i]) safeCount++;
            }

            System.out.println(safeCount);
        }
    }
}
