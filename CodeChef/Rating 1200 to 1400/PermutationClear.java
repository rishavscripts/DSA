import java.util.*;

public class PermutationClear {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                a.add(ele); // use add, not addLast
            }

            int k = sc.nextInt();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                int ele = sc.nextInt();
                b.add(ele);
            }

            for (int key : b) {
                a.remove(Integer.valueOf(key)); // remove by value, not index
            }

            // Print the remaining elements
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
