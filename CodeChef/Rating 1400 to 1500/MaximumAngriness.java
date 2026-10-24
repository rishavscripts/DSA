import java.util.Scanner;

public class MaximumAngriness {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            // If we can swap enough times to fully reverse the array
            if (k >= n / 2) {
                System.out.println((n * (n - 1)) / 2);
            } else {
                // Number of elements left untouched in the middle
                long rem = n - 2 * k;
                long totalInversions = (n * (n - 1)) / 2;
                long unswappedInversions = (rem * (rem - 1)) / 2;
                
                System.out.println(totalInversions - unswappedInversions);
            }
        }
    }
}
