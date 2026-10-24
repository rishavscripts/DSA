import java.util.HashMap;
import java.util.Scanner;

public class UnstableSubarray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();

            HashMap<Long, Long> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                freq.put(x, freq.getOrDefault(x, 0L) + 1);
            }

            long total = (long) n * (n + 1) / 2;
            long stable = 0;

            for (long f : freq.values()) {
                stable += f * (f + 1) / 2;
            }

            System.out.println(total - stable);
        }
    }
}
