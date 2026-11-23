import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StableQuickSort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        long[] first = new long[n];

        for (int i = 0; i < n; i++) {
            first[i] = sc.nextLong();
            sc.nextLong(); // ignore second value
        }

        HashMap<Long, Integer> firstPos = new HashMap<>();
        HashMap<Long, Integer> lastPos = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!firstPos.containsKey(first[i])) {
                firstPos.put(first[i], i);
            }
            lastPos.put(first[i], i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (firstPos.get(first[i]) == i ||
                lastPos.get(first[i]) == i) {
                ans.add(i);
            }
        }

        System.out.println(ans.size());

        for (int i = 0; i < ans.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(ans.get(i));
        }

        System.out.println();
    }
}
