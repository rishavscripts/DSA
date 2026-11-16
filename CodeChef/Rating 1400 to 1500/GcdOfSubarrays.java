import java.util.Scanner;

public class GcdOfSubarrays {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            long minSum = (n * (n + 1)) / 2;
            
            // If K is less than the minimum possible sum of GCDs, it's impossible
            if (k < minSum) {
                System.out.println("-1");
            } else {
                // The last element absorbs the remaining required sum
                long lastElement = k - (n * (n - 1)) / 2;
                
                // Print N-1 ones followed by the last element
                for (int i = 0; i < n - 1; i++) {
                    System.out.print("1 ");
                }
                System.out.println(lastElement);
            }
        }
    }
}
