import java.util.*;

public class PrefixPermutation {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int T = sc.nextInt();
        while (T-- > 0) {
           // int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[K];
            for (int i = 0; i < K; i++) A[i] = sc.nextInt();

            List<Integer> result = new ArrayList<>();
            int prev = 0;
            for (int idx = 0; idx < K; idx++) {
                int cur = A[idx];
                // Add numbers from cur down to prev+1
                for (int x = cur; x > prev; x--) {
                    result.add(x);
                }
                prev = cur;
            }

            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
        }
    }
}
