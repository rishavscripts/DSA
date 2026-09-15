import java.util.*;

public class PermutationGCD {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (x < n || x > 2*n - 1) {
                System.out.println(-1);
                continue;
            }

            int extra = x - n;
            int first = extra + 1;

            List<Integer> perm = new ArrayList<>();
            perm.add(first);
            perm.add(n);
            perm.add(1);
            for (int i = 2; i < n; i++) {
                if (i != first && i != n) perm.add(i);
            }

            for (int val : perm) System.out.print(val + " ");
            System.out.println();
        }
    }
}
