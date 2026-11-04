import java.util.Scanner;

public class BouncingBall {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            long[] A = new long[N];
            long maxWall = 0;

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
                if (A[i] > 0) {
                    maxWall = Math.max(maxWall, A[i]);
                }
            }

            int[] leftWall = new int[N];
            int[] rightWall = new int[N];

            int last = -1;
            for (int i = 0; i < N; i++) {
                if (A[i] > 0) last = i;
                leftWall[i] = last;
            }

            last = -1;
            for (int i = N - 1; i >= 0; i--) {
                if (A[i] > 0) last = i;
                rightWall[i] = last;
            }

            long ways = 0;

            for (int i = 0; i < N; i++) {
                if (A[i] != 0) continue;

                int l = leftWall[i];
                if (l != -1 && A[l] == maxWall) ways++;

                int r = rightWall[i];
                if (r != -1 && A[r] == maxWall) ways++;
            }

            System.out.println(ways);
        }
    }
}
