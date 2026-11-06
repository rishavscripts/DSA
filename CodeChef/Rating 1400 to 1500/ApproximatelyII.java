import java.util.Scanner;

public class ApproximatelyII {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong(); // Using long just to be safe with sums
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            long minDiff = Long.MAX_VALUE;
            long count = 0;
            
            // Check all unique pairs (i, j) where i < j
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long diff = Math.abs(a[i] + a[j] - k);
                    
                    if (diff < minDiff) {
                        minDiff = diff;
                        count = 1; // Reset count for the new minimum
                    } else if (diff == minDiff) {
                        count++; // Increment count if we found another pair with the same min difference
                    }
                }
            }
            
            System.out.println(minDiff + " " + count);
        }
    }
}
