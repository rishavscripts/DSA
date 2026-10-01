import java.util.*;
public class EvenSplits {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            int zeros = 0, ones = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
                else ones++;
            }
            // Special case: if N == 2, the string cannot change
            if (n == 2) {
                System.out.println(s);
            } else {
                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < zeros; i++) ans.append('0');
                for (int i = 0; i < ones; i++) ans.append('1');
                System.out.println(ans.toString());
            }
        }
    }
}
