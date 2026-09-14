import java.util.*;
public class DistinctPalindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if (x > 26 || x > (n + 1) / 2) {
                System.out.println(-1);
                continue;
            }

            char[] res = new char[n];
            // Fill first half with distinct letters
            for (int i = 0; i < x; i++) {
                res[i] = (char) ('a' + i);
                res[n - 1 - i] = res[i]; // mirror
            }
            // Fill remaining with 'a'
            for (int i = x; i < (n + 1) / 2; i++) {
                res[i] = 'a';
                res[n - 1 - i] = 'a';
            }

            System.out.println(new String(res));
        }
    }
}
