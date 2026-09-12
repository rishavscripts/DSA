import java.util.*;

public class LittleElephantandBombs {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean[] destroyed = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    destroyed[i] = true;
                    if (i > 0) destroyed[i - 1] = true;
                    if (i < n - 1) destroyed[i + 1] = true;
                }
            }

            int safe = 0;
            for (int i = 0; i < n; i++) {
                if (!destroyed[i]) safe++;
            }
            System.out.println(safe);
        }
    }
}
