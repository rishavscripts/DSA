import java.util.Scanner;

public class TraceofMatrix {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
            
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            
            // Array to store sums of all possible main diagonals
            // The size 2*N is sufficient to cover all offsets (i - j)
            int[] diagonalSums = new int[2 * n];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                    // Add the element to its respective diagonal bucket
                    diagonalSums[i - j + n - 1] += a[i][j];
                }
            }
            
            int maxTrace = 0;
            // Find the maximum sum among all diagonals
            for (int sum : diagonalSums) {
                if (sum > maxTrace) {
                    maxTrace = sum;
                }
            }
            
            System.out.println(maxTrace);
        }
       
    }
}
