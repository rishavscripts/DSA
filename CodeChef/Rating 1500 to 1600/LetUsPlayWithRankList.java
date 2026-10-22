import java.util.*;
public class LetUsPlayWithRankList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            long n = sc.nextLong();
            long s = sc.nextLong();

            long ideal = n * (n + 1) / 2;
            long extra = s - ideal;

            long ans = 0;
            long cur = n - 1;

            while (extra > 0) {
                extra -= cur;
                cur--;
                ans++;
            }

            System.out.println(ans);
        }
    }
}
