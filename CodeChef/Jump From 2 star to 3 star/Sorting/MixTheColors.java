import java.util.*;
public class MixTheColors {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            HashSet<Long> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextLong());
            }

            System.out.println(n - set.size());
        }
    }
}
