import java.util.*;
public class LuckyluckyNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = -1;
            for (long x = 0; x <= n; x += 7) {
                long y = n - x;
                if (y % 4 == 0) {
                    ans = x;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
