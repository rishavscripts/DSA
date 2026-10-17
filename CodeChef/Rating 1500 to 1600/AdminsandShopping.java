import java.util.Scanner;

public class AdminsandShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long X = sc.nextLong();
            long ans = 0;
            for (int i = 0; i < N; i++) {
                long Ai = sc.nextLong();
                long time = (X + Ai - 1) / Ai; // ceil(X/Ai)
                ans = Math.max(ans, time);
            }
            System.out.println(Math.max(ans, N));
        }
        sc.close();
    }
}
