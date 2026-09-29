import java.util.*;

public class LinearChess {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();
            
            int bestPlayer = -1;
            long minMoves = Long.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                if (k % p[i] == 0) {
                    long moves = k / p[i];
                    if (moves < minMoves) {
                        minMoves = moves;
                        bestPlayer = p[i];
                    }
                }
            }
            
            System.out.println(bestPlayer);
        }
    }
}
