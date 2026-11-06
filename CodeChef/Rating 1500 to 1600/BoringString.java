import java.util.*;

public class BoringString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] max1 = new int[26];
            int[] max2 = new int[26];

            int i = 0;

            while (i < n) {
                int j = i;

                while (j < n && s.charAt(j) == s.charAt(i)) {
                    j++;
                }

                int len = j - i;
                int idx = s.charAt(i) - 'a';

                if (len > max1[idx]) {
                    max2[idx] = max1[idx];
                    max1[idx] = len;
                } else if (len > max2[idx]) {
                    max2[idx] = len;
                }

                i = j;
            }

            int ans = 0;

            for (int c = 0; c < 26; c++) {
                ans = Math.max(ans, Math.max(max1[c] - 1, max2[c]));
            }

            System.out.println(ans);
        }
    }
}