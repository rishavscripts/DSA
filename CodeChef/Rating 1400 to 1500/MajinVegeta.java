import java.util.Scanner;

public class MajinVegeta {
    static Scanner scanner = new Scanner(System.in);
    
    static final int MAX = 1000005;
    static int[] distinctPrimes = new int[MAX];

    // Precompute distinct prime factors using a Sieve-like approach
    static void precompute() {
        for (int i = 2; i < MAX; i++) {
            if (distinctPrimes[i] == 0) {
                for (int j = i; j < MAX; j += i) {
                    distinctPrimes[j]++;
                }
            }
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        precompute();

        if (scanner.hasNextInt()) {
            int T = scanner.nextInt();
            while (T-- > 0) {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                
                long totalEnergy = 0;
                // Directly sum the values from n to m-1
                for (int i = n; i < m; i++) {
                    totalEnergy += distinctPrimes[i];
                }
                
                System.out.println(totalEnergy);
            }
        }
    }
}
