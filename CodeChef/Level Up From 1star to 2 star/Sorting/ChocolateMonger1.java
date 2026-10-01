import java.util.*;

public class ChocolateMonger1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Use HashSet to count distinct flavours
            HashSet<Integer> set = new HashSet<>();
            for (int val : a) {
                set.add(val);
            }
            
            int distinct = set.size();
            int maxEat = n - x;
            
            System.out.println(Math.min(distinct, maxEat));
        }
    }
}
