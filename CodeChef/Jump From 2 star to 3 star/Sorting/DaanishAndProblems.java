import java.util.*;
public class DaanishAndProblems {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            long[] a = new long[11];

            for (int i = 1; i <= 10; i++) {
                a[i] = sc.nextLong();
            }

            long k = sc.nextLong();

            int answer = 1;

            for (int difficulty = 10; difficulty >= 1; difficulty--) {

                if (k >= a[difficulty]) {
                    k -= a[difficulty];
                } else {
                    answer = difficulty;
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}
