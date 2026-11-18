import java.util.Scanner;

public class MinimumNumberofPizzas {
    static Scanner sc = new Scanner(System.in);

    // Function to calculate GCD using Euclidean algorithm
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // Check if there are any test cases to read
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            // Formula: N / GCD(N, K)
            long ans = n / gcd(n, k);
            System.out.println(ans);
        }
    }
}
