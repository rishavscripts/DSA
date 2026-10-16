import java.util.*;

public class Monsters {
    static Set<Integer> powMinusOne = new HashSet<>();
    static List<Integer> primes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static {
        // Precompute 2^k - 1 up to >1e6
        for (int k = 1; (1 << k) - 1 <= 1000000; k++) {
            powMinusOne.add((1 << k) - 1);
        }
        // Sieve primes up to 1e6
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) isPrime[j] = false;
            }
        }
        for (int i = 2; i <= 1000000; i++) if (isPrime[i]) primes.add(i);
    }

    public static void main(String[] args) {
        
        int T = sc.nextInt();
        while (T-- > 0) {
            int H = sc.nextInt();
            int ans = Integer.MAX_VALUE;

            // Case 1: H itself is 2^k - 1
            if (powMinusOne.contains(H)) {
                ans = Integer.numberOfTrailingZeros(H+1); // log2(H+1)
            }

            // Case 2: H - P = 2^k - 1
            for (int p : primes) {
                if (p > H) break;
                int rem = H - p;
                if (powMinusOne.contains(rem)) {
                    int k = Integer.numberOfTrailingZeros(rem+1);
                    ans = Math.min(ans, k+1);
                }
            }

            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
        }
    }
}
