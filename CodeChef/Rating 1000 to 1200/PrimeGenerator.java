import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class PrimeGenerator {
    static ArrayList<Integer> simpleSieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        if (limit >= 1) isPrime[1] = false;

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Function to print primes in range [m, n] using Segmented Sieve
    static void segmentedSieve(long m, long n, ArrayList<Integer> primes, StringBuilder sb) {
        // If m is 1, 1 is not prime, so start from max(2, m)
        long start = Math.max(2, m);
        boolean[] isPrime = new boolean[(int)(n - start + 1)];
        Arrays.fill(isPrime, true);

        for (int p : primes) {
            // Find the minimum number in [start, n] that is a multiple of p
            long base = (start / p) * p;
            if (base < start) {
                base += p;
            }
            
            // Mark multiples of p as non-prime
            for (long j = Math.max(base, (long)p * p); j <= n; j += p) {
                isPrime[(int)(j - start)] = false;
            }
        }

        for (long i = start; i <= n; i++) {
            if (isPrime[(int)(i - start)]) {
                sb.append(i).append("\n");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        // Maximum value of n is 10^9, so limit for simple sieve is sqrt(10^9) ≈ 31622
        ArrayList<Integer> basePrimes = simpleSieve(31622);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            long m = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());

            segmentedSieve(m, n, basePrimes, sb);
            
            // Separate the answers for each test case by an empty line
            if (i < t - 1) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }    
}
