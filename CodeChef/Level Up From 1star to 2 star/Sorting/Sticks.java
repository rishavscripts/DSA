import java.util.*;

public class Sticks {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int val : a) {
                map.put(val, map.getOrDefault(val, 0) + 1);
            }

            // Collect lengths with at least 2 sticks
            List<Integer> candidates = new ArrayList<>();
            for (int key : map.keySet()) {
                if (map.get(key) >= 2) {
                    candidates.add(key);
                    if (map.get(key) >= 4) {
                        candidates.add(key); // add twice to allow square
                    }
                }
            }

            Collections.sort(candidates, Collections.reverseOrder());

            if (candidates.size() < 2) {
                System.out.println(-1);
            } else {
                long area = (long)candidates.get(0) * candidates.get(1);
                System.out.println(area);
            }
        }
    }
}
