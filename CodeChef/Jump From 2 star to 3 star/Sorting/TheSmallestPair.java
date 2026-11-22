import java.util.*;
public class TheSmallestPair {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x < min1) {
                    min2 = min1;
                    min1 = x;
                } else if (x < min2) {
                    min2 = x;
                }
            }

            System.out.println(min1 + min2);
        }
    }
}
