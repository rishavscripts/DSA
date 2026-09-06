import java.util.*;

public class ChefandDemonetisation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long s = sc.nextLong();
            long n = sc.nextLong();
            long ans;

            if (s <= n) {
                ans = (s % 2 == 0 || s == 1) ? 1 : 2;
            } else {
                ans = s / n;
                long rem = s % n;
                if (rem == 0) {
                    // nothing left
                } else if (rem % 2 == 0 || rem == 1) {
                    ans += 1;
                } else {
                    ans += 2;
                }
            }
            System.out.println(ans);
        }
    }
}
