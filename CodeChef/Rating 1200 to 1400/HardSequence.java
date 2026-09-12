import java.util.*;

public class HardSequence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            arr.add(0);

            // map stores last occurrence of each number
            Map<Integer, Integer> lastPos = new HashMap<>();
            lastPos.put(0, 0);

            for (int i = 1; i < n; i++) {
                int prev = arr.get(i - 1);
                int next;
                if (lastPos.containsKey(prev) && lastPos.get(prev) != i - 1) {
                    next = (i - 1) - lastPos.get(prev);
                } else {
                    next = 0;
                }
                arr.add(next);
                lastPos.put(prev, i - 1); // update last occurrence of prev
            }

            int target = arr.get(n - 1);
            int count = 0;
            for (int val : arr) {
                if (val == target) count++;
            }
            System.out.println(count);
        }
    }
}
