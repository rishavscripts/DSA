import java.util.*;

public class WorldChessChampionship {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            String s = sc.next();

            int c = 0, n = 0;
            for (int i = 0; i < 14; i++) {
                char ch = s.charAt(i);
                if (ch == 'C') c += 2;
                else if (ch == 'N') n += 2;
                else if (ch == 'D') {
                    c += 1;
                    n += 1;
                }
            }

            if (c < n) {
                System.out.println(x * 40);
            } else if (c > n) {
                System.out.println(x * 60);
            } else {
                System.out.println(x * 55);
            }
        }
    }
}