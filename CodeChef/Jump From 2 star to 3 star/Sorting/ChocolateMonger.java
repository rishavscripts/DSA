import  java.util.*;
public class ChocolateMonger {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            int distinct = set.size();

            System.out.println(Math.min(distinct, n - x));
        }
    }
}
