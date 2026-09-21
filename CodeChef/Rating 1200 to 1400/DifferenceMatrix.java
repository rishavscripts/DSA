import java.util.*;

public class DifferenceMatrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> odds = new ArrayList<>();
            List<Integer> evens = new ArrayList<>();
            for (int i = 1; i <= n * n; i++) {
                if (i % 2 == 1) odds.add(i);
                else evens.add(i);
            }
            List<Integer> all = new ArrayList<>();
            all.addAll(odds);
            all.addAll(evens);

            int idx = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(all.get(idx++) + " ");
                }
                System.out.println();
            }
        }
    }
}
