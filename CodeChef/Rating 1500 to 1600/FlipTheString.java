import java.util.*;
public class FlipTheString {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            String A = sc.next();
            String B = sc.next();

            int n = A.length();
            int ans = 0;

            // odd positions (0-based: 0,2,4,...)
            boolean prev = false;
            for (int i = 0; i < n; i += 2) {
                boolean diff = A.charAt(i) != B.charAt(i);
                if (diff && !prev) ans++;
                prev = diff;
            }

            // even positions (0-based: 1,3,5,...)
            prev = false;
            for (int i = 1; i < n; i += 2) {
                boolean diff = A.charAt(i) != B.charAt(i);
                if (diff && !prev) ans++;
                prev = diff;
            }

            System.out.println(ans);
        }
    }
}
