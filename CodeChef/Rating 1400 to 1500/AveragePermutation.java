import java.util.*;
public class AveragePermutation{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        // Read the number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            StringBuilder sb = new StringBuilder();
            
            // For N = 3, the only permutation is 3 2 1
            if (n == 3) {
                sb.append("3 2 1");
            } else {
                // Place the largest elements in the positions with smaller weights
                sb.append(n).append(" ");
                sb.append(n - 2).append(" ");
                
                // Fill the middle positions with numbers from 1 to N-3
                for (int i = 1; i <= n - 3; i++) {
                    sb.append(i).append(" ");
                }
                
                // Place (N-1) at the very end
                sb.append(n - 1);
            }
            
            // Print the result for the current test case
            System.out.println(sb.toString());
        }
    }
}