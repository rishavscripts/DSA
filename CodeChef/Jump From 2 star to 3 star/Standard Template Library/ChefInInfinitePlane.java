import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChefInInfinitePlane {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            long ans = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

                int value = entry.getKey();
                int count = entry.getValue();

                ans += Math.min(count, value - 1);
            }

            System.out.println(ans);
        }
    }
}
