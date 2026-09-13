import java.util.*;

public class StrongLanguage {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int maxRun = 0, currentRun = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '*') {
                    currentRun++;
                    maxRun = Math.max(maxRun, currentRun);
                } else {
                    currentRun = 0;
                }
            }

            if (maxRun >= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
