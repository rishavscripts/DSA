import java.util.HashMap;
import java.util.Scanner;

public class EqualDifference {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            int maxFreq = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                map.put(num, map.getOrDefault(num, 0) + 1);

                maxFreq = Math.max(maxFreq, map.get(num));
            }

            System.out.println(n - maxFreq);
        }
    }
}
