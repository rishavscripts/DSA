import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BoringString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            ArrayList<Integer>[] blocks = new ArrayList[26];
            for (int i = 0; i < 26; i++) {
                blocks[i] = new ArrayList<>();
            }

            int i = 0;
            while (i < n) {
                int j = i;

                while (j < n && s.charAt(j) == s.charAt(i)) {
                    j++;
                }

                blocks[s.charAt(i) - 'a'].add(j - i);
                i = j;
            }

            int ans = 0;

            for (int c = 0; c < 26; c++) {
                Collections.sort(blocks[c], Collections.reverseOrder());

                int l1 = 0, l2 = 0;

                if (blocks[c].size() >= 1) l1 = blocks[c].get(0);
                if (blocks[c].size() >= 2) l2 = blocks[c].get(1);

                ans = Math.max(ans, Math.max(l1 - 1, l2));
            }

            System.out.println(ans);
        }
    }
}
