import java.util.Scanner;

public class ParallelProcessing {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) throws java.lang.Exception
    {
        // Check if there are test cases available
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            
            // Read array elements and compute the total sum
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }
            
            long ans = sum; // Initialize with edge case: Processor 1 takes 0 tasks
            long curr = 0;
            
            // Iterate through possible prefixes for the first processor
            for (int i = 0; i < n - 1; i++) {
                curr += a[i];
                long maxTime = Math.max(curr, sum - curr);
                ans = Math.min(ans, maxTime);
            }
            
            // Print the minimum time for the current test case
            System.out.println(ans);
        }
    }
}
