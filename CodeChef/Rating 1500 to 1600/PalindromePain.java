import java.util.*;
public class PalindromePain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            // Case: both odd → impossible
            if (x % 2 == 1 && y % 2 == 1) {
                System.out.println(-1);
                continue;
            }

            // Build two distinct palindromes
            String s1, s2;
            if (x % 2 == 0 && y % 2 == 0) {
                // Both even
                s1 = "a".repeat(x/2) + "b".repeat(y) + "a".repeat(x/2);
                s2 = "b".repeat(y/2) + "a".repeat(x) + "b".repeat(y/2);
            } else if (x % 2 == 1) {
                // Odd a's → put 'a' in middle
                s1 = "a".repeat(x/2) + "b".repeat(y) + "a".repeat(x/2+1);
                s2 = "b".repeat(y/2) + "a".repeat(x) + "b".repeat(y/2);
            } else {
                // Odd b's → put 'b' in middle
                s1 = "b".repeat(y/2) + "a".repeat(x) + "b".repeat(y/2+1);
                s2 = "a".repeat(x/2) + "b".repeat(y) + "a".repeat(x/2);
            }

            System.out.println(s1);
            System.out.println(s2);
        }
    }
}
