import java.util.*;

public class OneXORDeletions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }

            int maxSubset = 0;
            for (int x : freq.keySet()) {
                int count = freq.get(x);
                int countWithNext = count + freq.getOrDefault(x+1, 0);
                maxSubset = Math.max(maxSubset, Math.max(count, countWithNext));
            }

            System.out.println(n - maxSubset);
        }
        sc.close();
    }
}
