import java.util.Scanner;

public class Jogging {
    static final long MOD = 1000000007;
    static final int MAXN = 1000005;
    static long[] pow2 = new long[MAXN];
    static Scanner scanner = new Scanner(System.in);
    static void precompute() {
        pow2[0] = 1;
        for (int i = 1; i < MAXN; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        precompute();
        int t = scanner.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            long x = scanner.nextLong();
            
            long ans = (x * pow2[n - 1]) % MOD;
            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }
}
