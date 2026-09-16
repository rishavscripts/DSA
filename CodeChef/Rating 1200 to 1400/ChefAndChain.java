import java.util.*;

public class ChefAndChain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            int mismatch1 = 0; // starting with '-'
            int mismatch2 = 0; // starting with '+'

            for (int i = 0; i < n; i++) {
                char expected1 = (i % 2 == 0) ? '-' : '+';
                char expected2 = (i % 2 == 0) ? '+' : '-';

                if (s.charAt(i) != expected1) mismatch1++;
                if (s.charAt(i) != expected2) mismatch2++;
            }

            System.out.println(Math.min(mismatch1, mismatch2));
        }
    }
}
