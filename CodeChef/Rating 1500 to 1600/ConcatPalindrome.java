import java.util.*;

public class ConcatPalindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            /*int n = sc.nextInt();
            int m = sc.nextInt();*/
            String a = sc.next();
            String b = sc.next();

            boolean canA = canPalindrome(a);
            boolean canB = canPalindrome(b);

            if ((canA && canB) || (canA && hasOneOdd(b)) || (canB && hasOneOdd(a))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean canPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        int odd = 0;
        for (int f : freq) if (f % 2 != 0) odd++;
        return odd <= 1;
    }

    static boolean hasOneOdd(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        int odd = 0;
        for (int f : freq) if (f % 2 != 0) odd++;
        return odd == 1;
    }
}
