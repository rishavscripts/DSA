import java.util.*;

public class SplitSums {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            long S = N * (N + 1) / 2;

            if ((S + M) % 2 != 0 || (S - M) % 2 != 0 || S < M) {
                System.out.println("No");
                continue;
            }

            long sumA = (S + M) / 2;
            long sumB = (S - M) / 2;

            if (gcd(sumA, sumB) == 1) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
